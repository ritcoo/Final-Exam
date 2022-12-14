package Task1.WithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
    public WebDriver driver;
    private final WebDriverWait wait;

    public BaseClass(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public WebDriver Driver() {
        return driver;
    }

    public WebDriverWait Wait() {
        return wait;
    }

    public WebElement findElementWithWait(By locator) {
        return Wait().until(ExpectedConditions.presenceOfElementLocated(locator));
    }
}
