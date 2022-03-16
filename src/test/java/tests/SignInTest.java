package tests;

import baseclass.TestBase;
import pages.CreateAccountPage;
import pages.SignInPage;
import utilities.GetScreenShots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SignInTest extends TestBase
{
    @Test
    public void UserLogin() throws Exception {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        CreateAccountPage CreateProfile = new CreateAccountPage(driver);
        Thread.sleep(3000);
        CreateProfile.signInButton();

        SignInPage LogIn = new SignInPage(driver);
        LogIn.addEmailId("amarnath.bomma@mutualmobile.com");
        LogIn.addPassword("Bomma@123");

        CreateProfile.hidePassword();
        CreateProfile.unHidePassword();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Sign In", driver);

        LogIn.loginInButton();

        Thread.sleep(5000);
        driver.quit();
    }
}
