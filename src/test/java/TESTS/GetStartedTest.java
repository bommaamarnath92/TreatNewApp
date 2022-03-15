package TESTS;

import BASECLASS.TestBase;
import PAGES.GetStartedPage;
import UTILITIES.GetScreenShots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetStartedTest extends TestBase {

    @Test
    public void OnBoardScreens() throws Exception
    {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        GetStartedPage welcomeScreens = new GetStartedPage(driver);
        Thread.sleep(5000);

        String WelcomeNote = welcomeScreens.TreatWelcomeNote();
        Assert.assertEquals(WelcomeNote, "Your health and wellness travel champion —from inspiration to planning to integrated care, online and en-route. Start your journey.");
        System.out.println(WelcomeNote);

        welcomeScreens.GetStartedButton();
        welcomeScreens.NavigateForward();
        welcomeScreens.NavigateForward();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("On Board Screen 1", driver);

        welcomeScreens.NavigateBack();
        welcomeScreens.NavigateBack();
        welcomeScreens.NavigateBack();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("On Board Screen 2", driver);

        Thread.sleep(1000);
        driver.quit();
    }

}
