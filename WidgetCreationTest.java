package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjects.LoginPage;
import pageobjects.DashboardPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class WidgetCreationTest {

    @Test
    public void testCreateWidget() {
        WebDriver driver = new ChromeDriver();
        LoginPage loginPage = new LoginPage(driver);
        DashboardPage dashboardPage = new DashboardPage(driver);

        driver.get("https://your-report-portal-url.com");

        // Войти в систему
        loginPage.login("default", "1q2w3e");

        // Перейти на Dashboard и добавить Widget
        dashboardPage.addWidget();

        // Проверить, что Widget добавлен
        assertTrue(dashboardPage.isWidgetDisplayed());

        driver.quit();
    }
}
