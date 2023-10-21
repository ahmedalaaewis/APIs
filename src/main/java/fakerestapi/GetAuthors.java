package fakerestapi;

import Requests.GET_Request;

public class GetAuthors extends GET_Request {
    public GetAuthors( ) {
        super(fakerestserver.baseUrl, fakerestserver.authors_endpoint);
    }

}
