package com.restfulbooker.restfulbooker;

import com.restfulbooker.model.BookingPojo;
import com.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class POSTCreateNewData extends TestBase {

    static ValidatableResponse response;
    @Test
    public void CreateData()
    {
        HashMap<String,String> bookingdates = new HashMap<>();
        bookingdates.put("checkin","2020-10-15");
        bookingdates.put("checkout","2020-11-25");



        BookingPojo bookingPojo =new BookingPojo();
        bookingPojo.setFirstname("Tom");
        bookingPojo.setLastname("Brown");
        bookingPojo.setTotalprice(231);
        bookingPojo.setDepositpaid(true);
        bookingPojo.setBookingdates(bookingdates);
        bookingPojo.setAdditionalNeeds("Dinner");

        Response response = given()
                .header("Content-Type","application/json")
                .body(bookingPojo)
                .when()
                .post("/booking");
        response.then().statusCode(200);
        response.prettyPrint();


    }
}
