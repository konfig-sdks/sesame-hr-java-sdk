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
import com.konfigthis.client.model.RolesGetAllResponseDataInner;
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
 * EmployeeAssignationsRolesListByEmployeeResponseDataInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class EmployeeAssignationsRolesListByEmployeeResponseDataInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RolesGetAllResponseDataInner role;

  public static final String SERIALIZED_NAME_AFFECTED_ENTITY_TYPE = "affectedEntityType";
  @SerializedName(SERIALIZED_NAME_AFFECTED_ENTITY_TYPE)
  private String affectedEntityType;

  public static final String SERIALIZED_NAME_AFFECTED_ENTITY_ID = "affectedEntityId";
  @SerializedName(SERIALIZED_NAME_AFFECTED_ENTITY_ID)
  private UUID affectedEntityId;

  public EmployeeAssignationsRolesListByEmployeeResponseDataInner() {
  }

  public EmployeeAssignationsRolesListByEmployeeResponseDataInner id(UUID id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    
    
    
    this.id = id;
  }


  public EmployeeAssignationsRolesListByEmployeeResponseDataInner role(RolesGetAllResponseDataInner role) {
    
    
    
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RolesGetAllResponseDataInner getRole() {
    return role;
  }


  public void setRole(RolesGetAllResponseDataInner role) {
    
    
    
    this.role = role;
  }


  public EmployeeAssignationsRolesListByEmployeeResponseDataInner affectedEntityType(String affectedEntityType) {
    
    
    
    
    this.affectedEntityType = affectedEntityType;
    return this;
  }

   /**
   * Get affectedEntityType
   * @return affectedEntityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAffectedEntityType() {
    return affectedEntityType;
  }


  public void setAffectedEntityType(String affectedEntityType) {
    
    
    
    this.affectedEntityType = affectedEntityType;
  }


  public EmployeeAssignationsRolesListByEmployeeResponseDataInner affectedEntityId(UUID affectedEntityId) {
    
    
    
    
    this.affectedEntityId = affectedEntityId;
    return this;
  }

   /**
   * Get affectedEntityId
   * @return affectedEntityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getAffectedEntityId() {
    return affectedEntityId;
  }


  public void setAffectedEntityId(UUID affectedEntityId) {
    
    
    
    this.affectedEntityId = affectedEntityId;
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
   * @return the EmployeeAssignationsRolesListByEmployeeResponseDataInner instance itself
   */
  public EmployeeAssignationsRolesListByEmployeeResponseDataInner putAdditionalProperty(String key, Object value) {
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
    EmployeeAssignationsRolesListByEmployeeResponseDataInner employeeAssignationsRolesListByEmployeeResponseDataInner = (EmployeeAssignationsRolesListByEmployeeResponseDataInner) o;
    return Objects.equals(this.id, employeeAssignationsRolesListByEmployeeResponseDataInner.id) &&
        Objects.equals(this.role, employeeAssignationsRolesListByEmployeeResponseDataInner.role) &&
        Objects.equals(this.affectedEntityType, employeeAssignationsRolesListByEmployeeResponseDataInner.affectedEntityType) &&
        Objects.equals(this.affectedEntityId, employeeAssignationsRolesListByEmployeeResponseDataInner.affectedEntityId)&&
        Objects.equals(this.additionalProperties, employeeAssignationsRolesListByEmployeeResponseDataInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, role, affectedEntityType, affectedEntityId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeeAssignationsRolesListByEmployeeResponseDataInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    affectedEntityType: ").append(toIndentedString(affectedEntityType)).append("\n");
    sb.append("    affectedEntityId: ").append(toIndentedString(affectedEntityId)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("role");
    openapiFields.add("affectedEntityType");
    openapiFields.add("affectedEntityId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EmployeeAssignationsRolesListByEmployeeResponseDataInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!EmployeeAssignationsRolesListByEmployeeResponseDataInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EmployeeAssignationsRolesListByEmployeeResponseDataInner is not found in the empty JSON string", EmployeeAssignationsRolesListByEmployeeResponseDataInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // validate the optional field `role`
      if (jsonObj.get("role") != null && !jsonObj.get("role").isJsonNull()) {
        RolesGetAllResponseDataInner.validateJsonObject(jsonObj.getAsJsonObject("role"));
      }
      if ((jsonObj.get("affectedEntityType") != null && !jsonObj.get("affectedEntityType").isJsonNull()) && !jsonObj.get("affectedEntityType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `affectedEntityType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("affectedEntityType").toString()));
      }
      if ((jsonObj.get("affectedEntityId") != null && !jsonObj.get("affectedEntityId").isJsonNull()) && !jsonObj.get("affectedEntityId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `affectedEntityId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("affectedEntityId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EmployeeAssignationsRolesListByEmployeeResponseDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EmployeeAssignationsRolesListByEmployeeResponseDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EmployeeAssignationsRolesListByEmployeeResponseDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EmployeeAssignationsRolesListByEmployeeResponseDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EmployeeAssignationsRolesListByEmployeeResponseDataInner>() {
           @Override
           public void write(JsonWriter out, EmployeeAssignationsRolesListByEmployeeResponseDataInner value) throws IOException {
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
           public EmployeeAssignationsRolesListByEmployeeResponseDataInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             EmployeeAssignationsRolesListByEmployeeResponseDataInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of EmployeeAssignationsRolesListByEmployeeResponseDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EmployeeAssignationsRolesListByEmployeeResponseDataInner
  * @throws IOException if the JSON string is invalid with respect to EmployeeAssignationsRolesListByEmployeeResponseDataInner
  */
  public static EmployeeAssignationsRolesListByEmployeeResponseDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EmployeeAssignationsRolesListByEmployeeResponseDataInner.class);
  }

 /**
  * Convert an instance of EmployeeAssignationsRolesListByEmployeeResponseDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

