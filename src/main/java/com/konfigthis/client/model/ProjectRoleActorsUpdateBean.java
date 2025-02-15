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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * ProjectRoleActorsUpdateBean
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectRoleActorsUpdateBean {
  public static final String SERIALIZED_NAME_CATEGORISED_ACTORS = "categorisedActors";
  @SerializedName(SERIALIZED_NAME_CATEGORISED_ACTORS)
  private Map<String, List<String>> categorisedActors = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public ProjectRoleActorsUpdateBean() {
  }

  
  public ProjectRoleActorsUpdateBean(
     Long id
  ) {
    this();
    this.id = id;
  }

  public ProjectRoleActorsUpdateBean categorisedActors(Map<String, List<String>> categorisedActors) {
    
    
    
    
    this.categorisedActors = categorisedActors;
    return this;
  }

  public ProjectRoleActorsUpdateBean putCategorisedActorsItem(String key, List<String> categorisedActorsItem) {
    if (this.categorisedActors == null) {
      this.categorisedActors = new HashMap<>();
    }
    this.categorisedActors.put(key, categorisedActorsItem);
    return this;
  }

   /**
   * The actors to add to the project role.  Add groups using:   *  &#x60;atlassian-group-role-actor&#x60; and a list of group names.  *  &#x60;atlassian-group-role-actor-id&#x60; and a list of group IDs.  As a group&#39;s name can change, use of &#x60;atlassian-group-role-actor-id&#x60; is recommended. For example, &#x60;\&quot;atlassian-group-role-actor-id\&quot;:[\&quot;eef79f81-0b89-4fca-a736-4be531a10869\&quot;,\&quot;77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\&quot;]&#x60;.  Add users using &#x60;atlassian-user-role-actor&#x60; and a list of account IDs. For example, &#x60;\&quot;atlassian-user-role-actor\&quot;:[\&quot;12345678-9abc-def1-2345-6789abcdef12\&quot;, \&quot;abcdef12-3456-789a-bcde-f123456789ab\&quot;]&#x60;.
   * @return categorisedActors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The actors to add to the project role.  Add groups using:   *  `atlassian-group-role-actor` and a list of group names.  *  `atlassian-group-role-actor-id` and a list of group IDs.  As a group's name can change, use of `atlassian-group-role-actor-id` is recommended. For example, `\"atlassian-group-role-actor-id\":[\"eef79f81-0b89-4fca-a736-4be531a10869\",\"77f6ab39-e755-4570-a6ae-2d7a8df0bcb8\"]`.  Add users using `atlassian-user-role-actor` and a list of account IDs. For example, `\"atlassian-user-role-actor\":[\"12345678-9abc-def1-2345-6789abcdef12\", \"abcdef12-3456-789a-bcde-f123456789ab\"]`.")

  public Map<String, List<String>> getCategorisedActors() {
    return categorisedActors;
  }


  public void setCategorisedActors(Map<String, List<String>> categorisedActors) {
    
    
    
    this.categorisedActors = categorisedActors;
  }


   /**
   * The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project role. Use [Get all project roles](https://dac-static.atlassian.com) to get a list of project role IDs.")

  public Long getId() {
    return id;
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
   * @return the ProjectRoleActorsUpdateBean instance itself
   */
  public ProjectRoleActorsUpdateBean putAdditionalProperty(String key, Object value) {
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
    ProjectRoleActorsUpdateBean projectRoleActorsUpdateBean = (ProjectRoleActorsUpdateBean) o;
    return Objects.equals(this.categorisedActors, projectRoleActorsUpdateBean.categorisedActors) &&
        Objects.equals(this.id, projectRoleActorsUpdateBean.id)&&
        Objects.equals(this.additionalProperties, projectRoleActorsUpdateBean.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categorisedActors, id, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRoleActorsUpdateBean {\n");
    sb.append("    categorisedActors: ").append(toIndentedString(categorisedActors)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("categorisedActors");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectRoleActorsUpdateBean
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectRoleActorsUpdateBean.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectRoleActorsUpdateBean is not found in the empty JSON string", ProjectRoleActorsUpdateBean.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectRoleActorsUpdateBean.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectRoleActorsUpdateBean' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectRoleActorsUpdateBean> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectRoleActorsUpdateBean.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectRoleActorsUpdateBean>() {
           @Override
           public void write(JsonWriter out, ProjectRoleActorsUpdateBean value) throws IOException {
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
           public ProjectRoleActorsUpdateBean read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectRoleActorsUpdateBean instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectRoleActorsUpdateBean given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectRoleActorsUpdateBean
  * @throws IOException if the JSON string is invalid with respect to ProjectRoleActorsUpdateBean
  */
  public static ProjectRoleActorsUpdateBean fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectRoleActorsUpdateBean.class);
  }

 /**
  * Convert an instance of ProjectRoleActorsUpdateBean to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

