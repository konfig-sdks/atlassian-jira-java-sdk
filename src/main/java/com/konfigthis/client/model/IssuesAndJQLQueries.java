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
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
 * List of issues and JQL queries.
 */
@ApiModel(description = "List of issues and JQL queries.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IssuesAndJQLQueries {
  public static final String SERIALIZED_NAME_ISSUE_IDS = "issueIds";
  @SerializedName(SERIALIZED_NAME_ISSUE_IDS)
  private Set<Long> issueIds = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_JQLS = "jqls";
  @SerializedName(SERIALIZED_NAME_JQLS)
  private List<String> jqls = new ArrayList<>();

  public IssuesAndJQLQueries() {
  }

  public IssuesAndJQLQueries issueIds(Set<Long> issueIds) {
    
    
    
    
    this.issueIds = issueIds;
    return this;
  }

  public IssuesAndJQLQueries addIssueIdsItem(Long issueIdsItem) {
    this.issueIds.add(issueIdsItem);
    return this;
  }

   /**
   * A list of issue IDs.
   * @return issueIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of issue IDs.")

  public Set<Long> getIssueIds() {
    return issueIds;
  }


  public void setIssueIds(Set<Long> issueIds) {
    
    
    
    this.issueIds = issueIds;
  }


  public IssuesAndJQLQueries jqls(List<String> jqls) {
    
    
    
    
    this.jqls = jqls;
    return this;
  }

  public IssuesAndJQLQueries addJqlsItem(String jqlsItem) {
    this.jqls.add(jqlsItem);
    return this;
  }

   /**
   * A list of JQL queries.
   * @return jqls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A list of JQL queries.")

  public List<String> getJqls() {
    return jqls;
  }


  public void setJqls(List<String> jqls) {
    
    
    
    this.jqls = jqls;
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
   * @return the IssuesAndJQLQueries instance itself
   */
  public IssuesAndJQLQueries putAdditionalProperty(String key, Object value) {
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
    IssuesAndJQLQueries issuesAndJQLQueries = (IssuesAndJQLQueries) o;
    return Objects.equals(this.issueIds, issuesAndJQLQueries.issueIds) &&
        Objects.equals(this.jqls, issuesAndJQLQueries.jqls)&&
        Objects.equals(this.additionalProperties, issuesAndJQLQueries.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issueIds, jqls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssuesAndJQLQueries {\n");
    sb.append("    issueIds: ").append(toIndentedString(issueIds)).append("\n");
    sb.append("    jqls: ").append(toIndentedString(jqls)).append("\n");
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
    openapiFields.add("issueIds");
    openapiFields.add("jqls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("issueIds");
    openapiRequiredFields.add("jqls");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssuesAndJQLQueries
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssuesAndJQLQueries.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssuesAndJQLQueries is not found in the empty JSON string", IssuesAndJQLQueries.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : IssuesAndJQLQueries.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the required json array is present
      if (jsonObj.get("issueIds") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("issueIds").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `issueIds` to be an array in the JSON string but got `%s`", jsonObj.get("issueIds").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("jqls") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("jqls").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `jqls` to be an array in the JSON string but got `%s`", jsonObj.get("jqls").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssuesAndJQLQueries.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssuesAndJQLQueries' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssuesAndJQLQueries> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssuesAndJQLQueries.class));

       return (TypeAdapter<T>) new TypeAdapter<IssuesAndJQLQueries>() {
           @Override
           public void write(JsonWriter out, IssuesAndJQLQueries value) throws IOException {
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
           public IssuesAndJQLQueries read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssuesAndJQLQueries instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssuesAndJQLQueries given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssuesAndJQLQueries
  * @throws IOException if the JSON string is invalid with respect to IssuesAndJQLQueries
  */
  public static IssuesAndJQLQueries fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssuesAndJQLQueries.class);
  }

 /**
  * Convert an instance of IssuesAndJQLQueries to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

