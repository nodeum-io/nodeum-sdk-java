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


package io.nodeum.sdk.client.api;

import io.nodeum.sdk.client.ApiException;
import io.nodeum.sdk.client.model.ActiveJobStatus;
import io.nodeum.sdk.client.model.Error;
import io.nodeum.sdk.client.model.TapeDrive;
import io.nodeum.sdk.client.model.TapeDriveCollection;
import io.nodeum.sdk.client.model.TapeDriveDeviceCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TapeDrivesApi
 */
@Ignore
public class TapeDrivesApiTest {

    private final TapeDrivesApi api = new TapeDrivesApi();

    
    /**
     * Creates a new tape drive.
     *
     * **API Key Scope**: tape_drives / create
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTapeDriveByTapeLibraryTest() throws ApiException {
        String tapeLibraryId = null;
        TapeDrive tapeDriveBody = null;
        TapeDrive response = api.createTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveBody);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific tape drive.
     *
     * **API Key Scope**: tape_drives / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyTapeDriveTest() throws ApiException {
        String tapeDriveId = null;
        api.destroyTapeDrive(tapeDriveId);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific tape drive.
     *
     * **API Key Scope**: tape_drives / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyTapeDriveByTapeLibraryTest() throws ApiException {
        String tapeLibraryId = null;
        String tapeDriveId = null;
        api.destroyTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId);

        // TODO: test validations
    }
    
    /**
     * Lists tape drives devices.
     *
     * **API Key Scope**: tape_drives / devices
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTapeDriveDevicesTest() throws ApiException {
        String tapeLibraryId = null;
        String jobId = null;
        TapeDriveDeviceCollection response = api.indexTapeDriveDevices(tapeLibraryId, jobId);

        // TODO: test validations
    }
    
    /**
     * Lists all tape drives.
     *
     * **API Key Scope**: tape_drives / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTapeDrivesTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String tapeLibraryId = null;
        String name = null;
        String serial = null;
        String comment = null;
        String scsiAddress = null;
        String vendor = null;
        String product = null;
        String firmware = null;
        String device = null;
        String sgdevice = null;
        String libso = null;
        String acs = null;
        String lsm = null;
        String panel = null;
        String transport = null;
        String status = null;
        String full = null;
        String mountCount = null;
        String useTo = null;
        String useBy = null;
        String barcode = null;
        String taskId = null;
        String useFileProcessedSize = null;
        String useFileSizeToProcess = null;
        String useFileNameProcessed = null;
        String bandwidth = null;
        TapeDriveCollection response = api.indexTapeDrives(limit, offset, sortBy, id, tapeLibraryId, name, serial, comment, scsiAddress, vendor, product, firmware, device, sgdevice, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, barcode, taskId, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth);

        // TODO: test validations
    }
    
    /**
     * Lists all tape drives.
     *
     * **API Key Scope**: tape_drives / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTapeDrivesByTapeLibraryTest() throws ApiException {
        String tapeLibraryId = null;
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String name = null;
        String serial = null;
        String comment = null;
        String scsiAddress = null;
        String vendor = null;
        String product = null;
        String firmware = null;
        String device = null;
        String sgdevice = null;
        String libso = null;
        String acs = null;
        String lsm = null;
        String panel = null;
        String transport = null;
        String status = null;
        String full = null;
        String mountCount = null;
        String useTo = null;
        String useBy = null;
        String barcode = null;
        String taskId = null;
        String useFileProcessedSize = null;
        String useFileSizeToProcess = null;
        String useFileNameProcessed = null;
        String bandwidth = null;
        TapeDriveCollection response = api.indexTapeDrivesByTapeLibrary(tapeLibraryId, limit, offset, sortBy, id, name, serial, comment, scsiAddress, vendor, product, firmware, device, sgdevice, libso, acs, lsm, panel, transport, status, full, mountCount, useTo, useBy, barcode, taskId, useFileProcessedSize, useFileSizeToProcess, useFileNameProcessed, bandwidth);

        // TODO: test validations
    }
    
    /**
     * Displays a specific tape drive.
     *
     * **API Key Scope**: tape_drives / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showTapeDriveTest() throws ApiException {
        String tapeDriveId = null;
        TapeDrive response = api.showTapeDrive(tapeDriveId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific tape drive.
     *
     * **API Key Scope**: tape_drives / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showTapeDriveByTapeLibraryTest() throws ApiException {
        String tapeLibraryId = null;
        String tapeDriveId = null;
        TapeDrive response = api.showTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific tape drive.
     *
     * **API Key Scope**: tape_drives / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTapeDriveTest() throws ApiException {
        String tapeDriveId = null;
        TapeDrive tapeDriveBody = null;
        TapeDrive response = api.updateTapeDrive(tapeDriveId, tapeDriveBody);

        // TODO: test validations
    }
    
    /**
     * Updates a specific tape drive.
     *
     * **API Key Scope**: tape_drives / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTapeDriveByTapeLibraryTest() throws ApiException {
        String tapeLibraryId = null;
        String tapeDriveId = null;
        TapeDrive tapeDriveBody = null;
        TapeDrive response = api.updateTapeDriveByTapeLibrary(tapeLibraryId, tapeDriveId, tapeDriveBody);

        // TODO: test validations
    }
    
}
