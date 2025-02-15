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
import com.konfigthis.client.model.JsonTypeBean;
import com.konfigthis.client.model.Scope;
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
 * Details about a field.
 */
@ApiModel(description = "Details about a field.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FieldDetails {
  public static final String SERIALIZED_NAME_CLAUSE_NAMES = "clauseNames";
  @SerializedName(SERIALIZED_NAME_CLAUSE_NAMES)
  private Set<String> clauseNames = null;

  public static final String SERIALIZED_NAME_CUSTOM = "custom";
  @SerializedName(SERIALIZED_NAME_CUSTOM)
  private Boolean custom;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAVIGABLE = "navigable";
  @SerializedName(SERIALIZED_NAME_NAVIGABLE)
  private Boolean navigable;

  public static final String SERIALIZED_NAME_ORDERABLE = "orderable";
  @SerializedName(SERIALIZED_NAME_ORDERABLE)
  private Boolean orderable;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private JsonTypeBean schema;

  public static final String SERIALIZED_NAME_SCOPE = "scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private Scope scope;

  public static final String SERIALIZED_NAME_SEARCHABLE = "searchable";
  @SerializedName(SERIALIZED_NAME_SEARCHABLE)
  private Boolean searchable;

  public FieldDetails() {
  }

  public FieldDetails clauseNames(Set<String> clauseNames) {
    
    
    
    
    this.clauseNames = clauseNames;
    return this;
  }

  public FieldDetails addClauseNamesItem(String clauseNamesItem) {
    if (this.clauseNames == null) {
      this.clauseNames = new LinkedHashSet<>();
    }
    this.clauseNames.add(clauseNamesItem);
    return this;
  }

   /**
   * The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).
   * @return clauseNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The names that can be used to reference the field in an advanced search. For more information, see [Advanced searching - fields reference](https://confluence.atlassian.com/x/gwORLQ).")

  public Set<String> getClauseNames() {
    return clauseNames;
  }


  public void setClauseNames(Set<String> clauseNames) {
    
    
    
    this.clauseNames = clauseNames;
  }


  public FieldDetails custom(Boolean custom) {
    
    
    
    
    this.custom = custom;
    return this;
  }

   /**
   * Whether the field is a custom field.
   * @return custom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field is a custom field.")

  public Boolean getCustom() {
    return custom;
  }


  public void setCustom(Boolean custom) {
    
    
    
    this.custom = custom;
  }


  public FieldDetails id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the field.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the field.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public FieldDetails key(String key) {
    
    
    
    
    this.key = key;
    return this;
  }

   /**
   * The key of the field.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the field.")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    
    
    
    this.key = key;
  }


  public FieldDetails name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public FieldDetails navigable(Boolean navigable) {
    
    
    
    
    this.navigable = navigable;
    return this;
  }

   /**
   * Whether the field can be used as a column on the issue navigator.
   * @return navigable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the field can be used as a column on the issue navigator.")

  public Boolean getNavigable() {
    return navigable;
  }


  public void setNavigable(Boolean navigable) {
    
    
    
    this.navigable = navigable;
  }


  public FieldDetails orderable(Boolean orderable) {
    
    
    
    
    this.orderable = orderable;
    return this;
  }

   /**
   * Whether the content of the field can be used to order lists.
   * @return orderable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of the field can be used to order lists.")

  public Boolean getOrderable() {
    return orderable;
  }


  public void setOrderable(Boolean orderable) {
    
    
    
    this.orderable = orderable;
  }


  public FieldDetails schema(JsonTypeBean schema) {
    
    
    
    
    this.schema = schema;
    return this;
  }

   /**
   * The data schema for the field.
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The data schema for the field.")

  public JsonTypeBean getSchema() {
    return schema;
  }


  public void setSchema(JsonTypeBean schema) {
    
    
    
    this.schema = schema;
  }


  public FieldDetails scope(Scope scope) {
    
    
    
    
    this.scope = scope;
    return this;
  }

   /**
   * The scope of the field.
   * @return scope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The scope of the field.")

  public Scope getScope() {
    return scope;
  }


  public void setScope(Scope scope) {
    
    
    
    this.scope = scope;
  }


  public FieldDetails searchable(Boolean searchable) {
    
    
    
    
    this.searchable = searchable;
    return this;
  }

   /**
   * Whether the content of the field can be searched.
   * @return searchable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the content of the field can be searched.")

  public Boolean getSearchable() {
    return searchable;
  }


  public void setSearchable(Boolean searchable) {
    
    
    
    this.searchable = searchable;
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
   * @return the FieldDetails instance itself
   */
  public FieldDetails putAdditionalProperty(String key, Object value) {
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
    FieldDetails fieldDetails = (FieldDetails) o;
    return Objects.equals(this.clauseNames, fieldDetails.clauseNames) &&
        Objects.equals(this.custom, fieldDetails.custom) &&
        Objects.equals(this.id, fieldDetails.id) &&
        Objects.equals(this.key, fieldDetails.key) &&
        Objects.equals(this.name, fieldDetails.name) &&
        Objects.equals(this.navigable, fieldDetails.navigable) &&
        Objects.equals(this.orderable, fieldDetails.orderable) &&
        Objects.equals(this.schema, fieldDetails.schema) &&
        Objects.equals(this.scope, fieldDetails.scope) &&
        Objects.equals(this.searchable, fieldDetails.searchable)&&
        Objects.equals(this.additionalProperties, fieldDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clauseNames, custom, id, key, name, navigable, orderable, schema, scope, searchable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldDetails {\n");
    sb.append("    clauseNames: ").append(toIndentedString(clauseNames)).append("\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    navigable: ").append(toIndentedString(navigable)).append("\n");
    sb.append("    orderable: ").append(toIndentedString(orderable)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
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
    openapiFields.add("clauseNames");
    openapiFields.add("custom");
    openapiFields.add("id");
    openapiFields.add("key");
    openapiFields.add("name");
    openapiFields.add("navigable");
    openapiFields.add("orderable");
    openapiFields.add("schema");
    openapiFields.add("scope");
    openapiFields.add("searchable");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FieldDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldDetails is not found in the empty JSON string", FieldDetails.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("clauseNames") != null && !jsonObj.get("clauseNames").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `clauseNames` to be an array in the JSON string but got `%s`", jsonObj.get("clauseNames").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `schema`
      if (jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonNull()) {
        JsonTypeBean.validateJsonObject(jsonObj.getAsJsonObject("schema"));
      }
      // validate the optional field `scope`
      if (jsonObj.get("scope") != null && !jsonObj.get("scope").isJsonNull()) {
        Scope.validateJsonObject(jsonObj.getAsJsonObject("scope"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldDetails>() {
           @Override
           public void write(JsonWriter out, FieldDetails value) throws IOException {
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
           public FieldDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FieldDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FieldDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldDetails
  * @throws IOException if the JSON string is invalid with respect to FieldDetails
  */
  public static FieldDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldDetails.class);
  }

 /**
  * Convert an instance of FieldDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

