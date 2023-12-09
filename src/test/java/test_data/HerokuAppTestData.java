package test_data;

import java.util.HashMap;
import java.util.Map;

public class HerokuAppTestData {
    public static Map<String, String> bookingdatesInnerMap(String checkin, String checkout) {//non-primitive data types should be used
        //inner map
        Map<String, String> bookingDatesMap = new HashMap<>();
        bookingDatesMap.put("checkin", checkin);
        bookingDatesMap.put("checkout", checkout);
        return bookingDatesMap;
    }
    public static Map<String, Object> bookingdatesOuterMap(String firstname, String lastname, Integer totalprice, Boolean depositpaid, Map<String, String> bookingdates, String additionalneeds) {
        //primitive int does not accept null, because of this we declare wrapper class (Integer)
        //inner map
        //outer map
        Map<String, Object> expectedData = new HashMap<>();
        if (firstname != null) {
            expectedData.put("firstname", firstname);
        }
        if (lastname != null) {
            expectedData.put("lastname", lastname);
        }
        if (totalprice != null) {
            expectedData.put("totalprice", totalprice);
        }
        if (depositpaid != null) {
            expectedData.put("depositpaid", depositpaid);
        }
        if (bookingdates != null) {
            expectedData.put("bookingdates", bookingdates);
        }
        if (additionalneeds != null) {
            expectedData.put("additionalneeds", additionalneeds);
        }
//        expectedData.put("firstname", firstname);
//        expectedData.put("lastname", lastname);
//        expectedData.put("totalprice", totalprice);
//        expectedData.put("depositpaid", depositpaid);
//        expectedData.put("additionalneeds", additionalneeds);
//        expectedData.put("bookingdates", bookingdates);
        return expectedData;
    }
}
