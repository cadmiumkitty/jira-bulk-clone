/**
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.emorozov.jirabulkclone.main;

import java.net.URL;

import com.emorozov.jirabulkclone.jiraservicev2.JiraSoapService;
import com.emorozov.jirabulkclone.jiraservicev2.JiraSoapServiceService;
import com.emorozov.jirabulkclone.jiraservicev2.JiraSoapServiceServiceLocator;
import com.emorozov.jirabulkclone.jiraservicev2.RemoteComponent;
import com.emorozov.jirabulkclone.jiraservicev2.RemoteFilter;
import com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue;

/**
 * Simple command line tool for bulk cloning issues from one Jira
 * component to the other
 * 
 * @author Eugene Morozov (emorozov@gmail.com)
 */
public class JiraBulkClone {

	/**
	 * Main entry point, do only minimal error handling
	 * 
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		// Print usage
		if (args.length < 7) {
			System.out.println("Usage: <url> <username> <password> " 
					+ "<project key> <filter name> <from component name> " 
					+ "<to component name>");
			System.exit(-1);
		}
		
		// Get vars
		String url = args[0];
		String username = args[1];
		String password = args[2];
		String projectKey = args[3];
		String filterFromName = args[4];
		String componentFromName = args[5];
		String componentToName = args[6];
		
		// Log
		System.out.println("Setting up service...");
		
		// Create service, etc..
	    JiraSoapServiceService service = new JiraSoapServiceServiceLocator();

	    // Now use the service to get a stub which implements the SDI.
	    JiraSoapService port = service.getJirasoapserviceV2(new URL(url));

		// Log in
		System.out.println("Done. Logging in...");
	    String token = port.login(username, password);

	    // Get all filters, then pick the one we need
	    System.out.println("Done. Requesting filters...");
	    RemoteFilter[] filters = port.getFavouriteFilters(token);
	    String filterId = null;
	    for (int i = 0; (i < filters.length) 
	    		&& (filterId == null); i ++) {
	    	if (filters[i].getName().equals(filterFromName)) {
	    		filterId = filters[i].getId();
	    	}
	    }

	    // Log filter id
	    System.out.println("Done. Filter Id: [" + filterId + "].");

	    // Get all components so we can replace components
	    // in the existing issues when cloning
	    System.out.println("Requesting components...");
	    RemoteComponent[] components = port.getComponents(token, projectKey);
	    RemoteComponent componentFrom = null;
	    RemoteComponent componentTo = null;
	    for (int i = 0; (i < components.length) 
	    		&& ((componentFrom == null)
	    				|| (componentTo == null)); i++) {
	    	if (components[i].getName().equals(componentFromName)) {
	    		componentFrom = components[i];
	    	}
	    	if (components[i].getName().equals(componentToName)) {
	    		componentTo = components[i];
	    	}
	    }
	    
	    // Print out results
	    System.out.println("From component Id: [" + componentFrom.getId() + "].");
	    System.out.println("To component Id: [" + componentTo.getId() + "].");
	    
		// Get all issues for a given filter
		System.out.println("Requesting issues from filter...");
	    RemoteIssue[] issues = port.getIssuesFromFilter(token, filterId);

		// Copy one-by one, print progress
		System.out.println("Done. Issues found: [" 
				+ issues.length	+ "]. Preparing for clone...");
	    for (int i = 0; i < issues.length; i++) {
	    	
	    	// Get rid of the original Id
	    	issues[i].setId(null);
	    	
	    	// Add comment to the description
	    	String description = issues[i].getDescription();
	    	issues[i].setDescription(
	    			description == null
	    					? "Bulk cloned with JiraReqMatrix."
	    					: description + "\n\nBulk cloned with JiraReqMatrix.");
	    	
	    	// Replace component
	    	RemoteComponent[] issueComponents = issues[i].getComponents(); 
	    	for (int j = 0; j < issueComponents.length; j++) {
	    		if (issueComponents[j].getId().equals(componentFrom.getId())) {
	    			issueComponents[j] = componentTo;
	    		}
	    	}
	    }
	    
	    // Clone 
		System.out.println("Done. Creating issues..."); 
	    for (int i = 0; i < issues.length; i++) {
	    	RemoteIssue createdIssue = port.createIssue(token, issues[i]);
	    	System.out.println("New issue key: [" + createdIssue.getKey() + "].");
	    }
		
		// Log out
		System.out.println("Done. Logging out...");
		port.logout(token);
		
		// Confirm completion with user
		System.out.println("Done.");
	}

}
