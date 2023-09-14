package org.acme.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
class GreetingResourceTest {

    @Test
    void hello() {
        given()
                .when().get("/hello")
                .then()
                .statusCode(200)
                .body(is("Hello RESTEasy"));
    }

    @Test
    void getAlticci() {
        given()
                .when().get("/hello/5")
                .then()
                .statusCode(200)
                .body(is("2"));
    }
}