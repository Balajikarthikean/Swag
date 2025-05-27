package com.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import com.baseclass.BaseClass;
import com.reports.ExtentReportManager;

public class Hooks {

    @Before
    public void beforeScenario() {
        ExtentReportManager.startTest("SwagLabs Test");
    }

    @After
    public void afterScenario() {
        ExtentReportManager.flushReport();
        BaseClass.closeBrowser();
    }
}