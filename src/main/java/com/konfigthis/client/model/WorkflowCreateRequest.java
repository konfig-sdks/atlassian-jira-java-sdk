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
import com.konfigthis.client.model.WorkflowCreate;
import com.konfigthis.client.model.WorkflowScope;
import com.konfigthis.client.model.WorkflowStatusUpdate;
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
 * The create workflows payload.
 */
@ApiModel(description = "The create workflows payload.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowCreateRequest {
  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private WorkflowScope scope;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<WorkflowStatusUpdate> statuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_WORKFLOWS = "workflows";
  @SerializedName(SERIALIZED_NAME_WORKFLOWS)
  private List<WorkflowCreate> workflows = new ArrayList<>();

  public WorkflowCreateRequest() {
  }

  public WorkflowCreateRequest scope(WorkflowScope scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkflowScope getScope() {
    return scope;
  }


  public void setScope(WorkflowScope scope) {
    
    
    
    this.scope = scope;
  }


  public WorkflowCreateRequest statuses(List<WorkflowStatusUpdate> statuses) {
    
    
    
    
    this.statuses = statuses;
    return this;
  }

  public WorkflowCreateRequest addStatusesItem(WorkflowStatusUpdate statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses to associate with the workflows.
   * @return statuses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The statuses to associate with the workflows.")

  public List<WorkflowStatusUpdate> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<WorkflowStatusUpdate> statuses) {
    
    
    
    this.statuses = statuses;
  }


  public WorkflowCreateRequest workflows(List<WorkflowCreate> workflows) {
    
    
    
    
    this.workflows = workflows;
    return this;
  }

  public WorkflowCreateRequest addWorkflowsItem(WorkflowCreate workflowsItem) {
    this.workflows.add(workflowsItem);
    return this;
  }

   /**
   * The details of the workflows to create.
   * @return workflows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The details of the workflows to create.")

  public List<WorkflowCreate> getWorkflows() {
    return workflows;
  }


  public void setWorkflows(List<WorkflowCreate> workflows) {
    
    
    
    this.workflows = workflows;
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
   * @return the WorkflowCreateRequest instance itself
   */
  public WorkflowCreateRequest putAdditionalProperty(String key, Object value) {
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
    WorkflowCreateRequest workflowCreateRequest = (WorkflowCreateRequest) o;
    return Objects.equals(this.scope, workflowCreateRequest.scope) &&
        Objects.equals(this.statuses, workflowCreateRequest.statuses) &&
        Objects.equals(this.workflows, workflowCreateRequest.workflows)&&
        Objects.equals(this.additionalProperties, workflowCreateRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scope, statuses, workflows, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowCreateRequest {\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
    openapiFields.add("scope");
    openapiFields.add("statuses");
    openapiFields.add("workflows");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("scope");
    openapiRequiredFields.add("statuses");
    openapiRequiredFields.add("workflows");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowCreateRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowCreateRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowCreateRequest is not found in the empty JSON string", WorkflowCreateRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowCreateRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // validate the required field `scope`
      WorkflowScope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      // ensure the json data is an array
      if (!jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }

      JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
      // validate the required field `statuses` (array)
      for (int i = 0; i < jsonArraystatuses.size(); i++) {
        WorkflowStatusUpdate.validateJsonObject(jsonArraystatuses.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("workflows").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `workflows` to be an array in the JSON string but got `%s`", jsonObj.get("workflows").toString()));
      }

      JsonArray jsonArrayworkflows = jsonObj.getAsJsonArray("workflows");
      // validate the required field `workflows` (array)
      for (int i = 0; i < jsonArrayworkflows.size(); i++) {
        WorkflowCreate.validateJsonObject(jsonArrayworkflows.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowCreateRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowCreateRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowCreateRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowCreateRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowCreateRequest>() {
           @Override
           public void write(JsonWriter out, WorkflowCreateRequest value) throws IOException {
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
           public WorkflowCreateRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowCreateRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowCreateRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowCreateRequest
  * @throws IOException if the JSON string is invalid with respect to WorkflowCreateRequest
  */
  public static WorkflowCreateRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowCreateRequest.class);
  }

 /**
  * Convert an instance of WorkflowCreateRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

