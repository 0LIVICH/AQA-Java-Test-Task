package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class DashboardApiTest {

    @Test
    public void testCreateDashboard() {
        String apiKey = "your-api-key";

        RestAssured.baseURI = "https://your-report-portal-api-url.com";

        given()
                .header("Authorization", "Bearer " + apiKey)
                .contentType(ContentType.JSON)
                .body("{\"name\": \"New Dashboard\", \"description\": \"Test Dashboard\"}")
                .when()
                .post("/api/v1/dashboards")
                .then()
                .statusCode(201)
                .body("name", equalTo("New Dashboard"));
    }
}
