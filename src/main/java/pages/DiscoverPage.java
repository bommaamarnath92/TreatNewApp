package pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DiscoverPage {
    public DiscoverPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Discover']")
    public WebElement DiscoverText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Travel']")
    public WebElement TravelText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Health']")
    public WebElement HealthText;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wellness']")
    public WebElement WellnessText;

    public String getDiscoverTitle()
    {
        return DiscoverText.getText();
    }
    public String getTravelTitle()
    {
        return TravelText.getText();
    }
    public String getHealthTitle()
    {
        return HealthText.getText();

    }
    public String getWellnessText()
    {
        return WellnessText.getText();
    }

}
