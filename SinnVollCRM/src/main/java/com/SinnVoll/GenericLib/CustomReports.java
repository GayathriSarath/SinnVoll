package com.SinnVoll.GenericLib;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class CustomReports
{
public static void main(String[] args)
{
ExtentSparkReporter spark=new ExtentSparkReporter("./customReports/myReport.html");
spark.config().setTheme(Theme.DARK);
spark.config().setDocumentTitle("SinnVoll Reports");
spark.config().setReportName("Extent Reports");
ExtentReports extent = new ExtentReports();
extent.attachReporter(spark);
ExtentTest test= extent.createTest("Verify Customer");
test.info(MarkupHelper.createLabel("customer is displayed", ExtentColor.BLUE));
test.pass(MarkupHelper.createLabel("Method is passed",ExtentColor.GREEN ));
test.fail(MarkupHelper.createLabel("failed", ExtentColor.RED));
extent.flush();
System.out.println("Done");
}
}
