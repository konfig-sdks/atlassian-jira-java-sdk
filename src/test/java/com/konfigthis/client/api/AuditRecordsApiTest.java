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
import com.konfigthis.client.model.AuditRecords;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AuditRecordsApi
 */
@Disabled
public class AuditRecordsApiTest {

    private static AuditRecordsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AuditRecordsApi(apiClient);
    }

    /**
     * Get audit records
     *
     * Returns a list of audit records. The list can be filtered to include items:   *  where each item in &#x60;filter&#x60; has at least one match in any of these fields:           *  &#x60;summary&#x60;      *  &#x60;category&#x60;      *  &#x60;eventSource&#x60;      *  &#x60;objectItem.name&#x60; If the object is a user, account ID is available to filter.      *  &#x60;objectItem.parentName&#x60;      *  &#x60;objectItem.typeName&#x60;      *  &#x60;changedValues.changedFrom&#x60;      *  &#x60;changedValues.changedTo&#x60;      *  &#x60;remoteAddress&#x60;          For example, if &#x60;filter&#x60; contains *man ed*, an audit record containing &#x60;summary\&quot;: \&quot;User added to group\&quot;&#x60; and &#x60;\&quot;category\&quot;: \&quot;group management\&quot;&#x60; is returned.  *  created on or after a date and time.  *  created or or before a date and time.  **[Permissions](https://dac-static.atlassian.com) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAuditRecordsTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        String filter = null;
        String from = null;
        String to = null;
        AuditRecords response = api.getAuditRecords()
                .offset(offset)
                .limit(limit)
                .filter(filter)
                .from(from)
                .to(to)
                .execute();
        // TODO: test validations
    }

}
