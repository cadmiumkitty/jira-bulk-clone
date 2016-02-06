# Jira Bulk Clone v 1.0

## Overview

Simple utility to bulk-copy Jira items. 

It is designed to help with creation of the requirements matrix 
in Jira where you have identical user stories spanning across 
many components.

## Compatibility

WSDL under src/main/wsdl is from Jira v4.2#587

## How to run

Create named filter in Jira under the account under which you want 
to run the utility. Include all issues that you want cloned as 
part of the filter (typically includes all features from a given 
component).

Unpack the utility into a directory of your choice

Run

``` 
java -jar jirabulkclone-1.0.0.jar <url> <username> <password> <project key> <filter name> <from component name> <to component name>
```

Example:

```
java -jar jirabulkclone-1.0.0.jar http://localhost:8080/rpc/soap/jirasoapservice-v2 myusername mypassword TST "All Bonds" BONDS STOCKS
```
