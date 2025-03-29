package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    private WebDriver driver;
    private By addWidgetButton = By.id("add-widget");
    private By widgetTypeSelect = By.id("widget-type");
    private By taskProgressOption = By.id("task-progress");
    private By addButton = By.id("add-button");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addWidget() {
        driver.findElement(addWidgetButton).click();
        driver.findElement(widgetTypeSelect).click();
        driver.findElement(taskProgressOption).click();
        driver.findElement(addButton).click();
    }

    public boolean isWidgetDisplayed() {
        return driver.findElement(By.id("task-progress-widget")).isDisplayed();
    }
}
