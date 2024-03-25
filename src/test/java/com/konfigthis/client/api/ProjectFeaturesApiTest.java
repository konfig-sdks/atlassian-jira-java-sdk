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

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.ContainerForProjectFeatures;
import com.konfigthis.client.model.ProjectFeatureState;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectFeaturesApi
 */
@Disabled
public class ProjectFeaturesApiTest {

    private static ProjectFeaturesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ProjectFeaturesApi(apiClient);
    }

    /**
     * Get project features
     *
     * Returns the list of features for a project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String projectIdOrKey = null;
        ContainerForProjectFeatures response = api.getList(projectIdOrKey)
                .execute();
        // TODO: test validations
    }

    /**
     * Set project feature state
     *
     * Sets the state of a project feature.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setFeatureStateTest() throws ApiException {
        String projectIdOrKey = null;
        String featureKey = null;
        String state = null;
        ContainerForProjectFeatures response = api.setFeatureState(projectIdOrKey, featureKey)
                .state(state)
                .execute();
        // TODO: test validations
    }

}
