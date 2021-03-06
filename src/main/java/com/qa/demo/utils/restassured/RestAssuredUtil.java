package com.qa.demo.utils.restassured;

import static io.restassured.RestAssured.get;

import com.qa.demo.utils.api.APIException;
import com.qa.demo.utils.reporting.Log;

/**
 * This class provides methods to interact with Rest Services using rest assured.
 * WORK in PROGRESS
 * 
 * @author deenesh
 */
public class RestAssuredUtil {

    public static enum HTTP_METHOD {
        GET,
        POST,
        PUT,
        DELETE,
        INV_VAL
    };

    /**
     * This method calls REST API with given endpoint without any headers.
     * 
     * @param apiEndPoint
     * @param objectType
     * @return JSON response object
     */
    @SuppressWarnings("unchecked")
    public static <T> T getResponseNoHeader(String apiEndPoint, Class<T> objectType) {
        T webResource;
        try {
            Log.info("Creating client response for endPoint: " + apiEndPoint);
            webResource = (T) get(apiEndPoint).as(objectType.getClass());
        } catch (Exception e) {
            Log.error("Unable to get API Response for " + apiEndPoint, e);
            throw new APIException("Unable to get API Response for " + apiEndPoint, e);
        }
        return webResource;
    }

}
