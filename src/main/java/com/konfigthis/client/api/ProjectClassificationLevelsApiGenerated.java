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


import com.konfigthis.client.model.UpdateDefaultProjectClassificationBean;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectClassificationLevelsApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectClassificationLevelsApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectClassificationLevelsApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getDefaultDataClassificationLevelFromProjectCall(String projectIdOrKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/project/{projectIdOrKey}/classification-level/default"
            .replace("{" + "projectIdOrKey" + "}", localVarApiClient.escapeString(projectIdOrKey.toString()));

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
    private okhttp3.Call getDefaultDataClassificationLevelFromProjectValidateBeforeCall(String projectIdOrKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'projectIdOrKey' when calling getDefaultDataClassificationLevelFromProject(Async)");
        }

        return getDefaultDataClassificationLevelFromProjectCall(projectIdOrKey, _callback);

    }


    private ApiResponse<String> getDefaultDataClassificationLevelFromProjectWithHttpInfo(String projectIdOrKey) throws ApiException {
        okhttp3.Call localVarCall = getDefaultDataClassificationLevelFromProjectValidateBeforeCall(projectIdOrKey, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getDefaultDataClassificationLevelFromProjectAsync(String projectIdOrKey, final ApiCallback<String> _callback) throws ApiException {

        okhttp3.Call localVarCall = getDefaultDataClassificationLevelFromProjectValidateBeforeCall(projectIdOrKey, _callback);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetDefaultDataClassificationLevelFromProjectRequestBuilder {
        private final String projectIdOrKey;

        private GetDefaultDataClassificationLevelFromProjectRequestBuilder(String projectIdOrKey) {
            this.projectIdOrKey = projectIdOrKey;
        }

        /**
         * Build call for getDefaultDataClassificationLevelFromProject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getDefaultDataClassificationLevelFromProjectCall(projectIdOrKey, _callback);
        }


        /**
         * Execute getDefaultDataClassificationLevelFromProject request
         * @return String
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public String execute() throws ApiException {
            ApiResponse<String> localVarResp = getDefaultDataClassificationLevelFromProjectWithHttpInfo(projectIdOrKey);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getDefaultDataClassificationLevelFromProject request with HTTP info returned
         * @return ApiResponse&lt;String&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<String> executeWithHttpInfo() throws ApiException {
            return getDefaultDataClassificationLevelFromProjectWithHttpInfo(projectIdOrKey);
        }

        /**
         * Execute getDefaultDataClassificationLevelFromProject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<String> _callback) throws ApiException {
            return getDefaultDataClassificationLevelFromProjectAsync(projectIdOrKey, _callback);
        }
    }

    /**
     * Get the default data classification level of a project
     * Returns the default data classification for a project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse Projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param projectIdOrKey The project ID or project key (case-sensitive). (required)
     * @return GetDefaultDataClassificationLevelFromProjectRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public GetDefaultDataClassificationLevelFromProjectRequestBuilder getDefaultDataClassificationLevelFromProject(String projectIdOrKey) throws IllegalArgumentException {
        if (projectIdOrKey == null) throw new IllegalArgumentException("\"projectIdOrKey\" is required but got null");
            

        return new GetDefaultDataClassificationLevelFromProjectRequestBuilder(projectIdOrKey);
    }
    private okhttp3.Call removeDefaultDataClassificationLevelFromProjectCall(String projectIdOrKey, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/project/{projectIdOrKey}/classification-level/default"
            .replace("{" + "projectIdOrKey" + "}", localVarApiClient.escapeString(projectIdOrKey.toString()));

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
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call removeDefaultDataClassificationLevelFromProjectValidateBeforeCall(String projectIdOrKey, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'projectIdOrKey' when calling removeDefaultDataClassificationLevelFromProject(Async)");
        }

        return removeDefaultDataClassificationLevelFromProjectCall(projectIdOrKey, _callback);

    }


    private ApiResponse<Object> removeDefaultDataClassificationLevelFromProjectWithHttpInfo(String projectIdOrKey) throws ApiException {
        okhttp3.Call localVarCall = removeDefaultDataClassificationLevelFromProjectValidateBeforeCall(projectIdOrKey, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call removeDefaultDataClassificationLevelFromProjectAsync(String projectIdOrKey, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = removeDefaultDataClassificationLevelFromProjectValidateBeforeCall(projectIdOrKey, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class RemoveDefaultDataClassificationLevelFromProjectRequestBuilder {
        private final String projectIdOrKey;

        private RemoveDefaultDataClassificationLevelFromProjectRequestBuilder(String projectIdOrKey) {
            this.projectIdOrKey = projectIdOrKey;
        }

        /**
         * Build call for removeDefaultDataClassificationLevelFromProject
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return removeDefaultDataClassificationLevelFromProjectCall(projectIdOrKey, _callback);
        }


        /**
         * Execute removeDefaultDataClassificationLevelFromProject request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            ApiResponse<Object> localVarResp = removeDefaultDataClassificationLevelFromProjectWithHttpInfo(projectIdOrKey);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute removeDefaultDataClassificationLevelFromProject request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            return removeDefaultDataClassificationLevelFromProjectWithHttpInfo(projectIdOrKey);
        }

        /**
         * Execute removeDefaultDataClassificationLevelFromProject request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            return removeDefaultDataClassificationLevelFromProjectAsync(projectIdOrKey, _callback);
        }
    }

    /**
     * Remove the default data classification level from a project
     * Remove the default data classification level for a project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param projectIdOrKey The project ID or project key (case-sensitive). (required)
     * @return RemoveDefaultDataClassificationLevelFromProjectRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public RemoveDefaultDataClassificationLevelFromProjectRequestBuilder removeDefaultDataClassificationLevelFromProject(String projectIdOrKey) throws IllegalArgumentException {
        if (projectIdOrKey == null) throw new IllegalArgumentException("\"projectIdOrKey\" is required but got null");
            

        return new RemoveDefaultDataClassificationLevelFromProjectRequestBuilder(projectIdOrKey);
    }
    private okhttp3.Call updateDefaultDataClassificationLevelCall(String projectIdOrKey, UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = updateDefaultProjectClassificationBean;

        // create path and map variables
        String localVarPath = "/rest/api/3/project/{projectIdOrKey}/classification-level/default"
            .replace("{" + "projectIdOrKey" + "}", localVarApiClient.escapeString(projectIdOrKey.toString()));

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
    private okhttp3.Call updateDefaultDataClassificationLevelValidateBeforeCall(String projectIdOrKey, UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'projectIdOrKey' is set
        if (projectIdOrKey == null) {
            throw new ApiException("Missing the required parameter 'projectIdOrKey' when calling updateDefaultDataClassificationLevel(Async)");
        }

        // verify the required parameter 'updateDefaultProjectClassificationBean' is set
        if (updateDefaultProjectClassificationBean == null) {
            throw new ApiException("Missing the required parameter 'updateDefaultProjectClassificationBean' when calling updateDefaultDataClassificationLevel(Async)");
        }

        return updateDefaultDataClassificationLevelCall(projectIdOrKey, updateDefaultProjectClassificationBean, _callback);

    }


    private ApiResponse<Object> updateDefaultDataClassificationLevelWithHttpInfo(String projectIdOrKey, UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean) throws ApiException {
        okhttp3.Call localVarCall = updateDefaultDataClassificationLevelValidateBeforeCall(projectIdOrKey, updateDefaultProjectClassificationBean, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call updateDefaultDataClassificationLevelAsync(String projectIdOrKey, UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateDefaultDataClassificationLevelValidateBeforeCall(projectIdOrKey, updateDefaultProjectClassificationBean, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class UpdateDefaultDataClassificationLevelRequestBuilder {
        private final String id;
        private final String projectIdOrKey;

        private UpdateDefaultDataClassificationLevelRequestBuilder(String id, String projectIdOrKey) {
            this.id = id;
            this.projectIdOrKey = projectIdOrKey;
        }

        /**
         * Build call for updateDefaultDataClassificationLevel
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean = buildBodyParams();
            return updateDefaultDataClassificationLevelCall(projectIdOrKey, updateDefaultProjectClassificationBean, _callback);
        }

        private UpdateDefaultProjectClassificationBean buildBodyParams() {
            UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean = new UpdateDefaultProjectClassificationBean();
            updateDefaultProjectClassificationBean.id(this.id);
            return updateDefaultProjectClassificationBean;
        }

        /**
         * Execute updateDefaultDataClassificationLevel request
         * @return Object
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public Object execute() throws ApiException {
            UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean = buildBodyParams();
            ApiResponse<Object> localVarResp = updateDefaultDataClassificationLevelWithHttpInfo(projectIdOrKey, updateDefaultProjectClassificationBean);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute updateDefaultDataClassificationLevel request with HTTP info returned
         * @return ApiResponse&lt;Object&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
            UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean = buildBodyParams();
            return updateDefaultDataClassificationLevelWithHttpInfo(projectIdOrKey, updateDefaultProjectClassificationBean);
        }

        /**
         * Execute updateDefaultDataClassificationLevel request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Object> _callback) throws ApiException {
            UpdateDefaultProjectClassificationBean updateDefaultProjectClassificationBean = buildBodyParams();
            return updateDefaultDataClassificationLevelAsync(projectIdOrKey, updateDefaultProjectClassificationBean, _callback);
        }
    }

    /**
     * Update the default data classification level of a project
     * Updates the default data classification level for a project.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Administer projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project.  *  *Administer jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param projectIdOrKey The project ID or project key (case-sensitive). (required)
     * @param updateDefaultProjectClassificationBean  (required)
     * @return UpdateDefaultDataClassificationLevelRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the user does not have the necessary permission. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the project is not found. </td><td>  -  </td></tr>
     </table>
     */
    public UpdateDefaultDataClassificationLevelRequestBuilder updateDefaultDataClassificationLevel(String id, String projectIdOrKey) throws IllegalArgumentException {
        if (id == null) throw new IllegalArgumentException("\"id\" is required but got null");
            

        if (projectIdOrKey == null) throw new IllegalArgumentException("\"projectIdOrKey\" is required but got null");
            

        return new UpdateDefaultDataClassificationLevelRequestBuilder(id, projectIdOrKey);
    }
}
