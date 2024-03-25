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
import com.konfigthis.client.model.AppWorkflowTransitionRule;
import com.konfigthis.client.model.WorkflowId;
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
 * A workflow with transition rules.
 */
@ApiModel(description = "A workflow with transition rules.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowTransitionRules {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<AppWorkflowTransitionRule> conditions = null;

  public static final String SERIALIZED_NAME_POST_FUNCTIONS = "postFunctions";
  @SerializedName(SERIALIZED_NAME_POST_FUNCTIONS)
  private List<AppWorkflowTransitionRule> postFunctions = null;

  public static final String SERIALIZED_NAME_VALIDATORS = "validators";
  @SerializedName(SERIALIZED_NAME_VALIDATORS)
  private List<AppWorkflowTransitionRule> validators = null;

  public static final String SERIALIZED_NAME_WORKFLOW_ID = "workflowId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ID)
  private WorkflowId workflowId;

  public WorkflowTransitionRules() {
  }

  public WorkflowTransitionRules conditions(List<AppWorkflowTransitionRule> conditions) {
    
    
    
    
    this.conditions = conditions;
    return this;
  }

  public WorkflowTransitionRules addConditionsItem(AppWorkflowTransitionRule conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * The list of conditions within the workflow.
   * @return conditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of conditions within the workflow.")

  public List<AppWorkflowTransitionRule> getConditions() {
    return conditions;
  }


  public void setConditions(List<AppWorkflowTransitionRule> conditions) {
    
    
    
    this.conditions = conditions;
  }


  public WorkflowTransitionRules postFunctions(List<AppWorkflowTransitionRule> postFunctions) {
    
    
    
    
    this.postFunctions = postFunctions;
    return this;
  }

  public WorkflowTransitionRules addPostFunctionsItem(AppWorkflowTransitionRule postFunctionsItem) {
    if (this.postFunctions == null) {
      this.postFunctions = new ArrayList<>();
    }
    this.postFunctions.add(postFunctionsItem);
    return this;
  }

   /**
   * The list of post functions within the workflow.
   * @return postFunctions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of post functions within the workflow.")

  public List<AppWorkflowTransitionRule> getPostFunctions() {
    return postFunctions;
  }


  public void setPostFunctions(List<AppWorkflowTransitionRule> postFunctions) {
    
    
    
    this.postFunctions = postFunctions;
  }


  public WorkflowTransitionRules validators(List<AppWorkflowTransitionRule> validators) {
    
    
    
    
    this.validators = validators;
    return this;
  }

  public WorkflowTransitionRules addValidatorsItem(AppWorkflowTransitionRule validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

   /**
   * The list of validators within the workflow.
   * @return validators
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of validators within the workflow.")

  public List<AppWorkflowTransitionRule> getValidators() {
    return validators;
  }


  public void setValidators(List<AppWorkflowTransitionRule> validators) {
    
    
    
    this.validators = validators;
  }


  public WorkflowTransitionRules workflowId(WorkflowId workflowId) {
    
    
    
    
    this.workflowId = workflowId;
    return this;
  }

   /**
   * Get workflowId
   * @return workflowId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public WorkflowId getWorkflowId() {
    return workflowId;
  }


  public void setWorkflowId(WorkflowId workflowId) {
    
    
    
    this.workflowId = workflowId;
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
   * @return the WorkflowTransitionRules instance itself
   */
  public WorkflowTransitionRules putAdditionalProperty(String key, Object value) {
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
    WorkflowTransitionRules workflowTransitionRules = (WorkflowTransitionRules) o;
    return Objects.equals(this.conditions, workflowTransitionRules.conditions) &&
        Objects.equals(this.postFunctions, workflowTransitionRules.postFunctions) &&
        Objects.equals(this.validators, workflowTransitionRules.validators) &&
        Objects.equals(this.workflowId, workflowTransitionRules.workflowId)&&
        Objects.equals(this.additionalProperties, workflowTransitionRules.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, postFunctions, validators, workflowId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowTransitionRules {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    postFunctions: ").append(toIndentedString(postFunctions)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
    sb.append("    workflowId: ").append(toIndentedString(workflowId)).append("\n");
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
    openapiFields.add("conditions");
    openapiFields.add("postFunctions");
    openapiFields.add("validators");
    openapiFields.add("workflowId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("workflowId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowTransitionRules
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowTransitionRules.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowTransitionRules is not found in the empty JSON string", WorkflowTransitionRules.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowTransitionRules.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("conditions") != null && !jsonObj.get("conditions").isJsonNull()) {
        JsonArray jsonArrayconditions = jsonObj.getAsJsonArray("conditions");
        if (jsonArrayconditions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("conditions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `conditions` to be an array in the JSON string but got `%s`", jsonObj.get("conditions").toString()));
          }

          // validate the optional field `conditions` (array)
          for (int i = 0; i < jsonArrayconditions.size(); i++) {
            AppWorkflowTransitionRule.validateJsonObject(jsonArrayconditions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("postFunctions") != null && !jsonObj.get("postFunctions").isJsonNull()) {
        JsonArray jsonArraypostFunctions = jsonObj.getAsJsonArray("postFunctions");
        if (jsonArraypostFunctions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("postFunctions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `postFunctions` to be an array in the JSON string but got `%s`", jsonObj.get("postFunctions").toString()));
          }

          // validate the optional field `postFunctions` (array)
          for (int i = 0; i < jsonArraypostFunctions.size(); i++) {
            AppWorkflowTransitionRule.validateJsonObject(jsonArraypostFunctions.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("validators") != null && !jsonObj.get("validators").isJsonNull()) {
        JsonArray jsonArrayvalidators = jsonObj.getAsJsonArray("validators");
        if (jsonArrayvalidators != null) {
          // ensure the json data is an array
          if (!jsonObj.get("validators").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `validators` to be an array in the JSON string but got `%s`", jsonObj.get("validators").toString()));
          }

          // validate the optional field `validators` (array)
          for (int i = 0; i < jsonArrayvalidators.size(); i++) {
            AppWorkflowTransitionRule.validateJsonObject(jsonArrayvalidators.get(i).getAsJsonObject());
          };
        }
      }
      // validate the required field `workflowId`
      WorkflowId.validateJsonObject(jsonObj.getAsJsonObject("workflowId"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowTransitionRules.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowTransitionRules' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowTransitionRules> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowTransitionRules.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowTransitionRules>() {
           @Override
           public void write(JsonWriter out, WorkflowTransitionRules value) throws IOException {
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
           public WorkflowTransitionRules read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowTransitionRules instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowTransitionRules given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowTransitionRules
  * @throws IOException if the JSON string is invalid with respect to WorkflowTransitionRules
  */
  public static WorkflowTransitionRules fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowTransitionRules.class);
  }

 /**
  * Convert an instance of WorkflowTransitionRules to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

