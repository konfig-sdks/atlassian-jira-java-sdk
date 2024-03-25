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
import com.konfigthis.client.model.ProjectIssueTypes;
import com.konfigthis.client.model.WorkflowScope;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

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
 * Details of a status.
 */
@ApiModel(description = "Details of a status.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JiraWorkflowStatus {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private WorkflowScope scope;

  /**
   * The category of the status.
   */
  @JsonAdapter(StatusCategoryEnum.Adapter.class)
 public enum StatusCategoryEnum {
    TODO("TODO"),
    
    IN_PROGRESS("IN_PROGRESS"),
    
    DONE("DONE");

    private String value;

    StatusCategoryEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusCategoryEnum fromValue(String value) {
      for (StatusCategoryEnum b : StatusCategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusCategoryEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusCategoryEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusCategoryEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusCategoryEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS_CATEGORY = "statusCategory";
  @SerializedName(SERIALIZED_NAME_STATUS_CATEGORY)
  private StatusCategoryEnum statusCategory;

  public static final String SERIALIZED_NAME_STATUS_REFERENCE = "statusReference";
  @SerializedName(SERIALIZED_NAME_STATUS_REFERENCE)
  private String statusReference;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private Set<ProjectIssueTypes> usages = null;

  public JiraWorkflowStatus() {
  }

  public JiraWorkflowStatus description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the status.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the status.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public JiraWorkflowStatus id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the status.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the status.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public JiraWorkflowStatus name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the status.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the status.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JiraWorkflowStatus scope(WorkflowScope scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * Get scope
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowScope getScope() {
    return scope;
  }


  public void setScope(WorkflowScope scope) {
    
    
    
    this.scope = scope;
  }


  public JiraWorkflowStatus statusCategory(StatusCategoryEnum statusCategory) {
    
    
    
    
    this.statusCategory = statusCategory;
    return this;
  }

   /**
   * The category of the status.
   * @return statusCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the status.")

  public StatusCategoryEnum getStatusCategory() {
    return statusCategory;
  }


  public void setStatusCategory(StatusCategoryEnum statusCategory) {
    
    
    
    this.statusCategory = statusCategory;
  }


  public JiraWorkflowStatus statusReference(String statusReference) {
    
    
    
    
    this.statusReference = statusReference;
    return this;
  }

   /**
   * The reference of the status.
   * @return statusReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The reference of the status.")

  public String getStatusReference() {
    return statusReference;
  }


  public void setStatusReference(String statusReference) {
    
    
    
    this.statusReference = statusReference;
  }


  public JiraWorkflowStatus usages(Set<ProjectIssueTypes> usages) {
    
    
    
    
    this.usages = usages;
    return this;
  }

  public JiraWorkflowStatus addUsagesItem(ProjectIssueTypes usagesItem) {
    if (this.usages == null) {
      this.usages = new LinkedHashSet<>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * The &#x60;statuses.usages&#x60; expand is an optional parameter that can be used when reading and updating statuses in Jira. It provides additional information about the projects and issue types associated with the requested statuses.
   * @return usages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The `statuses.usages` expand is an optional parameter that can be used when reading and updating statuses in Jira. It provides additional information about the projects and issue types associated with the requested statuses.")

  public Set<ProjectIssueTypes> getUsages() {
    return usages;
  }


  public void setUsages(Set<ProjectIssueTypes> usages) {
    
    
    
    this.usages = usages;
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
   * @return the JiraWorkflowStatus instance itself
   */
  public JiraWorkflowStatus putAdditionalProperty(String key, Object value) {
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
    JiraWorkflowStatus jiraWorkflowStatus = (JiraWorkflowStatus) o;
    return Objects.equals(this.description, jiraWorkflowStatus.description) &&
        Objects.equals(this.id, jiraWorkflowStatus.id) &&
        Objects.equals(this.name, jiraWorkflowStatus.name) &&
        Objects.equals(this.scope, jiraWorkflowStatus.scope) &&
        Objects.equals(this.statusCategory, jiraWorkflowStatus.statusCategory) &&
        Objects.equals(this.statusReference, jiraWorkflowStatus.statusReference) &&
        Objects.equals(this.usages, jiraWorkflowStatus.usages)&&
        Objects.equals(this.additionalProperties, jiraWorkflowStatus.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, name, scope, statusCategory, statusReference, usages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JiraWorkflowStatus {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    statusCategory: ").append(toIndentedString(statusCategory)).append("\n");
    sb.append("    statusReference: ").append(toIndentedString(statusReference)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("scope");
    openapiFields.add("statusCategory");
    openapiFields.add("statusReference");
    openapiFields.add("usages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JiraWorkflowStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JiraWorkflowStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JiraWorkflowStatus is not found in the empty JSON string", JiraWorkflowStatus.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        WorkflowScope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      }
      if ((jsonObj.get("statusCategory") != null && !jsonObj.get("statusCategory").isJsonNull()) && !jsonObj.get("statusCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusCategory").toString()));
      }
      if ((jsonObj.get("statusReference") != null && !jsonObj.get("statusReference").isJsonNull()) && !jsonObj.get("statusReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusReference").toString()));
      }
      if (jsonObj.get("usages") != null && !jsonObj.get("usages").isJsonNull()) {
        JsonArray jsonArrayusages = jsonObj.getAsJsonArray("usages");
        if (jsonArrayusages != null) {
          // ensure the json data is an array
          if (!jsonObj.get("usages").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `usages` to be an array in the JSON string but got `%s`", jsonObj.get("usages").toString()));
          }

          // validate the optional field `usages` (array)
          for (int i = 0; i < jsonArrayusages.size(); i++) {
            ProjectIssueTypes.validateJsonObject(jsonArrayusages.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JiraWorkflowStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JiraWorkflowStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JiraWorkflowStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JiraWorkflowStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<JiraWorkflowStatus>() {
           @Override
           public void write(JsonWriter out, JiraWorkflowStatus value) throws IOException {
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
           public JiraWorkflowStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JiraWorkflowStatus instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JiraWorkflowStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JiraWorkflowStatus
  * @throws IOException if the JSON string is invalid with respect to JiraWorkflowStatus
  */
  public static JiraWorkflowStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JiraWorkflowStatus.class);
  }

 /**
  * Convert an instance of JiraWorkflowStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

