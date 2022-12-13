package com.orangehrm.pages;


import com.aventstack.extentreports.Status;
import com.orangehrm.customlisteners.CustomListeners;
import com.orangehrm.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class ForgotPasswordPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='orangehrm-login-forgot']/p")
    WebElement forgotYourPasswordLink;

    @CacheLookup
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")
    WebElement resetPasswordText;

    public void clickOnForgotYourPasswordLink() {
        Reporter.log("Click On Forgot Password" + forgotYourPasswordLink.toString());
        clickOnElement(forgotYourPasswordLink);
        CustomListeners.test.log(Status.PASS, "Click On Forgot password Link");
    }

    public String getResetPasswordText() {
        Reporter.log("Verify Reset Password Text" + resetPasswordText.toString());
        CustomListeners.test.log(Status.PASS, "Verify Reset Password Text");
        return getTextFromElement(resetPasswordText);

    }
}
