package Task1.WithPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Task1 extends BaseClass {

    public Task1(WebDriver driver, WebDriverWait wait) {
        super(driver, new WebDriverWait(driver, Duration.ofSeconds(10)));
    }

    public void NavigateToFirstPage() {
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    By child1 = By.cssSelector(".center:nth-child(1) > .btn");

    public void ClickCustomerLogin() {
        Wait().until(ExpectedConditions.presenceOfElementLocated(child1)).click();
    }

    By userSelect = By.id("userSelect");

    public void ClickYourName() {
        Wait().until(ExpectedConditions.presenceOfElementLocated(userSelect)).click();
    }

    By child3 = By.cssSelector("#userSelect > option:nth-child(3)");

    public void SelectHP() {
        Wait().until(ExpectedConditions.presenceOfElementLocated(child3)).click();
    }

    By buttonDef = By.cssSelector(".btn-default");

    public void ClickLogin() {
        Wait().until(ExpectedConditions.presenceOfElementLocated(buttonDef)).click();
    }

    By child2 = By.xpath("//div[3]/button[2]");

    public void ClickDeposit() {
        Wait().until(ExpectedConditions.presenceOfElementLocated(child2)).click();
    }

    By number = By.xpath("//input[@type='number']");

    public void EnterAmount(String Amount) {
        Wait().until(ExpectedConditions.presenceOfElementLocated(number)).sendKeys(Amount); //1st time
    }

    By buttonValue = By.xpath("//button[@value='']");

    public void ClickDeposit2() {
        Wait().until(ExpectedConditions.presenceOfElementLocated(buttonValue)).click();
    }
}

