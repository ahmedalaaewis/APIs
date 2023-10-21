package Requests;

import io.restassured.response.Response;

public class DELETE_Request extends BaseRequest {

    public DELETE_Request(String baseUrl, String endpoint) {
        super(baseUrl, endpoint);
    }

    public Response sendDeleteRequest() {
        return sendRequest("DELETE");
    }
}
