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
import com.konfigthis.client.model.SimpleListWrapperApplicationRole;
import com.konfigthis.client.model.SimpleListWrapperGroupName;
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
 * A user with details as permitted by the user&#39;s Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, &#x60;displayName&#x60; provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, &#x60;accountId&#x60; returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.
 */
@ApiModel(description = "A user with details as permitted by the user's Atlassian Account privacy settings. However, be aware of these exceptions:   *  User record deleted from Atlassian: This occurs as the result of a right to be forgotten request. In this case, `displayName` provides an indication and other parameters have default values or are blank (for example, email is blank).  *  User record corrupted: This occurs as a results of events such as a server import and can only happen to deleted users. In this case, `accountId` returns *unknown* and all other parameters have fallback values.  *  User record unavailable: This usually occurs due to an internal service outage. In this case, all parameters have fallback values.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class User {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
 public enum AccountTypeEnum {
    ATLASSIAN("atlassian"),
    
    APP("app"),
    
    CUSTOMER("customer"),
    
    UNKNOWN("unknown");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AccountTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "accountType";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AccountTypeEnum accountType;

  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Boolean active;

  public static final String SERIALIZED_NAME_APPLICATION_ROLES = "applicationRoles";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ROLES)
  private SimpleListWrapperApplicationRole applicationRoles;

  public static final String SERIALIZED_NAME_AVATAR_URLS = "avatarUrls";
  @SerializedName(SERIALIZED_NAME_AVATAR_URLS)
  private AvatarUrlsBean avatarUrls;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_EMAIL_ADDRESS = "emailAddress";
  @SerializedName(SERIALIZED_NAME_EMAIL_ADDRESS)
  private String emailAddress;

  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private SimpleListWrapperGroupName groups;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private URI self;

  public static final String SERIALIZED_NAME_TIME_ZONE = "timeZone";
  @SerializedName(SERIALIZED_NAME_TIME_ZONE)
  private String timeZone;

  public User() {
  }

  
  public User(
     AccountTypeEnum accountType, 
     Boolean active, 
     String displayName, 
     String emailAddress, 
     String expand, 
     String locale, 
     URI self, 
     String timeZone
  ) {
    this();
    this.accountType = accountType;
    this.active = active;
    this.displayName = displayName;
    this.emailAddress = emailAddress;
    this.expand = expand;
    this.locale = locale;
    this.self = self;
    this.timeZone = timeZone;
  }

  public User accountId(String accountId) {
    
    
    
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account ID of the user, which uniquely identifies the user across all Atlassian products. For example, *5b10ac8d82e05b22cc7d4ef5*. Required in requests.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    
    
    
    this.accountId = accountId;
  }


   /**
   * The user account type. Can take the following values:   *  &#x60;atlassian&#x60; regular Atlassian user account  *  &#x60;app&#x60; system account used for Connect applications and OAuth to represent external systems  *  &#x60;customer&#x60; Jira Service Desk account representing an external service desk
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user account type. Can take the following values:   *  `atlassian` regular Atlassian user account  *  `app` system account used for Connect applications and OAuth to represent external systems  *  `customer` Jira Service Desk account representing an external service desk")

  public AccountTypeEnum getAccountType() {
    return accountType;
  }




   /**
   * Whether the user is active.
   * @return active
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the user is active.")

  public Boolean getActive() {
    return active;
  }




  public User applicationRoles(SimpleListWrapperApplicationRole applicationRoles) {
    
    
    
    
    this.applicationRoles = applicationRoles;
    return this;
  }

   /**
   * The application roles the user is assigned to.
   * @return applicationRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The application roles the user is assigned to.")

  public SimpleListWrapperApplicationRole getApplicationRoles() {
    return applicationRoles;
  }


  public void setApplicationRoles(SimpleListWrapperApplicationRole applicationRoles) {
    
    
    
    this.applicationRoles = applicationRoles;
  }


  public User avatarUrls(AvatarUrlsBean avatarUrls) {
    
    
    
    
    this.avatarUrls = avatarUrls;
    return this;
  }

   /**
   * The avatars of the user.
   * @return avatarUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The avatars of the user.")

  public AvatarUrlsBean getAvatarUrls() {
    return avatarUrls;
  }


  public void setAvatarUrls(AvatarUrlsBean avatarUrls) {
    
    
    
    this.avatarUrls = avatarUrls;
  }


   /**
   * The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The display name of the user. Depending on the user’s privacy setting, this may return an alternative value.")

  public String getDisplayName() {
    return displayName;
  }




   /**
   * The email address of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email address of the user. Depending on the user’s privacy setting, this may be returned as null.")

  public String getEmailAddress() {
    return emailAddress;
  }




   /**
   * Expand options that include additional user details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional user details in the response.")

  public String getExpand() {
    return expand;
  }




  public User groups(SimpleListWrapperGroupName groups) {
    
    
    
    
    this.groups = groups;
    return this;
  }

   /**
   * The groups that the user belongs to.
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The groups that the user belongs to.")

  public SimpleListWrapperGroupName getGroups() {
    return groups;
  }


  public void setGroups(SimpleListWrapperGroupName groups) {
    
    
    
    this.groups = groups;
  }


  public User key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This property is no longer available and will be removed from the documentation soon. See the [deprecation notice](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


   /**
   * The locale of the user. Depending on the user’s privacy setting, this may be returned as null.
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The locale of the user. Depending on the user’s privacy setting, this may be returned as null.")

  public String getLocale() {
    return locale;
  }




  public User name(String name) {
    
    
    
    
    this.name = name;
    return this;
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


  public void setName(String name) {
    
    
    
    this.name = name;
  }


   /**
   * The URL of the user.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the user.")

  public URI getSelf() {
    return self;
  }




   /**
   * The time zone specified in the user&#39;s profile. Depending on the user’s privacy setting, this may be returned as null.
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time zone specified in the user's profile. Depending on the user’s privacy setting, this may be returned as null.")

  public String getTimeZone() {
    return timeZone;
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
   * @return the User instance itself
   */
  public User putAdditionalProperty(String key, Object value) {
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
    User user = (User) o;
    return Objects.equals(this.accountId, user.accountId) &&
        Objects.equals(this.accountType, user.accountType) &&
        Objects.equals(this.active, user.active) &&
        Objects.equals(this.applicationRoles, user.applicationRoles) &&
        Objects.equals(this.avatarUrls, user.avatarUrls) &&
        Objects.equals(this.displayName, user.displayName) &&
        Objects.equals(this.emailAddress, user.emailAddress) &&
        Objects.equals(this.expand, user.expand) &&
        Objects.equals(this.groups, user.groups) &&
        Objects.equals(this.key, user.key) &&
        Objects.equals(this.locale, user.locale) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.self, user.self) &&
        Objects.equals(this.timeZone, user.timeZone)&&
        Objects.equals(this.additionalProperties, user.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, active, applicationRoles, avatarUrls, displayName, emailAddress, expand, groups, key, locale, name, self, timeZone, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    applicationRoles: ").append(toIndentedString(applicationRoles)).append("\n");
    sb.append("    avatarUrls: ").append(toIndentedString(avatarUrls)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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
    openapiFields.add("accountId");
    openapiFields.add("accountType");
    openapiFields.add("active");
    openapiFields.add("applicationRoles");
    openapiFields.add("avatarUrls");
    openapiFields.add("displayName");
    openapiFields.add("emailAddress");
    openapiFields.add("expand");
    openapiFields.add("groups");
    openapiFields.add("key");
    openapiFields.add("locale");
    openapiFields.add("name");
    openapiFields.add("self");
    openapiFields.add("timeZone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to User
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("accountId") != null && !jsonObj.get("accountId").isJsonNull()) && !jsonObj.get("accountId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountId").toString()));
      }
      if ((jsonObj.get("accountType") != null && !jsonObj.get("accountType").isJsonNull()) && !jsonObj.get("accountType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `accountType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("accountType").toString()));
      }
      // validate the optional field `applicationRoles`
      if (jsonObj.get("applicationRoles") != null && !jsonObj.get("applicationRoles").isJsonNull()) {
        SimpleListWrapperApplicationRole.validateJsonObject(jsonObj.getAsJsonObject("applicationRoles"));
      }
      // validate the optional field `avatarUrls`
      if (jsonObj.get("avatarUrls") != null && !jsonObj.get("avatarUrls").isJsonNull()) {
        AvatarUrlsBean.validateJsonObject(jsonObj.getAsJsonObject("avatarUrls"));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("emailAddress") != null && !jsonObj.get("emailAddress").isJsonNull()) && !jsonObj.get("emailAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailAddress").toString()));
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      // validate the optional field `groups`
      if (jsonObj.get("groups") != null && !jsonObj.get("groups").isJsonNull()) {
        SimpleListWrapperGroupName.validateJsonObject(jsonObj.getAsJsonObject("groups"));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if ((jsonObj.get("timeZone") != null && !jsonObj.get("timeZone").isJsonNull()) && !jsonObj.get("timeZone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeZone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeZone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
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
           public User read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             User instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of User given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of User
  * @throws IOException if the JSON string is invalid with respect to User
  */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

 /**
  * Convert an instance of User to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

