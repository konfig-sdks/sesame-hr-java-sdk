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
 * VacationDayOffRequestsRejectRequestResponseMeta
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class VacationDayOffRequestsRejectRequestResponseMeta {
  public static final String SERIALIZED_NAME_CURRENT_PAGE = "currentPage";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE)
  private Integer currentPage;

  public static final String SERIALIZED_NAME_LAST_PAGE = "lastPage";
  @SerializedName(SERIALIZED_NAME_LAST_PAGE)
  private Integer lastPage;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public static final String SERIALIZED_NAME_PER_PAGE = "perPage";
  @SerializedName(SERIALIZED_NAME_PER_PAGE)
  private Integer perPage;

  public VacationDayOffRequestsRejectRequestResponseMeta() {
  }

  public VacationDayOffRequestsRejectRequestResponseMeta currentPage(Integer currentPage) {
    
    
    
    
    this.currentPage = currentPage;
    return this;
  }

   /**
   * Get currentPage
   * @return currentPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getCurrentPage() {
    return currentPage;
  }


  public void setCurrentPage(Integer currentPage) {
    
    
    
    this.currentPage = currentPage;
  }


  public VacationDayOffRequestsRejectRequestResponseMeta lastPage(Integer lastPage) {
    
    
    
    
    this.lastPage = lastPage;
    return this;
  }

   /**
   * Get lastPage
   * @return lastPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getLastPage() {
    return lastPage;
  }


  public void setLastPage(Integer lastPage) {
    
    
    
    this.lastPage = lastPage;
  }


  public VacationDayOffRequestsRejectRequestResponseMeta total(Integer total) {
    
    
    
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    
    
    
    this.total = total;
  }


  public VacationDayOffRequestsRejectRequestResponseMeta perPage(Integer perPage) {
    
    
    
    
    this.perPage = perPage;
    return this;
  }

   /**
   * Get perPage
   * @return perPage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getPerPage() {
    return perPage;
  }


  public void setPerPage(Integer perPage) {
    
    
    
    this.perPage = perPage;
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
   * @return the VacationDayOffRequestsRejectRequestResponseMeta instance itself
   */
  public VacationDayOffRequestsRejectRequestResponseMeta putAdditionalProperty(String key, Object value) {
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
    VacationDayOffRequestsRejectRequestResponseMeta vacationDayOffRequestsRejectRequestResponseMeta = (VacationDayOffRequestsRejectRequestResponseMeta) o;
    return Objects.equals(this.currentPage, vacationDayOffRequestsRejectRequestResponseMeta.currentPage) &&
        Objects.equals(this.lastPage, vacationDayOffRequestsRejectRequestResponseMeta.lastPage) &&
        Objects.equals(this.total, vacationDayOffRequestsRejectRequestResponseMeta.total) &&
        Objects.equals(this.perPage, vacationDayOffRequestsRejectRequestResponseMeta.perPage)&&
        Objects.equals(this.additionalProperties, vacationDayOffRequestsRejectRequestResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPage, lastPage, total, perPage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VacationDayOffRequestsRejectRequestResponseMeta {\n");
    sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
    sb.append("    lastPage: ").append(toIndentedString(lastPage)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
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
    openapiFields.add("currentPage");
    openapiFields.add("lastPage");
    openapiFields.add("total");
    openapiFields.add("perPage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VacationDayOffRequestsRejectRequestResponseMeta
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!VacationDayOffRequestsRejectRequestResponseMeta.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in VacationDayOffRequestsRejectRequestResponseMeta is not found in the empty JSON string", VacationDayOffRequestsRejectRequestResponseMeta.openapiRequiredFields.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VacationDayOffRequestsRejectRequestResponseMeta.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VacationDayOffRequestsRejectRequestResponseMeta' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VacationDayOffRequestsRejectRequestResponseMeta> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VacationDayOffRequestsRejectRequestResponseMeta.class));

       return (TypeAdapter<T>) new TypeAdapter<VacationDayOffRequestsRejectRequestResponseMeta>() {
           @Override
           public void write(JsonWriter out, VacationDayOffRequestsRejectRequestResponseMeta value) throws IOException {
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
           public VacationDayOffRequestsRejectRequestResponseMeta read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             VacationDayOffRequestsRejectRequestResponseMeta instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of VacationDayOffRequestsRejectRequestResponseMeta given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VacationDayOffRequestsRejectRequestResponseMeta
  * @throws IOException if the JSON string is invalid with respect to VacationDayOffRequestsRejectRequestResponseMeta
  */
  public static VacationDayOffRequestsRejectRequestResponseMeta fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VacationDayOffRequestsRejectRequestResponseMeta.class);
  }

 /**
  * Convert an instance of VacationDayOffRequestsRejectRequestResponseMeta to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

