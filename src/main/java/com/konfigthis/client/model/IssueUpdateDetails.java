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
import com.konfigthis.client.model.FieldUpdateOperation;
import com.konfigthis.client.model.HistoryMetadata;
import com.konfigthis.client.model.IssueTransition;
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
 * Details of an issue update request.
 */
@ApiModel(description = "Details of an issue update request.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class IssueUpdateDetails {
  public static final String SERIALIZED_NAME_FIELDS = "fields";
  @SerializedName(SERIALIZED_NAME_FIELDS)
  private Map<String, Object> fields = null;

  public static final String SERIALIZED_NAME_HISTORY_METADATA = "historyMetadata";
  @SerializedName(SERIALIZED_NAME_HISTORY_METADATA)
  private HistoryMetadata historyMetadata;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EntityProperty> properties = null;

  public static final String SERIALIZED_NAME_TRANSITION = "transition";
  @SerializedName(SERIALIZED_NAME_TRANSITION)
  private IssueTransition transition;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private Map<String, List<FieldUpdateOperation>> update = null;

  public IssueUpdateDetails() {
  }

  public IssueUpdateDetails fields(Map<String, Object> fields) {
    
    
    
    
    this.fields = fields;
    return this;
  }

  public IssueUpdateDetails putFieldsItem(String key, Object fieldsItem) {
    if (this.fields == null) {
      this.fields = new HashMap<>();
    }
    this.fields.put(key, fieldsItem);
    return this;
  }

   /**
   * List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use &#x60;update&#x60;. Fields included in here cannot be included in &#x60;update&#x60;.
   * @return fields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of issue screen fields to update, specifying the sub-field to update and its value for each field. This field provides a straightforward option when setting a sub-field. When multiple sub-fields or other operations are required, use `update`. Fields included in here cannot be included in `update`.")

  public Map<String, Object> getFields() {
    return fields;
  }


  public void setFields(Map<String, Object> fields) {
    
    
    
    this.fields = fields;
  }


  public IssueUpdateDetails historyMetadata(HistoryMetadata historyMetadata) {
    
    
    
    
    this.historyMetadata = historyMetadata;
    return this;
  }

   /**
   * Get historyMetadata
   * @return historyMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HistoryMetadata getHistoryMetadata() {
    return historyMetadata;
  }


  public void setHistoryMetadata(HistoryMetadata historyMetadata) {
    
    
    
    this.historyMetadata = historyMetadata;
  }


  public IssueUpdateDetails properties(List<EntityProperty> properties) {
    
    
    
    
    this.properties = properties;
    return this;
  }

  public IssueUpdateDetails addPropertiesItem(EntityProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * Details of issue properties to be add or update.
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of issue properties to be add or update.")

  public List<EntityProperty> getProperties() {
    return properties;
  }


  public void setProperties(List<EntityProperty> properties) {
    
    
    
    this.properties = properties;
  }


  public IssueUpdateDetails transition(IssueTransition transition) {
    
    
    
    
    this.transition = transition;
    return this;
  }

   /**
   * Get transition
   * @return transition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IssueTransition getTransition() {
    return transition;
  }


  public void setTransition(IssueTransition transition) {
    
    
    
    this.transition = transition;
  }


  public IssueUpdateDetails update(Map<String, List<FieldUpdateOperation>> update) {
    
    
    
    
    this.update = update;
    return this;
  }

  public IssueUpdateDetails putUpdateItem(String key, List<FieldUpdateOperation> updateItem) {
    if (this.update == null) {
      this.update = new HashMap<>();
    }
    this.update.put(key, updateItem);
    return this;
  }

   /**
   * A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in &#x60;fields&#x60;.
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Map containing the field field name and a list of operations to perform on the issue screen field. Note that fields included in here cannot be included in `fields`.")

  public Map<String, List<FieldUpdateOperation>> getUpdate() {
    return update;
  }


  public void setUpdate(Map<String, List<FieldUpdateOperation>> update) {
    
    
    
    this.update = update;
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
   * @return the IssueUpdateDetails instance itself
   */
  public IssueUpdateDetails putAdditionalProperty(String key, Object value) {
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
    IssueUpdateDetails issueUpdateDetails = (IssueUpdateDetails) o;
    return Objects.equals(this.fields, issueUpdateDetails.fields) &&
        Objects.equals(this.historyMetadata, issueUpdateDetails.historyMetadata) &&
        Objects.equals(this.properties, issueUpdateDetails.properties) &&
        Objects.equals(this.transition, issueUpdateDetails.transition) &&
        Objects.equals(this.update, issueUpdateDetails.update)&&
        Objects.equals(this.additionalProperties, issueUpdateDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fields, historyMetadata, properties, transition, update, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueUpdateDetails {\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    historyMetadata: ").append(toIndentedString(historyMetadata)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    transition: ").append(toIndentedString(transition)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
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
    openapiFields.add("historyMetadata");
    openapiFields.add("properties");
    openapiFields.add("transition");
    openapiFields.add("update");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to IssueUpdateDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!IssueUpdateDetails.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IssueUpdateDetails is not found in the empty JSON string", IssueUpdateDetails.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `historyMetadata`
      if (jsonObj.get("historyMetadata") != null && !jsonObj.get("historyMetadata").isJsonNull()) {
        HistoryMetadata.validateJsonObject(jsonObj.getAsJsonObject("historyMetadata"));
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
      // validate the optional field `transition`
      if (jsonObj.get("transition") != null && !jsonObj.get("transition").isJsonNull()) {
        IssueTransition.validateJsonObject(jsonObj.getAsJsonObject("transition"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IssueUpdateDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IssueUpdateDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IssueUpdateDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IssueUpdateDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<IssueUpdateDetails>() {
           @Override
           public void write(JsonWriter out, IssueUpdateDetails value) throws IOException {
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
           public IssueUpdateDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             IssueUpdateDetails instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of IssueUpdateDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of IssueUpdateDetails
  * @throws IOException if the JSON string is invalid with respect to IssueUpdateDetails
  */
  public static IssueUpdateDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IssueUpdateDetails.class);
  }

 /**
  * Convert an instance of IssueUpdateDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

