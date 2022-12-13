package com.orangehrm.testsuite;


import com.orangehrm.customlisteners.CustomListeners;
import com.orangehrm.pages.LoginPage;
import com.orangehrm.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class LoginPageTest extends BaseTest {
    LoginPage loginpage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        loginpage = new LoginPage();
    }

    @Test(groups = {"sanity","regression"})
    public void userShouldLoginSuccessfullyWithValidCredential() {
        loginpage.enterUsername("Admin");
        loginpage.enterPassword("admin123");
        loginpage.clickOnLoginButton();
        Assert.assertEquals(loginpage.getDisplayText(), "Dashboard", "Dashboard text is not visible");

    }
}
