/**
 * JiraSoapService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.emorozov.jirabulkclone.jiraservicev2;

public interface JiraSoapService extends java.rmi.Remote {
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteComment getComment(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteGroup createGroup(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteUser in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteServerInfo getServerInfo(java.lang.String in0) throws java.rmi.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteGroup getGroup(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public java.lang.String login(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteUser getUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue getIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteVersion[] getVersions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteComponent[] getComponents(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteUser createUser(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue createIssue(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue updateIssue(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteFieldValue[] in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteNamedObject[] getAvailableActions(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssueType[] getSubTaskIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteConfiguration getConfiguration(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject createProject(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme in6, com.emorozov.jirabulkclone.jiraservicev2.RemoteScheme in7, com.emorozov.jirabulkclone.jiraservicev2.RemoteScheme in8) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject updateProject(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProject in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject getProjectByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void removeAllRoleActorsByProject(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProject in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemotePriority[] getPriorities(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteResolution[] getResolutions(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssueType[] getIssueTypes(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteStatus[] getStatuses(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssueType[] getIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole[] getProjectRoles(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole getProjectRole(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRoleActors getProjectRoleActors(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteProject in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteRoleActors getDefaultRoleActors(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void removeAllRoleActorsByNameAndType(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteProjectRole(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1, boolean in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void updateProjectRole(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole createProjectRole(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean isProjectRoleNameUnique(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void addActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in2, com.emorozov.jirabulkclone.jiraservicev2.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void removeActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in2, com.emorozov.jirabulkclone.jiraservicev2.RemoteProject in3, java.lang.String in4) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void addDefaultActorsToProjectRole(java.lang.String in0, java.lang.String[] in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void removeDefaultActorsFromProjectRole(java.lang.String in0, java.lang.String[] in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in2, java.lang.String in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteScheme[] getAssociatedNotificationSchemes(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteScheme[] getAssociatedPermissionSchemes(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProjectRole in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject getProjectById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteField[] getCustomFields(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteComment[] getComments(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteFilter[] getFavouriteFilters(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void releaseVersion(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteVersion in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void archiveVersion(java.lang.String in0, java.lang.String in1, java.lang.String in2, boolean in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteField[] getFieldsForEdit(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssueType[] getSubTaskIssueTypesForProject(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException;
    public void addUserToGroup(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteGroup in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteUser in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void removeUserFromGroup(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteGroup in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteUser in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteSecurityLevel getSecurityLevel(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean logout(java.lang.String in0) throws java.rmi.RemoteException;
    public void addComment(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteComment in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject getProjectWithSchemesById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteSecurityLevel[] getSecurityLevels(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteAvatar[] getProjectAvatars(java.lang.String in0, java.lang.String in1, boolean in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void setProjectAvatar(java.lang.String in0, java.lang.String in1, long in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteAvatar getProjectAvatar(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteProjectAvatar(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteScheme[] getNotificationSchemes(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme[] getPermissionSchemes(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemotePermission[] getAllPermissions(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme createPermissionScheme(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme addPermissionTo(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme in1, com.emorozov.jirabulkclone.jiraservicev2.RemotePermission in2, com.emorozov.jirabulkclone.jiraservicev2.RemoteEntity in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme deletePermissionFrom(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionScheme in1, com.emorozov.jirabulkclone.jiraservicev2.RemotePermission in2, com.emorozov.jirabulkclone.jiraservicev2.RemoteEntity in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deletePermissionScheme(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue createIssueWithSecurityLevel(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue in1, long in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean addAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, byte[][] in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteAttachment[] getAttachmentsFromIssue(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean hasPermissionToEditComment(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteComment in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteComment editComment(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteComment in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteField[] getFieldsForAction(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue progressWorkflowAction(java.lang.String in0, java.lang.String in1, java.lang.String in2, com.emorozov.jirabulkclone.jiraservicev2.RemoteFieldValue[] in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue getIssueById(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog addWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog in2, java.lang.String in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog addWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog addWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteWorklogWithNewRemainingEstimate(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteWorklogAndRetainRemainingEstimate(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void updateWorklogWithNewRemainingEstimate(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog in1, java.lang.String in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void updateWorklogAndAutoAdjustRemainingEstimate(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void updateWorklogAndRetainRemainingEstimate(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteWorklog[] getWorklogs(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean hasPermissionToCreateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean hasPermissionToDeleteWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean hasPermissionToUpdateWorklog(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public java.util.Calendar getResolutionDateByKey(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public java.util.Calendar getResolutionDateById(java.lang.String in0, long in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public long getIssueCountForFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue[] getIssuesFromTextSearch(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue[] getIssuesFromTextSearchWithProject(java.lang.String in0, java.lang.String[] in1, java.lang.String in2, int in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue[] getIssuesFromJqlSearch(java.lang.String in0, java.lang.String in1, int in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteUser(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteGroup updateGroup(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteGroup in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void deleteGroup(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void refreshCustomFields(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteFilter[] getSavedFilters(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public boolean addBase64EncodedAttachmentsToIssue(java.lang.String in0, java.lang.String in1, java.lang.String[] in2, java.lang.String[] in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject createProjectFromObject(java.lang.String in0, com.emorozov.jirabulkclone.jiraservicev2.RemoteProject in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteValidationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteScheme[] getSecuritySchemes(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteVersion addVersion(java.lang.String in0, java.lang.String in1, com.emorozov.jirabulkclone.jiraservicev2.RemoteVersion in2) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue[] getIssuesFromFilter(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue[] getIssuesFromFilterWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteIssue[] getIssuesFromTextSearchWithLimit(java.lang.String in0, java.lang.String in1, int in2, int in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public com.emorozov.jirabulkclone.jiraservicev2.RemoteProject[] getProjectsNoSchemes(java.lang.String in0) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteAuthenticationException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
    public void setNewProjectAvatar(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException, com.emorozov.jirabulkclone.jiraservicev2.RemotePermissionException, com.emorozov.jirabulkclone.jiraservicev2.RemoteException;
}