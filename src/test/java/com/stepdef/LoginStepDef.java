package com.stepdef;

import org.openqa.selenium.WebDriver;
import com.baseclass.BaseClass;
import com.pages.LoginPage;
import com.reports.ExtentReportManager;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStepDef {
    WebDriver driver = BaseClass.driver;
    LoginPage login;
    ExtentTest test;

    @Given("User launches the browser and navigates to SwagLabs")
    public void user_launches_browser() {
        BaseClass.launchBrowser();
        driver = BaseClass.driver;
        driver.get("https://www.saucedemo.com/");
        login = new LoginPage(driver);
        test = ExtentReportManager.getTest();
        test.info("Navigated to SwagLabs");
    }

    @Then("User enters username and password")
    public void user_enters_username_password() {
        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");
        login.clickLogin();
        test.pass("Logged in successfully");
    }
}