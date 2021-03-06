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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for TapeStat
 */
public class TapeStatTest {
    private final TapeStat model = new TapeStat();

    /**
     * Model tests for TapeStat
     */
    @Test
    public void testTapeStat() {
        // TODO: test TapeStat
    }

    /**
     * Test the property 'logTime'
     */
    @Test
    public void logTimeTest() {
        // TODO: test logTime
    }

    /**
     * Test the property 'barcode'
     */
    @Test
    public void barcodeTest() {
        // TODO: test barcode
    }

    /**
     * Test the property 'mounts'
     */
    @Test
    public void mountsTest() {
        // TODO: test mounts
    }

    /**
     * Test the property 'datasetsWritten'
     */
    @Test
    public void datasetsWrittenTest() {
        // TODO: test datasetsWritten
    }

    /**
     * Test the property 'datasetsRead'
     */
    @Test
    public void datasetsReadTest() {
        // TODO: test datasetsRead
    }

    /**
     * Test the property 'recoveredWriteDataErrors'
     */
    @Test
    public void recoveredWriteDataErrorsTest() {
        // TODO: test recoveredWriteDataErrors
    }

    /**
     * Test the property 'unrecoveredWriteDataErrors'
     */
    @Test
    public void unrecoveredWriteDataErrorsTest() {
        // TODO: test unrecoveredWriteDataErrors
    }

    /**
     * Test the property 'writeServoErrors'
     */
    @Test
    public void writeServoErrorsTest() {
        // TODO: test writeServoErrors
    }

    /**
     * Test the property 'unrecoveredWriteServoErrors'
     */
    @Test
    public void unrecoveredWriteServoErrorsTest() {
        // TODO: test unrecoveredWriteServoErrors
    }

    /**
     * Test the property 'recoveredReadErrors'
     */
    @Test
    public void recoveredReadErrorsTest() {
        // TODO: test recoveredReadErrors
    }

    /**
     * Test the property 'unrecoveredReadErrors'
     */
    @Test
    public void unrecoveredReadErrorsTest() {
        // TODO: test unrecoveredReadErrors
    }

    /**
     * Test the property 'lastMountUnrecoveredWriteErrors'
     */
    @Test
    public void lastMountUnrecoveredWriteErrorsTest() {
        // TODO: test lastMountUnrecoveredWriteErrors
    }

    /**
     * Test the property 'lastMountUnrecoveredReadErrors'
     */
    @Test
    public void lastMountUnrecoveredReadErrorsTest() {
        // TODO: test lastMountUnrecoveredReadErrors
    }

    /**
     * Test the property 'lastMountMbytesWritten'
     */
    @Test
    public void lastMountMbytesWrittenTest() {
        // TODO: test lastMountMbytesWritten
    }

    /**
     * Test the property 'lastMountMbytesRead'
     */
    @Test
    public void lastMountMbytesReadTest() {
        // TODO: test lastMountMbytesRead
    }

    /**
     * Test the property 'lifetimeMbytesWritten'
     */
    @Test
    public void lifetimeMbytesWrittenTest() {
        // TODO: test lifetimeMbytesWritten
    }

    /**
     * Test the property 'lifetimeMbytesRead'
     */
    @Test
    public void lifetimeMbytesReadTest() {
        // TODO: test lifetimeMbytesRead
    }

    /**
     * Test the property 'lastLoadWriteCompressionRatio'
     */
    @Test
    public void lastLoadWriteCompressionRatioTest() {
        // TODO: test lastLoadWriteCompressionRatio
    }

    /**
     * Test the property 'lastLoadReadCompressionRatio'
     */
    @Test
    public void lastLoadReadCompressionRatioTest() {
        // TODO: test lastLoadReadCompressionRatio
    }

    /**
     * Test the property 'mediumMountTime'
     */
    @Test
    public void mediumMountTimeTest() {
        // TODO: test mediumMountTime
    }

    /**
     * Test the property 'mediumReadyTime'
     */
    @Test
    public void mediumReadyTimeTest() {
        // TODO: test mediumReadyTime
    }

    /**
     * Test the property 'totalNativeCapacity'
     */
    @Test
    public void totalNativeCapacityTest() {
        // TODO: test totalNativeCapacity
    }

    /**
     * Test the property 'totalUsedNativeCapacity'
     */
    @Test
    public void totalUsedNativeCapacityTest() {
        // TODO: test totalUsedNativeCapacity
    }

    /**
     * Test the property 'writeProtect'
     */
    @Test
    public void writeProtectTest() {
        // TODO: test writeProtect
    }

