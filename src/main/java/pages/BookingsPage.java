package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BookingsPage {
    public BookingsPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc='Bookings']")
    public WebElement BookingsScreen;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Treat Wellness Centers']")
    public WebElement BookingsScreenTitle;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Health Services']")
    public WebElement HealthServicesOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='JFK International Airport, Terminal 4, 3rd Floor Retail Hall']")
    public WebElement CenterHealthLocation;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Navigate up']")
    public WebElement NavigateBack;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wellness Services']")
    public WebElement WellnessServicesOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='3400 E Sky Harbor Blvd,, Terminal-4, Phoenix, AZ']")
    public WebElement CenterWellnessLocation;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc='Show dropdown menu']")
    public WebElement UpComingAppointments;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Health']")
    public WebElement HealthOption;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Wellness']")
    public WebElement WellnessOption;

    public void openBookingsTab()
    {
        BookingsScreen.click();
    }
    public String getBookingsPageTitle()
    {
        return BookingsScreenTitle.getText();
    }
    public void openHealthServices()
    {
        HealthServicesOption.click();
    }
    public void selectCenterLocationHealth()
    {
        CenterHealthLocation.click();
    }
    public void clickNavigateBack()
    {
        NavigateBack.click();
    }
    public void openWellnessServices()
    {
        WellnessServicesOption.click();
    }
    public void selectCenterLocationWellness()
    {
        CenterWellnessLocation.click();
    }
    public void checkUpComingAppointments()
    {
        UpComingAppointments.click();
    }
    public void openHealthLink()
    {
        HealthOption.click();
    }
    public void openWellnessLink()
    {
        WellnessOption.click();
    }

}
