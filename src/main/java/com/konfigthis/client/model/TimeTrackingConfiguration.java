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
 * Details of the time tracking configuration.
 */
@ApiModel(description = "Details of the time tracking configuration.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class TimeTrackingConfiguration {
  /**
   * The default unit of time applied to logged time.
   */
  @JsonAdapter(DefaultUnitEnum.Adapter.class)
 public enum DefaultUnitEnum {
    MINUTE("minute"),
    
    HOUR("hour"),
    
    DAY("day"),
    
    WEEK("week");

    private String value;

    DefaultUnitEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DefaultUnitEnum fromValue(String value) {
      for (DefaultUnitEnum b : DefaultUnitEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DefaultUnitEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DefaultUnitEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DefaultUnitEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DefaultUnitEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DEFAULT_UNIT = "defaultUnit";
  @SerializedName(SERIALIZED_NAME_DEFAULT_UNIT)
  private DefaultUnitEnum defaultUnit;

  /**
   * The format that will appear on an issue&#39;s *Time Spent* field.
   */
  @JsonAdapter(TimeFormatEnum.Adapter.class)
 public enum TimeFormatEnum {
    PRETTY("pretty"),
    
    DAYS("days"),
    
    HOURS("hours");

    private String value;

    TimeFormatEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TimeFormatEnum fromValue(String value) {
      for (TimeFormatEnum b : TimeFormatEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TimeFormatEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TimeFormatEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TimeFormatEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TimeFormatEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TIME_FORMAT = "timeFormat";
  @SerializedName(SERIALIZED_NAME_TIME_FORMAT)
  private TimeFormatEnum timeFormat;

  public static final String SERIALIZED_NAME_WORKING_DAYS_PER_WEEK = "workingDaysPerWeek";
  @SerializedName(SERIALIZED_NAME_WORKING_DAYS_PER_WEEK)
  private Double workingDaysPerWeek;

  public static final String SERIALIZED_NAME_WORKING_HOURS_PER_DAY = "workingHoursPerDay";
  @SerializedName(SERIALIZED_NAME_WORKING_HOURS_PER_DAY)
  private Double workingHoursPerDay;

  public TimeTrackingConfiguration() {
  }

  public TimeTrackingConfiguration defaultUnit(DefaultUnitEnum defaultUnit) {
    
    
    
    
    this.defaultUnit = defaultUnit;
    return this;
  }

   /**
   * The default unit of time applied to logged time.
   * @return defaultUnit
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The default unit of time applied to logged time.")

  public DefaultUnitEnum getDefaultUnit() {
    return defaultUnit;
  }


  public void setDefaultUnit(DefaultUnitEnum defaultUnit) {
    
    
    
    this.defaultUnit = defaultUnit;
  }


  public TimeTrackingConfiguration timeFormat(TimeFormatEnum timeFormat) {
    
    
    
    
    this.timeFormat = timeFormat;
    return this;
  }

   /**
   * The format that will appear on an issue&#39;s *Time Spent* field.
   * @return timeFormat
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The format that will appear on an issue's *Time Spent* field.")

  public TimeFormatEnum getTimeFormat() {
    return timeFormat;
  }


  public void setTimeFormat(TimeFormatEnum timeFormat) {
    
    
    
    this.timeFormat = timeFormat;
  }


  public TimeTrackingConfiguration workingDaysPerWeek(Double workingDaysPerWeek) {
    
    
    
    
    this.workingDaysPerWeek = workingDaysPerWeek;
    return this;
  }

   /**
   * The number of days in a working week.
   * @return workingDaysPerWeek
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of days in a working week.")

  public Double getWorkingDaysPerWeek() {
    return workingDaysPerWeek;
  }


  public void setWorkingDaysPerWeek(Double workingDaysPerWeek) {
    
    
    
    this.workingDaysPerWeek = workingDaysPerWeek;
  }


  public TimeTrackingConfiguration workingHoursPerDay(Double workingHoursPerDay) {
    
    
    
    
    this.workingHoursPerDay = workingHoursPerDay;
    return this;
  }

   /**
   * The number of hours in a working day.
   * @return workingHoursPerDay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The number of hours in a working day.")

  public Double getWorkingHoursPerDay() {
    return workingHoursPerDay;
  }


  public void setWorkingHoursPerDay(Double workingHoursPerDay) {
    
    
    
    this.workingHoursPerDay = workingHoursPerDay;
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
   * @return the TimeTrackingConfiguration instance itself
   */
  public TimeTrackingConfiguration putAdditionalProperty(String key, Object value) {
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
    TimeTrackingConfiguration timeTrackingConfiguration = (TimeTrackingConfiguration) o;
    return Objects.equals(this.defaultUnit, timeTrackingConfiguration.defaultUnit) &&
        Objects.equals(this.timeFormat, timeTrackingConfiguration.timeFormat) &&
        Objects.equals(this.workingDaysPerWeek, timeTrackingConfiguration.workingDaysPerWeek) &&
        Objects.equals(this.workingHoursPerDay, timeTrackingConfiguration.workingHoursPerDay)&&
        Objects.equals(this.additionalProperties, timeTrackingConfiguration.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultUnit, timeFormat, workingDaysPerWeek, workingHoursPerDay, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeTrackingConfiguration {\n");
    sb.append("    defaultUnit: ").append(toIndentedString(defaultUnit)).append("\n");
    sb.append("    timeFormat: ").append(toIndentedString(timeFormat)).append("\n");
    sb.append("    workingDaysPerWeek: ").append(toIndentedString(workingDaysPerWeek)).append("\n");
    sb.append("    workingHoursPerDay: ").append(toIndentedString(workingHoursPerDay)).append("\n");
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
    openapiFields.add("defaultUnit");
    openapiFields.add("timeFormat");
    openapiFields.add("workingDaysPerWeek");
    openapiFields.add("workingHoursPerDay");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("defaultUnit");
    openapiRequiredFields.add("timeFormat");
    openapiRequiredFields.add("workingDaysPerWeek");
    openapiRequiredFields.add("workingHoursPerDay");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to TimeTrackingConfiguration
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!TimeTrackingConfiguration.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in TimeTrackingConfiguration is not found in the empty JSON string", TimeTrackingConfiguration.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : TimeTrackingConfiguration.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("defaultUnit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `defaultUnit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("defaultUnit").toString()));
      }
      if (!jsonObj.get("timeFormat").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeFormat` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeFormat").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!TimeTrackingConfiguration.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'TimeTrackingConfiguration' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<TimeTrackingConfiguration> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(TimeTrackingConfiguration.class));

       return (TypeAdapter<T>) new TypeAdapter<TimeTrackingConfiguration>() {
           @Override
           public void write(JsonWriter out, TimeTrackingConfiguration value) throws IOException {
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
           public TimeTrackingConfiguration read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             TimeTrackingConfiguration instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of TimeTrackingConfiguration given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of TimeTrackingConfiguration
  * @throws IOException if the JSON string is invalid with respect to TimeTrackingConfiguration
  */
  public static TimeTrackingConfiguration fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, TimeTrackingConfiguration.class);
  }

 /**
  * Convert an instance of TimeTrackingConfiguration to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
