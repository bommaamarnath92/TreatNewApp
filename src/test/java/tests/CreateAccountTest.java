package tests;

import baseclass.TestBase;
import pages.CreateAccountPage;
import utilities.GetScreenShots;
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

        CreateProfile.signInButton();
        CreateProfile.createAccountLink();
        CreateProfile.emailIdField("amarnath.bomma@mutualmobile.com");
        CreateProfile.passwordField("Bomma@123");
        CreateProfile.hidePassword();
        CreateProfile.unHidePassword();

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Create Account 1", driver);

        CreateProfile.continueButton();

        CreateProfile.firstNameField("Amarnath");
        CreateProfile.lastNameField("Bomma");

        CreateProfile.selectCalendar();
        CreateProfile.selectDate();

        CreateProfile.genderField("Male");
        CreateProfile.phoneNumberField("2025550142");

        CreateProfile.addressLine1Field("1231 Lake Rd, Austin");
        CreateProfile.addressLine2Field("Austin, USA");
        CreateProfile.cityField("Austin");
        CreateProfile.selectStateField("Texas");

        Thread.sleep(1000);
        GetScreenShots.getScreenShot("Create Account 2", driver);

        //CreateProfile.enterZipCodeField("50009");

        //CreateProfile.termsOfServiceCheck();
        //CreateProfile.endUserAgreementCheck();
        //CreateProfile.privacyPolicyCheck();
        //CreateProfile.continueButtonCA();

        Thread.sleep(1000);
        driver.quit();
    }
}
