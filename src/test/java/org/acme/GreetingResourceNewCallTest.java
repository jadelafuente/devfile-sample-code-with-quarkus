package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceNewCallTest {

    @Test
    public void testHelloNewCallEndpoint() {
        given()
          .when().get("/hello-newcall")
          .then()
             .statusCode(200)
             .body(is("Hello NewCall Quarkus Java Test Answer: Pilot for new answers"));
    }

}

