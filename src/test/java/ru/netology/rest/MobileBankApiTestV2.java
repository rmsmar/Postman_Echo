package ru.netology.rest;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class MobileBankApiTestV2 {
    @Test
    void shouldReturnDemoAccounts() {

      given()
              .baseUri("https://postman-echo.com")
              .body("some data")
              .when()
              .post("/post")
              .then()
              .statusCode(200)
              .header("Content-Type", "application/json; charset=utf-8")
              .contentType(ContentType.JSON)
      ;
    }
}
