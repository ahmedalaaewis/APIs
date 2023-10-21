package Requests;

import io.restassured.response.Response;

public class PUT_Request extends BaseRequest {

    public PUT_Request(String baseUrl, String endpoint) {
        super(baseUrl, endpoint);
    }

    public void addFormParameter(String param, String value) {
        requestSpec.formParam(param, value);
    }

    public Response sendPutRequest(String requestBody) {
        return requestSpec.body(requestBody).put();
    }
}
