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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.GroupName;
import com.konfigthis.client.model.UserDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Details of the users and groups to receive the notification.
 */
@ApiModel(description = "Details of the users and groups to receive the notification.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class NotificationRecipients {
  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private Boolean assignee;

  public static final String SERIALIZED_NAME_GROUP_IDS = "groupIds";
  @SerializedName(SERIALIZED_NAME_GROUP_IDS)
  private List<String> groupIds = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<GroupName> groups = null;

  public static final String SERIALIZED_NAME_REPORTER = "reporter";
  @SerializedName(SERIALIZED_NAME_REPORTER)
  private Boolean reporter;

  public static final String SERIALIZED_NAME_USERS = "users";
  @SerializedName(SERIALIZED_NAME_USERS)
  private List<UserDetails> users = null;

  public static final String SERIALIZED_NAME_VOTERS = "voters";
  @SerializedName(SERIALIZED_NAME_VOTERS)
  private Boolean voters;

  public static final String SERIALIZED_NAME_WATCHERS = "watchers";
  @SerializedName(SERIALIZED_NAME_WATCHERS)
  private Boolean watchers;

  public NotificationRecipients() {
  }

  public NotificationRecipients assignee(Boolean assignee) {
    
    
    
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s assignees.
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's assignees.")

  public Boolean getAssignee() {
    return assignee;
  }


  public void setAssignee(Boolean assignee) {
    
    
    
    this.assignee = assignee;
  }


  public NotificationRecipients groupIds(List<String> groupIds) {
    
    
    
    
    this.groupIds = groupIds;
    return this;
  }

  public NotificationRecipients addGroupIdsItem(String groupIdsItem) {
    if (this.groupIds == null) {
      this.groupIds = new ArrayList<>();
    }
    this.groupIds.add(groupIdsItem);
    return this;
  }

   /**
   * List of groupIds to receive the notification.
   * @return groupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of groupIds to receive the notification.")

  public List<String> getGroupIds() {
    return groupIds;
  }


  public void setGroupIds(List<String> groupIds) {
    
    
    
    this.groupIds = groupIds;
  }


  public NotificationRecipients groups(List<GroupName> groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

  public NotificationRecipients addGroupsItem(GroupName groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of groups to receive the notification.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of groups to receive the notification.")

  public List<GroupName> getGroups() {
    return groups;
  }


  public void setGroups(List<GroupName> groups) {
    
    
    
    this.groups = groups;
  }


  public NotificationRecipients reporter(Boolean reporter) {
    
    
    
    
    this.reporter = reporter;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s reporter.
   * @return reporter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's reporter.")

  public Boolean getReporter() {
    return reporter;
  }


  public void setReporter(Boolean reporter) {
    
    
    
    this.reporter = reporter;
  }


  public NotificationRecipients users(List<UserDetails> users) {
    
    
    
    
    this.users = users;
    return this;
  }

  public NotificationRecipients addUsersItem(UserDetails usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users to receive the notification.
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of users to receive the notification.")

  public List<UserDetails> getUsers() {
    return users;
  }


  public void setUsers(List<UserDetails> users) {
    
    
    
    this.users = users;
  }


  public NotificationRecipients voters(Boolean voters) {
    
    
    
    
    this.voters = voters;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s voters.
   * @return voters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's voters.")

  public Boolean getVoters() {
    return voters;
  }


  public void setVoters(Boolean voters) {
    
    
    
    this.voters = voters;
  }


  public NotificationRecipients watchers(Boolean watchers) {
    
    
    
    
    this.watchers = watchers;
    return this;
  }

   /**
   * Whether the notification should be sent to the issue&#39;s watchers.
   * @return watchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the notification should be sent to the issue's watchers.")

  public Boolean getWatchers() {
    return watchers;
  }


  public void setWatchers(Boolean watchers) {
    
    
    
    this.watchers = watchers;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the NotificationRecipients instance itself
   */
  public NotificationRecipients putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationRecipients notificationRecipients = (NotificationRecipients) o;
    return Objects.equals(this.assignee, notificationRecipients.assignee) &&
        Objects.equals(this.groupIds, notificationRecipients.groupIds) &&
        Objects.equals(this.groups, notificationRecipients.groups) &&
        Objects.equals(this.reporter, notificationRecipients.reporter) &&
        Objects.equals(this.users, notificationRecipients.users) &&
        Objects.equals(this.voters, notificationRecipients.voters) &&
        Objects.equals(this.watchers, notificationRecipients.watchers)&&
        Objects.equals(this.additionalProperties, notificationRecipients.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assignee, groupIds, groups, reporter, users, voters, watchers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationRecipients {\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    reporter: ").append(toIndentedString(reporter)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    voters: ").append(toIndentedString(voters)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("assignee");
    openapiFields.add("groupIds");
    openapiFields.add("groups");
    openapiFields.add("reporter");
    openapiFields.add("users");
    openapiFields.add("voters");
    openapiFields.add("watchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to NotificationRecipients
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!NotificationRecipients.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NotificationRecipients is not found in the empty JSON string", NotificationRecipients.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("groupIds") != null && !jsonObj.get("groupIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `groupIds` to be an array in the JSON string but got `%s`", jsonObj.get("groupIds").toString()));
      }
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        JsonArray jsonArraygroups = jsonObj.getAsJsonArray("groups");
        if (jsonArraygroups != null) {
          // ensure the json data is an array
          if (!jsonObj.get("groups").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `groups` to be an array in the JSON string but got `%s`", jsonObj.get("groups").toString()));
          }

          // validate the optional field `groups` (array)
          for (int i = 0; i < jsonArraygroups.size(); i++) {
            GroupName.validateJsonObject(jsonArraygroups.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("users") != null && !jsonObj.get("users").isJsonNull()) {
        JsonArray jsonArrayusers = jsonObj.getAsJsonArray("users");
        if (jsonArrayusers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("users").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `users` to be an array in the JSON string but got `%s`", jsonObj.get("users").toString()));
          }

          // validate the optional field `users` (array)
          for (int i = 0; i < jsonArrayusers.size(); i++) {
            UserDetails.validateJsonObject(jsonArrayusers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationRecipients.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationRecipients' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationRecipients> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationRecipients.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationRecipients>() {
           @Override
           public void write(JsonWriter out, NotificationRecipients value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationRecipients read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             NotificationRecipients instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationRecipients given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationRecipients
  * @throws IOException if the JSON string is invalid with respect to NotificationRecipients
  */
  public static NotificationRecipients fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationRecipients.class);
  }

 /**
  * Convert an instance of NotificationRecipients to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

