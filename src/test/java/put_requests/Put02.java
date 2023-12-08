package put_requests;

import org.junit.Test;

public class Put02 {
    /*
        url: https://dummy.restapiexample.com/api/v1/update/21
        HTTP request method: PUT request
        Request Body :
                {
                    "employee_name": "Ahmet",
                    "employee_salary": 123,
                    "employee_age": 23,
                    "profile_image": "perfect image"
                  }
         test case: type by using Gherkin Language
         assert:
            1. status code is 200
            2. response body should be like this
                {
                    "status": "success",
                    "data": {
                            "employee_name": "Ahmet",
                            "employee_salary": 123,
                            "employee_age": 23,
                            "profile_image": "perfect image"
                    },
                    "message": "Successfully! record has been updated."
                }

     */

    @Test
    public void put02() {
    }
}
