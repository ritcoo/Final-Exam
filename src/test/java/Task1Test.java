import Task1.WithPOM.Task1;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task1Test extends BaseTestClass {

    @Test
    public void Deposit() {
        Task1 page = new Task1(driver, wait);
        page.NavigateToFirstPage();
        page.ClickCustomerLogin();
        page.ClickYourName();
        page.SelectHP();
        page.ClickLogin();
        page.ClickDeposit();
        page.EnterAmount("1000");
        page.ClickDeposit2();
        page.EnterAmount("1000");
        page.ClickDeposit2();

        WebElement Actual = driver.findElement(By.xpath("//div[2]/strong[2]"));
        String ActualRes = Actual.getText();
        String ExpectedRes = "2000";
        Assert.assertEquals(ExpectedRes, ActualRes);
    }

}
