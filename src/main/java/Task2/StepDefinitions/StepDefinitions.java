package Task2.StepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class StepDefinitions {
    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void BeforeEachTest() {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/main/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @Given("user navigates to the login page")
    public void navigate_to_the_login_page() {
        driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

    @When("selects the Bank Manager Login CTA")
    public void select_login_CTA() {
        driver.findElement(By.xpath("//div[2]/button")).click();
    }
    @When("selects the Customers CTA")
    public void select_customers_CTA() {
        driver.findElement(By.xpath("//button[contains(.,'Customers')]")).click();
    }

    @When("the user sees the table with the customer records")
    public void get_number_of_records() {
        List<WebElement> CustomerRecords = driver.findElements(By.xpath("//table/tbody/tr[]"));

        for (var element:CustomerRecords){
            System.out.println(element);
        }
    }

    @When("the user deletes a record")
    public void delete_a_record() {
        driver.findElement(By.xpath("//button[contains(.,'Delete')]")).click();
    }

    @Then("the user verifies that the records are with one less")
    public void verify_updated_number_of_records() {
        List<WebElement> UpdatedCustomerRecords = driver.findElements(By.xpath("//table/tbody/tr[]"));

        for (var updatedElement:UpdatedCustomerRecords){
            System.out.println(updatedElement);

            Assertions.assertEquals(3, updatedElement);
        }
    }


}
