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
import com.konfigthis.client.model.JqlQuery;
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
 * Details of a parsed JQL query.
 */
@ApiModel(description = "Details of a parsed JQL query.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ParsedJqlQuery {
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private Set<String> errors = null;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_STRUCTURE = "structure";
  @SerializedName(SERIALIZED_NAME_STRUCTURE)
  private JqlQuery structure;

  public ParsedJqlQuery() {
  }

  public ParsedJqlQuery errors(Set<String> errors) {
    
    
    
    
    this.errors = errors;
    return this;
  }

  public ParsedJqlQuery addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new LinkedHashSet<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * The list of syntax or validation errors.
   * @return errors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of syntax or validation errors.")

  public Set<String> getErrors() {
    return errors;
  }


  public void setErrors(Set<String> errors) {
    
    
    
    this.errors = errors;
  }


  public ParsedJqlQuery query(String query) {
    
    
    
    
    this.query = query;
    return this;
  }

   /**
   * The JQL query that was parsed and validated.
   * @return query
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The JQL query that was parsed and validated.")

  public String getQuery() {
    return query;
  }


  public void setQuery(String query) {
    
    
    
    this.query = query;
  }


  public ParsedJqlQuery structure(JqlQuery structure) {
    
    
    
    
    this.structure = structure;
    return this;
  }

   /**
   * The syntax tree of the query. Empty if the query was invalid.
   * @return structure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The syntax tree of the query. Empty if the query was invalid.")

  public JqlQuery getStructure() {
    return structure;
  }


  public void setStructure(JqlQuery structure) {
    
    
    
    this.structure = structure;
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
   * @return the ParsedJqlQuery instance itself
   */
  public ParsedJqlQuery putAdditionalProperty(String key, Object value) {
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
    ParsedJqlQuery parsedJqlQuery = (ParsedJqlQuery) o;
    return Objects.equals(this.errors, parsedJqlQuery.errors) &&
        Objects.equals(this.query, parsedJqlQuery.query) &&
        Objects.equals(this.structure, parsedJqlQuery.structure)&&
        Objects.equals(this.additionalProperties, parsedJqlQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, query, structure, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParsedJqlQuery {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    structure: ").append(toIndentedString(structure)).append("\n");
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
    openapiFields.add("errors");
    openapiFields.add("query");
    openapiFields.add("structure");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ParsedJqlQuery
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ParsedJqlQuery.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ParsedJqlQuery is not found in the empty JSON string", ParsedJqlQuery.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ParsedJqlQuery.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("errors") != null && !jsonObj.get("errors").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `errors` to be an array in the JSON string but got `%s`", jsonObj.get("errors").toString()));
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      // validate the optional field `structure`
      if (jsonObj.get("structure") != null && !jsonObj.get("structure").isJsonNull()) {
        JqlQuery.validateJsonObject(jsonObj.getAsJsonObject("structure"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ParsedJqlQuery.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ParsedJqlQuery' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ParsedJqlQuery> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ParsedJqlQuery.class));

       return (TypeAdapter<T>) new TypeAdapter<ParsedJqlQuery>() {
           @Override
           public void write(JsonWriter out, ParsedJqlQuery value) throws IOException {
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
           public ParsedJqlQuery read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ParsedJqlQuery instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ParsedJqlQuery given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ParsedJqlQuery
  * @throws IOException if the JSON string is invalid with respect to ParsedJqlQuery
  */
  public static ParsedJqlQuery fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ParsedJqlQuery.class);
  }

 /**
  * Convert an instance of ParsedJqlQuery to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

