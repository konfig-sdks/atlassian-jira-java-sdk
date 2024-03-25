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
import com.konfigthis.client.model.VersionUsageInCustomField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;
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
 * Various counts of issues within a version.
 */
@ApiModel(description = "Various counts of issues within a version.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VersionIssueCounts {
  public static final String SERIALIZED_NAME_CUSTOM_FIELD_USAGE = "customFieldUsage";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELD_USAGE)
  private List<VersionUsageInCustomField> customFieldUsage = null;

  public static final String SERIALIZED_NAME_ISSUE_COUNT_WITH_CUSTOM_FIELDS_SHOWING_VERSION = "issueCountWithCustomFieldsShowingVersion";
  @SerializedName(SERIALIZED_NAME_ISSUE_COUNT_WITH_CUSTOM_FIELDS_SHOWING_VERSION)
  private Long issueCountWithCustomFieldsShowingVersion;

  public static final String SERIALIZED_NAME_ISSUES_AFFECTED_COUNT = "issuesAffectedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_AFFECTED_COUNT)
  private Long issuesAffectedCount;

  public static final String SERIALIZED_NAME_ISSUES_FIXED_COUNT = "issuesFixedCount";
  @SerializedName(SERIALIZED_NAME_ISSUES_FIXED_COUNT)
  private Long issuesFixedCount;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public VersionIssueCounts() {
  }

  
  public VersionIssueCounts(
     List<VersionUsageInCustomField> customFieldUsage, 
     Long issueCountWithCustomFieldsShowingVersion, 
     Long issuesAffectedCount, 
     Long issuesFixedCount, 
     URI self
  ) {
    this();
    this.customFieldUsage = customFieldUsage;
    this.issueCountWithCustomFieldsShowingVersion = issueCountWithCustomFieldsShowingVersion;
    this.issuesAffectedCount = issuesAffectedCount;
    this.issuesFixedCount = issuesFixedCount;
    this.self = self;
  }

   /**
   * List of custom fields using the version.
   * @return customFieldUsage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of custom fields using the version.")

  public List<VersionUsageInCustomField> getCustomFieldUsage() {
    return customFieldUsage;
  }




   /**
   * Count of issues where a version custom field is set to the version.
   * @return issueCountWithCustomFieldsShowingVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues where a version custom field is set to the version.")

  public Long getIssueCountWithCustomFieldsShowingVersion() {
    return issueCountWithCustomFieldsShowingVersion;
  }




   /**
   * Count of issues where the &#x60;affectedVersion&#x60; is set to the version.
   * @return issuesAffectedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues where the `affectedVersion` is set to the version.")

  public Long getIssuesAffectedCount() {
    return issuesAffectedCount;
  }




   /**
   * Count of issues where the &#x60;fixVersion&#x60; is set to the version.
   * @return issuesFixedCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Count of issues where the `fixVersion` is set to the version.")

  public Long getIssuesFixedCount() {
    return issuesFixedCount;
  }




   /**
   * The URL of these count details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of these count details.")

  public URI getSelf() {
    return self;
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
   * @return the VersionIssueCounts instance itself
   */
  public VersionIssueCounts putAdditionalProperty(String key, Object value) {
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
    VersionIssueCounts versionIssueCounts = (VersionIssueCounts) o;
    return Objects.equals(this.customFieldUsage, versionIssueCounts.customFieldUsage) &&
        Objects.equals(this.issueCountWithCustomFieldsShowingVersion, versionIssueCounts.issueCountWithCustomFieldsShowingVersion) &&
        Objects.equals(this.issuesAffectedCount, versionIssueCounts.issuesAffectedCount) &&
        Objects.equals(this.issuesFixedCount, versionIssueCounts.issuesFixedCount) &&
        Objects.equals(this.self, versionIssueCounts.self)&&
        Objects.equals(this.additionalProperties, versionIssueCounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFieldUsage, issueCountWithCustomFieldsShowingVersion, issuesAffectedCount, issuesFixedCount, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionIssueCounts {\n");
    sb.append("    customFieldUsage: ").append(toIndentedString(customFieldUsage)).append("\n");
    sb.append("    issueCountWithCustomFieldsShowingVersion: ").append(toIndentedString(issueCountWithCustomFieldsShowingVersion)).append("\n");
    sb.append("    issuesAffectedCount: ").append(toIndentedString(issuesAffectedCount)).append("\n");
    sb.append("    issuesFixedCount: ").append(toIndentedString(issuesFixedCount)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("customFieldUsage");
    openapiFields.add("issueCountWithCustomFieldsShowingVersion");
    openapiFields.add("issuesAffectedCount");
    openapiFields.add("issuesFixedCount");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VersionIssueCounts
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VersionIssueCounts.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VersionIssueCounts is not found in the empty JSON string", VersionIssueCounts.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("customFieldUsage") != null && !jsonObj.get("customFieldUsage").isJsonNull()) {
        JsonArray jsonArraycustomFieldUsage = jsonObj.getAsJsonArray("customFieldUsage");
        if (jsonArraycustomFieldUsage != null) {
          // ensure the json data is an array
          if (!jsonObj.get("customFieldUsage").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `customFieldUsage` to be an array in the JSON string but got `%s`", jsonObj.get("customFieldUsage").toString()));
          }

          // validate the optional field `customFieldUsage` (array)
          for (int i = 0; i < jsonArraycustomFieldUsage.size(); i++) {
            VersionUsageInCustomField.validateJsonObject(jsonArraycustomFieldUsage.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VersionIssueCounts.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VersionIssueCounts' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VersionIssueCounts> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VersionIssueCounts.class));

       return (TypeAdapter<T>) new TypeAdapter<VersionIssueCounts>() {
           @Override
           public void write(JsonWriter out, VersionIssueCounts value) throws IOException {
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
           public VersionIssueCounts read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VersionIssueCounts instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VersionIssueCounts given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VersionIssueCounts
  * @throws IOException if the JSON string is invalid with respect to VersionIssueCounts
  */
  public static VersionIssueCounts fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VersionIssueCounts.class);
  }

 /**
  * Convert an instance of VersionIssueCounts to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
