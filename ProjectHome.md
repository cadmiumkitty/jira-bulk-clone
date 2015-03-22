# Overview #

This is a simple utility to allow for bulk-clone of Jira items. It is designed to help with creation of the requirements matrix in Jira where you have identical user stories spanning across many components.

# How to run #

  1. Create named filter in Jira under the account under which you want to run the utility. Include all issues that you want cloned as part of the filter (typically includes all features from a given component).
  1. [Download](http://code.google.com/p/jira-bulk-clone/downloads/detail?name=jira-bulk-clone-1.0.0.zip&can=2&q=) and unpack the utility into a directory of your choice
  1. Run: `java -jar jirabulkclone-1.0.0.jar <url> <username> <password> <project key> <filter name> <from component name> <to component name>`

Example: `java -jar jirabulkclone-1.0.0.jar http://localhost:8080/rpc/soap/jirasoapservice-v2 myusername mypassword TST "All Voice" VOICE BROADBAND`