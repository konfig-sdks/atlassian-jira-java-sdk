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
import com.konfigthis.client.model.IssueBean;
import com.konfigthis.client.model.JsonTypeBean;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * The result of a JQL search.
 */
@ApiModel(description = "The result of a JQL search.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SearchResults {
  public static final String SERIALIZED_NAME_EXPAND = "expand";
  @SerializedName(SERIALIZED_NAME_EXPAND)
  private String expand;

  public static final String SERIALIZED_NAME_ISSUES = "issues";
  @SerializedName(SERIALIZED_NAME_ISSUES)
  private List<IssueBean> issues = null;

  public static final String SERIALIZED_NAME_MAX_RESULTS = "maxResults";
  @SerializedName(SERIALIZED_NAME_MAX_RESULTS)
  private Integer maxResults;

  public static final String SERIALIZED_NAME_NAMES = "names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private Map<String, String> names = null;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private Map<String, JsonTypeBean> schema = null;

  public static final String SERIALIZED_NAME_START_AT = "startAt";
  @SerializedName(SERIALIZED_NAME_START_AT)
  private Integer startAt;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_WARNING_MESSAGES = "warningMessages";
  @SerializedName(SERIALIZED_NAME_WARNING_MESSAGES)
  private List<String> warningMessages = null;

  public SearchResults() {
  }

  
  public SearchResults(
     String expand, 
     List<IssueBean> issues, 
     Integer maxResults, 
     Map<String, String> names, 
     Map<String, JsonTypeBean> schema, 
     Integer startAt, 
     Integer total, 
     List<String> warningMessages
  ) {
    this();
    this.expand = expand;
    this.issues = issues;
    this.maxResults = maxResults;
    this.names = names;
    this.schema = schema;
    this.startAt = startAt;
    this.total = total;
    this.warningMessages = warningMessages;
  }

   /**
   * Expand options that include additional search result details in the response.
   * @return expand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Expand options that include additional search result details in the response.")

  public String getExpand() {
    return expand;
  }




   /**
   * The list of issues found by the search.
   * @return issues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of issues found by the search.")

  public List<IssueBean> getIssues() {
    return issues;
  }




   /**
   * The maximum number of results that could be on the page.
   * @return maxResults
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of results that could be on the page.")

  public Integer getMaxResults() {
    return maxResults;
  }




   /**
   * The ID and name of each field in the search results.
   * @return names
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID and name of each field in the search results.")

  public Map<String, String> getNames() {
    return names;
  }




   /**
   * The schema describing the field types in the search results.
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The schema describing the field types in the search results.")

  public Map<String, JsonTypeBean> getSchema() {
    return schema;
  }




   /**
   * The index of the first item returned on the page.
   * @return startAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The index of the first item returned on the page.")

  public Integer getStartAt() {
    return startAt;
  }




   /**
   * The number of results on the page.
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of results on the page.")

  public Integer getTotal() {
    return total;
  }




   /**
   * Any warnings related to the JQL query.
   * @return warningMessages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any warnings related to the JQL query.")

  public List<String> getWarningMessages() {
    return warningMessages;
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
   * @return the SearchResults instance itself
   */
  public SearchResults putAdditionalProperty(String key, Object value) {
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
    SearchResults searchResults = (SearchResults) o;
    return Objects.equals(this.expand, searchResults.expand) &&
        Objects.equals(this.issues, searchResults.issues) &&
        Objects.equals(this.maxResults, searchResults.maxResults) &&
        Objects.equals(this.names, searchResults.names) &&
        Objects.equals(this.schema, searchResults.schema) &&
        Objects.equals(this.startAt, searchResults.startAt) &&
        Objects.equals(this.total, searchResults.total) &&
        Objects.equals(this.warningMessages, searchResults.warningMessages)&&
        Objects.equals(this.additionalProperties, searchResults.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expand, issues, maxResults, names, schema, startAt, total, warningMessages, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchResults {\n");
    sb.append("    expand: ").append(toIndentedString(expand)).append("\n");
    sb.append("    issues: ").append(toIndentedString(issues)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    warningMessages: ").append(toIndentedString(warningMessages)).append("\n");
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
    openapiFields.add("expand");
    openapiFields.add("issues");
    openapiFields.add("maxResults");
    openapiFields.add("names");
    openapiFields.add("schema");
    openapiFields.add("startAt");
    openapiFields.add("total");
    openapiFields.add("warningMessages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchResults
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SearchResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchResults is not found in the empty JSON string", SearchResults.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("expand") != null && !jsonObj.get("expand").isJsonNull()) && !jsonObj.get("expand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `expand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("expand").toString()));
      }
      if (jsonObj.get("issues") != null && !jsonObj.get("issues").isJsonNull()) {
        JsonArray jsonArrayissues = jsonObj.getAsJsonArray("issues");
        if (jsonArrayissues != null) {
          // ensure the json data is an array
          if (!jsonObj.get("issues").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `issues` to be an array in the JSON string but got `%s`", jsonObj.get("issues").toString()));
          }

          // validate the optional field `issues` (array)
          for (int i = 0; i < jsonArrayissues.size(); i++) {
            IssueBean.validateJsonObject(jsonArrayissues.get(i).getAsJsonObject());
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("warningMessages") != null && !jsonObj.get("warningMessages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `warningMessages` to be an array in the JSON string but got `%s`", jsonObj.get("warningMessages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchResults.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchResults>() {
           @Override
           public void write(JsonWriter out, SearchResults value) throws IOException {
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
           public SearchResults read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SearchResults instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SearchResults given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchResults
  * @throws IOException if the JSON string is invalid with respect to SearchResults
  */
  public static SearchResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchResults.class);
  }

 /**
  * Convert an instance of SearchResults to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

