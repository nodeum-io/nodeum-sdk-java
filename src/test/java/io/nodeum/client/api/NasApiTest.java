/*
 * Nodeum API
 * # About  This document describes the Nodeum API version 2:  If you are looking for any information about the product itself, reach the product website https://www.nodeum.io. You can also contact us at this email address : info@nodeum.io  # Filter parameters When browsing a list of items, multiple filter parameters may be applied. Some operators can be added to the value as a prefix:  - `=` value is equal. Default operator, may be omitted  - `!=` value is different  - `>` greater than  - `>=` greater than or equal  - `<` lower than  - `>=` lower than or equal  - `><` included in list, items should be separated by `|`  - `!><` not included in list, items should be separated by `|`  - `~` pattern matching, may include `%` (any characters) and `_` (one character)  - `!~` pattern not matching, may include `%` (any characters) and `_` (one character)  
 *
 * The version of the OpenAPI document: 2.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.nodeum.client.api;

import io.nodeum.client.ApiException;
import io.nodeum.client.model.Error;
import io.nodeum.client.model.Nas;
import io.nodeum.client.model.NasCollection;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NasApi
 */
@Ignore
public class NasApiTest {

    private final NasApi api = new NasApi();

    
    /**
     * Creates a new NAS.
     *
     * **API Key Scope**: nas / create
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createNasTest() throws ApiException {
        Nas nasBody = null;
        Nas response = api.createNas(nasBody);

        // TODO: test validations
    }
    
    /**
     * Destroys a specific NAS.
     *
     * **API Key Scope**: nas / destroy
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void destroyNasTest() throws ApiException {
        String nasId = null;
        api.destroyNas(nasId);

        // TODO: test validations
    }
    
    /**
     * Lists all NAS.
     *
     * **API Key Scope**: nas / index
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void indexNasTest() throws ApiException {
        Integer limit = null;
        Integer offset = null;
        List<String> sortBy = null;
        String id = null;
        String name = null;
        String comment = null;
        String host = null;
        String type = null;
        String price = null;
        NasCollection response = api.indexNas(limit, offset, sortBy, id, name, comment, host, type, price);

        // TODO: test validations
    }
    
    /**
     * Displays a specific NAS.
     *
     * **API Key Scope**: nas / show
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void showNasTest() throws ApiException {
        String nasId = null;
        Nas response = api.showNas(nasId);

        // TODO: test validations
    }
    
    /**
     * Updates a specific NAS.
     *
     * **API Key Scope**: nas / update
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNasTest() throws ApiException {
        String nasId = null;
        Nas nasBody = null;
        Nas response = api.updateNas(nasId, nasBody);

        // TODO: test validations
    }
    
}
