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
import com.konfigthis.client.model.CompoundClauseFieldPropertyInner;
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
 * A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.
 */
@ApiModel(description = "A field used in a JQL query. See [Advanced searching - fields reference](https://confluence.atlassian.com/x/dAiiLQ) for more information about fields in JQL queries.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JqlQueryField {
  public static final String SERIALIZED_NAME_ENCODED_NAME = "encodedName";
  @SerializedName(SERIALIZED_NAME_ENCODED_NAME)
  private String encodedName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPERTY = "property";
  @SerializedName(SERIALIZED_NAME_PROPERTY)
  private List<CompoundClauseFieldPropertyInner> property = null;

  public JqlQueryField() {
  }

  public JqlQueryField encodedName(String encodedName) {
    
    
    
    
    this.encodedName = encodedName;
    return this;
  }

   /**
   * The encoded name of the field, which can be used directly in a JQL query.
   * @return encodedName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The encoded name of the field, which can be used directly in a JQL query.")

  public String getEncodedName() {
    return encodedName;
  }


  public void setEncodedName(String encodedName) {
    
    
    
    this.encodedName = encodedName;
  }


  public JqlQueryField name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the field.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the field.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public JqlQueryField property(List<CompoundClauseFieldPropertyInner> property) {
    
    
    
    
    this.property = property;
    return this;
  }

  public JqlQueryField addPropertyItem(CompoundClauseFieldPropertyInner propertyItem) {
    if (this.property == null) {
      this.property = new ArrayList<>();
    }
    this.property.add(propertyItem);
    return this;
  }

   /**
   * When the field refers to a value in an entity property, details of the entity property value.
   * @return property
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "When the field refers to a value in an entity property, details of the entity property value.")

  public List<CompoundClauseFieldPropertyInner> getProperty() {
    return property;
  }


  public void setProperty(List<CompoundClauseFieldPropertyInner> property) {
    
    
    
    this.property = property;
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
   * @return the JqlQueryField instance itself
   */
  public JqlQueryField putAdditionalProperty(String key, Object value) {
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
    JqlQueryField jqlQueryField = (JqlQueryField) o;
    return Objects.equals(this.encodedName, jqlQueryField.encodedName) &&
        Objects.equals(this.name, jqlQueryField.name) &&
        Objects.equals(this.property, jqlQueryField.property)&&
        Objects.equals(this.additionalProperties, jqlQueryField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedName, name, property, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JqlQueryField {\n");
    sb.append("    encodedName: ").append(toIndentedString(encodedName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
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
    openapiFields.add("encodedName");
    openapiFields.add("name");
    openapiFields.add("property");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JqlQueryField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JqlQueryField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JqlQueryField is not found in the empty JSON string", JqlQueryField.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : JqlQueryField.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("encodedName") != null && !jsonObj.get("encodedName").isJsonNull()) && !jsonObj.get("encodedName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodedName").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("property") != null && !jsonObj.get("property").isJsonNull()) {
        JsonArray jsonArrayproperty = jsonObj.getAsJsonArray("property");
        if (jsonArrayproperty != null) {
          // ensure the json data is an array
          if (!jsonObj.get("property").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `property` to be an array in the JSON string but got `%s`", jsonObj.get("property").toString()));
          }

          // validate the optional field `property` (array)
          for (int i = 0; i < jsonArrayproperty.size(); i++) {
            CompoundClauseFieldPropertyInner.validateJsonObject(jsonArrayproperty.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JqlQueryField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JqlQueryField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JqlQueryField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JqlQueryField.class));

       return (TypeAdapter<T>) new TypeAdapter<JqlQueryField>() {
           @Override
           public void write(JsonWriter out, JqlQueryField value) throws IOException {
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
           public JqlQueryField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JqlQueryField instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JqlQueryField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JqlQueryField
  * @throws IOException if the JSON string is invalid with respect to JqlQueryField
  */
  public static JqlQueryField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JqlQueryField.class);
  }

 /**
  * Convert an instance of JqlQueryField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

