package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

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

    public void signInButton()
    {
        SignInBtn.click();
    }
    public void createAccountLink()
    {
        CreateAccLink.click();
    }
    public void emailIdField(String EmailIdField)
    {
        EmailId.sendKeys(EmailIdField);
    }
    public void passwordField(String PasswordField)
    {
        Password.sendKeys(PasswordField);
    }
    public void hidePassword()
    {
        HideTextIcon.click();
    }
    public void unHidePassword()
    {
        UnHideTextIcon.click();
    }
    public void continueButton()
    {
        ContinueBtn.click();
    }
    public void firstNameField(String FirstNameField)
    {
        FirstName.sendKeys(FirstNameField);
    }
    public void lastNameField(String LastNameField)
    {
        LastName.sendKeys(LastNameField);
    }
    public void selectCalendar()
    {
        SelectDate.click();
    }
    public void selectDate()
    {
        SelectOk.click();
    }
    public void genderField(String GenderField)
    {
        SelectGender.sendKeys(GenderField);
    }
    public void phoneNumberField(String PhoneNumberField)
    {
        PhoneNumber.sendKeys(PhoneNumberField);
    }
    public void addressLine1Field(String AddressLine1Field)
    {
        AddressLine1.sendKeys(AddressLine1Field);
    }
    public void addressLine2Field(String AddressLine2Field)
    {
        AddressLine2.sendKeys(AddressLine2Field);
    }
    public void cityField(String CityField)
    {
        City.sendKeys(CityField);
    }
    public void selectStateField(String SelectStateField)
    {
        SelectState.sendKeys(SelectStateField);
    }
    public void enterZipCodeField(String EnterZipCodeField)
    {
        EnterZipCode.sendKeys(EnterZipCodeField);
    }
    public void termsOfServiceCheck()
    {
        TermsOfService.click();
    }
    public void endUserAgreementCheck()
    {
        EndUserAgree.click();
    }
    public void privacyPolicyCheck()
    {
        PrivacyPolicy.click();
    }
    public void continueButtonCA()
    {
        Continuebtn2.click();
    }

}
