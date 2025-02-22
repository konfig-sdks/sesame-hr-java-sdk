/*
 * Sesame Public API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 3.0.0
 * 
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
import java.time.LocalDate;
import java.util.UUID;

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
 * ProjectsUpdateProjectByIdRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ProjectsUpdateProjectByIdRequest {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PARENT_PROJECT_ID = "parentProjectId";
  @SerializedName(SERIALIZED_NAME_PARENT_PROJECT_ID)
  private UUID parentProjectId;

  public static final String SERIALIZED_NAME_CUSTOMER_ID = "customerId";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_ID)
  private UUID customerId;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Float price;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_MANAGER_ID = "managerId";
  @SerializedName(SERIALIZED_NAME_MANAGER_ID)
  private UUID managerId;

  /**
   * The status of the project
   */
  @JsonAdapter(StatusEnum.Adapter.class)
 public enum StatusEnum {
    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    PAUSED("paused");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public ProjectsUpdateProjectByIdRequest() {
  }

  public ProjectsUpdateProjectByIdRequest description(String description) {
    
    
    
    
    this.description = description;
    return this;
  }

   /**
   * The description of the project
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The description of the project")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    
    
    
    this.description = description;
  }


  public ProjectsUpdateProjectByIdRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * The name of the project
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the project")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ProjectsUpdateProjectByIdRequest parentProjectId(UUID parentProjectId) {
    
    
    
    
    this.parentProjectId = parentProjectId;
    return this;
  }

   /**
   * The id of the parent project
   * @return parentProjectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the parent project")

  public UUID getParentProjectId() {
    return parentProjectId;
  }


  public void setParentProjectId(UUID parentProjectId) {
    
    
    
    this.parentProjectId = parentProjectId;
  }


  public ProjectsUpdateProjectByIdRequest customerId(UUID customerId) {
    
    
    
    
    this.customerId = customerId;
    return this;
  }

   /**
   * The id of the customer
   * @return customerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the customer")

  public UUID getCustomerId() {
    return customerId;
  }


  public void setCustomerId(UUID customerId) {
    
    
    
    this.customerId = customerId;
  }


  public ProjectsUpdateProjectByIdRequest price(Float price) {
    
    
    
    
    this.price = price;
    return this;
  }

   /**
   * The price of the project
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The price of the project")

  public Float getPrice() {
    return price;
  }


  public void setPrice(Float price) {
    
    
    
    this.price = price;
  }


  public ProjectsUpdateProjectByIdRequest startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date of the project
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date of the project")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public ProjectsUpdateProjectByIdRequest endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date of the project
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date of the project")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public ProjectsUpdateProjectByIdRequest managerId(UUID managerId) {
    
    
    
    
    this.managerId = managerId;
    return this;
  }

   /**
   * The id of the employee manager
   * @return managerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the employee manager")

  public UUID getManagerId() {
    return managerId;
  }


  public void setManagerId(UUID managerId) {
    
    
    
    this.managerId = managerId;
  }


  public ProjectsUpdateProjectByIdRequest status(StatusEnum status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the project
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the project")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    
    
    
    this.status = status;
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
   * @return the ProjectsUpdateProjectByIdRequest instance itself
   */
  public ProjectsUpdateProjectByIdRequest putAdditionalProperty(String key, Object value) {
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
    ProjectsUpdateProjectByIdRequest projectsUpdateProjectByIdRequest = (ProjectsUpdateProjectByIdRequest) o;
    return Objects.equals(this.description, projectsUpdateProjectByIdRequest.description) &&
        Objects.equals(this.name, projectsUpdateProjectByIdRequest.name) &&
        Objects.equals(this.parentProjectId, projectsUpdateProjectByIdRequest.parentProjectId) &&
        Objects.equals(this.customerId, projectsUpdateProjectByIdRequest.customerId) &&
        Objects.equals(this.price, projectsUpdateProjectByIdRequest.price) &&
        Objects.equals(this.startDate, projectsUpdateProjectByIdRequest.startDate) &&
        Objects.equals(this.endDate, projectsUpdateProjectByIdRequest.endDate) &&
        Objects.equals(this.managerId, projectsUpdateProjectByIdRequest.managerId) &&
        Objects.equals(this.status, projectsUpdateProjectByIdRequest.status)&&
        Objects.equals(this.additionalProperties, projectsUpdateProjectByIdRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, parentProjectId, customerId, price, startDate, endDate, managerId, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectsUpdateProjectByIdRequest {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentProjectId: ").append(toIndentedString(parentProjectId)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("parentProjectId");
    openapiFields.add("customerId");
    openapiFields.add("price");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("managerId");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectsUpdateProjectByIdRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectsUpdateProjectByIdRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectsUpdateProjectByIdRequest is not found in the empty JSON string", ProjectsUpdateProjectByIdRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ProjectsUpdateProjectByIdRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("parentProjectId") != null && !jsonObj.get("parentProjectId").isJsonNull()) && !jsonObj.get("parentProjectId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentProjectId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentProjectId").toString()));
      }
      if ((jsonObj.get("customerId") != null && !jsonObj.get("customerId").isJsonNull()) && !jsonObj.get("customerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `customerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("customerId").toString()));
      }
      if ((jsonObj.get("managerId") != null && !jsonObj.get("managerId").isJsonNull()) && !jsonObj.get("managerId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `managerId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("managerId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectsUpdateProjectByIdRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectsUpdateProjectByIdRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectsUpdateProjectByIdRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectsUpdateProjectByIdRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectsUpdateProjectByIdRequest>() {
           @Override
           public void write(JsonWriter out, ProjectsUpdateProjectByIdRequest value) throws IOException {
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
           public ProjectsUpdateProjectByIdRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ProjectsUpdateProjectByIdRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ProjectsUpdateProjectByIdRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectsUpdateProjectByIdRequest
  * @throws IOException if the JSON string is invalid with respect to ProjectsUpdateProjectByIdRequest
  */
  public static ProjectsUpdateProjectByIdRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectsUpdateProjectByIdRequest.class);
  }

 /**
  * Convert an instance of ProjectsUpdateProjectByIdRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

