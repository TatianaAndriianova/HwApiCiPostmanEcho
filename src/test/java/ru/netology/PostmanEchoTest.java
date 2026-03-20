package ru.netology;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    void shouldReturnSentData() {
        String requestBody = "some data";

        given()
                .baseUri("https://postman-echo.com")
                .body(requestBody)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("wrong", equalTo(requestBody));
    }
}