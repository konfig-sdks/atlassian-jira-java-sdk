/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT-9aad01a33a3dae75a5b6aedf98c77d2cbd2f865d
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.ProjectEmailAddress;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectEmailApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectEmailApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectEmailApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getSenderEmailCall(Long projectId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectId}/email"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getSenderEmailValidateBeforeCall(Long projectId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getSenderEmail(Async)");
        }

        return getSenderEmailCall(projectId, _callback);

    }


    private ApiResponse<ProjectEmailAddress> getSenderEmailWithHttpInfo(Long projectId) throws ApiException {
        okhttp3.Call localVarCall = getSenderEmailValidateBeforeCall(projectId, null);
        Type localVarReturnType = new TypeToken<ProjectEmailAddress>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSenderEmailAsync(Long projectId, final ApiCallback<ProjectEmailAddress> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSenderEmailValidateBeforeCall(projectId, _callback);
        Type localVarReturnType = new TypeToken<ProjectEmailAddress>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetSenderEmailRequestBuilder {
        private final Long projectId;

        private GetSenderEmailRequestBuilder(Long projectId) {
            this.projectId = projectId;
        }

        /**
         * Build call for getSenderEmail
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSenderEmailCall(projectId, _callback);
        }


        /**
         * Execute getSenderEmail request
         * @return ProjectEmailAddress
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ProjectEmailAddress execute() throws ApiException {
            ApiResponse<ProjectEmailAddress> localVarResp = getSenderEmailWithHttpInfo(projectId);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getSenderEmail request with HTTP info returned
         * @return ApiResponse&lt;ProjectEmailAddress&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ProjectEmailAddress> executeWithHttpInfo() throws ApiException {
            return getSenderEmailWithHttpInfo(projectId);
        }

        /**
         * Execute getSenderEmail request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ProjectEmailAddress> _callback) throws ApiException {
            return getSenderEmailAsync(projectId, _callback);
        }
    }

    /**
     * Get project&#39;s sender email
     * Returns the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  **[Permissions](https://dac-static.atlassian.com) required:** *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.
     * @param projectId The project ID. (required)
     * @return GetSenderEmailRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to read project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project or project&#39;s sender email address is not found. </td><td>  -  </td></tr>
     </table>
     */
    public GetSenderEmailRequestBuilder getSenderEmail(Long projectId) throws IllegalArgumentException {
        if (projectId == null) throw new IllegalArgumentException("\"projectId\" is required but got null");
        return new GetSenderEmailRequestBuilder(projectId);
    }
    private okhttp3.Call setSenderEmailCall(Long projectId, ProjectEmailAddress projectEmailAddress, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = projectEmailAddress;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectId}/email"
            .replace("{" + "projectId" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "OAuth2", "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call setSenderEmailValidateBeforeCall(Long projectId, ProjectEmailAddress projectEmailAddress, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling setSenderEmail(Async)");
        }

        // verify the required parameter 'projectEmailAddress' is set
        if (projectEmailAddress == null) {
            throw new ApiException("Missing the required parameter 'projectEmailAddress' when calling setSenderEmail(Async)");
        }

        return setSenderEmailCall(projectId, projectEmailAddress, _callback);

    }


    private ApiResponse<Object> setSenderEmailWithHttpInfo(Long projectId, ProjectEmailAddress projectEmailAddress) throws ApiException {
        okhttp3.Call localVarCall = setSenderEmailValidateBeforeCall(projectId, projectEmailAddress, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call setSenderEmailAsync(Long projectId, ProjectEmailAddress projectEmailAddress, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = setSenderEmailValidateBeforeCall(projectId, projectEmailAddress, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class SetSenderEmailRequestBuilder {
        private final Long projectId;
        private String emailAddress;
        private List<String> emailAddressStatus;

        private SetSenderEmailRequestBuilder(Long projectId) {
            this.projectId = projectId;
        }

        /**
         * Set emailAddress
         * @param emailAddress The email address. (optional)
         * @return SetSenderEmailRequestBuilder
         */
        public SetSenderEmailRequestBuilder emailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
            return this;
        }
        
        /**
         * Set emailAddressStatus
         * @param emailAddressStatus When using a custom domain, the status of the email address. (optional)
         * @return SetSenderEmailRequestBuilder
         */
        public SetSenderEmailRequestBuilder emailAddressStatus(List<String> emailAddressStatus) {
            this.emailAddressStatus = emailAddressStatus;
            return this;
        }
        
        /**
         * Build call for setSenderEmail
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            ProjectEmailAddress projectEmailAddress = buildBodyParams();
            return setSenderEmailCall(projectId, projectEmailAddress, _callback);
        }

        private ProjectEmailAddress buildBodyParams() {
            ProjectEmailAddress projectEmailAddress = new ProjectEmailAddress();
            projectEmailAddress.emailAddress(this.emailAddress);
            projectEmailAddress.emailAddressStatus(this.emailAddressStatus);
            return projectEmailAddress;
        }

        /**
         * Execute setSenderEmail request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ProjectEmailAddress projectEmailAddress = buildBodyParams();
            ApiResponse<Object> localVarResp = setSenderEmailWithHttpInfo(projectId, projectEmailAddress);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute setSenderEmail request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            ProjectEmailAddress projectEmailAddress = buildBodyParams();
            return setSenderEmailWithHttpInfo(projectId, projectEmailAddress);
        }

        /**
         * Execute setSenderEmail request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            ProjectEmailAddress projectEmailAddress = buildBodyParams();
            return setSenderEmailAsync(projectId, projectEmailAddress, _callback);
        }
    }

    /**
     * Set project&#39;s sender email
     * Sets the [project&#39;s sender email address](https://confluence.atlassian.com/x/dolKLg).  If &#x60;emailAddress&#x60; is an empty string, the default email address is restored.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) or *Administer Projects* [project permission.](https://confluence.atlassian.com/x/yodKLg)
     * @param projectId The project ID. (required)
     * @param projectEmailAddress The project&#39;s sender email address to be set. (required)
     * @return SetSenderEmailRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the project&#39;s sender email address is successfully set. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is not valid, if the email address is not valid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user does not have permission to administer the project. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public SetSenderEmailRequestBuilder setSenderEmail(Long projectId) throws IllegalArgumentException {
        if (projectId == null) throw new IllegalArgumentException("\"projectId\" is required but got null");
        return new SetSenderEmailRequestBuilder(projectId);
    }
}