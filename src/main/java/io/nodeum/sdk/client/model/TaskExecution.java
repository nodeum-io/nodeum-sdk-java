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
 * TaskExecution
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-14T10:02:47.642Z[GMT]")
public class TaskExecution {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Integer taskId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

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

  public static final String SERIALIZED_NAME_LOG_TIME = "log_time";
  @SerializedName(SERIALIZED_NAME_LOG_TIME)
  private String logTime;

  public static final String SERIALIZED_NAME_JOB_STARTED = "job_started";
  @SerializedName(SERIALIZED_NAME_JOB_STARTED)
  private String jobStarted;

  public static final String SERIALIZED_NAME_JOB_FINISHED = "job_finished";
  @SerializedName(SERIALIZED_NAME_JOB_FINISHED)
  private String jobFinished;

  public static final String SERIALIZED_NAME_TO_PROCESS_SIZE = "to_process_size";
  @SerializedName(SERIALIZED_NAME_TO_PROCESS_SIZE)
  private Integer toProcessSize;

  public static final String SERIALIZED_NAME_PROCESSED_SIZE = "processed_size";
  @SerializedName(SERIALIZED_NAME_PROCESSED_SIZE)
  private Integer processedSize;

  public static final String SERIALIZED_NAME_TO_PROCESS_FILES = "to_process_files";
  @SerializedName(SERIALIZED_NAME_TO_PROCESS_FILES)
  private Integer toProcessFiles;

  public static final String SERIALIZED_NAME_PROCESSED_FILES = "processed_files";
  @SerializedName(SERIALIZED_NAME_PROCESSED_FILES)
  private Integer processedFiles;

  public static final String SERIALIZED_NAME_FINALIZED_FILES = "finalized_files";
  @SerializedName(SERIALIZED_NAME_FINALIZED_FILES)
  private Integer finalizedFiles;

  public static final String SERIALIZED_NAME_ESTIMATION_TIME = "estimation_time";
  @SerializedName(SERIALIZED_NAME_ESTIMATION_TIME)
  private Integer estimationTime;

  public static final String SERIALIZED_NAME_BANDWIDTH = "bandwidth";
  @SerializedName(SERIALIZED_NAME_BANDWIDTH)
  private Integer bandwidth;


