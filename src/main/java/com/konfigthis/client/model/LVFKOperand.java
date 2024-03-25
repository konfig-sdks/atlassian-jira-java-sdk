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
import com.konfigthis.client.model.VFKOperand;
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
 * An operand that is a list of values.
 */
@ApiModel(description = "An operand that is a list of values.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class LVFKOperand {
  public static final String SERIALIZED_NAME_ENCODED_OPERAND = "encodedOperand";
  @SerializedName(SERIALIZED_NAME_ENCODED_OPERAND)
  private String encodedOperand;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<VFKOperand> values = null;

  public static final String SERIALIZED_NAME_ENCODED_VALUE = "encodedValue";
  @SerializedName(SERIALIZED_NAME_ENCODED_VALUE)
  private String encodedValue;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_ARGUMENTS = "arguments";
  @SerializedName(SERIALIZED_NAME_ARGUMENTS)
  private List<String> arguments = null;

  public static final String SERIALIZED_NAME_FUNCTION = "function";
  @SerializedName(SERIALIZED_NAME_FUNCTION)
  private String function;

  /**
   * The keyword that is the operand value.
   */
  @JsonAdapter(KeywordEnum.Adapter.class)
 public enum KeywordEnum {
    EMPTY("empty");

    private String value;

    KeywordEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeywordEnum fromValue(String value) {
      for (KeywordEnum b : KeywordEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeywordEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeywordEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeywordEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeywordEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEYWORD = "keyword";
  @SerializedName(SERIALIZED_NAME_KEYWORD)
  private KeywordEnum keyword;

  public LVFKOperand() {
  }

  public LVFKOperand encodedOperand(String encodedOperand) {
    
    
    
    
    this.encodedOperand = encodedOperand;
    return this;
  }

   /**
   * Encoded operand, which can be used directly in a JQL query.
   * @return encodedOperand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encoded operand, which can be used directly in a JQL query.")

  public String getEncodedOperand() {
    return encodedOperand;
  }


  public void setEncodedOperand(String encodedOperand) {
    
    
    
    this.encodedOperand = encodedOperand;
  }


  public LVFKOperand values(List<VFKOperand> values) {
    
    
    
    
    this.values = values;
    return this;
  }

  public LVFKOperand addValuesItem(VFKOperand valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * The list of operand values.
   * @return values
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of operand values.")

  public List<VFKOperand> getValues() {
    return values;
  }


  public void setValues(List<VFKOperand> values) {
    
    
    
    this.values = values;
  }


  public LVFKOperand encodedValue(String encodedValue) {
    
    
    
    
    this.encodedValue = encodedValue;
    return this;
  }

   /**
   * Encoded value, which can be used directly in a JQL query.
   * @return encodedValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Encoded value, which can be used directly in a JQL query.")

  public String getEncodedValue() {
    return encodedValue;
  }


  public void setEncodedValue(String encodedValue) {
    
    
    
    this.encodedValue = encodedValue;
  }


  public LVFKOperand value(String value) {
    
    
    
    
    this.value = value;
    return this;
  }

   /**
   * The operand value.
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The operand value.")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    
    
    
    this.value = value;
  }


  public LVFKOperand arguments(List<String> arguments) {
    
    
    
    
    this.arguments = arguments;
    return this;
  }

  public LVFKOperand addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

   /**
   * The list of function arguments.
   * @return arguments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of function arguments.")

  public List<String> getArguments() {
    return arguments;
  }


  public void setArguments(List<String> arguments) {
    
    
    
    this.arguments = arguments;
  }


  public LVFKOperand function(String function) {
    
    
    
    
    this.function = function;
    return this;
  }

   /**
   * The name of the function.
   * @return function
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the function.")

  public String getFunction() {
    return function;
  }


  public void setFunction(String function) {
    
    
    
    this.function = function;
  }


  public LVFKOperand keyword(KeywordEnum keyword) {
    
    
    
    
    this.keyword = keyword;
    return this;
  }

   /**
   * The keyword that is the operand value.
   * @return keyword
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The keyword that is the operand value.")

  public KeywordEnum getKeyword() {
    return keyword;
  }


  public void setKeyword(KeywordEnum keyword) {
    
    
    
    this.keyword = keyword;
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
   * @return the LVFKOperand instance itself
   */
  public LVFKOperand putAdditionalProperty(String key, Object value) {
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
    LVFKOperand lvFKOperand = (LVFKOperand) o;
    return Objects.equals(this.encodedOperand, lvFKOperand.encodedOperand) &&
        Objects.equals(this.values, lvFKOperand.values) &&
        Objects.equals(this.encodedValue, lvFKOperand.encodedValue) &&
        Objects.equals(this.value, lvFKOperand.value) &&
        Objects.equals(this.arguments, lvFKOperand.arguments) &&
        Objects.equals(this.function, lvFKOperand.function) &&
        Objects.equals(this.keyword, lvFKOperand.keyword)&&
        Objects.equals(this.additionalProperties, lvFKOperand.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(encodedOperand, values, encodedValue, value, arguments, function, keyword, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LVFKOperand {\n");
    sb.append("    encodedOperand: ").append(toIndentedString(encodedOperand)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    encodedValue: ").append(toIndentedString(encodedValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
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
    openapiFields.add("encodedOperand");
    openapiFields.add("values");
    openapiFields.add("encodedValue");
    openapiFields.add("value");
    openapiFields.add("arguments");
    openapiFields.add("function");
    openapiFields.add("keyword");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to LVFKOperand
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!LVFKOperand.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in LVFKOperand is not found in the empty JSON string", LVFKOperand.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("encodedOperand") != null && !jsonObj.get("encodedOperand").isJsonNull()) && !jsonObj.get("encodedOperand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedOperand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodedOperand").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("values") != null && !jsonObj.get("values").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `values` to be an array in the JSON string but got `%s`", jsonObj.get("values").toString()));
      }
      if ((jsonObj.get("encodedValue") != null && !jsonObj.get("encodedValue").isJsonNull()) && !jsonObj.get("encodedValue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `encodedValue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("encodedValue").toString()));
      }
      if ((jsonObj.get("value") != null && !jsonObj.get("value").isJsonNull()) && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("arguments") != null && !jsonObj.get("arguments").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `arguments` to be an array in the JSON string but got `%s`", jsonObj.get("arguments").toString()));
      }
      if ((jsonObj.get("function") != null && !jsonObj.get("function").isJsonNull()) && !jsonObj.get("function").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `function` to be a primitive type in the JSON string but got `%s`", jsonObj.get("function").toString()));
      }
      if ((jsonObj.get("keyword") != null && !jsonObj.get("keyword").isJsonNull()) && !jsonObj.get("keyword").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyword` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyword").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LVFKOperand.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LVFKOperand' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LVFKOperand> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LVFKOperand.class));

       return (TypeAdapter<T>) new TypeAdapter<LVFKOperand>() {
           @Override
           public void write(JsonWriter out, LVFKOperand value) throws IOException {
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
           public LVFKOperand read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             LVFKOperand instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of LVFKOperand given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LVFKOperand
  * @throws IOException if the JSON string is invalid with respect to LVFKOperand
  */
  public static LVFKOperand fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LVFKOperand.class);
  }

 /**
  * Convert an instance of LVFKOperand to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

