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


import com.konfigthis.client.model.ApplicationRole;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ApplicationRolesApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ApplicationRolesApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationRolesApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAllCall(final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/applicationrole";

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getAllCall(_callback);

    }


    private ApiResponse<List<ApplicationRole>> getAllWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getAllValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<List<ApplicationRole>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAllAsync(final ApiCallback<List<ApplicationRole>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<List<ApplicationRole>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAllRequestBuilder {

        private GetAllRequestBuilder() {
        }

        /**
         * Build call for getAll
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAllCall(_callback);
        }


        /**
         * Execute getAll request
         * @return List&lt;ApplicationRole&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
         </table>
         */
        public List<ApplicationRole> execute() throws ApiException {
            ApiResponse<List<ApplicationRole>> localVarResp = getAllWithHttpInfo();
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAll request with HTTP info returned
         * @return ApiResponse&lt;List&lt;ApplicationRole&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ApplicationRole>> executeWithHttpInfo() throws ApiException {
            return getAllWithHttpInfo();
        }

        /**
         * Execute getAll request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ApplicationRole>> _callback) throws ApiException {
            return getAllAsync(_callback);
        }
    }

    /**
     * Get all application roles
     * Returns all application roles. In Jira, application roles are managed using the [Application access configuration](https://confluence.atlassian.com/x/3YxjL) page.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @return GetAllRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
     </table>
     */
    public GetAllRequestBuilder getAll() throws IllegalArgumentException {
        return new GetAllRequestBuilder();
    }
    private okhttp3.Call getRoleCall(String key, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/api/3/applicationrole/{key}"
            .replace("{" + "key" + "}", localVarApiClient.escapeString(key.toString()));

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

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getRoleValidateBeforeCall(String key, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'key' is set
        if (key == null) {
            throw new ApiException("Missing the required parameter 'key' when calling getRole(Async)");
        }

        return getRoleCall(key, _callback);

    }


    private ApiResponse<ApplicationRole> getRoleWithHttpInfo(String key) throws ApiException {
        okhttp3.Call localVarCall = getRoleValidateBeforeCall(key, null);
        Type localVarReturnType = new TypeToken<ApplicationRole>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getRoleAsync(String key, final ApiCallback<ApplicationRole> _callback) throws ApiException {

        okhttp3.Call localVarCall = getRoleValidateBeforeCall(key, _callback);
        Type localVarReturnType = new TypeToken<ApplicationRole>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetRoleRequestBuilder {
        private final String key;

        private GetRoleRequestBuilder(String key) {
            this.key = key;
        }

        /**
         * Build call for getRole
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the role is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getRoleCall(key, _callback);
        }


        /**
         * Execute getRole request
         * @return ApplicationRole
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the role is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApplicationRole execute() throws ApiException {
            ApiResponse<ApplicationRole> localVarResp = getRoleWithHttpInfo(key);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getRole request with HTTP info returned
         * @return ApiResponse&lt;ApplicationRole&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the role is not found. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ApplicationRole> executeWithHttpInfo() throws ApiException {
            return getRoleWithHttpInfo(key);
        }

        /**
         * Execute getRole request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> Returned if the role is not found. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ApplicationRole> _callback) throws ApiException {
            return getRoleAsync(key, _callback);
        }
    }

    /**
     * Get application role
     * Returns an application role.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     * @param key The key of the application role. Use the [Get all application roles](https://dac-static.atlassian.com) operation to get the key for each application role. (required)
     * @return GetRoleRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Returned if the authentication credentials are incorrect or missing. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Returned if the user is not an administrator. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Returned if the role is not found. </td><td>  -  </td></tr>
     </table>
     */
    public GetRoleRequestBuilder getRole(String key) throws IllegalArgumentException {
        if (key == null) throw new IllegalArgumentException("\"key\" is required but got null");
            

        return new GetRoleRequestBuilder(key);
    }
}
