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
 * ServiceManagementNavigationInfo
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ServiceManagementNavigationInfo {
  public static final String SERIALIZED_NAME_QUEUE_CATEGORY = "queueCategory";
  @SerializedName(SERIALIZED_NAME_QUEUE_CATEGORY)
  private String queueCategory;

  public static final String SERIALIZED_NAME_QUEUE_ID = "queueId";
  @SerializedName(SERIALIZED_NAME_QUEUE_ID)
  private Long queueId;

  public static final String SERIALIZED_NAME_QUEUE_NAME = "queueName";
  @SerializedName(SERIALIZED_NAME_QUEUE_NAME)
  private String queueName;

  public ServiceManagementNavigationInfo() {
  }

  public ServiceManagementNavigationInfo queueCategory(String queueCategory) {
    
    
    
    
    this.queueCategory = queueCategory;
    return this;
  }

   /**
   * Get queueCategory
   * @return queueCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueueCategory() {
    return queueCategory;
  }


  public void setQueueCategory(String queueCategory) {
    
    
    
    this.queueCategory = queueCategory;
  }


  public ServiceManagementNavigationInfo queueId(Long queueId) {
    
    
    
    
    this.queueId = queueId;
    return this;
  }

   /**
   * Get queueId
   * @return queueId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getQueueId() {
    return queueId;
  }


  public void setQueueId(Long queueId) {
    
    
    
    this.queueId = queueId;
  }


  public ServiceManagementNavigationInfo queueName(String queueName) {
    
    
    
    
    this.queueName = queueName;
    return this;
  }

   /**
   * Get queueName
   * @return queueName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getQueueName() {
    return queueName;
  }


  public void setQueueName(String queueName) {
    
    
    
    this.queueName = queueName;
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
   * @return the ServiceManagementNavigationInfo instance itself
   */
  public ServiceManagementNavigationInfo putAdditionalProperty(String key, Object value) {
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
    ServiceManagementNavigationInfo serviceManagementNavigationInfo = (ServiceManagementNavigationInfo) o;
    return Objects.equals(this.queueCategory, serviceManagementNavigationInfo.queueCategory) &&
        Objects.equals(this.queueId, serviceManagementNavigationInfo.queueId) &&
        Objects.equals(this.queueName, serviceManagementNavigationInfo.queueName)&&
        Objects.equals(this.additionalProperties, serviceManagementNavigationInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueCategory, queueId, queueName, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceManagementNavigationInfo {\n");
    sb.append("    queueCategory: ").append(toIndentedString(queueCategory)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
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
    openapiFields.add("queueCategory");
    openapiFields.add("queueId");
    openapiFields.add("queueName");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ServiceManagementNavigationInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ServiceManagementNavigationInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ServiceManagementNavigationInfo is not found in the empty JSON string", ServiceManagementNavigationInfo.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("queueCategory") != null && !jsonObj.get("queueCategory").isJsonNull()) && !jsonObj.get("queueCategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueCategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueCategory").toString()));
      }
      if ((jsonObj.get("queueName") != null && !jsonObj.get("queueName").isJsonNull()) && !jsonObj.get("queueName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `queueName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("queueName").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ServiceManagementNavigationInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ServiceManagementNavigationInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ServiceManagementNavigationInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ServiceManagementNavigationInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ServiceManagementNavigationInfo>() {
           @Override
           public void write(JsonWriter out, ServiceManagementNavigationInfo value) throws IOException {
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
           public ServiceManagementNavigationInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ServiceManagementNavigationInfo instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ServiceManagementNavigationInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ServiceManagementNavigationInfo
  * @throws IOException if the JSON string is invalid with respect to ServiceManagementNavigationInfo
  */
  public static ServiceManagementNavigationInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ServiceManagementNavigationInfo.class);
  }

 /**
  * Convert an instance of ServiceManagementNavigationInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

