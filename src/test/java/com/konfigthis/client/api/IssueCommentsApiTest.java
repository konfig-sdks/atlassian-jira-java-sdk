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
import com.konfigthis.client.model.Comment;
import com.konfigthis.client.model.EntityProperty;
import com.konfigthis.client.model.IssueCommentListRequestBean;
import java.time.OffsetDateTime;
import com.konfigthis.client.model.PageBeanComment;
import com.konfigthis.client.model.PageOfComments;
import com.konfigthis.client.model.UserDetails;
import com.konfigthis.client.model.Visibility;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueCommentsApi
 */
@Disabled
public class IssueCommentsApiTest {

    private static IssueCommentsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new IssueCommentsApi(apiClient);
    }

    /**
     * Add comment
     *
     * Adds a comment to an issue.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* and *Add comments* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addCommentToIssueTest() throws ApiException {
        String issueIdOrKey = null;
        UserDetails author = null;
        Object body = null;
        OffsetDateTime created = null;
        String id = null;
        Boolean jsdAuthorCanSeeRequest = null;
        Boolean jsdPublic = null;
        List<EntityProperty> properties = null;
        String renderedBody = null;
        String self = null;
        UserDetails updateAuthor = null;
        OffsetDateTime updated = null;
        Visibility visibility = null;
        String expand = null;
        Comment response = api.addCommentToIssue(issueIdOrKey)
                .author(author)
                .body(body)
                .created(created)
                .id(id)
                .jsdAuthorCanSeeRequest(jsdAuthorCanSeeRequest)
                .jsdPublic(jsdPublic)
                .properties(properties)
                .renderedBody(renderedBody)
                .self(self)
                .updateAuthor(updateAuthor)
                .updated(updated)
                .visibility(visibility)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete comment
     *
     * Deletes a comment.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Delete all comments*[project permission](https://confluence.atlassian.com/x/yodKLg) to delete any comment or *Delete own comments* to delete comment created by the user,  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteCommentTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        api.deleteComment(issueIdOrKey, id)
                .execute();
        // TODO: test validations
    }

    /**
     * Get comment
     *
     * Returns a comment.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCommentByIdTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        String expand = null;
        Comment response = api.getCommentById(issueIdOrKey, id)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get comments by IDs
     *
     * Returns a [paginated](https://dac-static.atlassian.com) list of comments specified by a list of comment IDs.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Comments are returned where the user:   *  has *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCommentsByIdsTest() throws ApiException {
        Set<Long> ids = null;
        String expand = null;
        PageBeanComment response = api.getCommentsByIds(ids)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Get comments
     *
     * Returns all comments for an issue.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:** Comments are included in the response where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the comment.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  If the comment has visibility restrictions, belongs to the group or has the role visibility is role visibility is restricted to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listGetTest() throws ApiException {
        String issueIdOrKey = null;
        Long startAt = null;
        Integer maxResults = null;
        String orderBy = null;
        String expand = null;
        PageOfComments response = api.listGet(issueIdOrKey)
                .startAt(startAt)
                .maxResults(maxResults)
                .orderBy(orderBy)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

    /**
     * Update comment
     *
     * Updates a comment.  This operation can be accessed anonymously.  **[Permissions](https://dac-static.atlassian.com) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project that the issue containing the comment is in.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit all comments*[project permission](https://confluence.atlassian.com/x/yodKLg) to update any comment or *Edit own comments* to update comment created by the user.  *  If the comment has visibility restrictions, the user belongs to the group or has the role visibility is restricted to.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateCommentTest() throws ApiException {
        String issueIdOrKey = null;
        String id = null;
        UserDetails author = null;
        Object body = null;
        OffsetDateTime created = null;
        String id = null;
        Boolean jsdAuthorCanSeeRequest = null;
        Boolean jsdPublic = null;
        List<EntityProperty> properties = null;
        String renderedBody = null;
        String self = null;
        UserDetails updateAuthor = null;
        OffsetDateTime updated = null;
        Visibility visibility = null;
        Boolean notifyUsers = null;
        Boolean overrideEditableFlag = null;
        String expand = null;
        Comment response = api.updateComment(issueIdOrKey, id)
                .author(author)
                .body(body)
                .created(created)
                .id(id)
                .jsdAuthorCanSeeRequest(jsdAuthorCanSeeRequest)
                .jsdPublic(jsdPublic)
                .properties(properties)
                .renderedBody(renderedBody)
                .self(self)
                .updateAuthor(updateAuthor)
                .updated(updated)
                .visibility(visibility)
                .notifyUsers(notifyUsers)
                .overrideEditableFlag(overrideEditableFlag)
                .expand(expand)
                .execute();
        // TODO: test validations
    }

}