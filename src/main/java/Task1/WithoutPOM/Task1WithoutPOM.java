package Task1.WithoutPOM;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1WithoutPOM {
    public WebDriver driver;

    String b = "1000";

    @BeforeEach
    public void BeforeTest() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @Test
    public void Test1() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".center:nth-child(1) > .btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("userSelect")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#userSelect > option:nth-child(3)")).click();
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        actions.click().build().perform();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn-default")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
        Thread.sleep(1000);
        WebElement numberField = driver.findElement(By.xpath("//input[@type='number']"));
        Thread.sleep(1000);
        numberField.click();
        Thread.sleep(1000);
        numberField.sendKeys(b);
        WebElement DepositCTA = driver.findElement(By.xpath("//button[@value='']"));
        Thread.sleep(1000);
        DepositCTA.click();
        Thread.sleep(1000);
        numberField.click();
        Thread.sleep(1000);
        numberField.sendKeys(b);
        Thread.sleep(1000);
        DepositCTA.click();
        Thread.sleep(1000);
        WebElement Actual = driver.findElement(By.xpath("//div[2]/strong[2]"));
        String ActualRes = Actual.getText();
        String ExpectedRes = "2000";
        Assert.assertEquals(ExpectedRes, ActualRes);
    }

    @AfterEach
    public void AfterTest() {
        driver.quit();
    }
}
