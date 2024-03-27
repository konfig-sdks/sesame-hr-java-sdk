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
import com.konfigthis.client.model.VacationDayOffRequestsAcceptRequestResponseData;
import com.konfigthis.client.model.VacationDayOffRequestsAcceptRequestResponseMeta;
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
 * VacationDayOffRequestsAcceptRequestResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VacationDayOffRequestsAcceptRequestResponse {
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private VacationDayOffRequestsAcceptRequestResponseData data;

  public static final String SERIALIZED_NAME_META = "meta";
  @SerializedName(SERIALIZED_NAME_META)
  private VacationDayOffRequestsAcceptRequestResponseMeta meta;

  public VacationDayOffRequestsAcceptRequestResponse() {
  }

  public VacationDayOffRequestsAcceptRequestResponse data(VacationDayOffRequestsAcceptRequestResponseData data) {
    
    
    
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VacationDayOffRequestsAcceptRequestResponseData getData() {
    return data;
  }


  public void setData(VacationDayOffRequestsAcceptRequestResponseData data) {
    
    
    
    this.data = data;
  }


  public VacationDayOffRequestsAcceptRequestResponse meta(VacationDayOffRequestsAcceptRequestResponseMeta meta) {
    
    
    
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VacationDayOffRequestsAcceptRequestResponseMeta getMeta() {
    return meta;
  }


  public void setMeta(VacationDayOffRequestsAcceptRequestResponseMeta meta) {
    
    
    
    this.meta = meta;
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
   * @return the VacationDayOffRequestsAcceptRequestResponse instance itself
   */
  public VacationDayOffRequestsAcceptRequestResponse putAdditionalProperty(String key, Object value) {
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
    VacationDayOffRequestsAcceptRequestResponse vacationDayOffRequestsAcceptRequestResponse = (VacationDayOffRequestsAcceptRequestResponse) o;
    return Objects.equals(this.data, vacationDayOffRequestsAcceptRequestResponse.data) &&
        Objects.equals(this.meta, vacationDayOffRequestsAcceptRequestResponse.meta)&&
        Objects.equals(this.additionalProperties, vacationDayOffRequestsAcceptRequestResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationDayOffRequestsAcceptRequestResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
    openapiFields.add("data");
    openapiFields.add("meta");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VacationDayOffRequestsAcceptRequestResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VacationDayOffRequestsAcceptRequestResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VacationDayOffRequestsAcceptRequestResponse is not found in the empty JSON string", VacationDayOffRequestsAcceptRequestResponse.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
        VacationDayOffRequestsAcceptRequestResponseData.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
      // validate the optional field `meta`
      if (jsonObj.get("meta") != null && !jsonObj.get("meta").isJsonNull()) {
        VacationDayOffRequestsAcceptRequestResponseMeta.validateJsonObject(jsonObj.getAsJsonObject("meta"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VacationDayOffRequestsAcceptRequestResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VacationDayOffRequestsAcceptRequestResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VacationDayOffRequestsAcceptRequestResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VacationDayOffRequestsAcceptRequestResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<VacationDayOffRequestsAcceptRequestResponse>() {
           @Override
           public void write(JsonWriter out, VacationDayOffRequestsAcceptRequestResponse value) throws IOException {
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
           public VacationDayOffRequestsAcceptRequestResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VacationDayOffRequestsAcceptRequestResponse instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VacationDayOffRequestsAcceptRequestResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VacationDayOffRequestsAcceptRequestResponse
  * @throws IOException if the JSON string is invalid with respect to VacationDayOffRequestsAcceptRequestResponse
  */
  public static VacationDayOffRequestsAcceptRequestResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VacationDayOffRequestsAcceptRequestResponse.class);
  }

 /**
  * Convert an instance of VacationDayOffRequestsAcceptRequestResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

