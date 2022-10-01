package com.restfulbooker.restfulbooker;

import com.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteBookingData extends TestBase {

        @Test
        public void DeleteData()
        {
            Response response = given()
                    .basePath("/booking")
                    .pathParam("id","2012")
                    .when()
                    .delete("/{id}");
            response.then();
            response.prettyPrint();


        }
}
