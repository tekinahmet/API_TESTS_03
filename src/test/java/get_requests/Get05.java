package get_requests;

import base_urls.HerokuAppBaseURL;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get05 extends HerokuAppBaseURL {
    @Test
    public void get05(){
//      SET THE URL
        spec.pathParam("first", "booking");

//      SET THE EXPECTED DATA

//      SEND REQUEST AND GET RESPONSE
        given(spec).get("{first}");

//      DO ASSERTION
    }
}