  public TaskExecution id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1542797273225418555", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TaskExecution taskId(Integer taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTaskId() {
    return taskId;
  }


  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  public TaskExecution name(String name) {
    
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


  public TaskExecution workflowType(WorkflowTypeEnum workflowType) {
    
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


  public TaskExecution workflowAction(WorkflowActionEnum workflowAction) {
    
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


  public TaskExecution sourceType(SourceTypeEnum sourceType) {
    
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


  public TaskExecution destinationType(DestinationTypeEnum destinationType) {
    
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


  public TaskExecution status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "finished_with_warnings", value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TaskExecution logTime(String logTime) {
    
    this.logTime = logTime;
    return this;
  }

   /**
   * Get logTime
   * @return logTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-11-21T09:48:09.000Z", value = "")

  public String getLogTime() {
    return logTime;
  }


  public void setLogTime(String logTime) {
    this.logTime = logTime;
  }


  public TaskExecution jobStarted(String jobStarted) {
    
    this.jobStarted = jobStarted;
    return this;
  }

   /**
   * Get jobStarted
   * @return jobStarted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-11-21T10:47:53.000Z", value = "")

  public String getJobStarted() {
    return jobStarted;
  }


  public void setJobStarted(String jobStarted) {
    this.jobStarted = jobStarted;
  }


  public TaskExecution jobFinished(String jobFinished) {
    
    this.jobFinished = jobFinished;
    return this;
  }

   /**
   * Get jobFinished
   * @return jobFinished
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-11-21T10:48:08.000Z", value = "")

  public String getJobFinished() {
    return jobFinished;
  }


  public void setJobFinished(String jobFinished) {
    this.jobFinished = jobFinished;
  }


  public TaskExecution toProcessSize(Integer toProcessSize) {
    
    this.toProcessSize = toProcessSize;
    return this;
  }

   /**
   * Get toProcessSize
   * @return toProcessSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "16515610", value = "")

  public Integer getToProcessSize() {
    return toProcessSize;
  }


  public void setToProcessSize(Integer toProcessSize) {
    this.toProcessSize = toProcessSize;
  }


  public TaskExecution processedSize(Integer processedSize) {
    
    this.processedSize = processedSize;
    return this;
  }

   /**
   * Get processedSize
   * @return processedSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "12115125", value = "")

  public Integer getProcessedSize() {
    return processedSize;
  }


  public void setProcessedSize(Integer processedSize) {
    this.processedSize = processedSize;
  }


  public TaskExecution toProcessFiles(Integer toProcessFiles) {
    
    this.toProcessFiles = toProcessFiles;
    return this;
  }

   /**
   * Get toProcessFiles
   * @return toProcessFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "126", value = "")

  public Integer getToProcessFiles() {
    return toProcessFiles;
  }


  public void setToProcessFiles(Integer toProcessFiles) {
    this.toProcessFiles = toProcessFiles;
  }


  public TaskExecution processedFiles(Integer processedFiles) {
    
    this.processedFiles = processedFiles;
    return this;
  }

   /**
   * Get processedFiles
   * @return processedFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "113", value = "")

  public Integer getProcessedFiles() {
    return processedFiles;
  }


  public void setProcessedFiles(Integer processedFiles) {
    this.processedFiles = processedFiles;
  }


  public TaskExecution finalizedFiles(Integer finalizedFiles) {
    
    this.finalizedFiles = finalizedFiles;
    return this;
  }

   /**
   * Get finalizedFiles
   * @return finalizedFiles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "126", value = "")

  public Integer getFinalizedFiles() {
    return finalizedFiles;
  }


  public void setFinalizedFiles(Integer finalizedFiles) {
    this.finalizedFiles = finalizedFiles;
  }


  public TaskExecution estimationTime(Integer estimationTime) {
    
    this.estimationTime = estimationTime;
    return this;
  }

   /**
   * Get estimationTime
   * @return estimationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEstimationTime() {
    return estimationTime;
  }


  public void setEstimationTime(Integer estimationTime) {
    this.estimationTime = estimationTime;
  }


  public TaskExecution bandwidth(Integer bandwidth) {
    
    this.bandwidth = bandwidth;
    return this;
  }

   /**
   * Get bandwidth
   * @return bandwidth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getBandwidth() {
    return bandwidth;
  }


  public void setBandwidth(Integer bandwidth) {
    this.bandwidth = bandwidth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskExecution taskExecution = (TaskExecution) o;
    return Objects.equals(this.id, taskExecution.id) &&
        Objects.equals(this.taskId, taskExecution.taskId) &&
        Objects.equals(this.name, taskExecution.name) &&
        Objects.equals(this.workflowType, taskExecution.workflowType) &&
        Objects.equals(this.workflowAction, taskExecution.workflowAction) &&
        Objects.equals(this.sourceType, taskExecution.sourceType) &&
        Objects.equals(this.destinationType, taskExecution.destinationType) &&
        Objects.equals(this.status, taskExecution.status) &&
        Objects.equals(this.logTime, taskExecution.logTime) &&
        Objects.equals(this.jobStarted, taskExecution.jobStarted) &&
        Objects.equals(this.jobFinished, taskExecution.jobFinished) &&
        Objects.equals(this.toProcessSize, taskExecution.toProcessSize) &&
        Objects.equals(this.processedSize, taskExecution.processedSize) &&
        Objects.equals(this.toProcessFiles, taskExecution.toProcessFiles) &&
        Objects.equals(this.processedFiles, taskExecution.processedFiles) &&
        Objects.equals(this.finalizedFiles, taskExecution.finalizedFiles) &&
        Objects.equals(this.estimationTime, taskExecution.estimationTime) &&
        Objects.equals(this.bandwidth, taskExecution.bandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, taskId, name, workflowType, workflowAction, sourceType, destinationType, status, logTime, jobStarted, jobFinished, toProcessSize, processedSize, toProcessFiles, processedFiles, finalizedFiles, estimationTime, bandwidth);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskExecution {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    workflowAction: ").append(toIndentedString(workflowAction)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    destinationType: ").append(toIndentedString(destinationType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    logTime: ").append(toIndentedString(logTime)).append("\n");
    sb.append("    jobStarted: ").append(toIndentedString(jobStarted)).append("\n");
    sb.append("    jobFinished: ").append(toIndentedString(jobFinished)).append("\n");
    sb.append("    toProcessSize: ").append(toIndentedString(toProcessSize)).append("\n");
    sb.append("    processedSize: ").append(toIndentedString(processedSize)).append("\n");
    sb.append("    toProcessFiles: ").append(toIndentedString(toProcessFiles)).append("\n");
    sb.append("    processedFiles: ").append(toIndentedString(processedFiles)).append("\n");
    sb.append("    finalizedFiles: ").append(toIndentedString(finalizedFiles)).append("\n");
    sb.append("    estimationTime: ").append(toIndentedString(estimationTime)).append("\n");
    sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
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

