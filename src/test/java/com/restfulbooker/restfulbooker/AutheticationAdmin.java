package com.restfulbooker.restfulbooker;

import com.restfulbooker.model.Authentication;
import com.restfulbooker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class AutheticationAdmin extends TestBase {
    @Test
    public void Authorize()
    {
        Authentication authentication=new Authentication();
        authentication.setUsername("admin");
        authentication.setPassword("password123");

        Response response = given()
                .header("Content-Type","application/json")
                .when()
                .body(authentication)
                .post("/auth");
                response.then();
        response.prettyPrint();

    }


}
