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
 * EmployeeAssignationsRolesAssignRoleRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeAssignationsRolesAssignRoleRequest {
  public static final String SERIALIZED_NAME_ROLE_ID = "roleId";
  @SerializedName(SERIALIZED_NAME_ROLE_ID)
  private UUID roleId;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  public static final String SERIALIZED_NAME_ENTITY_AFFECTED_ID = "entityAffectedId";
  @SerializedName(SERIALIZED_NAME_ENTITY_AFFECTED_ID)
  private UUID entityAffectedId;

  public EmployeeAssignationsRolesAssignRoleRequest() {
  }

  public EmployeeAssignationsRolesAssignRoleRequest roleId(UUID roleId) {
    
    
    
    
    this.roleId = roleId;
    return this;
  }

   /**
   * Role Id
   * @return roleId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Role Id")

  public UUID getRoleId() {
    return roleId;
  }


  public void setRoleId(UUID roleId) {
    
    
    
    this.roleId = roleId;
  }


  public EmployeeAssignationsRolesAssignRoleRequest employeeId(UUID employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The id of the employee to assign the role
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the employee to assign the role")

  public UUID getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(UUID employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public EmployeeAssignationsRolesAssignRoleRequest entityAffectedId(UUID entityAffectedId) {
    
    
    
    
    this.entityAffectedId = entityAffectedId;
    return this;
  }

   /**
   * The id of the entity to manage
   * @return entityAffectedId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The id of the entity to manage")

  public UUID getEntityAffectedId() {
    return entityAffectedId;
  }


  public void setEntityAffectedId(UUID entityAffectedId) {
    
    
    
    this.entityAffectedId = entityAffectedId;
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
   * @return the EmployeeAssignationsRolesAssignRoleRequest instance itself
   */
  public EmployeeAssignationsRolesAssignRoleRequest putAdditionalProperty(String key, Object value) {
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
    EmployeeAssignationsRolesAssignRoleRequest employeeAssignationsRolesAssignRoleRequest = (EmployeeAssignationsRolesAssignRoleRequest) o;
    return Objects.equals(this.roleId, employeeAssignationsRolesAssignRoleRequest.roleId) &&
        Objects.equals(this.employeeId, employeeAssignationsRolesAssignRoleRequest.employeeId) &&
        Objects.equals(this.entityAffectedId, employeeAssignationsRolesAssignRoleRequest.entityAffectedId)&&
        Objects.equals(this.additionalProperties, employeeAssignationsRolesAssignRoleRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roleId, employeeId, entityAffectedId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAssignationsRolesAssignRoleRequest {\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    entityAffectedId: ").append(toIndentedString(entityAffectedId)).append("\n");
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
    openapiFields.add("roleId");
    openapiFields.add("employeeId");
    openapiFields.add("entityAffectedId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("roleId");
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("entityAffectedId");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeAssignationsRolesAssignRoleRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeAssignationsRolesAssignRoleRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeAssignationsRolesAssignRoleRequest is not found in the empty JSON string", EmployeeAssignationsRolesAssignRoleRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : EmployeeAssignationsRolesAssignRoleRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("roleId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `roleId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("roleId").toString()));
      }
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (!jsonObj.get("entityAffectedId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `entityAffectedId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("entityAffectedId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeAssignationsRolesAssignRoleRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeAssignationsRolesAssignRoleRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeAssignationsRolesAssignRoleRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeAssignationsRolesAssignRoleRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeAssignationsRolesAssignRoleRequest>() {
           @Override
           public void write(JsonWriter out, EmployeeAssignationsRolesAssignRoleRequest value) throws IOException {
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
           public EmployeeAssignationsRolesAssignRoleRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeAssignationsRolesAssignRoleRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeAssignationsRolesAssignRoleRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeAssignationsRolesAssignRoleRequest
  * @throws IOException if the JSON string is invalid with respect to EmployeeAssignationsRolesAssignRoleRequest
  */
  public static EmployeeAssignationsRolesAssignRoleRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeAssignationsRolesAssignRoleRequest.class);
  }

 /**
  * Convert an instance of EmployeeAssignationsRolesAssignRoleRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

