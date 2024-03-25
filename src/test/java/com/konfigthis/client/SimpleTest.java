package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
        Configuration configuration = new Configuration();
        configuration.host = "https://your-domain.atlassian.net";
        
        // Configure OAuth2 access token for authorization: OAuth2
        configuration.accessToken = "YOUR ACCESS TOKEN";
        
        // Configure HTTP basic authorization: basicAuth
        configuration.username = "YOUR USERNAME";
        configuration.password = "YOUR PASSWORD";
        AtlassianJira client = new AtlassianJira(configuration);
        assertNotNull(client);
    }
}
