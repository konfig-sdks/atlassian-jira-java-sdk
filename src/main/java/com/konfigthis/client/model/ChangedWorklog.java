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
import com.konfigthis.client.model.EntityProperty;
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
 * Details of a changed worklog.
 */
@ApiModel(description = "Details of a changed worklog.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ChangedWorklog {
  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EntityProperty> properties = null;

  public static final String SERIALIZED_NAME_UPDATED_TIME = "updatedTime";
  @SerializedName(SERIALIZED_NAME_UPDATED_TIME)
  private Long updatedTime;

  public static final String SERIALIZED_NAME_WORKLOG_ID = "worklogId";
  @SerializedName(SERIALIZED_NAME_WORKLOG_ID)
  private Long worklogId;

  public ChangedWorklog() {
  }

  
  public ChangedWorklog(
     List<EntityProperty> properties, 
     Long updatedTime, 
     Long worklogId
  ) {
    this();
    this.properties = properties;
    this.updatedTime = updatedTime;
    this.worklogId = worklogId;
  }

   /**
   * Details of properties associated with the change.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of properties associated with the change.")

  public List<EntityProperty> getProperties() {
    return properties;
  }




   /**
   * The datetime of the change.
   * @return updatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The datetime of the change.")

  public Long getUpdatedTime() {
    return updatedTime;
  }




   /**
   * The ID of the worklog.
   * @return worklogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the worklog.")

  public Long getWorklogId() {
    return worklogId;
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
   * @return the ChangedWorklog instance itself
   */
  public ChangedWorklog putAdditionalProperty(String key, Object value) {
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
    ChangedWorklog changedWorklog = (ChangedWorklog) o;
    return Objects.equals(this.properties, changedWorklog.properties) &&
        Objects.equals(this.updatedTime, changedWorklog.updatedTime) &&
        Objects.equals(this.worklogId, changedWorklog.worklogId)&&
        Objects.equals(this.additionalProperties, changedWorklog.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(properties, updatedTime, worklogId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangedWorklog {\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    worklogId: ").append(toIndentedString(worklogId)).append("\n");
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
    openapiFields.add("properties");
    openapiFields.add("updatedTime");
    openapiFields.add("worklogId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ChangedWorklog
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ChangedWorklog.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChangedWorklog is not found in the empty JSON string", ChangedWorklog.openapiRequiredFields.toString()));
        }
      }
      if (jsonObj.get("properties") != null && !jsonObj.get("properties").isJsonNull()) {
        JsonArray jsonArrayproperties = jsonObj.getAsJsonArray("properties");
        if (jsonArrayproperties != null) {
          // ensure the json data is an array
          if (!jsonObj.get("properties").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `properties` to be an array in the JSON string but got `%s`", jsonObj.get("properties").toString()));
          }

          // validate the optional field `properties` (array)
          for (int i = 0; i < jsonArrayproperties.size(); i++) {
            EntityProperty.validateJsonObject(jsonArrayproperties.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChangedWorklog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChangedWorklog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChangedWorklog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChangedWorklog.class));

       return (TypeAdapter<T>) new TypeAdapter<ChangedWorklog>() {
           @Override
           public void write(JsonWriter out, ChangedWorklog value) throws IOException {
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
           public ChangedWorklog read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ChangedWorklog instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ChangedWorklog given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChangedWorklog
  * @throws IOException if the JSON string is invalid with respect to ChangedWorklog
  */
  public static ChangedWorklog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChangedWorklog.class);
  }

 /**
  * Convert an instance of ChangedWorklog to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

