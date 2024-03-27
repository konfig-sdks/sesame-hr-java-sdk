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
 * AgreementsCreateNewAgreementRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class AgreementsCreateNewAgreementRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_ANNUAL_HOURS = "annualHours";
  @SerializedName(SERIALIZED_NAME_ANNUAL_HOURS)
  private Double annualHours;

  public AgreementsCreateNewAgreementRequest() {
  }

  public AgreementsCreateNewAgreementRequest name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Agreement name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public AgreementsCreateNewAgreementRequest code(String code) {
    
    
    
    
    this.code = code;
    return this;
  }

   /**
   * Agreement code
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Agreement code")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    
    
    
    this.code = code;
  }


  public AgreementsCreateNewAgreementRequest color(String color) {
    
    
    
    
    this.color = color;
    return this;
  }

   /**
   * Color of agreement
   * @return color
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Color of agreement")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    
    
    
    this.color = color;
  }


  public AgreementsCreateNewAgreementRequest annualHours(Double annualHours) {
    
    
    
    
    this.annualHours = annualHours;
    return this;
  }

  public AgreementsCreateNewAgreementRequest annualHours(Integer annualHours) {
    
    
    
    
    this.annualHours = annualHours.doubleValue();
    return this;
  }

   /**
   * Annual hours
   * @return annualHours
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Annual hours")

  public Double getAnnualHours() {
    return annualHours;
  }


  public void setAnnualHours(Double annualHours) {
    
    
    
    this.annualHours = annualHours;
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
   * @return the AgreementsCreateNewAgreementRequest instance itself
   */
  public AgreementsCreateNewAgreementRequest putAdditionalProperty(String key, Object value) {
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
    AgreementsCreateNewAgreementRequest agreementsCreateNewAgreementRequest = (AgreementsCreateNewAgreementRequest) o;
    return Objects.equals(this.name, agreementsCreateNewAgreementRequest.name) &&
        Objects.equals(this.code, agreementsCreateNewAgreementRequest.code) &&
        Objects.equals(this.color, agreementsCreateNewAgreementRequest.color) &&
        Objects.equals(this.annualHours, agreementsCreateNewAgreementRequest.annualHours)&&
        Objects.equals(this.additionalProperties, agreementsCreateNewAgreementRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code, color, annualHours, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementsCreateNewAgreementRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    annualHours: ").append(toIndentedString(annualHours)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("code");
    openapiFields.add("color");
    openapiFields.add("annualHours");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("color");
    openapiRequiredFields.add("annualHours");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AgreementsCreateNewAgreementRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!AgreementsCreateNewAgreementRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AgreementsCreateNewAgreementRequest is not found in the empty JSON string", AgreementsCreateNewAgreementRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AgreementsCreateNewAgreementRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (!jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AgreementsCreateNewAgreementRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AgreementsCreateNewAgreementRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AgreementsCreateNewAgreementRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AgreementsCreateNewAgreementRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AgreementsCreateNewAgreementRequest>() {
           @Override
           public void write(JsonWriter out, AgreementsCreateNewAgreementRequest value) throws IOException {
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
           public AgreementsCreateNewAgreementRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             AgreementsCreateNewAgreementRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of AgreementsCreateNewAgreementRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AgreementsCreateNewAgreementRequest
  * @throws IOException if the JSON string is invalid with respect to AgreementsCreateNewAgreementRequest
  */
  public static AgreementsCreateNewAgreementRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AgreementsCreateNewAgreementRequest.class);
  }

 /**
  * Convert an instance of AgreementsCreateNewAgreementRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

