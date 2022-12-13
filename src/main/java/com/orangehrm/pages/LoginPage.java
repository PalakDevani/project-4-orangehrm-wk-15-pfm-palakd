package com.orangehrm.pages;


import com.aventstack.extentreports.Status;
import com.orangehrm.customlisteners.CustomListeners;
import com.orangehrm.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {


    @CacheLookup
    @FindBy(name = "username")
    WebElement usernameField;

    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='oxd-topbar-header-breadcrumb']/h6")
    WebElement displayText;

    public void enterUsername(String username) {
        Reporter.log("Enter Username" + usernameField);
        sendTextToElement(usernameField, username);
        CustomListeners.test.log(Status.PASS, "Enter Username");
    }

    public void enterPassword(String password) {
        Reporter.log("Enter Password" + passwordField.toString());
        sendTextToElement(passwordField, password);
        CustomListeners.test.log(Status.PASS, "Enter password");
    }

    public void clickOnLoginButton() {
        Reporter.log("Click On Login Button" + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS, "Click On Login Button");
    }

    public String getDisplayText() {
        Reporter.log("Get Display Text" + displayText.toString());
        CustomListeners.test.log(Status.PASS, "Get Display Text");
        return getTextFromElement(displayText);

    }

}
