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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Associated issue type screen scheme and project.
 */
@ApiModel(description = "Associated issue type screen scheme and project.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IssueTypeScreenSchemeProjectAssociation {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_SCREEN_SCHEME_ID = "issueTypeScreenSchemeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_SCREEN_SCHEME_ID)
  private String issueTypeScreenSchemeId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public IssueTypeScreenSchemeProjectAssociation() {
  }

  public IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    
    
    
    
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
    return this;
  }

   /**
   * The ID of the issue type screen scheme.
   * @return issueTypeScreenSchemeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue type screen scheme.")

  public String getIssueTypeScreenSchemeId() {
    return issueTypeScreenSchemeId;
  }


  public void setIssueTypeScreenSchemeId(String issueTypeScreenSchemeId) {
    
    
    
    this.issueTypeScreenSchemeId = issueTypeScreenSchemeId;
  }


  public IssueTypeScreenSchemeProjectAssociation projectId(String projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The ID of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    
    
    
    this.projectId = projectId;
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
   * @return the IssueTypeScreenSchemeProjectAssociation instance itself
   */
  public IssueTypeScreenSchemeProjectAssociation putAdditionalProperty(String key, Object value) {
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
    IssueTypeScreenSchemeProjectAssociation issueTypeScreenSchemeProjectAssociation = (IssueTypeScreenSchemeProjectAssociation) o;
    return Objects.equals(this.issueTypeScreenSchemeId, issueTypeScreenSchemeProjectAssociation.issueTypeScreenSchemeId) &&
        Objects.equals(this.projectId, issueTypeScreenSchemeProjectAssociation.projectId)&&
        Objects.equals(this.additionalProperties, issueTypeScreenSchemeProjectAssociation.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeScreenSchemeId, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueTypeScreenSchemeProjectAssociation {\n");
    sb.append("    issueTypeScreenSchemeId: ").append(toIndentedString(issueTypeScreenSchemeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("issueTypeScreenSchemeId");
    openapiFields.add("projectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueTypeScreenSchemeProjectAssociation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssueTypeScreenSchemeProjectAssociation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueTypeScreenSchemeProjectAssociation is not found in the empty JSON string", IssueTypeScreenSchemeProjectAssociation.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("issueTypeScreenSchemeId") != null && !jsonObj.get("issueTypeScreenSchemeId").isJsonNull()) && !jsonObj.get("issueTypeScreenSchemeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeScreenSchemeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeScreenSchemeId").toString()));
      }
      if ((jsonObj.get("projectId") != null && !jsonObj.get("projectId").isJsonNull()) && !jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueTypeScreenSchemeProjectAssociation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueTypeScreenSchemeProjectAssociation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueTypeScreenSchemeProjectAssociation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueTypeScreenSchemeProjectAssociation.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueTypeScreenSchemeProjectAssociation>() {
           @Override
           public void write(JsonWriter out, IssueTypeScreenSchemeProjectAssociation value) throws IOException {
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
           public IssueTypeScreenSchemeProjectAssociation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueTypeScreenSchemeProjectAssociation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssueTypeScreenSchemeProjectAssociation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueTypeScreenSchemeProjectAssociation
  * @throws IOException if the JSON string is invalid with respect to IssueTypeScreenSchemeProjectAssociation
  */
  public static IssueTypeScreenSchemeProjectAssociation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueTypeScreenSchemeProjectAssociation.class);
  }

 /**
  * Convert an instance of IssueTypeScreenSchemeProjectAssociation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

