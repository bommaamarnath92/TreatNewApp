package tests;

import baseclass.TestBase;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;
import pages.DiscoverPage;
import pages.SignInPage;
import utilities.GetScreenShots;
import utilities.SwipeScreen;

import java.util.concurrent.TimeUnit;

public class DiscoverTest extends TestBase {


    @Test
    public void DiscoverTitlesCheck() throws Exception
    {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        CreateAccountPage CreateProfile = new CreateAccountPage(driver);
        Thread.sleep(2000);
        CreateProfile.signInButton();

        SignInPage LogIn = new SignInPage(driver);
        LogIn.addEmailId("amarnath.bomma@mutualmobile.com");
        LogIn.addPassword("Bomma@123");

        CreateProfile.hidePassword();
        CreateProfile.unHidePassword();

        LogIn.loginInButton();
        WebDriverWait wait = new WebDriverWait(driver,25);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Discover']")));

        DiscoverPage TitleCheck = new DiscoverPage(driver);

        String DiscoverTitleCheck = TitleCheck.getDiscoverTitle();
        Assert.assertEquals(DiscoverTitleCheck, "Discover");
        System.out.println(DiscoverTitleCheck);

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Discover_1", driver);

        String TravelTitleCheck = TitleCheck.getTravelTitle();
        Assert.assertEquals(TravelTitleCheck, "Travel");
        System.out.println(TravelTitleCheck);

        String HealthTitleCheck = TitleCheck.getHealthTitle();
        Assert.assertEquals(HealthTitleCheck, "Health");
        System.out.println(HealthTitleCheck);

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Discover_2", driver);

        Thread.sleep(1000);
        driver.quit();
    }
}