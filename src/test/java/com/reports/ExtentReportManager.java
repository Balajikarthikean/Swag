package com.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    static ExtentReports extent;
    static ExtentTest test;

    public static void startTest(String testName) {
        ExtentSparkReporter reporter = new ExtentSparkReporter("Report/SwagLabsReport.html");
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        test = extent.createTest(testName);
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void flushReport() {
        extent.flush();
    }
}