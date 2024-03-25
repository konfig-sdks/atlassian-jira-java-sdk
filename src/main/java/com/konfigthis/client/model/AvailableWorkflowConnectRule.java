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
 * The Connect provided ecosystem rules available.
 */
@ApiModel(description = "The Connect provided ecosystem rules available.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AvailableWorkflowConnectRule {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_ADDON_KEY = "addonKey";
  @SerializedName(SERIALIZED_NAME_ADDON_KEY)
  private String addonKey;

  public static final String SERIALIZED_NAME_CREATE_URL = "createUrl";
  @SerializedName(SERIALIZED_NAME_CREATE_URL)
  private String createUrl;

  public static final String SERIALIZED_NAME_EDIT_URL = "editUrl";
  @SerializedName(SERIALIZED_NAME_EDIT_URL)
  private String editUrl;

  public static final String SERIALIZED_NAME_MODULE_KEY = "moduleKey";
  @SerializedName(SERIALIZED_NAME_MODULE_KEY)
  private String moduleKey;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RULE_KEY = "ruleKey";
  @SerializedName(SERIALIZED_NAME_RULE_KEY)
  private String ruleKey;

  /**
   * The rule type.
   */
  @JsonAdapter(RuleTypeEnum.Adapter.class)
 public enum RuleTypeEnum {
    CONDITION("Condition"),
    
    VALIDATOR("Validator"),
    
    FUNCTION("Function"),
    
    SCREEN("Screen");

    private String value;

    RuleTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static RuleTypeEnum fromValue(String value) {
      for (RuleTypeEnum b : RuleTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<RuleTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RuleTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RuleTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return RuleTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_RULE_TYPE = "ruleType";
  @SerializedName(SERIALIZED_NAME_RULE_TYPE)
  private RuleTypeEnum ruleType;

  public static final String SERIALIZED_NAME_VIEW_URL = "viewUrl";
  @SerializedName(SERIALIZED_NAME_VIEW_URL)
  private String viewUrl;

  public AvailableWorkflowConnectRule() {
  }

  public AvailableWorkflowConnectRule description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The rule description.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rule description.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public AvailableWorkflowConnectRule addonKey(String addonKey) {
    
    
    
    
    this.addonKey = addonKey;
    return this;
  }

   /**
   * The add-on providing the rule.
   * @return addonKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The add-on providing the rule.")

  public String getAddonKey() {
    return addonKey;
  }


  public void setAddonKey(String addonKey) {
    
    
    
    this.addonKey = addonKey;
  }


  public AvailableWorkflowConnectRule createUrl(String createUrl) {
    
    
    
    
    this.createUrl = createUrl;
    return this;
  }

   /**
   * The URL creation path segment defined in the Connect module.
   * @return createUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL creation path segment defined in the Connect module.")

  public String getCreateUrl() {
    return createUrl;
  }


  public void setCreateUrl(String createUrl) {
    
    
    
    this.createUrl = createUrl;
  }


  public AvailableWorkflowConnectRule editUrl(String editUrl) {
    
    
    
    
    this.editUrl = editUrl;
    return this;
  }

   /**
   * The URL edit path segment defined in the Connect module.
   * @return editUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL edit path segment defined in the Connect module.")

  public String getEditUrl() {
    return editUrl;
  }


  public void setEditUrl(String editUrl) {
    
    
    
    this.editUrl = editUrl;
  }


  public AvailableWorkflowConnectRule moduleKey(String moduleKey) {
    
    
    
    
    this.moduleKey = moduleKey;
    return this;
  }

   /**
   * The module providing the rule.
   * @return moduleKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The module providing the rule.")

  public String getModuleKey() {
    return moduleKey;
  }


  public void setModuleKey(String moduleKey) {
    
    
    
    this.moduleKey = moduleKey;
  }


  public AvailableWorkflowConnectRule name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The rule name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rule name.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AvailableWorkflowConnectRule ruleKey(String ruleKey) {
    
    
    
    
    this.ruleKey = ruleKey;
    return this;
  }

   /**
   * The rule key.
   * @return ruleKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rule key.")

  public String getRuleKey() {
    return ruleKey;
  }


  public void setRuleKey(String ruleKey) {
    
    
    
    this.ruleKey = ruleKey;
  }


  public AvailableWorkflowConnectRule ruleType(RuleTypeEnum ruleType) {
    
    
    
    
    this.ruleType = ruleType;
    return this;
  }

   /**
   * The rule type.
   * @return ruleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rule type.")

  public RuleTypeEnum getRuleType() {
    return ruleType;
  }


  public void setRuleType(RuleTypeEnum ruleType) {
    
    
    
    this.ruleType = ruleType;
  }


  public AvailableWorkflowConnectRule viewUrl(String viewUrl) {
    
    
    
    
    this.viewUrl = viewUrl;
    return this;
  }

   /**
   * The URL view path segment defined in the Connect module.
   * @return viewUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL view path segment defined in the Connect module.")

  public String getViewUrl() {
    return viewUrl;
  }


  public void setViewUrl(String viewUrl) {
    
    
    
    this.viewUrl = viewUrl;
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
   * @return the AvailableWorkflowConnectRule instance itself
   */
  public AvailableWorkflowConnectRule putAdditionalProperty(String key, Object value) {
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
    AvailableWorkflowConnectRule availableWorkflowConnectRule = (AvailableWorkflowConnectRule) o;
    return Objects.equals(this.description, availableWorkflowConnectRule.description) &&
        Objects.equals(this.addonKey, availableWorkflowConnectRule.addonKey) &&
        Objects.equals(this.createUrl, availableWorkflowConnectRule.createUrl) &&
        Objects.equals(this.editUrl, availableWorkflowConnectRule.editUrl) &&
        Objects.equals(this.moduleKey, availableWorkflowConnectRule.moduleKey) &&
        Objects.equals(this.name, availableWorkflowConnectRule.name) &&
        Objects.equals(this.ruleKey, availableWorkflowConnectRule.ruleKey) &&
        Objects.equals(this.ruleType, availableWorkflowConnectRule.ruleType) &&
        Objects.equals(this.viewUrl, availableWorkflowConnectRule.viewUrl)&&
        Objects.equals(this.additionalProperties, availableWorkflowConnectRule.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, addonKey, createUrl, editUrl, moduleKey, name, ruleKey, ruleType, viewUrl, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableWorkflowConnectRule {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    addonKey: ").append(toIndentedString(addonKey)).append("\n");
    sb.append("    createUrl: ").append(toIndentedString(createUrl)).append("\n");
    sb.append("    editUrl: ").append(toIndentedString(editUrl)).append("\n");
    sb.append("    moduleKey: ").append(toIndentedString(moduleKey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleKey: ").append(toIndentedString(ruleKey)).append("\n");
    sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
    sb.append("    viewUrl: ").append(toIndentedString(viewUrl)).append("\n");
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
    openapiFields.add("addonKey");
    openapiFields.add("createUrl");
    openapiFields.add("editUrl");
    openapiFields.add("moduleKey");
    openapiFields.add("name");
    openapiFields.add("ruleKey");
    openapiFields.add("ruleType");
    openapiFields.add("viewUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AvailableWorkflowConnectRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AvailableWorkflowConnectRule.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AvailableWorkflowConnectRule is not found in the empty JSON string", AvailableWorkflowConnectRule.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("addonKey") != null && !jsonObj.get("addonKey").isJsonNull()) && !jsonObj.get("addonKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `addonKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("addonKey").toString()));
      }
      if ((jsonObj.get("createUrl") != null && !jsonObj.get("createUrl").isJsonNull()) && !jsonObj.get("createUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createUrl").toString()));
      }
      if ((jsonObj.get("editUrl") != null && !jsonObj.get("editUrl").isJsonNull()) && !jsonObj.get("editUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `editUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("editUrl").toString()));
      }
      if ((jsonObj.get("moduleKey") != null && !jsonObj.get("moduleKey").isJsonNull()) && !jsonObj.get("moduleKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `moduleKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("moduleKey").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("ruleKey") != null && !jsonObj.get("ruleKey").isJsonNull()) && !jsonObj.get("ruleKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleKey").toString()));
      }
      if ((jsonObj.get("ruleType") != null && !jsonObj.get("ruleType").isJsonNull()) && !jsonObj.get("ruleType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ruleType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ruleType").toString()));
      }
      if ((jsonObj.get("viewUrl") != null && !jsonObj.get("viewUrl").isJsonNull()) && !jsonObj.get("viewUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `viewUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("viewUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AvailableWorkflowConnectRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AvailableWorkflowConnectRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AvailableWorkflowConnectRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AvailableWorkflowConnectRule.class));

       return (TypeAdapter<T>) new TypeAdapter<AvailableWorkflowConnectRule>() {
           @Override
           public void write(JsonWriter out, AvailableWorkflowConnectRule value) throws IOException {
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
           public AvailableWorkflowConnectRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AvailableWorkflowConnectRule instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AvailableWorkflowConnectRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AvailableWorkflowConnectRule
  * @throws IOException if the JSON string is invalid with respect to AvailableWorkflowConnectRule
  */
  public static AvailableWorkflowConnectRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AvailableWorkflowConnectRule.class);
  }

 /**
  * Convert an instance of AvailableWorkflowConnectRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

