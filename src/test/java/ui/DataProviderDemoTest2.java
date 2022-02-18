package ui;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemoTest2 {

	@DataProvider(name = "credential")
	public Object[][] dataSet1(Method m) {

		Object[][] testData = null;

		if (m.getName().equals("loginTest1")) {
			testData = new Object[][] { 
				{ "username", "password", "test1"}, 
				{ "user1", "pass1", "test1" }
				};
		} 
		else if (m.getName().equals("loginTest")) {
			testData = new Object[][] {
				{"chrome", "standard_user", "secret_sauce"}
				};
		} 
		else {
			testData = new Object[][] {
				{ "suptoDas", "password123"},
				{ "rozanee", "pass1"}
				};
		}

		return testData;
	}
}
