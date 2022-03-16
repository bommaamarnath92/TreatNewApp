package utilities;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.time.Duration;


import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;
import org.testng.IReporter;

public class SwipeScreen implements IReporter {

    public  TouchAction action;
    public  Dimension size;

    public SwipeScreen(AndroidDriver<AndroidElement> driver) {
        action = new TouchAction(driver);
        size = driver.manage().window().getSize();
    }

    public void swipingLocation(int xStart, int xEnd, int yStart, int yEnd)
    {
        int width = size.getWidth();
        int height = size.getHeight();

        int startXCoordinate = (width/4)*(xStart); // 3 touch points on the x axis (width)
        int startYCoordinate = (height/7)*(yStart); // 6 touch points on the y axis (height)
        int endXCoordinate = (width/4)*(xEnd);
        int endYCoordinate = (height/7)*(yEnd);

        action.longPress(longPressOptions().withPosition(PointOption.point(startXCoordinate, startYCoordinate))
                .withDuration(Duration.ofMillis(500))).moveTo(PointOption.point(endXCoordinate, endYCoordinate)).release().perform();
    }
}