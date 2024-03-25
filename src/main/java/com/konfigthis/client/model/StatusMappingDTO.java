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
import com.konfigthis.client.model.StatusMigration;
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
 * The mapping of old to new status ID for a specific project and issue type.
 */
@ApiModel(description = "The mapping of old to new status ID for a specific project and issue type.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class StatusMappingDTO {
  public static final String SERIALIZED_NAME_ISSUE_TYPE_ID = "issueTypeId";
  @SerializedName(SERIALIZED_NAME_ISSUE_TYPE_ID)
  private String issueTypeId;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_STATUS_MIGRATIONS = "statusMigrations";
  @SerializedName(SERIALIZED_NAME_STATUS_MIGRATIONS)
  private List<StatusMigration> statusMigrations = new ArrayList<>();

  public StatusMappingDTO() {
  }

  public StatusMappingDTO issueTypeId(String issueTypeId) {
    
    
    
    
    this.issueTypeId = issueTypeId;
    return this;
  }

   /**
   * The issue type for the status mapping.
   * @return issueTypeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The issue type for the status mapping.")

  public String getIssueTypeId() {
    return issueTypeId;
  }


  public void setIssueTypeId(String issueTypeId) {
    
    
    
    this.issueTypeId = issueTypeId;
  }


  public StatusMappingDTO projectId(String projectId) {
    
    
    
    
    this.projectId = projectId;
    return this;
  }

   /**
   * The project for the status mapping.
   * @return projectId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The project for the status mapping.")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    
    
    
    this.projectId = projectId;
  }


  public StatusMappingDTO statusMigrations(List<StatusMigration> statusMigrations) {
    
    
    
    
    this.statusMigrations = statusMigrations;
    return this;
  }

  public StatusMappingDTO addStatusMigrationsItem(StatusMigration statusMigrationsItem) {
    this.statusMigrations.add(statusMigrationsItem);
    return this;
  }

   /**
   * The list of old and new status ID mappings for the specified project and issue type.
   * @return statusMigrations
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The list of old and new status ID mappings for the specified project and issue type.")

  public List<StatusMigration> getStatusMigrations() {
    return statusMigrations;
  }


  public void setStatusMigrations(List<StatusMigration> statusMigrations) {
    
    
    
    this.statusMigrations = statusMigrations;
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
   * @return the StatusMappingDTO instance itself
   */
  public StatusMappingDTO putAdditionalProperty(String key, Object value) {
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
    StatusMappingDTO statusMappingDTO = (StatusMappingDTO) o;
    return Objects.equals(this.issueTypeId, statusMappingDTO.issueTypeId) &&
        Objects.equals(this.projectId, statusMappingDTO.projectId) &&
        Objects.equals(this.statusMigrations, statusMappingDTO.statusMigrations)&&
        Objects.equals(this.additionalProperties, statusMappingDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueTypeId, projectId, statusMigrations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusMappingDTO {\n");
    sb.append("    issueTypeId: ").append(toIndentedString(issueTypeId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    statusMigrations: ").append(toIndentedString(statusMigrations)).append("\n");
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
    openapiFields.add("issueTypeId");
    openapiFields.add("projectId");
    openapiFields.add("statusMigrations");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueTypeId");
    openapiRequiredFields.add("projectId");
    openapiRequiredFields.add("statusMigrations");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatusMappingDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!StatusMappingDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatusMappingDTO is not found in the empty JSON string", StatusMappingDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StatusMappingDTO.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("issueTypeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueTypeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("issueTypeId").toString()));
      }
      if (!jsonObj.get("projectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectId").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("statusMigrations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusMigrations` to be an array in the JSON string but got `%s`", jsonObj.get("statusMigrations").toString()));
      }

      JsonArray jsonArraystatusMigrations = jsonObj.getAsJsonArray("statusMigrations");
      // validate the required field `statusMigrations` (array)
      for (int i = 0; i < jsonArraystatusMigrations.size(); i++) {
        StatusMigration.validateJsonObject(jsonArraystatusMigrations.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatusMappingDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatusMappingDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatusMappingDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatusMappingDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<StatusMappingDTO>() {
           @Override
           public void write(JsonWriter out, StatusMappingDTO value) throws IOException {
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
           public StatusMappingDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             StatusMappingDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of StatusMappingDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatusMappingDTO
  * @throws IOException if the JSON string is invalid with respect to StatusMappingDTO
  */
  public static StatusMappingDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatusMappingDTO.class);
  }

 /**
  * Convert an instance of StatusMappingDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

