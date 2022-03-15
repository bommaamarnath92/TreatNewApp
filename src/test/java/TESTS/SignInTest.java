package TESTS;

import BASECLASS.TestBase;
import PAGES.CreateAccountPage;
import PAGES.GetStartedPage;
import PAGES.SignInPage;
import UTILITIES.GetScreenShots;
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
        CreateProfile.SignInButton();

        SignInPage LogIn = new SignInPage(driver);
        LogIn.AddEmailId("amarnath.bomma@mutualmobile.com");
        LogIn.AddPassword("Bomma@123");

        CreateProfile.HidePassword();
        CreateProfile.UnHidePassword();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Sign In", driver);

        LogIn.LoginInButton();

        Thread.sleep(5000);
        driver.quit();
    }
}
