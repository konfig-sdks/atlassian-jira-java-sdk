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


import com.konfigthis.client.model.ServiceRegistry;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ServiceRegistryApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ServiceRegistryApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ServiceRegistryApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
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

    private okhttp3.Call getAttributesOfServiceRegistriesCall(List<String> serviceIds, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/rest/atlassian-connect/1/service-registry";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (serviceIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "serviceIds", serviceIds));
        }

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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAttributesOfServiceRegistriesValidateBeforeCall(List<String> serviceIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'serviceIds' is set
        if (serviceIds == null) {
            throw new ApiException("Missing the required parameter 'serviceIds' when calling getAttributesOfServiceRegistries(Async)");
        }

        return getAttributesOfServiceRegistriesCall(serviceIds, _callback);

    }


    private ApiResponse<List<ServiceRegistry>> getAttributesOfServiceRegistriesWithHttpInfo(List<String> serviceIds) throws ApiException {
        okhttp3.Call localVarCall = getAttributesOfServiceRegistriesValidateBeforeCall(serviceIds, null);
        Type localVarReturnType = new TypeToken<List<ServiceRegistry>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getAttributesOfServiceRegistriesAsync(List<String> serviceIds, final ApiCallback<List<ServiceRegistry>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAttributesOfServiceRegistriesValidateBeforeCall(serviceIds, _callback);
        Type localVarReturnType = new TypeToken<List<ServiceRegistry>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetAttributesOfServiceRegistriesRequestBuilder {
        private final List<String> serviceIds;

        private GetAttributesOfServiceRegistriesRequestBuilder(List<String> serviceIds) {
            this.serviceIds = serviceIds;
        }

        /**
         * Build call for getAttributesOfServiceRegistries
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> The request needs to be authenticated. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> The request isn&#39;t authorized. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> The endpoint failed internally. </td><td>  -  </td></tr>
            <tr><td> 501 </td><td> The endpoint isn&#39;t ready for receiving requests. </td><td>  -  </td></tr>
            <tr><td> 504 </td><td> The upstream service is busy. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getAttributesOfServiceRegistriesCall(serviceIds, _callback);
        }


        /**
         * Execute getAttributesOfServiceRegistries request
         * @return List&lt;ServiceRegistry&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> The request needs to be authenticated. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> The request isn&#39;t authorized. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> The endpoint failed internally. </td><td>  -  </td></tr>
            <tr><td> 501 </td><td> The endpoint isn&#39;t ready for receiving requests. </td><td>  -  </td></tr>
            <tr><td> 504 </td><td> The upstream service is busy. </td><td>  -  </td></tr>
         </table>
         */
        public List<ServiceRegistry> execute() throws ApiException {
            ApiResponse<List<ServiceRegistry>> localVarResp = getAttributesOfServiceRegistriesWithHttpInfo(serviceIds);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getAttributesOfServiceRegistries request with HTTP info returned
         * @return ApiResponse&lt;List&lt;ServiceRegistry&gt;&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> The request needs to be authenticated. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> The request isn&#39;t authorized. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> The endpoint failed internally. </td><td>  -  </td></tr>
            <tr><td> 501 </td><td> The endpoint isn&#39;t ready for receiving requests. </td><td>  -  </td></tr>
            <tr><td> 504 </td><td> The upstream service is busy. </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<List<ServiceRegistry>> executeWithHttpInfo() throws ApiException {
            return getAttributesOfServiceRegistriesWithHttpInfo(serviceIds);
        }

        /**
         * Execute getAttributesOfServiceRegistries request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
            <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
            <tr><td> 401 </td><td> The request needs to be authenticated. </td><td>  -  </td></tr>
            <tr><td> 403 </td><td> The request isn&#39;t authorized. </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> The endpoint failed internally. </td><td>  -  </td></tr>
            <tr><td> 501 </td><td> The endpoint isn&#39;t ready for receiving requests. </td><td>  -  </td></tr>
            <tr><td> 504 </td><td> The upstream service is busy. </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<List<ServiceRegistry>> _callback) throws ApiException {
            return getAttributesOfServiceRegistriesAsync(serviceIds, _callback);
        }
    }

    /**
     * Retrieve the attributes of service registries
     * Retrieve the attributes of given service registries.  **[Permissions](https://dac-static.atlassian.com) required:** Only Connect apps can make this request and the servicesIds belong to the tenant you are requesting
     * @param serviceIds The ID of the services (the strings starting with \&quot;b:\&quot; need to be decoded in Base64). (required)
     * @return GetAttributesOfServiceRegistriesRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Returned if the request is successful. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Returned if the request is invalid. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> The request needs to be authenticated. </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> The request isn&#39;t authorized. </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> The endpoint failed internally. </td><td>  -  </td></tr>
        <tr><td> 501 </td><td> The endpoint isn&#39;t ready for receiving requests. </td><td>  -  </td></tr>
        <tr><td> 504 </td><td> The upstream service is busy. </td><td>  -  </td></tr>
     </table>
     */
    public GetAttributesOfServiceRegistriesRequestBuilder getAttributesOfServiceRegistries(List<String> serviceIds) throws IllegalArgumentException {
        if (serviceIds == null) throw new IllegalArgumentException("\"serviceIds\" is required but got null");
        return new GetAttributesOfServiceRegistriesRequestBuilder(serviceIds);
    }
}
