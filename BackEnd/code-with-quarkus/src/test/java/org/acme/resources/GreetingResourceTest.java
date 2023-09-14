package org.acme.resources;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


@QuarkusTest
class GreetingResourceTest {

    @Test
    void hello() {
        given()
                .when().get("/alticci")
                .then()
                .statusCode(200)
                .body(is("Welcome to AlticciCalculator"));
    }

    @Test
    void getAlticci() {
        given()
                .when().get("/alticci/5")
                .then()
                .statusCode(200)
                .body(is("2"));
    }
}