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
import org.openapitools.jackson.nullable.JsonNullable;

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
 * Details of an operation to perform on a field.
 */
@ApiModel(description = "Details of an operation to perform on a field.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class FieldUpdateOperation {
  public static final String SERIALIZED_NAME_ADD = "add";
  @SerializedName(SERIALIZED_NAME_ADD)
  private Object add = null;

  public static final String SERIALIZED_NAME_COPY = "copy";
  @SerializedName(SERIALIZED_NAME_COPY)
  private Object copy = null;

  public static final String SERIALIZED_NAME_EDIT = "edit";
  @SerializedName(SERIALIZED_NAME_EDIT)
  private Object edit = null;

  public static final String SERIALIZED_NAME_REMOVE = "remove";
  @SerializedName(SERIALIZED_NAME_REMOVE)
  private Object remove = null;

  public static final String SERIALIZED_NAME_SET = "set";
  @SerializedName(SERIALIZED_NAME_SET)
  private Object set = null;

  public FieldUpdateOperation() {
  }

  public FieldUpdateOperation add(Object add) {
    
    
    
    
    this.add = add;
    return this;
  }

   /**
   * The value to add to the field.
   * @return add
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "triaged", value = "The value to add to the field.")

  public Object getAdd() {
    return add;
  }


  public void setAdd(Object add) {
    
    
    
    this.add = add;
  }


  public FieldUpdateOperation copy(Object copy) {
    
    
    
    
    this.copy = copy;
    return this;
  }

   /**
   * The field value to copy from another issue.
   * @return copy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"issuelinks\":{\"sourceIssues\":[{\"key\":\"FP-5\"}]}}", value = "The field value to copy from another issue.")

  public Object getCopy() {
    return copy;
  }


  public void setCopy(Object copy) {
    
    
    
    this.copy = copy;
  }


  public FieldUpdateOperation edit(Object edit) {
    
    
    
    
    this.edit = edit;
    return this;
  }

   /**
   * The value to edit in the field.
   * @return edit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"originalEstimate\":\"1w 1d\",\"remainingEstimate\":\"4d\"}", value = "The value to edit in the field.")

  public Object getEdit() {
    return edit;
  }


  public void setEdit(Object edit) {
    
    
    
    this.edit = edit;
  }


  public FieldUpdateOperation remove(Object remove) {
    
    
    
    
    this.remove = remove;
    return this;
  }

   /**
   * The value to removed from the field.
   * @return remove
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "blocker", value = "The value to removed from the field.")

  public Object getRemove() {
    return remove;
  }


  public void setRemove(Object remove) {
    
    
    
    this.remove = remove;
  }


  public FieldUpdateOperation set(Object set) {
    
    
    
    
    this.set = set;
    return this;
  }

   /**
   * The value to set in the field.
   * @return set
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A new summary", value = "The value to set in the field.")

  public Object getSet() {
    return set;
  }


  public void setSet(Object set) {
    
    
    
    this.set = set;
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
   * @return the FieldUpdateOperation instance itself
   */
  public FieldUpdateOperation putAdditionalProperty(String key, Object value) {
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
    FieldUpdateOperation fieldUpdateOperation = (FieldUpdateOperation) o;
    return Objects.equals(this.add, fieldUpdateOperation.add) &&
        Objects.equals(this.copy, fieldUpdateOperation.copy) &&
        Objects.equals(this.edit, fieldUpdateOperation.edit) &&
        Objects.equals(this.remove, fieldUpdateOperation.remove) &&
        Objects.equals(this.set, fieldUpdateOperation.set)&&
        Objects.equals(this.additionalProperties, fieldUpdateOperation.additionalProperties);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(add, copy, edit, remove, set, additionalProperties);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldUpdateOperation {\n");
    sb.append("    add: ").append(toIndentedString(add)).append("\n");
    sb.append("    copy: ").append(toIndentedString(copy)).append("\n");
    sb.append("    edit: ").append(toIndentedString(edit)).append("\n");
    sb.append("    remove: ").append(toIndentedString(remove)).append("\n");
    sb.append("    set: ").append(toIndentedString(set)).append("\n");
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
    openapiFields.add("add");
    openapiFields.add("copy");
    openapiFields.add("edit");
    openapiFields.add("remove");
    openapiFields.add("set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to FieldUpdateOperation
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!FieldUpdateOperation.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in FieldUpdateOperation is not found in the empty JSON string", FieldUpdateOperation.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FieldUpdateOperation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FieldUpdateOperation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FieldUpdateOperation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FieldUpdateOperation.class));

       return (TypeAdapter<T>) new TypeAdapter<FieldUpdateOperation>() {
           @Override
           public void write(JsonWriter out, FieldUpdateOperation value) throws IOException {
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
           public FieldUpdateOperation read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             FieldUpdateOperation instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of FieldUpdateOperation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FieldUpdateOperation
  * @throws IOException if the JSON string is invalid with respect to FieldUpdateOperation
  */
  public static FieldUpdateOperation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FieldUpdateOperation.class);
  }

 /**
  * Convert an instance of FieldUpdateOperation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

