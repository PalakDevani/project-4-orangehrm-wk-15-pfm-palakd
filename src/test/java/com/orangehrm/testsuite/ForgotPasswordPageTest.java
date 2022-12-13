package com.orangehrm.testsuite;


import com.orangehrm.customlisteners.CustomListeners;
import com.orangehrm.pages.ForgotPasswordPage;
import com.orangehrm.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)

public class ForgotPasswordPageTest extends BaseTest {
    ForgotPasswordPage forgotPasswordPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        forgotPasswordPage = new ForgotPasswordPage();
    }

    @Test(groups = {"sanity", "regression"})
    public void userShouldNavigateToForgotPasswordPageSuccessfully() {
        forgotPasswordPage.clickOnElement(By.xpath("//div[@class='orangehrm-login-forgot']/p"));
        Assert.assertEquals(forgotPasswordPage.getResetPasswordText(), "Reset Password", "Reset Password Text not available");

    }
}
