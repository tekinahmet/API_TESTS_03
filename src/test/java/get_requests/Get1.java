package get_requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class Get1 {
    /*
         Given
             https://restful-booker.herokuapp.com/booking/10
         When
             User sends a GET Request to the url
         Then
             HTTP Status Code should be 200
         And
             Content Type should be application/json
         And
             Status Line should be HTTP/1.1 200 OK
*/
    @Test
    public void get() {    //test method must be public and void without parameter
//        set the url
        String url = "https://restful-booker.herokuapp.com/booking/10";

//        set expected data

//        send request and get response
        Response response = given().when().get(url);
        response.prettyPrint();

//        do assertion
        response
                .then()
                .statusCode(200)
                .contentType("application/json")
//                .contentType(ContentType.JSON)
                .statusLine("HTTP/1.1 200 OK");
    }
}
