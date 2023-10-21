package Requests;

import Requests.BaseRequest;

public class GET_Request extends BaseRequest {

    public GET_Request(String baseUrl, String endpoint) {
        super(baseUrl, endpoint);
    }

    public void addQueryParameter(String param, String value) {
        requestSpec.queryParam(param, value);
    }
}
