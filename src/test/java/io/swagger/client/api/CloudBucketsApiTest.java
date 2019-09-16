/*
 * Nodeum API
 * Nodeum API  # Filter parameters When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.ActiveJobStatus;
import io.swagger.client.model.CloudBucket;
import io.swagger.client.model.CloudBucketCollection;
import io.swagger.client.model.CloudBucketSimpleCollection;
import io.swagger.client.model.Error;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CloudBucketsApi
 */
@Ignore
public class CloudBucketsApiTest {

    private final CloudBucketsApi api = new CloudBucketsApi();

    
    /**
     * Lists all cloud buckets.
     *
     * **API Key Scope**: cloud_buckets / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexCloudBucketsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String cloudConnectorId = null;
        String cloudPoolId = null;
        String name = null;
        String location = null;
        String price = null;
        CloudBucketCollection response = api.indexCloudBuckets(limit, offset, sortBy, id, cloudConnectorId, cloudPoolId, name, location, price);

        // TODO: test validations
    }
    
    /**
     * Lists all cloud buckets.
     *
     * **API Key Scope**: cloud_buckets / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexCloudBucketsByCloudConnectorTest() throws ApiException {
        String cloudConnectorId = null;
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String cloudPoolId = null;
        String name = null;
        String location = null;
        String price = null;
        CloudBucketCollection response = api.indexCloudBucketsByCloudConnector(cloudConnectorId, limit, offset, sortBy, id, cloudPoolId, name, location, price);

        // TODO: test validations
    }
    
    /**
     * Lists all cloud buckets.
     *
     * **API Key Scope**: cloud_buckets / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexCloudBucketsByCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String cloudConnectorId = null;
        String name = null;
        String location = null;
        String price = null;
        CloudBucketCollection response = api.indexCloudBucketsByCloudPool(cloudPoolId, limit, offset, sortBy, id, cloudConnectorId, name, location, price);

        // TODO: test validations
    }
    
    /**
     * Displays a specific cloud bucket.
     *
     * **API Key Scope**: cloud_buckets / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showCloudBucketTest() throws ApiException {
        String cloudBucketId = null;
        CloudBucket response = api.showCloudBucket(cloudBucketId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific cloud bucket.
     *
     * **API Key Scope**: cloud_buckets / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showCloudBucketByCloudConnectorTest() throws ApiException {
        String cloudConnectorId = null;
        String cloudBucketId = null;
        CloudBucket response = api.showCloudBucketByCloudConnector(cloudConnectorId, cloudBucketId);

        // TODO: test validations
    }
    
    /**
     * Displays a specific cloud bucket.
     *
     * **API Key Scope**: cloud_buckets / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showCloudBucketByCloudPoolTest() throws ApiException {
        String cloudPoolId = null;
        String cloudBucketId = null;
        CloudBucket response = api.showCloudBucketByCloudPool(cloudPoolId, cloudBucketId);

        // TODO: test validations
    }
    
    /**
     * Synchronize internal cloud buckets with their remote equivalent.
     *
     * **API Key Scope**: cloud_buckets / sync
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncCloudBucketsTest() throws ApiException {
        String cloudConnectorId = null;
        ActiveJobStatus response = api.syncCloudBuckets(cloudConnectorId);

        // TODO: test validations
    }
    
    /**
     * Check result of cloud connector sync job.
     *
     * **API Key Scope**: cloud_buckets / sync
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncResultCloudBucketsTest() throws ApiException {
        String cloudConnectorId = null;
        String jobId = null;
        CloudBucketSimpleCollection response = api.syncResultCloudBuckets(cloudConnectorId, jobId);

        // TODO: test validations
    }
    
}
