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
import com.konfigthis.client.model.FieldReferenceData;
import com.konfigthis.client.model.FunctionReferenceData;
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
 * Lists of JQL reference data.
 */
@ApiModel(description = "Lists of JQL reference data.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class JQLReferenceData {
  public static final String SERIALIZED_NAME_JQL_RESERVED_WORDS = "jqlReservedWords";
  @SerializedName(SERIALIZED_NAME_JQL_RESERVED_WORDS)
  private List<String> jqlReservedWords = null;

  public static final String SERIALIZED_NAME_VISIBLE_FIELD_NAMES = "visibleFieldNames";
  @SerializedName(SERIALIZED_NAME_VISIBLE_FIELD_NAMES)
  private List<FieldReferenceData> visibleFieldNames = null;

  public static final String SERIALIZED_NAME_VISIBLE_FUNCTION_NAMES = "visibleFunctionNames";
  @SerializedName(SERIALIZED_NAME_VISIBLE_FUNCTION_NAMES)
  private List<FunctionReferenceData> visibleFunctionNames = null;

  public JQLReferenceData() {
  }

  public JQLReferenceData jqlReservedWords(List<String> jqlReservedWords) {
    
    
    
    
    this.jqlReservedWords = jqlReservedWords;
    return this;
  }

  public JQLReferenceData addJqlReservedWordsItem(String jqlReservedWordsItem) {
    if (this.jqlReservedWords == null) {
      this.jqlReservedWords = new ArrayList<>();
    }
    this.jqlReservedWords.add(jqlReservedWordsItem);
    return this;
  }

   /**
   * List of JQL query reserved words.
   * @return jqlReservedWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of JQL query reserved words.")

  public List<String> getJqlReservedWords() {
    return jqlReservedWords;
  }


  public void setJqlReservedWords(List<String> jqlReservedWords) {
    
    
    
    this.jqlReservedWords = jqlReservedWords;
  }


  public JQLReferenceData visibleFieldNames(List<FieldReferenceData> visibleFieldNames) {
    
    
    
    
    this.visibleFieldNames = visibleFieldNames;
    return this;
  }

  public JQLReferenceData addVisibleFieldNamesItem(FieldReferenceData visibleFieldNamesItem) {
    if (this.visibleFieldNames == null) {
      this.visibleFieldNames = new ArrayList<>();
    }
    this.visibleFieldNames.add(visibleFieldNamesItem);
    return this;
  }

   /**
   * List of fields usable in JQL queries.
   * @return visibleFieldNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of fields usable in JQL queries.")

  public List<FieldReferenceData> getVisibleFieldNames() {
    return visibleFieldNames;
  }


  public void setVisibleFieldNames(List<FieldReferenceData> visibleFieldNames) {
    
    
    
    this.visibleFieldNames = visibleFieldNames;
  }


  public JQLReferenceData visibleFunctionNames(List<FunctionReferenceData> visibleFunctionNames) {
    
    
    
    
    this.visibleFunctionNames = visibleFunctionNames;
    return this;
  }

  public JQLReferenceData addVisibleFunctionNamesItem(FunctionReferenceData visibleFunctionNamesItem) {
    if (this.visibleFunctionNames == null) {
      this.visibleFunctionNames = new ArrayList<>();
    }
    this.visibleFunctionNames.add(visibleFunctionNamesItem);
    return this;
  }

   /**
   * List of functions usable in JQL queries.
   * @return visibleFunctionNames
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of functions usable in JQL queries.")

  public List<FunctionReferenceData> getVisibleFunctionNames() {
    return visibleFunctionNames;
  }


  public void setVisibleFunctionNames(List<FunctionReferenceData> visibleFunctionNames) {
    
    
    
    this.visibleFunctionNames = visibleFunctionNames;
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
   * @return the JQLReferenceData instance itself
   */
  public JQLReferenceData putAdditionalProperty(String key, Object value) {
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
    JQLReferenceData jqLReferenceData = (JQLReferenceData) o;
    return Objects.equals(this.jqlReservedWords, jqLReferenceData.jqlReservedWords) &&
        Objects.equals(this.visibleFieldNames, jqLReferenceData.visibleFieldNames) &&
        Objects.equals(this.visibleFunctionNames, jqLReferenceData.visibleFunctionNames)&&
        Objects.equals(this.additionalProperties, jqLReferenceData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jqlReservedWords, visibleFieldNames, visibleFunctionNames, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JQLReferenceData {\n");
    sb.append("    jqlReservedWords: ").append(toIndentedString(jqlReservedWords)).append("\n");
    sb.append("    visibleFieldNames: ").append(toIndentedString(visibleFieldNames)).append("\n");
    sb.append("    visibleFunctionNames: ").append(toIndentedString(visibleFunctionNames)).append("\n");
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
    openapiFields.add("jqlReservedWords");
    openapiFields.add("visibleFieldNames");
    openapiFields.add("visibleFunctionNames");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to JQLReferenceData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!JQLReferenceData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in JQLReferenceData is not found in the empty JSON string", JQLReferenceData.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("jqlReservedWords") != null && !jsonObj.get("jqlReservedWords").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `jqlReservedWords` to be an array in the JSON string but got `%s`", jsonObj.get("jqlReservedWords").toString()));
      }
      if (jsonObj.get("visibleFieldNames") != null && !jsonObj.get("visibleFieldNames").isJsonNull()) {
        JsonArray jsonArrayvisibleFieldNames = jsonObj.getAsJsonArray("visibleFieldNames");
        if (jsonArrayvisibleFieldNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("visibleFieldNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `visibleFieldNames` to be an array in the JSON string but got `%s`", jsonObj.get("visibleFieldNames").toString()));
          }

          // validate the optional field `visibleFieldNames` (array)
          for (int i = 0; i < jsonArrayvisibleFieldNames.size(); i++) {
            FieldReferenceData.validateJsonObject(jsonArrayvisibleFieldNames.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("visibleFunctionNames") != null && !jsonObj.get("visibleFunctionNames").isJsonNull()) {
        JsonArray jsonArrayvisibleFunctionNames = jsonObj.getAsJsonArray("visibleFunctionNames");
        if (jsonArrayvisibleFunctionNames != null) {
          // ensure the json data is an array
          if (!jsonObj.get("visibleFunctionNames").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `visibleFunctionNames` to be an array in the JSON string but got `%s`", jsonObj.get("visibleFunctionNames").toString()));
          }

          // validate the optional field `visibleFunctionNames` (array)
          for (int i = 0; i < jsonArrayvisibleFunctionNames.size(); i++) {
            FunctionReferenceData.validateJsonObject(jsonArrayvisibleFunctionNames.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!JQLReferenceData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'JQLReferenceData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<JQLReferenceData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(JQLReferenceData.class));

       return (TypeAdapter<T>) new TypeAdapter<JQLReferenceData>() {
           @Override
           public void write(JsonWriter out, JQLReferenceData value) throws IOException {
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
           public JQLReferenceData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             JQLReferenceData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of JQLReferenceData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of JQLReferenceData
  * @throws IOException if the JSON string is invalid with respect to JQLReferenceData
  */
  public static JQLReferenceData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, JQLReferenceData.class);
  }

 /**
  * Convert an instance of JQLReferenceData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

