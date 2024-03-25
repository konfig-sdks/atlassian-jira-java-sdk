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
import com.konfigthis.client.model.PageBeanIssueSecurityLevelMember;
import com.konfigthis.client.model.SecurityLevel;
import java.util.Set;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueSecurityLevelApi
 */
@Disabled
public class IssueSecurityLevelApiTest {

    private static IssueSecurityLevelApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssueSecurityLevelApi(apiClient);
    }

    /**
     * Get issue security level
     *
     * Returns details of an issue security level.  Use [Get issue security scheme](https://dac-static.atlassian.com) to obtain the IDs of issue security levels associated with the issue security scheme.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** None.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getDetailsTest() throws ApiException {
        String id = null;
        SecurityLevel response = api.getDetails(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get issue security level members by issue security scheme
     *
     * Returns issue security level members.  Only issue security level members in context of classic projects are returned.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getLevelMembersTest() throws ApiException {
        Long issueSecuritySchemeId = null;
        Long startAt = null;
        Integer maxResults = null;
        Set<String> issueSecurityLevelId = null;
        String expand = null;
        PageBeanIssueSecurityLevelMember response = api.getLevelMembers(issueSecuritySchemeId)
                .startAt(startAt)
                .maxResults(maxResults)
                .issueSecurityLevelId(issueSecurityLevelId)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

}
