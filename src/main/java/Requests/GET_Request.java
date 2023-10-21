package Requests;

import io.restassured.response.Response;

public class GET_Request extends BaseRequest {

    public GET_Request(String baseUrl, String endpoint) {
        super(baseUrl, endpoint);
    }

    public void addQueryParameter(String param, String value) {
        requestSpec.queryParam(param, value);
    }
    public Response send() {
        return requestSpec.request("GET");
    }
}
