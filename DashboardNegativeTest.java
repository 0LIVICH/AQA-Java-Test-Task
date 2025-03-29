package tests;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class DashboardNegativeTest {

    @Test
    public void testCreateDashboardWithMissingParams() {
        String apiKey = "your-api-key";

        RestAssured.baseURI = "https://your-report-portal-api-url.com";

        given()
                .header("Authorization", "Bearer " + apiKey)
                .contentType(ContentType.JSON)
                .body("{}")  // Пустой запрос
                .when()
                .post("/api/v1/dashboards")
                .then()
                .statusCode(400);  // Ожидаем ошибку 400
    }
}
