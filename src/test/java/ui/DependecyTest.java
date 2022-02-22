package ui;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class DependecyTest{
	
	@Test
	public void userRegistration() {
		System.out.println("This is userRegistration test");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods="userRegistration", alwaysRun=true)
	public void userSearch() {
		System.out.println("This is userSearch Test");
	}

	@Test
	public void test3() {
		System.out.println("This is test3");
	}
	
	@Test
	public void test4() {
		System.out.println("This is test4");
	}

}
