package Requests;

import io.restassured.response.Response;

public class POST_Request extends BaseRequest {

    public POST_Request(String baseUrl, String endpoint) {
        super(baseUrl, endpoint);
    }

    public void addFormParameter(String param, String value) {
        requestSpec.formParam(param, value);
    }

    public Response sendPostRequest(String requestBody) {
        return requestSpec.body(requestBody).post();
    }
}
