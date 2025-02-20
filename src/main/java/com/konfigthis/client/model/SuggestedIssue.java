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
 * An issue suggested for use in the issue picker auto-completion.
 */
@ApiModel(description = "An issue suggested for use in the issue picker auto-completion.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SuggestedIssue {
  public static final String SERIALIZED_NAME_SUMMARY = "summary";
  @SerializedName(SERIALIZED_NAME_SUMMARY)
  private String summary;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_IMG = "img";
  @SerializedName(SERIALIZED_NAME_IMG)
  private String img;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_KEY_HTML = "keyHtml";
  @SerializedName(SERIALIZED_NAME_KEY_HTML)
  private String keyHtml;

  public static final String SERIALIZED_NAME_SUMMARY_TEXT = "summaryText";
  @SerializedName(SERIALIZED_NAME_SUMMARY_TEXT)
  private String summaryText;

  public SuggestedIssue() {
  }

  
  public SuggestedIssue(
     String summary, 
     Long id, 
     String img, 
     String key, 
     String keyHtml, 
     String summaryText
  ) {
    this();
    this.summary = summary;
    this.id = id;
    this.img = img;
    this.key = key;
    this.keyHtml = keyHtml;
    this.summaryText = summaryText;
  }

   /**
   * The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phrase containing the query string in HTML format, with the string highlighted with HTML bold tags.")

  public String getSummary() {
    return summary;
  }




   /**
   * The ID of the issue.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the issue.")

  public Long getId() {
    return id;
  }




   /**
   * The URL of the issue type&#39;s avatar.
   * @return img
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of the issue type's avatar.")

  public String getImg() {
    return img;
  }




   /**
   * The key of the issue.
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the issue.")

  public String getKey() {
    return key;
  }




   /**
   * The key of the issue in HTML format.
   * @return keyHtml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the issue in HTML format.")

  public String getKeyHtml() {
    return keyHtml;
  }




   /**
   * The phrase containing the query string, as plain text.
   * @return summaryText
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The phrase containing the query string, as plain text.")

  public String getSummaryText() {
    return summaryText;
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
   * @return the SuggestedIssue instance itself
   */
  public SuggestedIssue putAdditionalProperty(String key, Object value) {
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
    SuggestedIssue suggestedIssue = (SuggestedIssue) o;
    return Objects.equals(this.summary, suggestedIssue.summary) &&
        Objects.equals(this.id, suggestedIssue.id) &&
        Objects.equals(this.img, suggestedIssue.img) &&
        Objects.equals(this.key, suggestedIssue.key) &&
        Objects.equals(this.keyHtml, suggestedIssue.keyHtml) &&
        Objects.equals(this.summaryText, suggestedIssue.summaryText)&&
        Objects.equals(this.additionalProperties, suggestedIssue.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, id, img, key, keyHtml, summaryText, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SuggestedIssue {\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    img: ").append(toIndentedString(img)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    keyHtml: ").append(toIndentedString(keyHtml)).append("\n");
    sb.append("    summaryText: ").append(toIndentedString(summaryText)).append("\n");
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
    openapiFields.add("summary");
    openapiFields.add("id");
    openapiFields.add("img");
    openapiFields.add("key");
    openapiFields.add("keyHtml");
    openapiFields.add("summaryText");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SuggestedIssue
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SuggestedIssue.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SuggestedIssue is not found in the empty JSON string", SuggestedIssue.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("summary") != null && !jsonObj.get("summary").isJsonNull()) && !jsonObj.get("summary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summary").toString()));
      }
      if ((jsonObj.get("img") != null && !jsonObj.get("img").isJsonNull()) && !jsonObj.get("img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("img").toString()));
      }
      if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull()) && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if ((jsonObj.get("keyHtml") != null && !jsonObj.get("keyHtml").isJsonNull()) && !jsonObj.get("keyHtml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `keyHtml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("keyHtml").toString()));
      }
      if ((jsonObj.get("summaryText") != null && !jsonObj.get("summaryText").isJsonNull()) && !jsonObj.get("summaryText").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `summaryText` to be a primitive type in the JSON string but got `%s`", jsonObj.get("summaryText").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SuggestedIssue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SuggestedIssue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SuggestedIssue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SuggestedIssue.class));

       return (TypeAdapter<T>) new TypeAdapter<SuggestedIssue>() {
           @Override
           public void write(JsonWriter out, SuggestedIssue value) throws IOException {
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
           public SuggestedIssue read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SuggestedIssue instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SuggestedIssue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SuggestedIssue
  * @throws IOException if the JSON string is invalid with respect to SuggestedIssue
  */
  public static SuggestedIssue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SuggestedIssue.class);
  }

 /**
  * Convert an instance of SuggestedIssue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

