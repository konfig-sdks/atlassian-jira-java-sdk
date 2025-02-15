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
 * A reference to the location of the error. This will be null if the error does not refer to a specific element.
 */
@ApiModel(description = "A reference to the location of the error. This will be null if the error does not refer to a specific element.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowElementReference {
  public static final String SERIALIZED_NAME_PROPERTY_KEY = "propertyKey";
  @SerializedName(SERIALIZED_NAME_PROPERTY_KEY)
  private String propertyKey;

  public static final String SERIALIZED_NAME_RULE_ID = "ruleId";
  @SerializedName(SERIALIZED_NAME_RULE_ID)
  private String ruleId;

  public static final String SERIALIZED_NAME_STATUS_MAPPING_REFERENCE = "statusMappingReference";
  @SerializedName(SERIALIZED_NAME_STATUS_MAPPING_REFERENCE)
  private ProjectAndIssueTypePair statusMappingReference;

  public static final String SERIALIZED_NAME_STATUS_REFERENCE = "statusReference";
  @SerializedName(SERIALIZED_NAME_STATUS_REFERENCE)
  private String statusReference;

  public static final String SERIALIZED_NAME_TRANSITION_ID = "transitionId";
  @SerializedName(SERIALIZED_NAME_TRANSITION_ID)
  private String transitionId;

  public WorkflowElementReference() {
  }

  public WorkflowElementReference propertyKey(String propertyKey) {
    
    
    
    
    this.propertyKey = propertyKey;
    return this;
  }

   /**
   * A property key.
   * @return propertyKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A property key.")

  public String getPropertyKey() {
    return propertyKey;
  }


  public void setPropertyKey(String propertyKey) {
    
    
    
    this.propertyKey = propertyKey;
  }


  public WorkflowElementReference ruleId(String ruleId) {
    
    
    
    
    this.ruleId = ruleId;
    return this;
  }

   /**
   * A rule ID.
   * @return ruleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A rule ID.")

  public String getRuleId() {
    return ruleId;
  }


  public void setRuleId(String ruleId) {
    
    
    
    this.ruleId = ruleId;
  }


  public WorkflowElementReference statusMappingReference(ProjectAndIssueTypePair statusMappingReference) {
    
    
    
    
    this.statusMappingReference = statusMappingReference;
    return this;
  }

   /**
   * Get statusMappingReference
   * @return statusMappingReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectAndIssueTypePair getStatusMappingReference() {
    return statusMappingReference;
  }


  public void setStatusMappingReference(ProjectAndIssueTypePair statusMappingReference) {
    
    
    
    this.statusMappingReference = statusMappingReference;
  }


  public WorkflowElementReference statusReference(String statusReference) {
    
    
    
    
    this.statusReference = statusReference;
    return this;
  }

   /**
   * A status reference.
   * @return statusReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A status reference.")

  public String getStatusReference() {
    return statusReference;
  }


  public void setStatusReference(String statusReference) {
    
    
    
    this.statusReference = statusReference;
  }


  public WorkflowElementReference transitionId(String transitionId) {
    
    
    
    
    this.transitionId = transitionId;
    return this;
  }

   /**
   * A transition ID.
   * @return transitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A transition ID.")

  public String getTransitionId() {
    return transitionId;
  }


  public void setTransitionId(String transitionId) {
    
    
    
    this.transitionId = transitionId;
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
   * @return the WorkflowElementReference instance itself
   */
  public WorkflowElementReference putAdditionalProperty(String key, Object value) {
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
    WorkflowElementReference workflowElementReference = (WorkflowElementReference) o;
    return Objects.equals(this.propertyKey, workflowElementReference.propertyKey) &&
        Objects.equals(this.ruleId, workflowElementReference.ruleId) &&
        Objects.equals(this.statusMappingReference, workflowElementReference.statusMappingReference) &&
        Objects.equals(this.statusReference, workflowElementReference.statusReference) &&
        Objects.equals(this.transitionId, workflowElementReference.transitionId)&&
        Objects.equals(this.additionalProperties, workflowElementReference.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyKey, ruleId, statusMappingReference, statusReference, transitionId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowElementReference {\n");
    sb.append("    propertyKey: ").append(toIndentedString(propertyKey)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    statusMappingReference: ").append(toIndentedString(statusMappingReference)).append("\n");
    sb.append("    statusReference: ").append(toIndentedString(statusReference)).append("\n");
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
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
    openapiFields.add("propertyKey");
    openapiFields.add("ruleId");
    openapiFields.add("statusMappingReference");
    openapiFields.add("statusReference");
    openapiFields.add("transitionId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowElementReference
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowElementReference.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowElementReference is not found in the empty JSON string", WorkflowElementReference.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("propertyKey") != null && !jsonObj.get("propertyKey").isJsonNull()) && !jsonObj.get("propertyKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `propertyKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("propertyKey").toString()));
      }
      if ((jsonObj.get("ruleId") != null && !jsonObj.get("ruleId").isJsonNull()) && !jsonObj.get("ruleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleId").toString()));
      }
      // validate the optional field `statusMappingReference`
      if (jsonObj.get("statusMappingReference") != null && !jsonObj.get("statusMappingReference").isJsonNull()) {
        ProjectAndIssueTypePair.validateJsonObject(jsonObj.getAsJsonObject("statusMappingReference"));
      }
      if ((jsonObj.get("statusReference") != null && !jsonObj.get("statusReference").isJsonNull()) && !jsonObj.get("statusReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReference").toString()));
      }
      if ((jsonObj.get("transitionId") != null && !jsonObj.get("transitionId").isJsonNull()) && !jsonObj.get("transitionId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `transitionId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("transitionId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowElementReference.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowElementReference' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowElementReference> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowElementReference.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowElementReference>() {
           @Override
           public void write(JsonWriter out, WorkflowElementReference value) throws IOException {
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
           public WorkflowElementReference read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowElementReference instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowElementReference given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowElementReference
  * @throws IOException if the JSON string is invalid with respect to WorkflowElementReference
  */
  public static WorkflowElementReference fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowElementReference.class);
  }

 /**
  * Convert an instance of WorkflowElementReference to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

