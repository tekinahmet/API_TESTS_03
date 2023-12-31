package base_urls;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utils.AuthenticationHerokuApp;

import static utils.AuthenticationHerokuApp.generateToken;

public class HerokuAppBaseURL {
//this class is created for preventing repetitions such as bas url, content type, header, authorization etc
    protected RequestSpecification spec;//do not forget type protected
    @Before //annotation will run this method before @Test methods. So spec won't be null
    public void setUp(){
        spec = new RequestSpecBuilder()
                .setBaseUri("https://restful-booker.herokuapp.com")
                .setContentType(ContentType.JSON)
                //.addHeader("Cookie", "token=1ff36e8b093bea1")
                //.addHeader("Cookie", "token="+ AuthenticationHerokuApp.generateToken())
                .addHeader("Cookie", "token="+generateToken())//import from AuthenticationHerokuApp class
                .build();
    }
}
