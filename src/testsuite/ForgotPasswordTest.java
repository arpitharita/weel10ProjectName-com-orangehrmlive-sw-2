package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {


    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup(){openbrowse(baseUrl);}

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){

        //* Verify the text ‘Forgot Your Password?’
        WebElement VerifyText = driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']"));
        VerifyText.getText();
//        String actualTest = VerifyText.getText();
//        String expectedTest = "Forgot your password?";
//        Assert.assertEquals(expectedTest,actualTest);

        //  * click on the ‘Forgot your password’ link
        WebElement forgotpassword = driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']"));
        forgotpassword.click();


    }
    @After
    public void closebrowser(){
       // driver.quit();
    }
}

