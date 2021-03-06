package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ContinueAsGuestPage {
    public ContinueAsGuestPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/btn_guest_user")
    public WebElement ContinueAsGuestBtn;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Discover']")
    public WebElement DiscoverPage;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/discover")
    public WebElement DiscoveryBtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/bookings")
    public WebElement BookingsBtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/chat")
    public WebElement ChatBtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/health_wallet")
    public WebElement HealthWalletBtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/my_account")
    public WebElement MyAccountBtn;

    public void continueAsGuestButton()
    {
        ContinueAsGuestBtn.click();
    }
    public String discoverTitle()
    {
        return DiscoverPage.getText();
    }
    public void discoveryButton()
    {
        DiscoveryBtn.click();
    }
    public void bookingsButton()
    {
        BookingsBtn.click();
    }
    public void chatButton()
    {
        ChatBtn.click();
    }
    public void healthWalletButton()
    {
        HealthWalletBtn.click();
    }
    public void myAccountButton()
    {
        MyAccountBtn.click();
    }

}













