package patch_requests;

import base_urls.JSonPLaceHolderBaseURL;
import io.restassured.response.Response;
import org.junit.Test;
import test_data.JSonPlaceHolderTestData;
import utils.ObjectMapperUtils;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static test_data.JSonPlaceHolderTestData.expectedDataMap;

public class Patch01 extends JSonPLaceHolderBaseURL {//partially update
    /*
            Given
                 https://jsonplaceholder.typicode.com/todos/25
                    {
                        "title": "have breakfast",
                    }
            When
                 User send a Patch request to the url
            Then
                 HTTP Status Code should be 200
            And
                Response body should be like
                {
                    "userId": 2,
                    "id": 25,
                    "title": "have breakfast",
                    "completed": true
                }
        */

    @Test
    public void patch01() {
//      SET THE URL
        spec.pathParams("first", "todos", "second", 25);

//      SET THE EXPECTED DATA
        Map<String, Object> expectedData = expectedDataMap(null, "have lunch", null);
        System.out.println("expectedData = " + expectedData);

//      SEND REQUEST AND GET RESPONSE
        Response response = given(spec).body(expectedData).patch("{first}/{second}");
        response.prettyPrint();

//      DO ASSERTION
        Map<String, Object> actualData = ObjectMapperUtils.convertJsonToJava(response.asString(), HashMap.class);
        System.out.println("actualData = " + actualData);

        assertEquals(200, response.statusCode());
        //we updated just the title, so no need to assert the others
        assertEquals(expectedData.get("title"), actualData.get("title"));

        //to assert the whole body
        assertEquals(2, actualData.get("userId"));
        assertEquals(25, actualData.get("id"));
        assertEquals(true, actualData.get("completed"));



    }
}



