    /**
     * Test the property 'worm'
     */
    @Test
    public void wormTest() {
        // TODO: test worm
    }

    /**
     * Test the property 'beginningOfMediumPasses'
     */
    @Test
    public void beginningOfMediumPassesTest() {
        // TODO: test beginningOfMediumPasses
    }

    /**
     * Test the property 'middleOfTapePasses'
     */
    @Test
    public void middleOfTapePassesTest() {
        // TODO: test middleOfTapePasses
    }

    /**
     * Test the property 'readCompressionRatio'
     */
    @Test
    public void readCompressionRatioTest() {
        // TODO: test readCompressionRatio
    }

    /**
     * Test the property 'writeCompressionRatio'
     */
    @Test
    public void writeCompressionRatioTest() {
        // TODO: test writeCompressionRatio
    }

    /**
     * Test the property 'mbytesTransferredToAppClient'
     */
    @Test
    public void mbytesTransferredToAppClientTest() {
        // TODO: test mbytesTransferredToAppClient
    }

    /**
     * Test the property 'bytesTransferredToAppClient'
     */
    @Test
    public void bytesTransferredToAppClientTest() {
        // TODO: test bytesTransferredToAppClient
    }

    /**
     * Test the property 'mbytesReadFromMedium'
     */
    @Test
    public void mbytesReadFromMediumTest() {
        // TODO: test mbytesReadFromMedium
    }

    /**
     * Test the property 'bytesReadFromMedium'
     */
    @Test
    public void bytesReadFromMediumTest() {
        // TODO: test bytesReadFromMedium
    }

    /**
     * Test the property 'mbytesTransferredFromAppClient'
     */
    @Test
    public void mbytesTransferredFromAppClientTest() {
        // TODO: test mbytesTransferredFromAppClient
    }

    /**
     * Test the property 'bytesTransferredFromAppClient'
     */
    @Test
    public void bytesTransferredFromAppClientTest() {
        // TODO: test bytesTransferredFromAppClient
    }

    /**
     * Test the property 'mbytesWrittenToMedium'
     */
    @Test
    public void mbytesWrittenToMediumTest() {
        // TODO: test mbytesWrittenToMedium
    }

    /**
     * Test the property 'bytesWrittenToMedium'
     */
    @Test
    public void bytesWrittenToMediumTest() {
        // TODO: test bytesWrittenToMedium
    }

    /**
     * Test the property 'dataCompressionEnabled'
     */
    @Test
    public void dataCompressionEnabledTest() {
        // TODO: test dataCompressionEnabled
    }

    /**
     * Test the property 'writeRetries'
     */
    @Test
    public void writeRetriesTest() {
        // TODO: test writeRetries
    }

    /**
     * Test the property 'writePerms'
     */
    @Test
    public void writePermsTest() {
        // TODO: test writePerms
    }

    /**
     * Test the property 'suspendedWrites'
     */
    @Test
    public void suspendedWritesTest() {
        // TODO: test suspendedWrites
    }

    /**
     * Test the property 'fatalSuspendedWrites'
     */
    @Test
    public void fatalSuspendedWritesTest() {
        // TODO: test fatalSuspendedWrites
    }

    /**
     * Test the property 'readRetries'
     */
    @Test
    public void readRetriesTest() {
        // TODO: test readRetries
    }

    /**
     * Test the property 'readPerms'
     */
    @Test
    public void readPermsTest() {
        // TODO: test readPerms
    }

    /**
     * Test the property 'suspendedReads'
     */
    @Test
    public void suspendedReadsTest() {
        // TODO: test suspendedReads
    }

    /**
     * Test the property 'fatalSuspendedReads'
     */
    @Test
    public void fatalSuspendedReadsTest() {
        // TODO: test fatalSuspendedReads
    }

    /**
     * Test the property 'partition0RemainingCapacity'
     */
    @Test
    public void partition0RemainingCapacityTest() {
        // TODO: test partition0RemainingCapacity
    }

    /**
     * Test the property 'partition1RemainingCapacity'
     */
    @Test
    public void partition1RemainingCapacityTest() {
        // TODO: test partition1RemainingCapacity
    }

    /**
     * Test the property 'partition0MaximumCapacity'
     */
    @Test
    public void partition0MaximumCapacityTest() {
        // TODO: test partition0MaximumCapacity
    }

    /**
     * Test the property 'partition1MaximumCapacity'
     */
    @Test
    public void partition1MaximumCapacityTest() {
        // TODO: test partition1MaximumCapacity
    }

}
