package Requests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseRequest {
    protected RequestSpecification requestSpec;

    public BaseRequest(String baseUrl, String endpoint) {
        requestSpec = RestAssured.given().baseUri(baseUrl).basePath(endpoint);
        requestSpec.contentType(ContentType.JSON);
    }

    public void addHeader(String name, String value) {
        requestSpec.header(name, value);
    }

    public Response sendRequest(String method) {
        return requestSpec.request(method);
    }
}