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
import com.konfigthis.client.model.ProjectDetails;
import com.konfigthis.client.model.PublishedWorkflowId;
import com.konfigthis.client.model.Transition;
import com.konfigthis.client.model.WorkflowOperations;
import com.konfigthis.client.model.WorkflowSchemeIdName;
import com.konfigthis.client.model.WorkflowStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * Details about a workflow.
 */
@ApiModel(description = "Details about a workflow.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Workflow {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_HAS_DRAFT_WORKFLOW = "hasDraftWorkflow";
  @SerializedName(SERIALIZED_NAME_HAS_DRAFT_WORKFLOW)
  private Boolean hasDraftWorkflow;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private PublishedWorkflowId id;

  public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";
  @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
  private Boolean isDefault;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private WorkflowOperations operations;

  public static final String SERIALIZED_NAME_PROJECTS = "projects";
  @SerializedName(SERIALIZED_NAME_PROJECTS)
  private List<ProjectDetails> projects = null;

  public static final String SERIALIZED_NAME_SCHEMES = "schemes";
  @SerializedName(SERIALIZED_NAME_SCHEMES)
  private List<WorkflowSchemeIdName> schemes = null;

  public static final String SERIALIZED_NAME_STATUSES = "statuses";
  @SerializedName(SERIALIZED_NAME_STATUSES)
  private List<WorkflowStatus> statuses = null;

  public static final String SERIALIZED_NAME_TRANSITIONS = "transitions";
  @SerializedName(SERIALIZED_NAME_TRANSITIONS)
  private List<Transition> transitions = null;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public Workflow() {
  }

  public Workflow description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the workflow.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The description of the workflow.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public Workflow created(OffsetDateTime created) {
    
    
    
    
    this.created = created;
    return this;
  }

   /**
   * The creation date of the workflow.
   * @return created
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The creation date of the workflow.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    
    
    
    this.created = created;
  }


  public Workflow hasDraftWorkflow(Boolean hasDraftWorkflow) {
    
    
    
    
    this.hasDraftWorkflow = hasDraftWorkflow;
    return this;
  }

   /**
   * Whether the workflow has a draft version.
   * @return hasDraftWorkflow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the workflow has a draft version.")

  public Boolean getHasDraftWorkflow() {
    return hasDraftWorkflow;
  }


  public void setHasDraftWorkflow(Boolean hasDraftWorkflow) {
    
    
    
    this.hasDraftWorkflow = hasDraftWorkflow;
  }


  public Workflow id(PublishedWorkflowId id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public PublishedWorkflowId getId() {
    return id;
  }


  public void setId(PublishedWorkflowId id) {
    
    
    
    this.id = id;
  }


  public Workflow isDefault(Boolean isDefault) {
    
    
    
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether this is the default workflow.
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this is the default workflow.")

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    
    
    
    this.isDefault = isDefault;
  }


  public Workflow operations(WorkflowOperations operations) {
    
    
    
    
    this.operations = operations;
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowOperations getOperations() {
    return operations;
  }


  public void setOperations(WorkflowOperations operations) {
    
    
    
    this.operations = operations;
  }


  public Workflow projects(List<ProjectDetails> projects) {
    
    
    
    
    this.projects = projects;
    return this;
  }

  public Workflow addProjectsItem(ProjectDetails projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

   /**
   * The projects the workflow is assigned to, through workflow schemes.
   * @return projects
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The projects the workflow is assigned to, through workflow schemes.")

  public List<ProjectDetails> getProjects() {
    return projects;
  }


  public void setProjects(List<ProjectDetails> projects) {
    
    
    
    this.projects = projects;
  }


  public Workflow schemes(List<WorkflowSchemeIdName> schemes) {
    
    
    
    
    this.schemes = schemes;
    return this;
  }

  public Workflow addSchemesItem(WorkflowSchemeIdName schemesItem) {
    if (this.schemes == null) {
      this.schemes = new ArrayList<>();
    }
    this.schemes.add(schemesItem);
    return this;
  }

   /**
   * The workflow schemes the workflow is assigned to.
   * @return schemes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The workflow schemes the workflow is assigned to.")

  public List<WorkflowSchemeIdName> getSchemes() {
    return schemes;
  }


  public void setSchemes(List<WorkflowSchemeIdName> schemes) {
    
    
    
    this.schemes = schemes;
  }


  public Workflow statuses(List<WorkflowStatus> statuses) {
    
    
    
    
    this.statuses = statuses;
    return this;
  }

  public Workflow addStatusesItem(WorkflowStatus statusesItem) {
    if (this.statuses == null) {
      this.statuses = new ArrayList<>();
    }
    this.statuses.add(statusesItem);
    return this;
  }

   /**
   * The statuses of the workflow.
   * @return statuses
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The statuses of the workflow.")

  public List<WorkflowStatus> getStatuses() {
    return statuses;
  }


  public void setStatuses(List<WorkflowStatus> statuses) {
    
    
    
    this.statuses = statuses;
  }


  public Workflow transitions(List<Transition> transitions) {
    
    
    
    
    this.transitions = transitions;
    return this;
  }

  public Workflow addTransitionsItem(Transition transitionsItem) {
    if (this.transitions == null) {
      this.transitions = new ArrayList<>();
    }
    this.transitions.add(transitionsItem);
    return this;
  }

   /**
   * The transitions of the workflow.
   * @return transitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The transitions of the workflow.")

  public List<Transition> getTransitions() {
    return transitions;
  }


  public void setTransitions(List<Transition> transitions) {
    
    
    
    this.transitions = transitions;
  }


  public Workflow updated(OffsetDateTime updated) {
    
    
    
    
    this.updated = updated;
    return this;
  }

   /**
   * The last edited date of the workflow.
   * @return updated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The last edited date of the workflow.")

  public OffsetDateTime getUpdated() {
    return updated;
  }


  public void setUpdated(OffsetDateTime updated) {
    
    
    
    this.updated = updated;
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
   * @return the Workflow instance itself
   */
  public Workflow putAdditionalProperty(String key, Object value) {
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
    Workflow workflow = (Workflow) o;
    return Objects.equals(this.description, workflow.description) &&
        Objects.equals(this.created, workflow.created) &&
        Objects.equals(this.hasDraftWorkflow, workflow.hasDraftWorkflow) &&
        Objects.equals(this.id, workflow.id) &&
        Objects.equals(this.isDefault, workflow.isDefault) &&
        Objects.equals(this.operations, workflow.operations) &&
        Objects.equals(this.projects, workflow.projects) &&
        Objects.equals(this.schemes, workflow.schemes) &&
        Objects.equals(this.statuses, workflow.statuses) &&
        Objects.equals(this.transitions, workflow.transitions) &&
        Objects.equals(this.updated, workflow.updated)&&
        Objects.equals(this.additionalProperties, workflow.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, created, hasDraftWorkflow, id, isDefault, operations, projects, schemes, statuses, transitions, updated, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workflow {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    hasDraftWorkflow: ").append(toIndentedString(hasDraftWorkflow)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    schemes: ").append(toIndentedString(schemes)).append("\n");
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
    sb.append("    transitions: ").append(toIndentedString(transitions)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("created");
    openapiFields.add("hasDraftWorkflow");
    openapiFields.add("id");
    openapiFields.add("isDefault");
    openapiFields.add("operations");
    openapiFields.add("projects");
    openapiFields.add("schemes");
    openapiFields.add("statuses");
    openapiFields.add("transitions");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("description");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Workflow
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Workflow.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workflow is not found in the empty JSON string", Workflow.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Workflow.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the required field `id`
      PublishedWorkflowId.validateJsonObject(jsonObj.getAsJsonObject("id"));
      // validate the optional field `operations`
      if (jsonObj.get("operations") != null && !jsonObj.get("operations").isJsonNull()) {
        WorkflowOperations.validateJsonObject(jsonObj.getAsJsonObject("operations"));
      }
      if (jsonObj.get("projects") != null && !jsonObj.get("projects").isJsonNull()) {
        JsonArray jsonArrayprojects = jsonObj.getAsJsonArray("projects");
        if (jsonArrayprojects != null) {
          // ensure the json data is an array
          if (!jsonObj.get("projects").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `projects` to be an array in the JSON string but got `%s`", jsonObj.get("projects").toString()));
          }

          // validate the optional field `projects` (array)
          for (int i = 0; i < jsonArrayprojects.size(); i++) {
            ProjectDetails.validateJsonObject(jsonArrayprojects.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("schemes") != null && !jsonObj.get("schemes").isJsonNull()) {
        JsonArray jsonArrayschemes = jsonObj.getAsJsonArray("schemes");
        if (jsonArrayschemes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("schemes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `schemes` to be an array in the JSON string but got `%s`", jsonObj.get("schemes").toString()));
          }

          // validate the optional field `schemes` (array)
          for (int i = 0; i < jsonArrayschemes.size(); i++) {
            WorkflowSchemeIdName.validateJsonObject(jsonArrayschemes.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("statuses") != null && !jsonObj.get("statuses").isJsonNull()) {
        JsonArray jsonArraystatuses = jsonObj.getAsJsonArray("statuses");
        if (jsonArraystatuses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("statuses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `statuses` to be an array in the JSON string but got `%s`", jsonObj.get("statuses").toString()));
          }

          // validate the optional field `statuses` (array)
          for (int i = 0; i < jsonArraystatuses.size(); i++) {
            WorkflowStatus.validateJsonObject(jsonArraystatuses.get(i).getAsJsonObject());
          };
        }
      }
      if (jsonObj.get("transitions") != null && !jsonObj.get("transitions").isJsonNull()) {
        JsonArray jsonArraytransitions = jsonObj.getAsJsonArray("transitions");
        if (jsonArraytransitions != null) {
          // ensure the json data is an array
          if (!jsonObj.get("transitions").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `transitions` to be an array in the JSON string but got `%s`", jsonObj.get("transitions").toString()));
          }

          // validate the optional field `transitions` (array)
          for (int i = 0; i < jsonArraytransitions.size(); i++) {
            Transition.validateJsonObject(jsonArraytransitions.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workflow.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workflow' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workflow> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workflow.class));

       return (TypeAdapter<T>) new TypeAdapter<Workflow>() {
           @Override
           public void write(JsonWriter out, Workflow value) throws IOException {
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
           public Workflow read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Workflow instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Workflow given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workflow
  * @throws IOException if the JSON string is invalid with respect to Workflow
  */
  public static Workflow fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workflow.class);
  }

 /**
  * Convert an instance of Workflow to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
