package ui;

import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="credential", dataProviderClass=DataProviderDemoTest2.class)
	public void loginTest1(String username, String password, String test) {
		
		System.out.println(username+"======"+password+"======"+test);
	
	}
	
	@Test(dataProvider="credential", dataProviderClass=DataProviderDemoTest2.class)
	public void loginTest(String username, String password) {
		
		System.out.println(username+"======"+password);
	}

}
