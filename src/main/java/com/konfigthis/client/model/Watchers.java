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
import com.konfigthis.client.model.UserDetails;
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
 * The details of watchers on an issue.
 */
@ApiModel(description = "The details of watchers on an issue.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Watchers {
  public static final String SERIALIZED_NAME_IS_WATCHING = "isWatching";
  @SerializedName(SERIALIZED_NAME_IS_WATCHING)
  private Boolean isWatching;

  public static final String SERIALIZED_NAME_SELF = "self";
  @SerializedName(SERIALIZED_NAME_SELF)
  private String self;

  public static final String SERIALIZED_NAME_WATCH_COUNT = "watchCount";
  @SerializedName(SERIALIZED_NAME_WATCH_COUNT)
  private Integer watchCount;

  public static final String SERIALIZED_NAME_WATCHERS = "watchers";
  @SerializedName(SERIALIZED_NAME_WATCHERS)
  private List<UserDetails> watchers = null;

  public Watchers() {
  }

  
  public Watchers(
     Boolean isWatching, 
     String self, 
     Integer watchCount, 
     List<UserDetails> watchers
  ) {
    this();
    this.isWatching = isWatching;
    this.self = self;
    this.watchCount = watchCount;
    this.watchers = watchers;
  }

   /**
   * Whether the calling user is watching this issue.
   * @return isWatching
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the calling user is watching this issue.")

  public Boolean getIsWatching() {
    return isWatching;
  }




   /**
   * The URL of these issue watcher details.
   * @return self
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL of these issue watcher details.")

  public String getSelf() {
    return self;
  }




   /**
   * The number of users watching this issue.
   * @return watchCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of users watching this issue.")

  public Integer getWatchCount() {
    return watchCount;
  }




   /**
   * Details of the users watching this issue.
   * @return watchers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of the users watching this issue.")

  public List<UserDetails> getWatchers() {
    return watchers;
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
   * @return the Watchers instance itself
   */
  public Watchers putAdditionalProperty(String key, Object value) {
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
    Watchers watchers = (Watchers) o;
    return Objects.equals(this.isWatching, watchers.isWatching) &&
        Objects.equals(this.self, watchers.self) &&
        Objects.equals(this.watchCount, watchers.watchCount) &&
        Objects.equals(this.watchers, watchers.watchers)&&
        Objects.equals(this.additionalProperties, watchers.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isWatching, self, watchCount, watchers, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Watchers {\n");
    sb.append("    isWatching: ").append(toIndentedString(isWatching)).append("\n");
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    watchCount: ").append(toIndentedString(watchCount)).append("\n");
    sb.append("    watchers: ").append(toIndentedString(watchers)).append("\n");
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
    openapiFields.add("isWatching");
    openapiFields.add("self");
    openapiFields.add("watchCount");
    openapiFields.add("watchers");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Watchers
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Watchers.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Watchers is not found in the empty JSON string", Watchers.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("self") != null && !jsonObj.get("self").isJsonNull()) && !jsonObj.get("self").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `self` to be a primitive type in the JSON string but got `%s`", jsonObj.get("self").toString()));
      }
      if (jsonObj.get("watchers") != null && !jsonObj.get("watchers").isJsonNull()) {
        JsonArray jsonArraywatchers = jsonObj.getAsJsonArray("watchers");
        if (jsonArraywatchers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("watchers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `watchers` to be an array in the JSON string but got `%s`", jsonObj.get("watchers").toString()));
          }

          // validate the optional field `watchers` (array)
          for (int i = 0; i < jsonArraywatchers.size(); i++) {
            UserDetails.validateJsonObject(jsonArraywatchers.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Watchers.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Watchers' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Watchers> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Watchers.class));

       return (TypeAdapter<T>) new TypeAdapter<Watchers>() {
           @Override
           public void write(JsonWriter out, Watchers value) throws IOException {
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
           public Watchers read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Watchers instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Watchers given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Watchers
  * @throws IOException if the JSON string is invalid with respect to Watchers
  */
  public static Watchers fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Watchers.class);
  }

 /**
  * Convert an instance of Watchers to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

