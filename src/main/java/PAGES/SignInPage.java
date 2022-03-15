package PAGES;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPage
{
    public SignInPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email Address']")
    public WebElement EnterEmail;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password']")
    public WebElement EnterPassword;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/btn_login")
    public WebElement LoginBtn;

    public void AddEmailId(String AddEmailId)
    {
        EnterEmail.sendKeys(AddEmailId);
    }
    public void AddPassword(String AddPassword)
    {
        EnterPassword.sendKeys(AddPassword);
    }
    public void LoginInButton() throws InterruptedException
    {
        LoginBtn.click();
    }


}
