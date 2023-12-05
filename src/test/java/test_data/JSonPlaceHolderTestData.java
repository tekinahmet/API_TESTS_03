package test_data;

import java.util.HashMap;
import java.util.Map;

public class JSonPlaceHolderTestData {
    public static Map<String, Object> expectedDataMap(Integer userId, String title, Boolean completed){
        //primitive int does not accept null, because of this we declare wrapper class (Integer)
        Map<String, Object> expectedData = new HashMap<>();//random order
        expectedData.put("userId", userId);
        expectedData.put("title", title);
        expectedData.put("completed", completed);
        return expectedData;
    }
}
