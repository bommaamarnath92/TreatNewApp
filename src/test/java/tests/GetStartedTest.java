package tests;

import baseclass.TestBase;
import io.appium.java_client.TouchAction;
import pages.GetStartedPage;
import utilities.GetScreenShots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.SwipeScreen;

import java.util.concurrent.TimeUnit;

public class GetStartedTest extends TestBase {

    private TouchAction action;

    @Test
    public void OnBoardScreens() throws Exception
    {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        GetStartedPage welcomeScreens = new GetStartedPage(driver);
        Thread.sleep(5000);

        String WelcomeNote = welcomeScreens.treatWelcomeNote();
        Assert.assertEquals(WelcomeNote, "Your health and wellness travel champion —from inspiration to planning to integrated care, online and en-route. Start your journey.");
        System.out.println(WelcomeNote);

        welcomeScreens.getStartedButton();

        SwipeScreen Swipe = new SwipeScreen(driver);
        System.out.println("Swipe");
        Swipe.swipingLocation(3,0,4,4);
        Swipe.swipingLocation(3,0,4,4);
        Swipe.swipingLocation(0,3,4,4);
        Swipe.swipingLocation(0,3,4,4);

        //Clicking on Back Icon//
        welcomeScreens.navigateForward();
        welcomeScreens.navigateForward();

        Thread.sleep(2000);
        GetScreenShots.getScreenShot("On Board Screen 1", driver);

        welcomeScreens.navigateBack();
        welcomeScreens.navigateBack();
        welcomeScreens.navigateBack();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("On Board Screen 2", driver);

        Thread.sleep(1000);
        driver.quit();
    }

}
