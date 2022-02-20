package common;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import utilities.testUtils;

public class Listeners extends testUtils implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		Reporter.log("Method name is - "+result.getName());
		System.out.println("Listerners says : Test Case is starting");
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("Status of execution is "+result.getStatus());
		System.out.println("Listerners says : Success of test cases and its details are : " + result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Listerners says : Failure of test cases and its details are : " + result.getName());
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("org.uncommons.reportng.escape-output", "false");
		Reporter.log("<a href=\"C:\\Users\\Asus\\eclipse-workspace\\WebProtalTestProject\\screenshot\\Sat-Feb-19-22-49-39-BDT-2022.png\">Test Resutls</a>");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Listerners says : Skip of test cases and its details are : " + result.getName());
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Listerners says : Failure of test cases and its details are : " + result.getName());
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
	}
}
