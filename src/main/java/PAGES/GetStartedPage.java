package PAGES;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class GetStartedPage
{
    public GetStartedPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Your health and wellness travel champion —from inspiration to planning to integrated care, online and en-route. Start your journey.']")
    public WebElement TreatWelcomeInfo;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Get Started']")
    public WebElement getStartedbtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/bt_forward")
    public WebElement navigateUp;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/bt_back")
    public WebElement navigateDown;


    public String TreatWelcomeNote()
    {
        return TreatWelcomeInfo.getText();
    }
    public void GetStartedButton()
    {
        getStartedbtn.click();
    }
    public void NavigateForward()
    {
        navigateUp.click();
    }
    public void NavigateBack()
    {
        navigateDown.click();
    }
}
