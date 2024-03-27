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
 * SalariesCreateSalaryRequest
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SalariesCreateSalaryRequest {
  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  /**
   * Payment period of contract
   */
  @JsonAdapter(PayPeriodEnum.Adapter.class)
 public enum PayPeriodEnum {
    DAILY("daily"),
    
    WEEKLY("weekly"),
    
    BIWEEKLY("biweekly"),
    
    MONTHLY("monthly"),
    
    YEARLY("yearly");

    private String value;

    PayPeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PayPeriodEnum fromValue(String value) {
      for (PayPeriodEnum b : PayPeriodEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<PayPeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PayPeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PayPeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return PayPeriodEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_PAY_PERIOD = "payPeriod";
  @SerializedName(SERIALIZED_NAME_PAY_PERIOD)
  private PayPeriodEnum payPeriod;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public static final String SERIALIZED_NAME_GROSS_SALARY = "grossSalary";
  @SerializedName(SERIALIZED_NAME_GROSS_SALARY)
  private Float grossSalary;

  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private Integer payments;

  public static final String SERIALIZED_NAME_CONTRIBUTION_GROUP_ID = "contributionGroupId";
  @SerializedName(SERIALIZED_NAME_CONTRIBUTION_GROUP_ID)
  private UUID contributionGroupId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_COMMENTS = "comments";
  @SerializedName(SERIALIZED_NAME_COMMENTS)
  private String comments;

  public SalariesCreateSalaryRequest() {
  }

  public SalariesCreateSalaryRequest employeeId(UUID employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * The ID of the employee
   * @return employeeId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The ID of the employee")

  public UUID getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(UUID employeeId) {
    
    
    
    this.employeeId = employeeId;
  }


  public SalariesCreateSalaryRequest payPeriod(PayPeriodEnum payPeriod) {
    
    
    
    
    this.payPeriod = payPeriod;
    return this;
  }

   /**
   * Payment period of contract
   * @return payPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Payment period of contract")

  public PayPeriodEnum getPayPeriod() {
    return payPeriod;
  }


  public void setPayPeriod(PayPeriodEnum payPeriod) {
    
    
    
    this.payPeriod = payPeriod;
  }


  public SalariesCreateSalaryRequest currency(String currency) {
    
    
    
    
    this.currency = currency;
    return this;
  }

   /**
   * Currency of contract
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EUR", required = true, value = "Currency of contract")

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    
    
    
    this.currency = currency;
  }


  public SalariesCreateSalaryRequest grossSalary(Float grossSalary) {
    
    
    
    
    this.grossSalary = grossSalary;
    return this;
  }

   /**
   * Salary amount
   * @return grossSalary
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Salary amount")

  public Float getGrossSalary() {
    return grossSalary;
  }


  public void setGrossSalary(Float grossSalary) {
    
    
    
    this.grossSalary = grossSalary;
  }


  public SalariesCreateSalaryRequest payments(Integer payments) {
    
    
    
    
    this.payments = payments;
    return this;
  }

   /**
   * Number of payments
   * @return payments
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Number of payments")

  public Integer getPayments() {
    return payments;
  }


  public void setPayments(Integer payments) {
    
    
    
    this.payments = payments;
  }


  public SalariesCreateSalaryRequest contributionGroupId(UUID contributionGroupId) {
    
    
    
    
    this.contributionGroupId = contributionGroupId;
    return this;
  }

   /**
   * Contribution group id
   * @return contributionGroupId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Contribution group id")

  public UUID getContributionGroupId() {
    return contributionGroupId;
  }


  public void setContributionGroupId(UUID contributionGroupId) {
    
    
    
    this.contributionGroupId = contributionGroupId;
  }


  public SalariesCreateSalaryRequest startDate(LocalDate startDate) {
    
    
    
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Salary start date
   * @return startDate
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Salary start date")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    
    
    
    this.startDate = startDate;
  }


  public SalariesCreateSalaryRequest endDate(LocalDate endDate) {
    
    
    
    
    this.endDate = endDate;
    return this;
  }

   /**
   * Salary end date
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Salary end date")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    
    
    
    this.endDate = endDate;
  }


  public SalariesCreateSalaryRequest comments(String comments) {
    
    
    
    
    this.comments = comments;
    return this;
  }

   /**
   * Comments
   * @return comments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Comments")

  public String getComments() {
    return comments;
  }


  public void setComments(String comments) {
    
    
    
    this.comments = comments;
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
   * @return the SalariesCreateSalaryRequest instance itself
   */
  public SalariesCreateSalaryRequest putAdditionalProperty(String key, Object value) {
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
    SalariesCreateSalaryRequest salariesCreateSalaryRequest = (SalariesCreateSalaryRequest) o;
    return Objects.equals(this.employeeId, salariesCreateSalaryRequest.employeeId) &&
        Objects.equals(this.payPeriod, salariesCreateSalaryRequest.payPeriod) &&
        Objects.equals(this.currency, salariesCreateSalaryRequest.currency) &&
        Objects.equals(this.grossSalary, salariesCreateSalaryRequest.grossSalary) &&
        Objects.equals(this.payments, salariesCreateSalaryRequest.payments) &&
        Objects.equals(this.contributionGroupId, salariesCreateSalaryRequest.contributionGroupId) &&
        Objects.equals(this.startDate, salariesCreateSalaryRequest.startDate) &&
        Objects.equals(this.endDate, salariesCreateSalaryRequest.endDate) &&
        Objects.equals(this.comments, salariesCreateSalaryRequest.comments)&&
        Objects.equals(this.additionalProperties, salariesCreateSalaryRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeeId, payPeriod, currency, grossSalary, payments, contributionGroupId, startDate, endDate, comments, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalariesCreateSalaryRequest {\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    payPeriod: ").append(toIndentedString(payPeriod)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    grossSalary: ").append(toIndentedString(grossSalary)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    contributionGroupId: ").append(toIndentedString(contributionGroupId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
    openapiFields.add("employeeId");
    openapiFields.add("payPeriod");
    openapiFields.add("currency");
    openapiFields.add("grossSalary");
    openapiFields.add("payments");
    openapiFields.add("contributionGroupId");
    openapiFields.add("startDate");
    openapiFields.add("endDate");
    openapiFields.add("comments");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("employeeId");
    openapiRequiredFields.add("payPeriod");
    openapiRequiredFields.add("currency");
    openapiRequiredFields.add("grossSalary");
    openapiRequiredFields.add("payments");
    openapiRequiredFields.add("contributionGroupId");
    openapiRequiredFields.add("startDate");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SalariesCreateSalaryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SalariesCreateSalaryRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SalariesCreateSalaryRequest is not found in the empty JSON string", SalariesCreateSalaryRequest.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SalariesCreateSalaryRequest.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
      if (!jsonObj.get("payPeriod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payPeriod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payPeriod").toString()));
      }
      if (!jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
      if (!jsonObj.get("contributionGroupId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `contributionGroupId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("contributionGroupId").toString()));
      }
      if ((jsonObj.get("comments") != null && !jsonObj.get("comments").isJsonNull()) && !jsonObj.get("comments").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comments` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comments").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SalariesCreateSalaryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SalariesCreateSalaryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SalariesCreateSalaryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SalariesCreateSalaryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SalariesCreateSalaryRequest>() {
           @Override
           public void write(JsonWriter out, SalariesCreateSalaryRequest value) throws IOException {
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
           public SalariesCreateSalaryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SalariesCreateSalaryRequest instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SalariesCreateSalaryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SalariesCreateSalaryRequest
  * @throws IOException if the JSON string is invalid with respect to SalariesCreateSalaryRequest
  */
  public static SalariesCreateSalaryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SalariesCreateSalaryRequest.class);
  }

 /**
  * Convert an instance of SalariesCreateSalaryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

