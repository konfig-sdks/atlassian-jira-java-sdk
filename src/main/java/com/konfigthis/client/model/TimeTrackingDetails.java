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
 * Time tracking details.
 */
@ApiModel(description = "Time tracking details.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeTrackingDetails {
  public static final String SERIALIZED_NAME_ORIGINAL_ESTIMATE = "originalEstimate";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ESTIMATE)
  private String originalEstimate;

  public static final String SERIALIZED_NAME_ORIGINAL_ESTIMATE_SECONDS = "originalEstimateSeconds";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_ESTIMATE_SECONDS)
  private Long originalEstimateSeconds;

  public static final String SERIALIZED_NAME_REMAINING_ESTIMATE = "remainingEstimate";
  @SerializedName(SERIALIZED_NAME_REMAINING_ESTIMATE)
  private String remainingEstimate;

  public static final String SERIALIZED_NAME_REMAINING_ESTIMATE_SECONDS = "remainingEstimateSeconds";
  @SerializedName(SERIALIZED_NAME_REMAINING_ESTIMATE_SECONDS)
  private Long remainingEstimateSeconds;

  public static final String SERIALIZED_NAME_TIME_SPENT = "timeSpent";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT)
  private String timeSpent;

  public static final String SERIALIZED_NAME_TIME_SPENT_SECONDS = "timeSpentSeconds";
  @SerializedName(SERIALIZED_NAME_TIME_SPENT_SECONDS)
  private Long timeSpentSeconds;

  public TimeTrackingDetails() {
  }

  
  public TimeTrackingDetails(
     String originalEstimate, 
     Long originalEstimateSeconds, 
     String remainingEstimate, 
     Long remainingEstimateSeconds, 
     String timeSpent, 
     Long timeSpentSeconds
  ) {
    this();
    this.originalEstimate = originalEstimate;
    this.originalEstimateSeconds = originalEstimateSeconds;
    this.remainingEstimate = remainingEstimate;
    this.remainingEstimateSeconds = remainingEstimateSeconds;
    this.timeSpent = timeSpent;
    this.timeSpentSeconds = timeSpentSeconds;
  }

   /**
   * The original estimate of time needed for this issue in readable format.
   * @return originalEstimate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original estimate of time needed for this issue in readable format.")

  public String getOriginalEstimate() {
    return originalEstimate;
  }




   /**
   * The original estimate of time needed for this issue in seconds.
   * @return originalEstimateSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original estimate of time needed for this issue in seconds.")

  public Long getOriginalEstimateSeconds() {
    return originalEstimateSeconds;
  }




   /**
   * The remaining estimate of time needed for this issue in readable format.
   * @return remainingEstimate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remaining estimate of time needed for this issue in readable format.")

  public String getRemainingEstimate() {
    return remainingEstimate;
  }




   /**
   * The remaining estimate of time needed for this issue in seconds.
   * @return remainingEstimateSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The remaining estimate of time needed for this issue in seconds.")

  public Long getRemainingEstimateSeconds() {
    return remainingEstimateSeconds;
  }




   /**
   * Time worked on this issue in readable format.
   * @return timeSpent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time worked on this issue in readable format.")

  public String getTimeSpent() {
    return timeSpent;
  }




   /**
   * Time worked on this issue in seconds.
   * @return timeSpentSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time worked on this issue in seconds.")

  public Long getTimeSpentSeconds() {
    return timeSpentSeconds;
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
   * @return the TimeTrackingDetails instance itself
   */
  public TimeTrackingDetails putAdditionalProperty(String key, Object value) {
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
    TimeTrackingDetails timeTrackingDetails = (TimeTrackingDetails) o;
    return Objects.equals(this.originalEstimate, timeTrackingDetails.originalEstimate) &&
        Objects.equals(this.originalEstimateSeconds, timeTrackingDetails.originalEstimateSeconds) &&
        Objects.equals(this.remainingEstimate, timeTrackingDetails.remainingEstimate) &&
        Objects.equals(this.remainingEstimateSeconds, timeTrackingDetails.remainingEstimateSeconds) &&
        Objects.equals(this.timeSpent, timeTrackingDetails.timeSpent) &&
        Objects.equals(this.timeSpentSeconds, timeTrackingDetails.timeSpentSeconds)&&
        Objects.equals(this.additionalProperties, timeTrackingDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalEstimate, originalEstimateSeconds, remainingEstimate, remainingEstimateSeconds, timeSpent, timeSpentSeconds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingDetails {\n");
    sb.append("    originalEstimate: ").append(toIndentedString(originalEstimate)).append("\n");
    sb.append("    originalEstimateSeconds: ").append(toIndentedString(originalEstimateSeconds)).append("\n");
    sb.append("    remainingEstimate: ").append(toIndentedString(remainingEstimate)).append("\n");
    sb.append("    remainingEstimateSeconds: ").append(toIndentedString(remainingEstimateSeconds)).append("\n");
    sb.append("    timeSpent: ").append(toIndentedString(timeSpent)).append("\n");
    sb.append("    timeSpentSeconds: ").append(toIndentedString(timeSpentSeconds)).append("\n");
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
    openapiFields.add("originalEstimate");
    openapiFields.add("originalEstimateSeconds");
    openapiFields.add("remainingEstimate");
    openapiFields.add("remainingEstimateSeconds");
    openapiFields.add("timeSpent");
    openapiFields.add("timeSpentSeconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeTrackingDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeTrackingDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingDetails is not found in the empty JSON string", TimeTrackingDetails.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("originalEstimate") != null && !jsonObj.get("originalEstimate").isJsonNull()) && !jsonObj.get("originalEstimate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `originalEstimate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("originalEstimate").toString()));
      }
      if ((jsonObj.get("remainingEstimate") != null && !jsonObj.get("remainingEstimate").isJsonNull()) && !jsonObj.get("remainingEstimate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `remainingEstimate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("remainingEstimate").toString()));
      }
      if ((jsonObj.get("timeSpent") != null && !jsonObj.get("timeSpent").isJsonNull()) && !jsonObj.get("timeSpent").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeSpent` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeSpent").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingDetails>() {
           @Override
           public void write(JsonWriter out, TimeTrackingDetails value) throws IOException {
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
           public TimeTrackingDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeTrackingDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeTrackingDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeTrackingDetails
  * @throws IOException if the JSON string is invalid with respect to TimeTrackingDetails
  */
  public static TimeTrackingDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingDetails.class);
  }

 /**
  * Convert an instance of TimeTrackingDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
