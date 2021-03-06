/*
 * RCoreResult.java
 *
 * Copyright (C) 2010-2016, Microsoft Corporation
 *
 * This program is licensed to you under the terms of Version 2.0 of the
 * Apache License. This program is distributed WITHOUT
 * ANY EXPRESS OR IMPLIED WARRANTY, INCLUDING THOSE OF NON-INFRINGEMENT,
 * MERCHANTABILITY OR FITNESS FOR A PARTICULAR PURPOSE. Please refer to the
 * Apache License 2.0 (http://www.apache.org/licenses/LICENSE-2.0) for more details.
 *
 */
package com.revo.deployr.client.core;

import com.revo.deployr.client.data.RData;

import java.util.List;
import java.util.Map;

import org.apache.http.Header;

/**
 * Represents the result of a completed DeployR API call.
 */
public interface RCoreResult {

    /**
     * Returns the HTTP Response Headers from the DeployR API call that 
     * generated this result.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns response headers.
     */
    public Header[] getHeaders();

    /**
     * Returns the call result status of the DeployR API call.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns true if success, false otherwise.
     */
    public boolean isSuccess();

    /**
     * Returns the interface name of the DeployR API call.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns String
     */
    public String getCall();

    /**
     * Returns a unique id for the request.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns String
     */
    public String getUid();    

    /**
     * Returns identity information on currently logged-in user making the DeployR API call.
     * <br/><br/>
     * String username = identityMap.get("username");
     * <br/>
     * String displayname  = identityMap.get("displayname");
     * <br/><br/>
     * <p/>
     * Available: on WhoAmICall.
     *
     * @returns String
     */
    public Map<String, String> getIdentity();

    /**
     * Returns current system limits on user making the DeployR API call.
     * <br/><br/>
     * <p/>
     * Available: on LoginCall, AboutCall.
     *
     * @returns Map<String, Integer>
     */
    public Map<String, Integer> getLimits();

    /**
     * Returns project on the DeployR API call.
     * <br/><br/>
     *
     * @returns Map
     */
    public Map getProject();

    /**
     * Returns list of projects on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getProjects();

    /**
     * Returns repository file on the DeployR API call.
     * <br/><br/>
     *
     * @returns Map
     */
    public Map getRepoFile();

    /**
     * Returns list of repository files on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getRepoFiles();

    /**
     * Returns list of repository scripts on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getRepoScripts();

    /**
     * Returns repository directory on the DeployR API call.
     * <br/><br/>
     *
     * @returns Map
     */
    public Map getRepoDirectory();

    /**
     * Returns list of repository directories on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getRepoDirectories();

    /**
     * Returns job on the DeployR API call.
     * <br/><br/>
     *
     * @returns Map
     */
    public Map getJob();

    /**
     * Returns list of jobs on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getJobs();

    /**
     * Returns project execution on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public Map getExecution();

    /**
     * Returns the console output on the latest execution on the project.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns String
     */
    public String getConsole();

    /**
     * Returns the warnings on the latest execution on the project.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns List<String>
     */
    public List<String> getWarnings();

    /**
     * Returns list of execution results on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getResults();

    /**
     * Returns list of execution artifacts on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getArtifacts();

    /**
     * Returns directory file on the DeployR API call.
     * <br/><br/>
     *
     * @returns Map
     */
    public Map getDirectoryFile();

    /**
     * Returns list of directory files on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getDirectoryFiles();

    /**
     * Returns list of history (executions) on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getHistory();

    /**
     * Returns list of project packages on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<Map>
     */
    public List<Map> getPackages();

    /**
     * Returns list of encoded R objects on the DeployR API call.
     * <br/><br/>
     *
     * @returns List<RData>
     */
    public List<RData> getRObjects();

    /**
     * Returns error message on failed DeployR API call.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns String
     */
    public String getError();

    /**
     * Returns error code on failed DeployR API call.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns int
     */
    public int getErrorCode();

    /**
     * Returns the HTTP status code on the DeployR API call.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns int
     */
    public int getStatusCode();

    /**
     * Returns the HTTP status message on the DeployR API call.
     * <p/>
     * <br/><br/>
     * Available: always.
     *
     * @returns String
     */
    public String getStatusMsg();

}
