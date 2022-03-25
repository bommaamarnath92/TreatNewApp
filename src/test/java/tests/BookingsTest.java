package tests;

import baseclass.TestBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BookingsPage;
import pages.CreateAccountPage;
import pages.SignInPage;
import utilities.ScreenShots;

import java.util.concurrent.TimeUnit;

public class BookingsTest extends TestBase {
    @Test
    public void BookingsTest() throws Exception {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        CreateAccountPage CreateProfile = new CreateAccountPage(driver);

        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.Button[@text='Get Started']")));
        CreateProfile.signInButton();

        SignInPage LogIn = new SignInPage(driver);
        LogIn.addEmailId("amarnath.bomma@mutualmobile.com");
        LogIn.addPassword("Bomma@123");

        CreateProfile.hidePassword();
        CreateProfile.unHidePassword();

        Thread.sleep(1000);
        ScreenShots.getScreenShot("Bookings Screen 1", driver);

        LogIn.loginInButton();
        WebDriverWait wait1 = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@text='Discover']")));

        BookingsPage BookingScreen = new BookingsPage(driver);
        BookingScreen.openBookingsTab();
        Thread.sleep(2000);
        String BookingsScreenTitle = BookingScreen.getBookingsPageTitle();
        Assert.assertEquals(BookingsScreenTitle, "Treat Wellness Centers");
        System.out.println(BookingsScreenTitle);

        Thread.sleep(1000);
        ScreenShots.getScreenShot("Bookings Screen 2", driver);

        BookingScreen.openHealthServices();
        BookingScreen.selectCenterLocationHealth();
        BookingScreen.clickNavigateBack();
        BookingScreen.openWellnessServices();
        BookingScreen.selectCenterLocationWellness();
        BookingScreen.clickNavigateBack();
        BookingScreen.checkUpComingAppointments();
        BookingScreen.checkUpComingAppointments();
        BookingScreen.openHealthLink();
        BookingScreen.openWellnessLink();

        Thread.sleep(1000);
        driver.quit();
    }
}
