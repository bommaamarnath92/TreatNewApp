package baseclass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class TestBase
{
    public static AndroidDriver<AndroidElement> capabilities(String appName) throws IOException {

        // Add global properties folder and use the properties //
        Properties prop = new Properties();

        // Specify the file name and the path //
        File appDir = new File("src");
        File app = new File(appDir, "Treat.apk");

        // Add and set the Capabilities //
        DesiredCapabilities capabilities = new DesiredCapabilities();

        // Set device name for the virtual Android Emulator - BommaA //

        String device = (String) prop.get("device");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");

        // Set the capabilities for the real Android device //
//        capabilities.setCapability(MobileCapabilityType.UDID, "DI4HQSUGCQY9PBHE");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//        capabilities.setCapability(MobileCapabilityType.NO_RESET, "true");
//
//        // Download the APK Info app from the play store to see below capabilities //
//        capabilities.setCapability("appPackage", "com.xpresspa.treatmobile.dev");
//        capabilities.setCapability("appActivity", "com.xpresspa.treatmobile.ui.activities.splash.SplashActivity");

        // Set the app location path //
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/amarnathbomma/Documents/TreatNewApp/src/test/APPLICATIONS/Treat.apk");

        // Set the Automation name and the time out seconds //
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 14);

        // Set the server connection and port //
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        return driver;
    }

}
