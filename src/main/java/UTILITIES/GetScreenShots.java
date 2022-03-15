package UTILITIES;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.IReporter;

import java.io.File;

public class GetScreenShots implements IReporter
{
    public static void getScreenShot(String screenshotName, AndroidDriver driver) throws Exception
    {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File screenshot = ts.getScreenshotAs(OutputType.FILE);
        File srcfile = new File(String.valueOf(screenshot));
        FileUtils.moveFile(srcfile, new File("/Users/amarnathbomma/Documents/TreatNewApp/src/test/resources/SCREENSHOTS/" + screenshotName + ".png"));
        System.out.println("Screenshot Captured and Saved");
    }
}
