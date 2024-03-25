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
import com.konfigthis.client.model.AvatarUrlsBean;
import com.konfigthis.client.model.IssueTypeIssueCreateMetadata;
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
 * Details of the issue creation metadata for a project.
 */
@ApiModel(description = "Details of the issue creation metadata for a project.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectIssueCreateMetadata {
  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private AvatarUrlsBean avatarUrls;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ISSUETYPES = "issuetypes";
  @SerializedName(SERIALIZED_NAME_ISSUETYPES)
  private List<IssueTypeIssueCreateMetadata> issuetypes = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public ProjectIssueCreateMetadata() {
  }

  
  public ProjectIssueCreateMetadata(
     String expand, 
     String id, 
     List<IssueTypeIssueCreateMetadata> issuetypes, 
     String key, 
     String name, 
     String self
  ) {
    this();
    this.expand = expand;
    this.id = id;
    this.issuetypes = issuetypes;
    this.key = key;
    this.name = name;
    this.self = self;
  }

  public ProjectIssueCreateMetadata avatarUrls(AvatarUrlsBean avatarUrls) {
    
    
    
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * List of the project&#39;s avatars, returning the avatar size and associated URL.
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the project's avatars, returning the avatar size and associated URL.")

  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(AvatarUrlsBean avatarUrls) {
    
    
    
    this.avatarUrls = avatarUrls;
  }


   /**
   * Expand options that include additional project issue create metadata details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional project issue create metadata details in the response.")

  public String getExpand() {
    return expand;
  }




   /**
   * The ID of the project.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the project.")

  public String getId() {
    return id;
  }




   /**
   * List of the issue types supported by the project.
   * @return issuetypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of the issue types supported by the project.")

  public List<IssueTypeIssueCreateMetadata> getIssuetypes() {
    return issuetypes;
  }




   /**
   * The key of the project.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the project.")

  public String getKey() {
    return key;
  }




   /**
   * The name of the project.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the project.")

  public String getName() {
    return name;
  }




   /**
   * The URL of the project.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the project.")

  public String getSelf() {
    return self;
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
   * @return the ProjectIssueCreateMetadata instance itself
   */
  public ProjectIssueCreateMetadata putAdditionalProperty(String key, Object value) {
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
    ProjectIssueCreateMetadata projectIssueCreateMetadata = (ProjectIssueCreateMetadata) o;
    return Objects.equals(this.avatarUrls, projectIssueCreateMetadata.avatarUrls) &&
        Objects.equals(this.expand, projectIssueCreateMetadata.expand) &&
        Objects.equals(this.id, projectIssueCreateMetadata.id) &&
        Objects.equals(this.issuetypes, projectIssueCreateMetadata.issuetypes) &&
        Objects.equals(this.key, projectIssueCreateMetadata.key) &&
        Objects.equals(this.name, projectIssueCreateMetadata.name) &&
        Objects.equals(this.self, projectIssueCreateMetadata.self)&&
        Objects.equals(this.additionalProperties, projectIssueCreateMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avatarUrls, expand, id, issuetypes, key, name, self, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectIssueCreateMetadata {\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    issuetypes: ").append(toIndentedString(issuetypes)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
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
    openapiFields.add("avatarUrls");
    openapiFields.add("expand");
    openapiFields.add("id");
    openapiFields.add("issuetypes");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("self");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectIssueCreateMetadata
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectIssueCreateMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectIssueCreateMetadata is not found in the empty JSON string", ProjectIssueCreateMetadata.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `avatarUrls`
      if (jsonObj.get("avatarUrls") != null && !jsonObj.get("avatarUrls").isJsonNull()) {
        AvatarUrlsBean.validateJsonObject(jsonObj.getAsJsonObject("avatarUrls"));
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("issuetypes") != null && !jsonObj.get("issuetypes").isJsonNull()) {
        JsonArray jsonArrayissuetypes = jsonObj.getAsJsonArray("issuetypes");
        if (jsonArrayissuetypes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issuetypes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issuetypes` to be an array in the JSON string but got `%s`", jsonObj.get("issuetypes").toString()));
          }

          // validate the optional field `issuetypes` (array)
          for (int i = 0; i < jsonArrayissuetypes.size(); i++) {
            IssueTypeIssueCreateMetadata.validateJsonObject(jsonArrayissuetypes.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectIssueCreateMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectIssueCreateMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectIssueCreateMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectIssueCreateMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectIssueCreateMetadata>() {
           @Override
           public void write(JsonWriter out, ProjectIssueCreateMetadata value) throws IOException {
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
           public ProjectIssueCreateMetadata read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectIssueCreateMetadata instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectIssueCreateMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectIssueCreateMetadata
  * @throws IOException if the JSON string is invalid with respect to ProjectIssueCreateMetadata
  */
  public static ProjectIssueCreateMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectIssueCreateMetadata.class);
  }

 /**
  * Convert an instance of ProjectIssueCreateMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

