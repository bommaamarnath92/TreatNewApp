package PAGES;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.security.PublicKey;

public class CreateAccountPage
{
    public CreateAccountPage(AndroidDriver<AndroidElement> driver)
    {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Sign In']")
    public WebElement SignInBtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/btn_create_account")
    public WebElement CreateAccLink;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Email Address*']")
    public WebElement EmailId;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Password*']")
    public WebElement Password;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/text_input_end_icon")
    public WebElement HideTextIcon;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/text_input_end_icon")
    public WebElement UnHideTextIcon;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/btn_continue")
    public WebElement ContinueBtn;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/edit_first_name")
    public WebElement FirstName;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/edit_last_name")
    public WebElement LastName;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/edit_date")
    public WebElement SelectDate;

    @AndroidFindBy(id = "android:id/button1")
    public WebElement SelectOk;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@text='Gender Identity*']")
    public WebElement SelectGender;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/edit_phone")
    public WebElement PhoneNumber;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Address Line 1*']")
    public WebElement AddressLine1;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Address Line 2 (Optional)']")
    public WebElement AddressLine2;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='City*']")
    public WebElement City;

    @AndroidFindBy(xpath = "//android.widget.Spinner[@text='Select State*']")
    public WebElement SelectState;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/edit_zip")
    public WebElement EnterZipCode;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/iv_terms_of_service")
    public WebElement TermsOfService;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/iv_eula")
    public WebElement EndUserAgree;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/iv_privacy_policy")
    public WebElement PrivacyPolicy;

    @AndroidFindBy(id = "com.xpresspa.treatmobile.dev:id/btn_done")
    public WebElement Continuebtn2;

    public void SignInButton()
    {
        SignInBtn.click();
    }
    public void CreateAccountLink()
    {
        CreateAccLink.click();
    }
    public void EmailIdField(String EmailIdField)
    {
        EmailId.sendKeys(EmailIdField);
    }
    public void PasswordField(String PasswordField)
    {
        Password.sendKeys(PasswordField);
    }
    public void HidePassword()
    {
        HideTextIcon.click();
    }
    public void UnHidePassword()
    {
        UnHideTextIcon.click();
    }
    public void ContinueButton()
    {
        ContinueBtn.click();
    }
    public void FirstNameField(String FirstNameField)
    {
        FirstName.sendKeys(FirstNameField);
    }
    public void LastNameField(String LastNameField)
    {
        LastName.sendKeys(LastNameField);
    }
    public void SelectCalendar()
    {
        SelectDate.click();
    }
    public void SelectDate()
    {
        SelectOk.click();
    }
    public void GenderField(String GenderField)
    {
        SelectGender.sendKeys(GenderField);
    }
    public void PhoneNumberField(String PhoneNumberField)
    {
        PhoneNumber.sendKeys(PhoneNumberField);
    }
    public void AddressLine1Field(String AddressLine1Field)
    {
        AddressLine1.sendKeys(AddressLine1Field);
    }
    public void AddressLine2Field(String AddressLine2Field)
    {
        AddressLine2.sendKeys(AddressLine2Field);
    }
    public void CityField(String CityField)
    {
        City.sendKeys(CityField);
    }
    public void SelectStateField(String SelectStateField)
    {
        SelectState.sendKeys(SelectStateField);
    }
    public void EnterZipCodeField(String EnterZipCodeField)
    {
        EnterZipCode.sendKeys(EnterZipCodeField);
    }
    public void TermsOfServiceCheck()
    {
        TermsOfService.click();
    }
    public void EndUserAgreementCheck()
    {
        EndUserAgree.click();
    }
    public void PrivacyPolicyCheck()
    {
        PrivacyPolicy.click();
    }
    public void ContinueButtonCA()
    {
        Continuebtn2.click();
    }

}
