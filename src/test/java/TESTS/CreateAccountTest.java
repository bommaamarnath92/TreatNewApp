package TESTS;

import BASECLASS.TestBase;
import PAGES.CreateAccountPage;
import UTILITIES.GetScreenShots;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CreateAccountTest extends TestBase {

    @Test
    public void CreateUserAccount() throws Exception
    {
        AndroidDriver<AndroidElement> driver = capabilities("TreatExp");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        CreateAccountPage CreateProfile = new CreateAccountPage(driver);
        Thread.sleep(5000);

        CreateProfile.SignInButton();
        CreateProfile.CreateAccountLink();
        CreateProfile.EmailIdField("amarnath.bomma@mutualmobile.com");
        CreateProfile.PasswordField("Bomma@123");
        CreateProfile.HidePassword();
        CreateProfile.UnHidePassword();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Create Account 1", driver);

        CreateProfile.ContinueButton();

        CreateProfile.FirstNameField("Amarnath");
        CreateProfile.LastNameField("Bomma");

        CreateProfile.SelectCalendar();
        CreateProfile.SelectDate();

        CreateProfile.GenderField("Male");
        CreateProfile.PhoneNumberField("2025550142");

        CreateProfile.AddressLine1Field("1231 Lake Rd, Austin");
        CreateProfile.AddressLine2Field("Austin, USA");
        CreateProfile.CityField("Austin");
        CreateProfile.SelectStateField("Texas");

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Create Account 2", driver);

        //CreateProfile.EnterZipCodeField("50009");

        //CreateProfile.TermsOfServiceCheck();
        //CreateProfile.EndUserAgreementCheck();
        //CreateProfile.PrivacyPolicyCheck();
        //CreateProfile.ContinueButtonCA();

        Thread.sleep(1000);
        driver.quit();
    }
}
