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
import com.konfigthis.client.model.RecruitmentCreateCandidateResponseDataStatus;
import com.konfigthis.client.model.RecruitmentCreateCandidateResponseDataVacancy;
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
 * RecruitmentCreateCandidateResponseData
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class RecruitmentCreateCandidateResponseData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_COMPANY_ID = "companyId";
  @SerializedName(SERIALIZED_NAME_COMPANY_ID)
  private UUID companyId;

  public static final String SERIALIZED_NAME_VACANCY = "vacancy";
  @SerializedName(SERIALIZED_NAME_VACANCY)
  private RecruitmentCreateCandidateResponseDataVacancy vacancy;

  public static final String SERIALIZED_NAME_VACANCY_ID = "vacancyId";
  @SerializedName(SERIALIZED_NAME_VACANCY_ID)
  private UUID vacancyId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_STATUS_ID = "statusId";
  @SerializedName(SERIALIZED_NAME_STATUS_ID)
  private UUID statusId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private RecruitmentCreateCandidateResponseDataStatus status;

  public static final String SERIALIZED_NAME_LINKED_IN_U_R_L = "linkedInURL";
  @SerializedName(SERIALIZED_NAME_LINKED_IN_U_R_L)
  private String linkedInURL;

  public static final String SERIALIZED_NAME_DESIRED_SALARY = "desiredSalary";
  @SerializedName(SERIALIZED_NAME_DESIRED_SALARY)
  private String desiredSalary;

  public static final String SERIALIZED_NAME_START_WORK_DATE = "startWorkDate";
  @SerializedName(SERIALIZED_NAME_START_WORK_DATE)
  private String startWorkDate;

  public static final String SERIALIZED_NAME_EVALUATION = "evaluation";
  @SerializedName(SERIALIZED_NAME_EVALUATION)
  private Integer evaluation;

  public static final String SERIALIZED_NAME_WEB = "web";
  @SerializedName(SERIALIZED_NAME_WEB)
  private String web;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_HAS_DOCUMENT = "hasDocument";
  @SerializedName(SERIALIZED_NAME_HAS_DOCUMENT)
  private Boolean hasDocument;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  public static final String SERIALIZED_NAME_APPLIED_AT = "appliedAt";
  @SerializedName(SERIALIZED_NAME_APPLIED_AT)
  private String appliedAt;

  public static final String SERIALIZED_NAME_THREAD_ID = "threadId";
  @SerializedName(SERIALIZED_NAME_THREAD_ID)
  private UUID threadId;

  public static final String SERIALIZED_NAME_LAST_COMMENT = "lastComment";
  @SerializedName(SERIALIZED_NAME_LAST_COMMENT)
  private Object lastComment;

  public static final String SERIALIZED_NAME_NUM_COMMENTS = "numComments";
  @SerializedName(SERIALIZED_NAME_NUM_COMMENTS)
  private Integer numComments;

  public static final String SERIALIZED_NAME_IMAGE_PROFILE_U_R_L = "imageProfileURL";
  @SerializedName(SERIALIZED_NAME_IMAGE_PROFILE_U_R_L)
  private String imageProfileURL;

  public static final String SERIALIZED_NAME_CHECKLIST = "checklist";
  @SerializedName(SERIALIZED_NAME_CHECKLIST)
  private Object checklist;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private String updatedAt;

  public static final String SERIALIZED_NAME_EMPLOYEE_ID = "employeeId";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_ID)
  private UUID employeeId;

  public RecruitmentCreateCandidateResponseData() {
  }

  public RecruitmentCreateCandidateResponseData id(UUID id) {
    
    
    
    
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


  public RecruitmentCreateCandidateResponseData companyId(UUID companyId) {
    
    
    
    
    this.companyId = companyId;
    return this;
  }

   /**
   * Get companyId
   * @return companyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getCompanyId() {
    return companyId;
  }


  public void setCompanyId(UUID companyId) {
    
    
    
    this.companyId = companyId;
  }


  public RecruitmentCreateCandidateResponseData vacancy(RecruitmentCreateCandidateResponseDataVacancy vacancy) {
    
    
    
    
    this.vacancy = vacancy;
    return this;
  }

   /**
   * Get vacancy
   * @return vacancy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecruitmentCreateCandidateResponseDataVacancy getVacancy() {
    return vacancy;
  }


  public void setVacancy(RecruitmentCreateCandidateResponseDataVacancy vacancy) {
    
    
    
    this.vacancy = vacancy;
  }


  public RecruitmentCreateCandidateResponseData vacancyId(UUID vacancyId) {
    
    
    
    
    this.vacancyId = vacancyId;
    return this;
  }

   /**
   * Get vacancyId
   * @return vacancyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getVacancyId() {
    return vacancyId;
  }


  public void setVacancyId(UUID vacancyId) {
    
    
    
    this.vacancyId = vacancyId;
  }


  public RecruitmentCreateCandidateResponseData firstName(String firstName) {
    
    
    
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    
    
    
    this.firstName = firstName;
  }


  public RecruitmentCreateCandidateResponseData lastName(String lastName) {
    
    
    
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    
    
    
    this.lastName = lastName;
  }


  public RecruitmentCreateCandidateResponseData email(String email) {
    
    
    
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    
    
    
    this.email = email;
  }


  public RecruitmentCreateCandidateResponseData phone(String phone) {
    
    
    
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    
    
    
    this.phone = phone;
  }


  public RecruitmentCreateCandidateResponseData type(String type) {
    
    
    
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    
    
    
    this.type = type;
  }


  public RecruitmentCreateCandidateResponseData statusId(UUID statusId) {
    
    
    
    
    this.statusId = statusId;
    return this;
  }

   /**
   * Get statusId
   * @return statusId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getStatusId() {
    return statusId;
  }


  public void setStatusId(UUID statusId) {
    
    
    
    this.statusId = statusId;
  }


  public RecruitmentCreateCandidateResponseData status(RecruitmentCreateCandidateResponseDataStatus status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RecruitmentCreateCandidateResponseDataStatus getStatus() {
    return status;
  }


  public void setStatus(RecruitmentCreateCandidateResponseDataStatus status) {
    
    
    
    this.status = status;
  }


  public RecruitmentCreateCandidateResponseData linkedInURL(String linkedInURL) {
    
    
    
    
    this.linkedInURL = linkedInURL;
    return this;
  }

   /**
   * Get linkedInURL
   * @return linkedInURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLinkedInURL() {
    return linkedInURL;
  }


  public void setLinkedInURL(String linkedInURL) {
    
    
    
    this.linkedInURL = linkedInURL;
  }


  public RecruitmentCreateCandidateResponseData desiredSalary(String desiredSalary) {
    
    
    
    
    this.desiredSalary = desiredSalary;
    return this;
  }

   /**
   * Get desiredSalary
   * @return desiredSalary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDesiredSalary() {
    return desiredSalary;
  }


  public void setDesiredSalary(String desiredSalary) {
    
    
    
    this.desiredSalary = desiredSalary;
  }


  public RecruitmentCreateCandidateResponseData startWorkDate(String startWorkDate) {
    
    
    
    
    this.startWorkDate = startWorkDate;
    return this;
  }

   /**
   * Get startWorkDate
   * @return startWorkDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStartWorkDate() {
    return startWorkDate;
  }


  public void setStartWorkDate(String startWorkDate) {
    
    
    
    this.startWorkDate = startWorkDate;
  }


  public RecruitmentCreateCandidateResponseData evaluation(Integer evaluation) {
    
    
    
    
    this.evaluation = evaluation;
    return this;
  }

   /**
   * Get evaluation
   * @return evaluation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEvaluation() {
    return evaluation;
  }


  public void setEvaluation(Integer evaluation) {
    
    
    
    this.evaluation = evaluation;
  }


  public RecruitmentCreateCandidateResponseData web(String web) {
    
    
    
    
    this.web = web;
    return this;
  }

   /**
   * Get web
   * @return web
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getWeb() {
    return web;
  }


  public void setWeb(String web) {
    
    
    
    this.web = web;
  }


  public RecruitmentCreateCandidateResponseData location(String location) {
    
    
    
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    
    
    
    this.location = location;
  }


  public RecruitmentCreateCandidateResponseData hasDocument(Boolean hasDocument) {
    
    
    
    
    this.hasDocument = hasDocument;
    return this;
  }

   /**
   * Get hasDocument
   * @return hasDocument
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHasDocument() {
    return hasDocument;
  }


  public void setHasDocument(Boolean hasDocument) {
    
    
    
    this.hasDocument = hasDocument;
  }


  public RecruitmentCreateCandidateResponseData comment(String comment) {
    
    
    
    
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComment() {
    return comment;
  }


  public void setComment(String comment) {
    
    
    
    this.comment = comment;
  }


  public RecruitmentCreateCandidateResponseData appliedAt(String appliedAt) {
    
    
    
    
    this.appliedAt = appliedAt;
    return this;
  }

   /**
   * Get appliedAt
   * @return appliedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

  public String getAppliedAt() {
    return appliedAt;
  }


  public void setAppliedAt(String appliedAt) {
    
    
    
    this.appliedAt = appliedAt;
  }


  public RecruitmentCreateCandidateResponseData threadId(UUID threadId) {
    
    
    
    
    this.threadId = threadId;
    return this;
  }

   /**
   * Get threadId
   * @return threadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getThreadId() {
    return threadId;
  }


  public void setThreadId(UUID threadId) {
    
    
    
    this.threadId = threadId;
  }


  public RecruitmentCreateCandidateResponseData lastComment(Object lastComment) {
    
    
    
    
    this.lastComment = lastComment;
    return this;
  }

   /**
   * Get lastComment
   * @return lastComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getLastComment() {
    return lastComment;
  }


  public void setLastComment(Object lastComment) {
    
    
    
    this.lastComment = lastComment;
  }


  public RecruitmentCreateCandidateResponseData numComments(Integer numComments) {
    
    
    
    
    this.numComments = numComments;
    return this;
  }

   /**
   * Get numComments
   * @return numComments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNumComments() {
    return numComments;
  }


  public void setNumComments(Integer numComments) {
    
    
    
    this.numComments = numComments;
  }


  public RecruitmentCreateCandidateResponseData imageProfileURL(String imageProfileURL) {
    
    
    
    
    this.imageProfileURL = imageProfileURL;
    return this;
  }

   /**
   * Get imageProfileURL
   * @return imageProfileURL
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageProfileURL() {
    return imageProfileURL;
  }


  public void setImageProfileURL(String imageProfileURL) {
    
    
    
    this.imageProfileURL = imageProfileURL;
  }


  public RecruitmentCreateCandidateResponseData checklist(Object checklist) {
    
    
    
    
    this.checklist = checklist;
    return this;
  }

   /**
   * Get checklist
   * @return checklist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getChecklist() {
    return checklist;
  }


  public void setChecklist(Object checklist) {
    
    
    
    this.checklist = checklist;
  }


  public RecruitmentCreateCandidateResponseData createdAt(String createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

  public String getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(String createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public RecruitmentCreateCandidateResponseData updatedAt(String updatedAt) {
    
    
    
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01T10:00:00+01:00", value = "")

  public String getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(String updatedAt) {
    
    
    
    this.updatedAt = updatedAt;
  }


  public RecruitmentCreateCandidateResponseData employeeId(UUID employeeId) {
    
    
    
    
    this.employeeId = employeeId;
    return this;
  }

   /**
   * Get employeeId
   * @return employeeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getEmployeeId() {
    return employeeId;
  }


  public void setEmployeeId(UUID employeeId) {
    
    
    
    this.employeeId = employeeId;
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
   * @return the RecruitmentCreateCandidateResponseData instance itself
   */
  public RecruitmentCreateCandidateResponseData putAdditionalProperty(String key, Object value) {
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
    RecruitmentCreateCandidateResponseData recruitmentCreateCandidateResponseData = (RecruitmentCreateCandidateResponseData) o;
    return Objects.equals(this.id, recruitmentCreateCandidateResponseData.id) &&
        Objects.equals(this.companyId, recruitmentCreateCandidateResponseData.companyId) &&
        Objects.equals(this.vacancy, recruitmentCreateCandidateResponseData.vacancy) &&
        Objects.equals(this.vacancyId, recruitmentCreateCandidateResponseData.vacancyId) &&
        Objects.equals(this.firstName, recruitmentCreateCandidateResponseData.firstName) &&
        Objects.equals(this.lastName, recruitmentCreateCandidateResponseData.lastName) &&
        Objects.equals(this.email, recruitmentCreateCandidateResponseData.email) &&
        Objects.equals(this.phone, recruitmentCreateCandidateResponseData.phone) &&
        Objects.equals(this.type, recruitmentCreateCandidateResponseData.type) &&
        Objects.equals(this.statusId, recruitmentCreateCandidateResponseData.statusId) &&
        Objects.equals(this.status, recruitmentCreateCandidateResponseData.status) &&
        Objects.equals(this.linkedInURL, recruitmentCreateCandidateResponseData.linkedInURL) &&
        Objects.equals(this.desiredSalary, recruitmentCreateCandidateResponseData.desiredSalary) &&
        Objects.equals(this.startWorkDate, recruitmentCreateCandidateResponseData.startWorkDate) &&
        Objects.equals(this.evaluation, recruitmentCreateCandidateResponseData.evaluation) &&
        Objects.equals(this.web, recruitmentCreateCandidateResponseData.web) &&
        Objects.equals(this.location, recruitmentCreateCandidateResponseData.location) &&
        Objects.equals(this.hasDocument, recruitmentCreateCandidateResponseData.hasDocument) &&
        Objects.equals(this.comment, recruitmentCreateCandidateResponseData.comment) &&
        Objects.equals(this.appliedAt, recruitmentCreateCandidateResponseData.appliedAt) &&
        Objects.equals(this.threadId, recruitmentCreateCandidateResponseData.threadId) &&
        Objects.equals(this.lastComment, recruitmentCreateCandidateResponseData.lastComment) &&
        Objects.equals(this.numComments, recruitmentCreateCandidateResponseData.numComments) &&
        Objects.equals(this.imageProfileURL, recruitmentCreateCandidateResponseData.imageProfileURL) &&
        Objects.equals(this.checklist, recruitmentCreateCandidateResponseData.checklist) &&
        Objects.equals(this.createdAt, recruitmentCreateCandidateResponseData.createdAt) &&
        Objects.equals(this.updatedAt, recruitmentCreateCandidateResponseData.updatedAt) &&
        Objects.equals(this.employeeId, recruitmentCreateCandidateResponseData.employeeId)&&
        Objects.equals(this.additionalProperties, recruitmentCreateCandidateResponseData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, companyId, vacancy, vacancyId, firstName, lastName, email, phone, type, statusId, status, linkedInURL, desiredSalary, startWorkDate, evaluation, web, location, hasDocument, comment, appliedAt, threadId, lastComment, numComments, imageProfileURL, checklist, createdAt, updatedAt, employeeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitmentCreateCandidateResponseData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    vacancy: ").append(toIndentedString(vacancy)).append("\n");
    sb.append("    vacancyId: ").append(toIndentedString(vacancyId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    linkedInURL: ").append(toIndentedString(linkedInURL)).append("\n");
    sb.append("    desiredSalary: ").append(toIndentedString(desiredSalary)).append("\n");
    sb.append("    startWorkDate: ").append(toIndentedString(startWorkDate)).append("\n");
    sb.append("    evaluation: ").append(toIndentedString(evaluation)).append("\n");
    sb.append("    web: ").append(toIndentedString(web)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    hasDocument: ").append(toIndentedString(hasDocument)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    appliedAt: ").append(toIndentedString(appliedAt)).append("\n");
    sb.append("    threadId: ").append(toIndentedString(threadId)).append("\n");
    sb.append("    lastComment: ").append(toIndentedString(lastComment)).append("\n");
    sb.append("    numComments: ").append(toIndentedString(numComments)).append("\n");
    sb.append("    imageProfileURL: ").append(toIndentedString(imageProfileURL)).append("\n");
    sb.append("    checklist: ").append(toIndentedString(checklist)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
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
    openapiFields.add("companyId");
    openapiFields.add("vacancy");
    openapiFields.add("vacancyId");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("phone");
    openapiFields.add("type");
    openapiFields.add("statusId");
    openapiFields.add("status");
    openapiFields.add("linkedInURL");
    openapiFields.add("desiredSalary");
    openapiFields.add("startWorkDate");
    openapiFields.add("evaluation");
    openapiFields.add("web");
    openapiFields.add("location");
    openapiFields.add("hasDocument");
    openapiFields.add("comment");
    openapiFields.add("appliedAt");
    openapiFields.add("threadId");
    openapiFields.add("lastComment");
    openapiFields.add("numComments");
    openapiFields.add("imageProfileURL");
    openapiFields.add("checklist");
    openapiFields.add("createdAt");
    openapiFields.add("updatedAt");
    openapiFields.add("employeeId");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitmentCreateCandidateResponseData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!RecruitmentCreateCandidateResponseData.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitmentCreateCandidateResponseData is not found in the empty JSON string", RecruitmentCreateCandidateResponseData.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("companyId") != null && !jsonObj.get("companyId").isJsonNull()) && !jsonObj.get("companyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `companyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("companyId").toString()));
      }
      // validate the optional field `vacancy`
      if (jsonObj.get("vacancy") != null && !jsonObj.get("vacancy").isJsonNull()) {
        RecruitmentCreateCandidateResponseDataVacancy.validateJsonObject(jsonObj.getAsJsonObject("vacancy"));
      }
      if ((jsonObj.get("vacancyId") != null && !jsonObj.get("vacancyId").isJsonNull()) && !jsonObj.get("vacancyId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vacancyId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vacancyId").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonNull()) && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("statusId") != null && !jsonObj.get("statusId").isJsonNull()) && !jsonObj.get("statusId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `statusId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("statusId").toString()));
      }
      // validate the optional field `status`
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) {
        RecruitmentCreateCandidateResponseDataStatus.validateJsonObject(jsonObj.getAsJsonObject("status"));
      }
      if ((jsonObj.get("linkedInURL") != null && !jsonObj.get("linkedInURL").isJsonNull()) && !jsonObj.get("linkedInURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `linkedInURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("linkedInURL").toString()));
      }
      if ((jsonObj.get("desiredSalary") != null && !jsonObj.get("desiredSalary").isJsonNull()) && !jsonObj.get("desiredSalary").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desiredSalary` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desiredSalary").toString()));
      }
      if ((jsonObj.get("startWorkDate") != null && !jsonObj.get("startWorkDate").isJsonNull()) && !jsonObj.get("startWorkDate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `startWorkDate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("startWorkDate").toString()));
      }
      if ((jsonObj.get("web") != null && !jsonObj.get("web").isJsonNull()) && !jsonObj.get("web").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `web` to be a primitive type in the JSON string but got `%s`", jsonObj.get("web").toString()));
      }
      if ((jsonObj.get("location") != null && !jsonObj.get("location").isJsonNull()) && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if ((jsonObj.get("comment") != null && !jsonObj.get("comment").isJsonNull()) && !jsonObj.get("comment").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `comment` to be a primitive type in the JSON string but got `%s`", jsonObj.get("comment").toString()));
      }
      if ((jsonObj.get("appliedAt") != null && !jsonObj.get("appliedAt").isJsonNull()) && !jsonObj.get("appliedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appliedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appliedAt").toString()));
      }
      if ((jsonObj.get("threadId") != null && !jsonObj.get("threadId").isJsonNull()) && !jsonObj.get("threadId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `threadId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("threadId").toString()));
      }
      if ((jsonObj.get("imageProfileURL") != null && !jsonObj.get("imageProfileURL").isJsonNull()) && !jsonObj.get("imageProfileURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageProfileURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageProfileURL").toString()));
      }
      if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull()) && !jsonObj.get("createdAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `createdAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("createdAt").toString()));
      }
      if ((jsonObj.get("updatedAt") != null && !jsonObj.get("updatedAt").isJsonNull()) && !jsonObj.get("updatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `updatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("updatedAt").toString()));
      }
      if ((jsonObj.get("employeeId") != null && !jsonObj.get("employeeId").isJsonNull()) && !jsonObj.get("employeeId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `employeeId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("employeeId").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitmentCreateCandidateResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitmentCreateCandidateResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitmentCreateCandidateResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitmentCreateCandidateResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitmentCreateCandidateResponseData>() {
           @Override
           public void write(JsonWriter out, RecruitmentCreateCandidateResponseData value) throws IOException {
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
           public RecruitmentCreateCandidateResponseData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             RecruitmentCreateCandidateResponseData instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of RecruitmentCreateCandidateResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitmentCreateCandidateResponseData
  * @throws IOException if the JSON string is invalid with respect to RecruitmentCreateCandidateResponseData
  */
  public static RecruitmentCreateCandidateResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitmentCreateCandidateResponseData.class);
  }

 /**
  * Convert an instance of RecruitmentCreateCandidateResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

