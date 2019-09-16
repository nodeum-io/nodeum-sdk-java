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
import io.swagger.client.model.Error;
import io.swagger.client.model.TapePool;
import io.swagger.client.model.TapePoolCollection;
import io.swagger.client.model.TapePoolUp;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TapePoolsApi
 */
@Ignore
public class TapePoolsApiTest {

    private final TapePoolsApi api = new TapePoolsApi();

    
    /**
     * Creates a new tape pool.
     *
     * **API Key Scope**: tape_pools / create
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTapePoolTest() throws ApiException {
        TapePoolUp tapePoolBody = null;
        TapePool response = api.createTapePool(tapePoolBody);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific tape pool.
     *
     * **API Key Scope**: tape_pools / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyTapePoolTest() throws ApiException {
        String tapePoolId = null;
        api.destroyTapePool(tapePoolId);

        // TODO: test validations
    }
    
    /**
     * Lists all tape pools.
     *
     * **API Key Scope**: tape_pools / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexTapePoolsTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String name = null;
        String comment = null;
        String type = null;
        TapePoolCollection response = api.indexTapePools(limit, offset, sortBy, id, name, comment, type);

        // TODO: test validations
    }
    
    /**
     * Displays a specific tape pool.
     *
     * **API Key Scope**: tape_pools / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showTapePoolTest() throws ApiException {
        String tapePoolId = null;
        TapePool response = api.showTapePool(tapePoolId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific tape pool.
     *
     * **API Key Scope**: tape_pools / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTapePoolTest() throws ApiException {
        String tapePoolId = null;
        TapePoolUp tapePoolBody = null;
        TapePool response = api.updateTapePool(tapePoolId, tapePoolBody);

        // TODO: test validations
    }
    
}
