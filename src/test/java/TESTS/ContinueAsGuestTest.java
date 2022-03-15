package TESTS;

import BASECLASS.TestBase;
import PAGES.ContinueAsGuestPage;
import UTILITIES.GetScreenShots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ContinueAsGuestTest extends TestBase
{
    @Test
    public void GuestLogin() throws Exception {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        ContinueAsGuestPage GuestLogin = new ContinueAsGuestPage(driver);

        Thread.sleep(2000);
        GuestLogin.ContinueAsGuestButton();

        String DiscoverText = GuestLogin.DiscoverTitle();
        Assert.assertEquals(DiscoverText, "Discover");
        System.out.println(DiscoverText);

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Continue As Guest 1", driver);

        GuestLogin.DiscoveryButton();
        GuestLogin.BookingsButton();
        GuestLogin.ChatButton();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Continue As Guest 2", driver);

        GuestLogin.HealthWalletButton();
        GuestLogin.MyAccountButton();
        GuestLogin.DiscoveryButton();

        Thread.sleep(2000);
        driver.quit();
    }
}
