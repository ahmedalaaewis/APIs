package APItest;

import Requests.DELETE_Request;
import Requests.POST_Request;
import Requests.PUT_Request;
import fakerestapi.GetAuthors;
import fakerestapi.fakerestserver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.restassured.response.Response;

public class APITest {


    private GetAuthors getAuthors;
    private POST_Request postRequest; //make postAuthors same as get
    private PUT_Request putRequest; //make puttAuthors same as get
    private DELETE_Request deleteRequest; //make deleteAuthors same as get

    @BeforeTest
    public void setup() {
        getAuthors = new GetAuthors();
        postRequest = new POST_Request(fakerestserver.baseUrl, fakerestserver.authors_endpoint); //make postAuthors same as get
        putRequest = new PUT_Request(fakerestserver.baseUrl,fakerestserver.authors_endpoint); //make puttAuthors same as get
        deleteRequest = new DELETE_Request(fakerestserver.baseUrl,fakerestserver.authors_endpoint); //make deleteAuthors same as get
    }

    @Test
    public void testGetRequest() {
        Response getResponse = getAuthors.send();
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
