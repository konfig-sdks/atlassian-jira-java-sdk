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
import com.konfigthis.client.model.DocumentVersion;
import com.konfigthis.client.model.StatusLayoutUpdate;
import com.konfigthis.client.model.StatusMappingDTO;
import com.konfigthis.client.model.StatusMigration;
import com.konfigthis.client.model.TransitionUpdateDTO;
import com.konfigthis.client.model.WorkflowLayout;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * The details of the workflows to update.
 */
@ApiModel(description = "The details of the workflows to update.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class WorkflowUpdate {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private DocumentVersion version;

  public static final String SERIALIZED_NAME_DEFAULT_STATUS_MAPPINGS = "defaultStatusMappings";
  @SerializedName(SERIALIZED_NAME_DEFAULT_STATUS_MAPPINGS)
  private List<StatusMigration> defaultStatusMappings = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_START_POINT_LAYOUT = "startPointLayout";
  @SerializedName(SERIALIZED_NAME_START_POINT_LAYOUT)
  private WorkflowLayout startPointLayout;

  public static final String SERIALIZED_NAME_STATUS_MAPPINGS = "statusMappings";
  @SerializedName(SERIALIZED_NAME_STATUS_MAPPINGS)
  private List<StatusMappingDTO> statusMappings = null;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<StatusLayoutUpdate> statuses = new ArrayList<>();

  public static final String SERIALIZED_NAME_TRANSITIONS = "transitions";
  @SerializedName(SERIALIZED_NAME_TRANSITIONS)
  private List<TransitionUpdateDTO> transitions = new ArrayList<>();

  public WorkflowUpdate() {
  }

  public WorkflowUpdate description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The new description for this workflow.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The new description for this workflow.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public WorkflowUpdate version(DocumentVersion version) {
    
    
    
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DocumentVersion getVersion() {
    return version;
  }


  public void setVersion(DocumentVersion version) {
    
    
    
    this.version = version;
  }


  public WorkflowUpdate defaultStatusMappings(List<StatusMigration> defaultStatusMappings) {
    
    
    
    
    this.defaultStatusMappings = defaultStatusMappings;
    return this;
  }

  public WorkflowUpdate addDefaultStatusMappingsItem(StatusMigration defaultStatusMappingsItem) {
    if (this.defaultStatusMappings == null) {
      this.defaultStatusMappings = new ArrayList<>();
    }
    this.defaultStatusMappings.add(defaultStatusMappingsItem);
    return this;
  }

   /**
   * The mapping of old to new status ID.
   * @return defaultStatusMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mapping of old to new status ID.")

  public List<StatusMigration> getDefaultStatusMappings() {
    return defaultStatusMappings;
  }


  public void setDefaultStatusMappings(List<StatusMigration> defaultStatusMappings) {
    
    
    
    this.defaultStatusMappings = defaultStatusMappings;
  }


  public WorkflowUpdate id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of this workflow.
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of this workflow.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public WorkflowUpdate startPointLayout(WorkflowLayout startPointLayout) {
    
    
    
    
    this.startPointLayout = startPointLayout;
    return this;
  }

   /**
   * Get startPointLayout
   * @return startPointLayout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowLayout getStartPointLayout() {
    return startPointLayout;
  }


  public void setStartPointLayout(WorkflowLayout startPointLayout) {
    
    
    
    this.startPointLayout = startPointLayout;
  }


  public WorkflowUpdate statusMappings(List<StatusMappingDTO> statusMappings) {
    
    
    
    
    this.statusMappings = statusMappings;
    return this;
  }

  public WorkflowUpdate addStatusMappingsItem(StatusMappingDTO statusMappingsItem) {
    if (this.statusMappings == null) {
      this.statusMappings = new ArrayList<>();
    }
    this.statusMappings.add(statusMappingsItem);
    return this;
  }

   /**
   * The mapping of old to new status ID for a specific project and issue type.
   * @return statusMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The mapping of old to new status ID for a specific project and issue type.")

  public List<StatusMappingDTO> getStatusMappings() {
    return statusMappings;
  }


  public void setStatusMappings(List<StatusMappingDTO> statusMappings) {
    
    
    
    this.statusMappings = statusMappings;
  }


  public WorkflowUpdate statuses(List<StatusLayoutUpdate> statuses) {
    
    
    
    
    this.statuses = statuses;
    return this;
  }

  public WorkflowUpdate addStatusesItem(StatusLayoutUpdate statusesItem) {
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses associated with this workflow.
   * @return statuses
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The statuses associated with this workflow.")

  public List<StatusLayoutUpdate> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<StatusLayoutUpdate> statuses) {
    
    
    
    this.statuses = statuses;
  }


  public WorkflowUpdate transitions(List<TransitionUpdateDTO> transitions) {
    
    
    
    
    this.transitions = transitions;
    return this;
  }

  public WorkflowUpdate addTransitionsItem(TransitionUpdateDTO transitionsItem) {
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The transitions of this workflow.
   * @return transitions
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The transitions of this workflow.")

  public List<TransitionUpdateDTO> getTransitions() {
    return transitions;
  }


  public void setTransitions(List<TransitionUpdateDTO> transitions) {
    
    
    
    this.transitions = transitions;
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
   * @return the WorkflowUpdate instance itself
   */
  public WorkflowUpdate putAdditionalProperty(String key, Object value) {
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
    WorkflowUpdate workflowUpdate = (WorkflowUpdate) o;
    return Objects.equals(this.description, workflowUpdate.description) &&
        Objects.equals(this.version, workflowUpdate.version) &&
        Objects.equals(this.defaultStatusMappings, workflowUpdate.defaultStatusMappings) &&
        Objects.equals(this.id, workflowUpdate.id) &&
        Objects.equals(this.startPointLayout, workflowUpdate.startPointLayout) &&
        Objects.equals(this.statusMappings, workflowUpdate.statusMappings) &&
        Objects.equals(this.statuses, workflowUpdate.statuses) &&
        Objects.equals(this.transitions, workflowUpdate.transitions)&&
        Objects.equals(this.additionalProperties, workflowUpdate.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, version, defaultStatusMappings, id, startPointLayout, statusMappings, statuses, transitions, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowUpdate {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    defaultStatusMappings: ").append(toIndentedString(defaultStatusMappings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startPointLayout: ").append(toIndentedString(startPointLayout)).append("\n");
    sb.append("    statusMappings: ").append(toIndentedString(statusMappings)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("version");
    openapiFields.add("defaultStatusMappings");
    openapiFields.add("id");
    openapiFields.add("startPointLayout");
    openapiFields.add("statusMappings");
    openapiFields.add("statuses");
    openapiFields.add("transitions");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("version");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("statuses");
    openapiRequiredFields.add("transitions");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to WorkflowUpdate
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!WorkflowUpdate.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in WorkflowUpdate is not found in the empty JSON string", WorkflowUpdate.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : WorkflowUpdate.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `version`
      DocumentVersion.validateJsonObject(jsonObj.getAsJsonObject("version"));
      if (jsonObj.get("defaultStatusMappings") != null && !jsonObj.get("defaultStatusMappings").isJsonNull()) {
        JsonArray jsonArraydefaultStatusMappings = jsonObj.getAsJsonArray("defaultStatusMappings");
        if (jsonArraydefaultStatusMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("defaultStatusMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `defaultStatusMappings` to be an array in the JSON string but got `%s`", jsonObj.get("defaultStatusMappings").toString()));
          }

          // validate the optional field `defaultStatusMappings` (array)
          for (int i = 0; i < jsonArraydefaultStatusMappings.size(); i++) {
            StatusMigration.validateJsonObject(jsonArraydefaultStatusMappings.get(i).getAsJsonObject());
          };
        }
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `startPointLayout`
      if (jsonObj.get("startPointLayout") != null && !jsonObj.get("startPointLayout").isJsonNull()) {
        WorkflowLayout.validateJsonObject(jsonObj.getAsJsonObject("startPointLayout"));
      }
      if (jsonObj.get("statusMappings") != null && !jsonObj.get("statusMappings").isJsonNull()) {
        JsonArray jsonArraystatusMappings = jsonObj.getAsJsonArray("statusMappings");
        if (jsonArraystatusMappings != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statusMappings").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statusMappings` to be an array in the JSON string but got `%s`", jsonObj.get("statusMappings").toString()));
          }

          // validate the optional field `statusMappings` (array)
          for (int i = 0; i < jsonArraystatusMappings.size(); i++) {
            StatusMappingDTO.validateJsonObject(jsonArraystatusMappings.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("statuses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
      }

      JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
      // validate the required field `statuses` (array)
      for (int i = 0; i < jsonArraystatuses.size(); i++) {
        StatusLayoutUpdate.validateJsonObject(jsonArraystatuses.get(i).getAsJsonObject());
      };
      // ensure the json data is an array
      if (!jsonObj.get("transitions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `transitions` to be an array in the JSON string but got `%s`", jsonObj.get("transitions").toString()));
      }

      JsonArray jsonArraytransitions = jsonObj.getAsJsonArray("transitions");
      // validate the required field `transitions` (array)
      for (int i = 0; i < jsonArraytransitions.size(); i++) {
        TransitionUpdateDTO.validateJsonObject(jsonArraytransitions.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!WorkflowUpdate.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'WorkflowUpdate' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<WorkflowUpdate> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(WorkflowUpdate.class));

       return (TypeAdapter<T>) new TypeAdapter<WorkflowUpdate>() {
           @Override
           public void write(JsonWriter out, WorkflowUpdate value) throws IOException {
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
           public WorkflowUpdate read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             WorkflowUpdate instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of WorkflowUpdate given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of WorkflowUpdate
  * @throws IOException if the JSON string is invalid with respect to WorkflowUpdate
  */
  public static WorkflowUpdate fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, WorkflowUpdate.class);
  }

 /**
  * Convert an instance of WorkflowUpdate to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

