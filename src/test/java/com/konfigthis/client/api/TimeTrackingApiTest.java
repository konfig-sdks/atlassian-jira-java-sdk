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
import com.konfigthis.client.model.TimeTrackingConfiguration;
import com.konfigthis.client.model.TimeTrackingProvider;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TimeTrackingApi
 */
@Disabled
public class TimeTrackingApiTest {

    private static TimeTrackingApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new TimeTrackingApi(apiClient);
    }

    /**
     * Get all time tracking providers
     *
     * Returns all time tracking providers. By default, Jira only has one time tracking provider: *JIRA provided time tracking*. However, you can install other time tracking providers via apps from the Atlassian Marketplace. For more information on time tracking providers, see the documentation for the [Time Tracking Provider](https://developer.atlassian.com/cloud/jira/platform/modules/time-tracking-provider/) module.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllProvidersTest() throws ApiException {
        List<TimeTrackingProvider> response = api.getAllProviders()
                .execute();
        // TODO: test validations
    }

    /**
     * Get time tracking settings
     *
     * Returns the time tracking settings. This includes settings such as the time format, default time unit, and others. For more information, see [Configuring time tracking](https://confluence.atlassian.com/x/qoXKM).  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTimeTrackingOptionsTest() throws ApiException {
        TimeTrackingConfiguration response = api.getTimeTrackingOptions()
                .execute();
        // TODO: test validations
    }

    /**
     * Select time tracking provider
     *
     * Selects a time tracking provider.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void selectProviderTest() throws ApiException {
        String key = null;
        String name = null;
        String url = null;
        Object response = api.selectProvider(key)
                .name(name)
                .url(url)
                .execute();
        // TODO: test validations
    }

    /**
     * Get selected time tracking provider
     *
     * Returns the time tracking provider that is currently selected. Note that if time tracking is disabled, then a successful but empty response is returned.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void selectedProviderTest() throws ApiException {
        TimeTrackingProvider response = api.selectedProvider()
                .execute();
        // TODO: test validations
    }

    /**
     * Set time tracking settings
     *
     * Sets the time tracking settings.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setOptionsTest() throws ApiException {
        String defaultUnit = null;
        String timeFormat = null;
        Double workingDaysPerWeek = null;
        Double workingHoursPerDay = null;
        TimeTrackingConfiguration response = api.setOptions(defaultUnit, timeFormat, workingDaysPerWeek, workingHoursPerDay)
                .execute();
        // TODO: test validations
    }

}