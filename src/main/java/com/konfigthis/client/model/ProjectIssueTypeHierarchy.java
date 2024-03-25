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
import com.konfigthis.client.model.ProjectIssueTypesHierarchyLevel;
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
 * The hierarchy of issue types within a project.
 */
@ApiModel(description = "The hierarchy of issue types within a project.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectIssueTypeHierarchy {
  public static final String SERIALIZED_NAME_HIERARCHY = "hierarchy";
  @SerializedName(SERIALIZED_NAME_HIERARCHY)
  private List<ProjectIssueTypesHierarchyLevel> hierarchy = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId;

  public ProjectIssueTypeHierarchy() {
  }

  
  public ProjectIssueTypeHierarchy(
     List<ProjectIssueTypesHierarchyLevel> hierarchy, 
     Long projectId
  ) {
    this();
    this.hierarchy = hierarchy;
    this.projectId = projectId;
  }

   /**
   * Details of an issue type hierarchy level.
   * @return hierarchy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of an issue type hierarchy level.")

  public List<ProjectIssueTypesHierarchyLevel> getHierarchy() {
    return hierarchy;
  }




   /**
   * The ID of the project.
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public Long getProjectId() {
    return projectId;
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
   * @return the ProjectIssueTypeHierarchy instance itself
   */
  public ProjectIssueTypeHierarchy putAdditionalProperty(String key, Object value) {
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
    ProjectIssueTypeHierarchy projectIssueTypeHierarchy = (ProjectIssueTypeHierarchy) o;
    return Objects.equals(this.hierarchy, projectIssueTypeHierarchy.hierarchy) &&
        Objects.equals(this.projectId, projectIssueTypeHierarchy.projectId)&&
        Objects.equals(this.additionalProperties, projectIssueTypeHierarchy.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hierarchy, projectId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueTypeHierarchy {\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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
    openapiFields.add("hierarchy");
    openapiFields.add("projectId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectIssueTypeHierarchy
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectIssueTypeHierarchy.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectIssueTypeHierarchy is not found in the empty JSON string", ProjectIssueTypeHierarchy.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("hierarchy") != null && !jsonObj.get("hierarchy").isJsonNull()) {
        JsonArray jsonArrayhierarchy = jsonObj.getAsJsonArray("hierarchy");
        if (jsonArrayhierarchy != null) {
          // ensure the json data is an array
          if (!jsonObj.get("hierarchy").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `hierarchy` to be an array in the JSON string but got `%s`", jsonObj.get("hierarchy").toString()));
          }

          // validate the optional field `hierarchy` (array)
          for (int i = 0; i < jsonArrayhierarchy.size(); i++) {
            ProjectIssueTypesHierarchyLevel.validateJsonObject(jsonArrayhierarchy.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectIssueTypeHierarchy.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectIssueTypeHierarchy' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectIssueTypeHierarchy> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectIssueTypeHierarchy.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectIssueTypeHierarchy>() {
           @Override
           public void write(JsonWriter out, ProjectIssueTypeHierarchy value) throws IOException {
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
           public ProjectIssueTypeHierarchy read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectIssueTypeHierarchy instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectIssueTypeHierarchy given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectIssueTypeHierarchy
  * @throws IOException if the JSON string is invalid with respect to ProjectIssueTypeHierarchy
  */
  public static ProjectIssueTypeHierarchy fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectIssueTypeHierarchy.class);
  }

 /**
  * Convert an instance of ProjectIssueTypeHierarchy to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

