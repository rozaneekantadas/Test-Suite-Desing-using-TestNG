package ui;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerate {
	
	@Test
	public void extentTest() {
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("report/index.html");
		spark.config().setTheme(Theme.DARK);
		spark.config().setDocumentTitle("MyReport");
		extent.attachReporter(spark);
		
		ExtentTest test = extent.createTest("Login Tests").assignAuthor("Rozanee").assignCategory("Smoke").assignCategory("Regression").assignDevice("Chrome 96");
		test.pass("Login Test Start Successfully");
		test.info("URL is loaded");
		test.info("Values Entered");
		test.pass("Login Test Completed Successfully");
		
		ExtentTest test1 = extent.createTest("HomePage Test").assignAuthor("Supto").assignCategory("Regression").assignDevice("Firefox 60");
		test1.pass("Homepage Test Start Successfully");
		test1.info("URL is loaded");
		test1.info("Values Entered");
		test1.fail("Homepage Test failed");
		
		extent.flush();
		
	}
	

}
