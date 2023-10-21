package APItest;

import Requests.DELETE_Request;
import Requests.GET_Request;
import Requests.POST_Request;
import Requests.PUT_Request;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class APITest {

    private String baseUrl = "https://fakerestapi.azurewebsites.net";
    private String endpoint = "api/v1/Authors";
    private GET_Request getRequest;
    private POST_Request postRequest;
    private PUT_Request putRequest;
    private DELETE_Request deleteRequest;

    @BeforeTest
    public void setup() {
        getRequest = new GET_Request(baseUrl, endpoint);
        postRequest = new POST_Request(baseUrl, endpoint);
        putRequest = new PUT_Request(baseUrl, endpoint);
        deleteRequest = new DELETE_Request(baseUrl, endpoint);
    }

    @Test
    public void testGetRequest() {
        Response getResponse = getRequest.sendRequest("GET");
        Assert.assertEquals(getResponse.getStatusCode(), 200);
        String responseBody = getResponse.getBody().asString();
        System.out.println("Author Info:\n" + responseBody);
    }

    @Test
    public void testPostRequest() {
        String postRequestBody = "{\"name\": \"John\"}";
        Response postResponse = postRequest.sendPostRequest(postRequestBody);
    }

    @Test
    public void testPutRequest() {
        String putRequestBody = "{\"name\": \"Updated John\"}";
        Response putResponse = putRequest.sendPutRequest(putRequestBody);
    }

    @Test
    public void testDeleteRequest() {
        Response deleteResponse = deleteRequest.sendDeleteRequest();
    }
}
