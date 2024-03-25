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
import com.konfigthis.client.model.FieldConfigurationToIssueTypeMapping;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.LinkedHashSet;
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
 * Details of a field configuration to issue type mappings.
 */
@ApiModel(description = "Details of a field configuration to issue type mappings.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AssociateFieldConfigurationsWithIssueTypesRequest {
  public static final String SERIALIZED_NAME_MAPPINGS = "mappings";
  @SerializedName(SERIALIZED_NAME_MAPPINGS)
  private Set<FieldConfigurationToIssueTypeMapping> mappings = new LinkedHashSet<>();

  public AssociateFieldConfigurationsWithIssueTypesRequest() {
  }

  public AssociateFieldConfigurationsWithIssueTypesRequest mappings(Set<FieldConfigurationToIssueTypeMapping> mappings) {
    
    
    
    
    this.mappings = mappings;
    return this;
  }

  public AssociateFieldConfigurationsWithIssueTypesRequest addMappingsItem(FieldConfigurationToIssueTypeMapping mappingsItem) {
    this.mappings.add(mappingsItem);
    return this;
  }

   /**
   * Field configuration to issue type mappings.
   * @return mappings
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Field configuration to issue type mappings.")

  public Set<FieldConfigurationToIssueTypeMapping> getMappings() {
    return mappings;
  }


  public void setMappings(Set<FieldConfigurationToIssueTypeMapping> mappings) {
    
    
    
    this.mappings = mappings;
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
   * @return the AssociateFieldConfigurationsWithIssueTypesRequest instance itself
   */
  public AssociateFieldConfigurationsWithIssueTypesRequest putAdditionalProperty(String key, Object value) {
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
    AssociateFieldConfigurationsWithIssueTypesRequest associateFieldConfigurationsWithIssueTypesRequest = (AssociateFieldConfigurationsWithIssueTypesRequest) o;
    return Objects.equals(this.mappings, associateFieldConfigurationsWithIssueTypesRequest.mappings)&&
        Objects.equals(this.additionalProperties, associateFieldConfigurationsWithIssueTypesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mappings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssociateFieldConfigurationsWithIssueTypesRequest {\n");
    sb.append("    mappings: ").append(toIndentedString(mappings)).append("\n");
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
    openapiFields.add("mappings");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("mappings");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AssociateFieldConfigurationsWithIssueTypesRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AssociateFieldConfigurationsWithIssueTypesRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AssociateFieldConfigurationsWithIssueTypesRequest is not found in the empty JSON string", AssociateFieldConfigurationsWithIssueTypesRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AssociateFieldConfigurationsWithIssueTypesRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (!jsonObj.get("mappings").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `mappings` to be an array in the JSON string but got `%s`", jsonObj.get("mappings").toString()));
      }

      JsonArray jsonArraymappings = jsonObj.getAsJsonArray("mappings");
      // validate the required field `mappings` (array)
      for (int i = 0; i < jsonArraymappings.size(); i++) {
        FieldConfigurationToIssueTypeMapping.validateJsonObject(jsonArraymappings.get(i).getAsJsonObject());
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssociateFieldConfigurationsWithIssueTypesRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssociateFieldConfigurationsWithIssueTypesRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssociateFieldConfigurationsWithIssueTypesRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssociateFieldConfigurationsWithIssueTypesRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AssociateFieldConfigurationsWithIssueTypesRequest>() {
           @Override
           public void write(JsonWriter out, AssociateFieldConfigurationsWithIssueTypesRequest value) throws IOException {
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
           public AssociateFieldConfigurationsWithIssueTypesRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AssociateFieldConfigurationsWithIssueTypesRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AssociateFieldConfigurationsWithIssueTypesRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssociateFieldConfigurationsWithIssueTypesRequest
  * @throws IOException if the JSON string is invalid with respect to AssociateFieldConfigurationsWithIssueTypesRequest
  */
  public static AssociateFieldConfigurationsWithIssueTypesRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssociateFieldConfigurationsWithIssueTypesRequest.class);
  }

 /**
  * Convert an instance of AssociateFieldConfigurationsWithIssueTypesRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

