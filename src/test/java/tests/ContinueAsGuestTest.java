package tests;

import baseclass.TestBase;
import pages.ContinueAsGuestPage;
import utilities.GetScreenShots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.SwipeScreen;

import java.util.concurrent.TimeUnit;

public class ContinueAsGuestTest extends TestBase
{
    @Test
    public void GuestLogin() throws Exception {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        ContinueAsGuestPage GuestLogin = new ContinueAsGuestPage(driver);

        Thread.sleep(3000);
        GuestLogin.continueAsGuestButton();

        String DiscoverText = GuestLogin.discoverTitle();
        Assert.assertEquals(DiscoverText, "Discover");
        System.out.println(DiscoverText);

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Continue As Guest 1", driver);

        GuestLogin.discoveryButton();
        GuestLogin.bookingsButton();
        GuestLogin.chatButton();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Continue As Guest 2", driver);

        GuestLogin.healthWalletButton();
        GuestLogin.myAccountButton();
        GuestLogin.discoveryButton();

        Thread.sleep(2000);
        driver.quit();
    }
}
