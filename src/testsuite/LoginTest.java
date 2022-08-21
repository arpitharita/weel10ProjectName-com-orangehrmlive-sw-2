package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){openbrowse(baseUrl);}
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        //* Enter “Admin” username
        WebElement Enterusername = driver.findElement(By.xpath("//input[@name='username']"));
        Enterusername.sendKeys("Admin");

        //* Enter “admin123 password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@name='password']"));
        EnterPassword.sendKeys("admin123");

        //* Click on ‘LOGIN’ button
        WebElement ClickonLogin =driver.findElement(By.xpath("//button[@type='submit']"));
        ClickonLogin.click();

        //* Verify the ‘Welcome’ text is display
      WebElement Verifytext= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
       String actualtest = Verifytext.getText();
       String expctedtest = "Manoj c";
        Assert.assertEquals(actualtest,expctedtest);
    }
    @After
    public void closebrowser(){
       // driver.quit();
    }
}
