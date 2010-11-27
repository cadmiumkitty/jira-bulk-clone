Jira Bulk Clone v 1.0
=====================

November 27th 2010
Eugene Morozov (emorozov@gmail.com)

Overview
========

This is a simple utility to allow for bulk-copy of Jira items. 

It is designed to help with creation of the requirements matrix 
in Jira where you have identical user stories spanning across 
many components.


Compatibility
=============

WSDL under src/main/wsdl is from Jira v4.2#587


How to run
==========

1. Create named filter in Jira under the account under which you want 
   to run the utility. Include all issues that you want cloned as 
   part of the filter (typically includes all features from a given 
   component).

2. Unpack the utility into a directory of your choice

3. Run: 
   java -jar JiraBulkClone.jar <url> <username> <password> 
   <project key> <filter name> 
   <from component name> <to component name>

   Example:
   java -jar jirareqmatrix-1.0.0.jar 
   http://localhost:8080/rpc/soap/jirasoapservice-v2 
   myusername mypassword TST "All Bonds" BONDS STOCKS

