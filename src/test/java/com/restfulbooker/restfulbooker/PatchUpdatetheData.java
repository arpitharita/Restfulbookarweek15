package com.restfulbooker.restfulbooker;

import com.restfulbooker.model.BookingPojo;
import com.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PatchUpdatetheData extends TestBase {

    @Test
    public void PatchUpdateData()
    {
        BookingPojo bookingPojo =new BookingPojo();
        bookingPojo.setFirstname("Merry");
        bookingPojo.setLastname("Dom");
        bookingPojo.setTotalprice(565);


        Response response = given()

                .basePath("/booking")
                .header("Content-Type","application/json")
                //.pathParam("token","8af175a14540108")
                .body(bookingPojo)
                .when()
                .patch("876");
        response.then();
        response.prettyPrint();


    }
}
