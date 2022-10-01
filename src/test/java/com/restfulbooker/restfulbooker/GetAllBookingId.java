package com.restfulbooker.restfulbooker;

import com.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetAllBookingId extends TestBase {

        @Test
        public void getAllBookingId()
        {
           Response response = given()
                    .when()
                    .get("/booking");
           response.then().statusCode(200);
           response.prettyPrint();


        }
        @Test
        public void GetSingleIdData()
        {
            Response response = given()
                    .basePath("/booking")
                    .pathParam("id","300")
                    .when()
                    .get("/{id}");
            response.then().statusCode(200);
            response.prettyPrint();

        }
}
