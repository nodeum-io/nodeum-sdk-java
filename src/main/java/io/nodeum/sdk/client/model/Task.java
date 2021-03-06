/*
 * Nodeum API
 * The Nodeum API makes it easy to tap into the digital data mesh that runs across your organisation. Make requests to our API endpoints and we’ll give you everything you need to interconnect your business workflows with your storage.  All production API requests are made to:  http://nodeumhostname/api/  The current production version of the API is v1.   **REST** The Nodeum API is a RESTful API. This means that the API is designed to allow you to get, create, update, & delete objects with the HTTP verbs GET, POST, PUT, PATCH, & DELETE.  **JSON** The Nodeum API speaks exclusively in JSON. This means that you should always set the Content-Type header to application/json to ensure that your requests are properly accepted and processed by the API.  **Authentication** All API calls require user-password authentication.   **Cross-Origin Resource Sharing** The Nodeum API supports CORS for communicating from Javascript for these endpoints. You will need to specify an Origin URI when creating your application to allow for CORS to be whitelisted for your domain.   **Pagination** Some endpoints such as File Listing return a potentially lengthy array of objects. In order to keep the response sizes manageable the API will take advantage of pagination. Pagination is a mechanism for returning a subset of the results for a request and allowing for subsequent requests to “page” through the rest of the results until the end is reached. Paginated endpoints follow a standard interface that accepts two query parameters, limit and offset, and return a payload that follows a standard form. These parameters names and their behavior are borrowed from SQL LIMIT and OFFSET keywords.  **Versioning** The Nodeum API is constantly being worked on to add features, make improvements, and fix bugs. This means that you should expect changes to be introduced and documented.   However, there are some changes or additions that are considered backwards-compatible and your applications should be flexible enough to handle them. These include:  - Adding new endpoints to the API - Adding new attributes to the response of an existing endpoint - Changing the order of attributes of responses (JSON by definition is an object of unordered key/value pairs)  **Filter parameters** When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * The version of the OpenAPI document: 2.1.0
 * Contact: info@nodeum.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nodeum.sdk.client.model;

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

/**
 * Task
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:57:32.172Z[GMT]")
public class Task {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_COMMENT = "comment";
  @SerializedName(SERIALIZED_NAME_COMMENT)
  private String comment;

  /**
   * Gets or Sets workflowType
   */
  @JsonAdapter(WorkflowTypeEnum.Adapter.class)
  public enum WorkflowTypeEnum {
    ACTIVE_ARCHIVE("active_archive"),
    
    OFFLINE_ARCHIVE("offline_archive"),
    
    DATA_EXCHANGE("data_exchange"),
    
    DATA_MIGRATION("data_migration"),
    
    MAINTENANCE("maintenance"),
    
    DATA_ENRICHMENT("data_enrichment");

    private String value;

    WorkflowTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowTypeEnum fromValue(String value) {
      for (WorkflowTypeEnum b : WorkflowTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkflowTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkflowTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflow_type";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private WorkflowTypeEnum workflowType;

  /**
   * Gets or Sets workflowAction
   */
  @JsonAdapter(WorkflowActionEnum.Adapter.class)
  public enum WorkflowActionEnum {
    COPY("copy"),
    
    MOVE("move"),
    
    ERASE("erase"),
    
    SCAN("scan"),
    
    REHYDRATATION("rehydratation"),
    
    FORMAT("format"),
    
    CHECK_CONSISTENCY("check_consistency"),
    
    DUPLICATION("duplication"),
    
    CACHE_CLEANING("cache_cleaning"),
    
    EJECTION("ejection"),
    
    GET_INDEX("get_index"),
    
    FULL_BACKUP("full_backup"),
    
    INCREMENTAL_BACKUP("incremental_backup");

    private String value;

    WorkflowActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static WorkflowActionEnum fromValue(String value) {
      for (WorkflowActionEnum b : WorkflowActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<WorkflowActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final WorkflowActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public WorkflowActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return WorkflowActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_WORKFLOW_ACTION = "workflow_action";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_ACTION)
  private WorkflowActionEnum workflowAction;

  /**
   * Gets or Sets sourceType
   */
  @JsonAdapter(SourceTypeEnum.Adapter.class)
  public enum SourceTypeEnum {
    CONTAINER("container"),
    
    PRIMARY_NAS("primary_nas"),
    
    SECONDARY_NAS("secondary_nas"),
    
    PRIMARY_CLOUD("primary_cloud"),
    
    SECONDARY_CLOUD("secondary_cloud"),
    
    SECONDARY_TAPE("secondary_tape");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SourceTypeEnum fromValue(String value) {
      for (SourceTypeEnum b : SourceTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<SourceTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SourceTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SourceTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return SourceTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_SOURCE_TYPE = "source_type";
  @SerializedName(SERIALIZED_NAME_SOURCE_TYPE)
  private SourceTypeEnum sourceType;

  /**
   * Gets or Sets destinationType
   */
  @JsonAdapter(DestinationTypeEnum.Adapter.class)
  public enum DestinationTypeEnum {
    CONTAINER("container"),
    
    PRIMARY_NAS("primary_nas"),
    
    SECONDARY_NAS("secondary_nas"),
    
    PRIMARY_CLOUD("primary_cloud"),
    
    SECONDARY_CLOUD("secondary_cloud"),
    
    SECONDARY_TAPE("secondary_tape");

    private String value;

    DestinationTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DestinationTypeEnum fromValue(String value) {
      for (DestinationTypeEnum b : DestinationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DestinationTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DestinationTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DestinationTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DestinationTypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_DESTINATION_TYPE = "destination_type";
  @SerializedName(SERIALIZED_NAME_DESTINATION_TYPE)
  private DestinationTypeEnum destinationType;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private Integer priority;

  /**
   * Gets or Sets conflictResolution
   */
  @JsonAdapter(ConflictResolutionEnum.Adapter.class)
  public enum ConflictResolutionEnum {
    RENAME("rename"),
    
    OVERWRITE("overwrite"),
    
    IGNORE("ignore");

    private String value;

    ConflictResolutionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConflictResolutionEnum fromValue(String value) {
      for (ConflictResolutionEnum b : ConflictResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ConflictResolutionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConflictResolutionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConflictResolutionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ConflictResolutionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CONFLICT_RESOLUTION = "conflict_resolution";
  @SerializedName(SERIALIZED_NAME_CONFLICT_RESOLUTION)
  private ConflictResolutionEnum conflictResolution;

  /**
   * Gets or Sets action
   */
  @JsonAdapter(ActionEnum.Adapter.class)
  public enum ActionEnum {
    NOOP("noop"),
    
    RUN("run"),
    
    PAUSE("pause"),
    
    STOP("stop"),
    
    RESUME("resume");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ActionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ActionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ActionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ActionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private ActionEnum action;

  public static final String SERIALIZED_NAME_ACTIVATE = "activate";
  @SerializedName(SERIALIZED_NAME_ACTIVATE)
  private Boolean activate;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creation_date";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private String creationDate;

  public static final String SERIALIZED_NAME_MODIFICATION_DATE = "modification_date";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_DATE)
  private String modificationDate;

  public static final String SERIALIZED_NAME_CREATION_USERNAME = "creation_username";
  @SerializedName(SERIALIZED_NAME_CREATION_USERNAME)
  private String creationUsername;

  public static final String SERIALIZED_NAME_MODIFICATION_USERNAME = "modification_username";
  @SerializedName(SERIALIZED_NAME_MODIFICATION_USERNAME)
  private String modificationUsername;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    NOT_ACTIVATED("not_activated"),
    
    DONE("done"),
    
    IN_PROGRESS("in_progress"),
    
    ERROR("error"),
    
    PAUSED("paused"),
    
    STOPPED_BY_SYSTEM("stopped_by_system"),
    
    IN_QUEUE("in_queue"),
    
    FINISHED_WITH_WARNINGS("finished_with_warnings"),
    
    CALCULATING("calculating"),
    
    STOPPED_BY_USER("stopped_by_user");

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

  public static final String SERIALIZED_NAME_JOB_STARTED = "job_started";
  @SerializedName(SERIALIZED_NAME_JOB_STARTED)
  private String jobStarted;

  public static final String SERIALIZED_NAME_JOB_FINISHED = "job_finished";
  @SerializedName(SERIALIZED_NAME_JOB_FINISHED)
  private String jobFinished;

  public static final String SERIALIZED_NAME_PROCESSED_SIZE = "processed_size";
  @SerializedName(SERIALIZED_NAME_PROCESSED_SIZE)
  private Integer processedSize;

  public static final String SERIALIZED_NAME_TO_PROCESS_SIZE = "to_process_size";
  @SerializedName(SERIALIZED_NAME_TO_PROCESS_SIZE)
  private Integer toProcessSize;


   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId() {
    return id;
  }




  public Task name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Task comment(String comment) {
    
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


  public Task workflowType(WorkflowTypeEnum workflowType) {
    
    this.workflowType = workflowType;
    return this;
  }

   /**
   * Get workflowType
   * @return workflowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowTypeEnum getWorkflowType() {
    return workflowType;
  }


  public void setWorkflowType(WorkflowTypeEnum workflowType) {
    this.workflowType = workflowType;
  }


  public Task workflowAction(WorkflowActionEnum workflowAction) {
    
    this.workflowAction = workflowAction;
    return this;
  }

   /**
   * Get workflowAction
   * @return workflowAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowActionEnum getWorkflowAction() {
    return workflowAction;
  }


  public void setWorkflowAction(WorkflowActionEnum workflowAction) {
    this.workflowAction = workflowAction;
  }


  public Task sourceType(SourceTypeEnum sourceType) {
    
    this.sourceType = sourceType;
    return this;
  }

   /**
   * Get sourceType
   * @return sourceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SourceTypeEnum getSourceType() {
    return sourceType;
  }


  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  public Task destinationType(DestinationTypeEnum destinationType) {
    
    this.destinationType = destinationType;
    return this;
  }

   /**
   * Get destinationType
   * @return destinationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DestinationTypeEnum getDestinationType() {
    return destinationType;
  }


  public void setDestinationType(DestinationTypeEnum destinationType) {
    this.destinationType = destinationType;
  }


  public Task priority(Integer priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPriority() {
    return priority;
  }


  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  public Task conflictResolution(ConflictResolutionEnum conflictResolution) {
    
    this.conflictResolution = conflictResolution;
    return this;
  }

   /**
   * Get conflictResolution
   * @return conflictResolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConflictResolutionEnum getConflictResolution() {
    return conflictResolution;
  }


  public void setConflictResolution(ConflictResolutionEnum conflictResolution) {
    this.conflictResolution = conflictResolution;
  }


   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ActionEnum getAction() {
    return action;
  }




  public Task activate(Boolean activate) {
    
    this.activate = activate;
    return this;
  }

   /**
   * Get activate
   * @return activate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getActivate() {
    return activate;
  }


  public void setActivate(Boolean activate) {
    this.activate = activate;
  }


   /**
   * Get creationDate
   * @return creationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreationDate() {
    return creationDate;
  }




   /**
   * Get modificationDate
   * @return modificationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModificationDate() {
    return modificationDate;
  }




   /**
   * Get creationUsername
   * @return creationUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreationUsername() {
    return creationUsername;
  }




   /**
   * Get modificationUsername
   * @return modificationUsername
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getModificationUsername() {
    return modificationUsername;
  }




   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }




   /**
   * Get jobStarted
   * @return jobStarted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobStarted() {
    return jobStarted;
  }




   /**
   * Get jobFinished
   * @return jobFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobFinished() {
    return jobFinished;
  }




   /**
   * Get processedSize
   * @return processedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getProcessedSize() {
    return processedSize;
  }




   /**
   * Get toProcessSize
   * @return toProcessSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getToProcessSize() {
    return toProcessSize;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.id, task.id) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.comment, task.comment) &&
        Objects.equals(this.workflowType, task.workflowType) &&
        Objects.equals(this.workflowAction, task.workflowAction) &&
        Objects.equals(this.sourceType, task.sourceType) &&
        Objects.equals(this.destinationType, task.destinationType) &&
        Objects.equals(this.priority, task.priority) &&
        Objects.equals(this.conflictResolution, task.conflictResolution) &&
        Objects.equals(this.action, task.action) &&
        Objects.equals(this.activate, task.activate) &&
        Objects.equals(this.creationDate, task.creationDate) &&
        Objects.equals(this.modificationDate, task.modificationDate) &&
        Objects.equals(this.creationUsername, task.creationUsername) &&
        Objects.equals(this.modificationUsername, task.modificationUsername) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.jobStarted, task.jobStarted) &&
        Objects.equals(this.jobFinished, task.jobFinished) &&
        Objects.equals(this.processedSize, task.processedSize) &&
        Objects.equals(this.toProcessSize, task.toProcessSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, comment, workflowType, workflowAction, sourceType, destinationType, priority, conflictResolution, action, activate, creationDate, modificationDate, creationUsername, modificationUsername, status, jobStarted, jobFinished, processedSize, toProcessSize);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowAction: ").append(toIndentedString(workflowAction)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    conflictResolution: ").append(toIndentedString(conflictResolution)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    activate: ").append(toIndentedString(activate)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    modificationDate: ").append(toIndentedString(modificationDate)).append("\n");
    sb.append("    creationUsername: ").append(toIndentedString(creationUsername)).append("\n");
    sb.append("    modificationUsername: ").append(toIndentedString(modificationUsername)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    jobStarted: ").append(toIndentedString(jobStarted)).append("\n");
    sb.append("    jobFinished: ").append(toIndentedString(jobFinished)).append("\n");
    sb.append("    processedSize: ").append(toIndentedString(processedSize)).append("\n");
    sb.append("    toProcessSize: ").append(toIndentedString(toProcessSize)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

