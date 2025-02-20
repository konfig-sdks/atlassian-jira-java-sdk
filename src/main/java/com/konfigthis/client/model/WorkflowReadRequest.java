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
import com.konfigthis.client.model.ProjectAndIssueTypePair;
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
 * WorkflowReadRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowReadRequest {
  public static final String SERIALIZED_NAME_PROJECT_AND_ISSUE_TYPES = "projectAndIssueTypes";
  @SerializedName(SERIALIZED_NAME_PROJECT_AND_ISSUE_TYPES)
  private List<ProjectAndIssueTypePair> projectAndIssueTypes = null;

  public static final String SERIALIZED_NAME_WORKFLOW_IDS = "workflowIds";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_IDS)
  private List<String> workflowIds = null;

  public static final String SERIALIZED_NAME_WORKFLOW_NAMES = "workflowNames";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_NAMES)
  private List<String> workflowNames = null;

  public WorkflowReadRequest() {
  }

  public WorkflowReadRequest projectAndIssueTypes(List<ProjectAndIssueTypePair> projectAndIssueTypes) {
    
    
    
    
    this.projectAndIssueTypes = projectAndIssueTypes;
    return this;
  }

  public WorkflowReadRequest addProjectAndIssueTypesItem(ProjectAndIssueTypePair projectAndIssueTypesItem) {
    if (this.projectAndIssueTypes == null) {
      this.projectAndIssueTypes = new ArrayList<>();
    }
    this.projectAndIssueTypes.add(projectAndIssueTypesItem);
    return this;
  }

   /**
   * The list of projects and issue types to query.
   * @return projectAndIssueTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of projects and issue types to query.")

  public List<ProjectAndIssueTypePair> getProjectAndIssueTypes() {
    return projectAndIssueTypes;
  }


  public void setProjectAndIssueTypes(List<ProjectAndIssueTypePair> projectAndIssueTypes) {
    
    
    
    this.projectAndIssueTypes = projectAndIssueTypes;
  }


  public WorkflowReadRequest workflowIds(List<String> workflowIds) {
    
    
    
    
    this.workflowIds = workflowIds;
    return this;
  }

  public WorkflowReadRequest addWorkflowIdsItem(String workflowIdsItem) {
    if (this.workflowIds == null) {
      this.workflowIds = new ArrayList<>();
    }
    this.workflowIds.add(workflowIdsItem);
    return this;
  }

   /**
   * The list of workflow IDs to query.
   * @return workflowIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of workflow IDs to query.")

  public List<String> getWorkflowIds() {
    return workflowIds;
  }


  public void setWorkflowIds(List<String> workflowIds) {
    
    
    
    this.workflowIds = workflowIds;
  }


  public WorkflowReadRequest workflowNames(List<String> workflowNames) {
    
    
    
    
    this.workflowNames = workflowNames;
    return this;
  }

  public WorkflowReadRequest addWorkflowNamesItem(String workflowNamesItem) {
    if (this.workflowNames == null) {
      this.workflowNames = new ArrayList<>();
    }
    this.workflowNames.add(workflowNamesItem);
    return this;
  }

   /**
   * The list of workflow names to query.
   * @return workflowNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of workflow names to query.")

  public List<String> getWorkflowNames() {
    return workflowNames;
  }


  public void setWorkflowNames(List<String> workflowNames) {
    
    
    
    this.workflowNames = workflowNames;
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
   * @return the WorkflowReadRequest instance itself
   */
  public WorkflowReadRequest putAdditionalProperty(String key, Object value) {
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
    WorkflowReadRequest workflowReadRequest = (WorkflowReadRequest) o;
    return Objects.equals(this.projectAndIssueTypes, workflowReadRequest.projectAndIssueTypes) &&
        Objects.equals(this.workflowIds, workflowReadRequest.workflowIds) &&
        Objects.equals(this.workflowNames, workflowReadRequest.workflowNames)&&
        Objects.equals(this.additionalProperties, workflowReadRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(projectAndIssueTypes, workflowIds, workflowNames, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowReadRequest {\n");
    sb.append("    projectAndIssueTypes: ").append(toIndentedString(projectAndIssueTypes)).append("\n");
    sb.append("    workflowIds: ").append(toIndentedString(workflowIds)).append("\n");
    sb.append("    workflowNames: ").append(toIndentedString(workflowNames)).append("\n");
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
    openapiFields.add("projectAndIssueTypes");
    openapiFields.add("workflowIds");
    openapiFields.add("workflowNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowReadRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowReadRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowReadRequest is not found in the empty JSON string", WorkflowReadRequest.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("projectAndIssueTypes") != null && !jsonObj.get("projectAndIssueTypes").isJsonNull()) {
        JsonArray jsonArrayprojectAndIssueTypes = jsonObj.getAsJsonArray("projectAndIssueTypes");
        if (jsonArrayprojectAndIssueTypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projectAndIssueTypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projectAndIssueTypes` to be an array in the JSON string but got `%s`", jsonObj.get("projectAndIssueTypes").toString()));
          }

          // validate the optional field `projectAndIssueTypes` (array)
          for (int i = 0; i < jsonArrayprojectAndIssueTypes.size(); i++) {
            ProjectAndIssueTypePair.validateJsonObject(jsonArrayprojectAndIssueTypes.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workflowIds") != null && !jsonObj.get("workflowIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowIds` to be an array in the JSON string but got `%s`", jsonObj.get("workflowIds").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("workflowNames") != null && !jsonObj.get("workflowNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflowNames` to be an array in the JSON string but got `%s`", jsonObj.get("workflowNames").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowReadRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowReadRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowReadRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowReadRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowReadRequest>() {
           @Override
           public void write(JsonWriter out, WorkflowReadRequest value) throws IOException {
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
           public WorkflowReadRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowReadRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowReadRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowReadRequest
  * @throws IOException if the JSON string is invalid with respect to WorkflowReadRequest
  */
  public static WorkflowReadRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowReadRequest.class);
  }

 /**
  * Convert an instance of WorkflowReadRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

