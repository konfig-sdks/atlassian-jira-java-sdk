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
import com.konfigthis.client.model.ProjectRoleGroup;
import com.konfigthis.client.model.ProjectRoleUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

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
 * Details about a user assigned to a project role.
 */
@ApiModel(description = "Details about a user assigned to a project role.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RoleActor {
  public static final String SERIALIZED_NAME_ACTOR_GROUP = "actorGroup";
  @SerializedName(SERIALIZED_NAME_ACTOR_GROUP)
  private ProjectRoleGroup actorGroup;

  public static final String SERIALIZED_NAME_ACTOR_USER = "actorUser";
  @SerializedName(SERIALIZED_NAME_ACTOR_USER)
  private ProjectRoleUser actorUser;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatarUrl";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private URI avatarUrl;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * The type of role actor.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
 public enum TypeEnum {
    GROUP_ROLE_ACTOR("atlassian-group-role-actor"),
    
    USER_ROLE_ACTOR("atlassian-user-role-actor");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public RoleActor() {
  }

  
  public RoleActor(
     URI avatarUrl, 
     String displayName, 
     Long id, 
     String name, 
     TypeEnum type
  ) {
    this();
    this.avatarUrl = avatarUrl;
    this.displayName = displayName;
    this.id = id;
    this.name = name;
    this.type = type;
  }

  public RoleActor actorGroup(ProjectRoleGroup actorGroup) {
    
    
    
    
    this.actorGroup = actorGroup;
    return this;
  }

   /**
   * Get actorGroup
   * @return actorGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectRoleGroup getActorGroup() {
    return actorGroup;
  }


  public void setActorGroup(ProjectRoleGroup actorGroup) {
    
    
    
    this.actorGroup = actorGroup;
  }


  public RoleActor actorUser(ProjectRoleUser actorUser) {
    
    
    
    
    this.actorUser = actorUser;
    return this;
  }

   /**
   * Get actorUser
   * @return actorUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProjectRoleUser getActorUser() {
    return actorUser;
  }


  public void setActorUser(ProjectRoleUser actorUser) {
    
    
    
    this.actorUser = actorUser;
  }


   /**
   * The avatar of the role actor.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The avatar of the role actor.")

  public URI getAvatarUrl() {
    return avatarUrl;
  }




   /**
   * The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user&#39;s name.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the role actor. For users, depending on the user’s privacy setting, this may return an alternative value for the user's name.")

  public String getDisplayName() {
    return displayName;
  }




   /**
   * The ID of the role actor.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the role actor.")

  public Long getId() {
    return id;
  }




   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")

  public String getName() {
    return name;
  }




   /**
   * The type of role actor.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of role actor.")

  public TypeEnum getType() {
    return type;
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
   * @return the RoleActor instance itself
   */
  public RoleActor putAdditionalProperty(String key, Object value) {
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
    RoleActor roleActor = (RoleActor) o;
    return Objects.equals(this.actorGroup, roleActor.actorGroup) &&
        Objects.equals(this.actorUser, roleActor.actorUser) &&
        Objects.equals(this.avatarUrl, roleActor.avatarUrl) &&
        Objects.equals(this.displayName, roleActor.displayName) &&
        Objects.equals(this.id, roleActor.id) &&
        Objects.equals(this.name, roleActor.name) &&
        Objects.equals(this.type, roleActor.type)&&
        Objects.equals(this.additionalProperties, roleActor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actorGroup, actorUser, avatarUrl, displayName, id, name, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoleActor {\n");
    sb.append("    actorGroup: ").append(toIndentedString(actorGroup)).append("\n");
    sb.append("    actorUser: ").append(toIndentedString(actorUser)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("actorGroup");
    openapiFields.add("actorUser");
    openapiFields.add("avatarUrl");
    openapiFields.add("displayName");
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RoleActor
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RoleActor.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RoleActor is not found in the empty JSON string", RoleActor.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `actorGroup`
      if (jsonObj.get("actorGroup") != null && !jsonObj.get("actorGroup").isJsonNull()) {
        ProjectRoleGroup.validateJsonObject(jsonObj.getAsJsonObject("actorGroup"));
      }
      // validate the optional field `actorUser`
      if (jsonObj.get("actorUser") != null && !jsonObj.get("actorUser").isJsonNull()) {
        ProjectRoleUser.validateJsonObject(jsonObj.getAsJsonObject("actorUser"));
      }
      if ((jsonObj.get("avatarUrl") != null && !jsonObj.get("avatarUrl").isJsonNull()) && !jsonObj.get("avatarUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `avatarUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("avatarUrl").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RoleActor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RoleActor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RoleActor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RoleActor.class));

       return (TypeAdapter<T>) new TypeAdapter<RoleActor>() {
           @Override
           public void write(JsonWriter out, RoleActor value) throws IOException {
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
           public RoleActor read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RoleActor instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RoleActor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RoleActor
  * @throws IOException if the JSON string is invalid with respect to RoleActor
  */
  public static RoleActor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RoleActor.class);
  }

 /**
  * Convert an instance of RoleActor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
