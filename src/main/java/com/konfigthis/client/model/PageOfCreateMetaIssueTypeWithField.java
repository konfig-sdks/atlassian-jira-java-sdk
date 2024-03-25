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
import com.konfigthis.client.model.FieldCreateMetadata;
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
 * A page of CreateMetaIssueType with Field.
 */
@ApiModel(description = "A page of CreateMetaIssueType with Field.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class PageOfCreateMetaIssueTypeWithField {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private List<FieldCreateMetadata> fields = null;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_RESULTS = "results";
  @SerializedName(SERIALIZED_NAME_RESULTS)
  private List<FieldCreateMetadata> results = null;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Long startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total;

  public PageOfCreateMetaIssueTypeWithField() {
  }

  
  public PageOfCreateMetaIssueTypeWithField(
     List<FieldCreateMetadata> fields, 
     Integer maxResults, 
     Long startAt, 
     Long total
  ) {
    this();
    this.fields = fields;
    this.maxResults = maxResults;
    this.startAt = startAt;
    this.total = total;
  }

   /**
   * The collection of FieldCreateMetaBeans.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The collection of FieldCreateMetaBeans.")

  public List<FieldCreateMetadata> getFields() {
    return fields;
  }




   /**
   * The maximum number of items to return per page.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of items to return per page.")

  public Integer getMaxResults() {
    return maxResults;
  }




  public PageOfCreateMetaIssueTypeWithField results(List<FieldCreateMetadata> results) {
    
    
    
    
    this.results = results;
    return this;
  }

  public PageOfCreateMetaIssueTypeWithField addResultsItem(FieldCreateMetadata resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    return this;
  }

   /**
   * Get results
   * @return results
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<FieldCreateMetadata> getResults() {
    return results;
  }


  public void setResults(List<FieldCreateMetadata> results) {
    
    
    
    this.results = results;
  }


   /**
   * The index of the first item returned.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned.")

  public Long getStartAt() {
    return startAt;
  }




   /**
   * The total number of items in all pages.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total number of items in all pages.")

  public Long getTotal() {
    return total;
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
   * @return the PageOfCreateMetaIssueTypeWithField instance itself
   */
  public PageOfCreateMetaIssueTypeWithField putAdditionalProperty(String key, Object value) {
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
    PageOfCreateMetaIssueTypeWithField pageOfCreateMetaIssueTypeWithField = (PageOfCreateMetaIssueTypeWithField) o;
    return Objects.equals(this.fields, pageOfCreateMetaIssueTypeWithField.fields) &&
        Objects.equals(this.maxResults, pageOfCreateMetaIssueTypeWithField.maxResults) &&
        Objects.equals(this.results, pageOfCreateMetaIssueTypeWithField.results) &&
        Objects.equals(this.startAt, pageOfCreateMetaIssueTypeWithField.startAt) &&
        Objects.equals(this.total, pageOfCreateMetaIssueTypeWithField.total)&&
        Objects.equals(this.additionalProperties, pageOfCreateMetaIssueTypeWithField.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, maxResults, results, startAt, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfCreateMetaIssueTypeWithField {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
    openapiFields.add("fields");
    openapiFields.add("maxResults");
    openapiFields.add("results");
    openapiFields.add("startAt");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PageOfCreateMetaIssueTypeWithField
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PageOfCreateMetaIssueTypeWithField.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PageOfCreateMetaIssueTypeWithField is not found in the empty JSON string", PageOfCreateMetaIssueTypeWithField.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("fields") != null && !jsonObj.get("fields").isJsonNull()) {
        JsonArray jsonArrayfields = jsonObj.getAsJsonArray("fields");
        if (jsonArrayfields != null) {
          // ensure the json data is an array
          if (!jsonObj.get("fields").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `fields` to be an array in the JSON string but got `%s`", jsonObj.get("fields").toString()));
          }

          // validate the optional field `fields` (array)
          for (int i = 0; i < jsonArrayfields.size(); i++) {
            FieldCreateMetadata.validateJsonObject(jsonArrayfields.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("results") != null && !jsonObj.get("results").isJsonNull()) {
        JsonArray jsonArrayresults = jsonObj.getAsJsonArray("results");
        if (jsonArrayresults != null) {
          // ensure the json data is an array
          if (!jsonObj.get("results").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `results` to be an array in the JSON string but got `%s`", jsonObj.get("results").toString()));
          }

          // validate the optional field `results` (array)
          for (int i = 0; i < jsonArrayresults.size(); i++) {
            FieldCreateMetadata.validateJsonObject(jsonArrayresults.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PageOfCreateMetaIssueTypeWithField.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PageOfCreateMetaIssueTypeWithField' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PageOfCreateMetaIssueTypeWithField> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PageOfCreateMetaIssueTypeWithField.class));

       return (TypeAdapter<T>) new TypeAdapter<PageOfCreateMetaIssueTypeWithField>() {
           @Override
           public void write(JsonWriter out, PageOfCreateMetaIssueTypeWithField value) throws IOException {
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
           public PageOfCreateMetaIssueTypeWithField read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             PageOfCreateMetaIssueTypeWithField instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PageOfCreateMetaIssueTypeWithField given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PageOfCreateMetaIssueTypeWithField
  * @throws IOException if the JSON string is invalid with respect to PageOfCreateMetaIssueTypeWithField
  */
  public static PageOfCreateMetaIssueTypeWithField fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PageOfCreateMetaIssueTypeWithField.class);
  }

 /**
  * Convert an instance of PageOfCreateMetaIssueTypeWithField to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

