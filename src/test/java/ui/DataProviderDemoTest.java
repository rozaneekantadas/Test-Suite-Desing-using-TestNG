package ui;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemoTest {
	
	//method 2
	@Test(dataProvider="credential")
	public void loginTest1(String username, String password, String test) {
		
		System.out.println(username+"======"+password+"======"+test);
	
	}
	
	@DataProvider(name="credential")
	public Object[][] dataSet1() {
		
		return new Object[][] 
			{
			{"username", "password", "test1"},
			{"user1", "pass1", "test1"}
			};
	}

	// method 1
	@Test(dataProvider="dataSet")
	public void loginTest(String username, String password) {
		
		System.out.println(username+"======"+password);
	
	}
	
	@DataProvider
	public Object[][] dataSet() {
		
		Object[][] dataset = new Object[4][2];
		
		//first row
		dataset[0][0] = "user1";
		dataset[0][1] = "pass1";
		
		//second row
		dataset[1][0] = "user2";
		dataset[1][1] = "pass2";
				
		//third row
		dataset[2][0] = "user3";
		dataset[2][1] = "pass3";
		
		//fourth row
		dataset[3][0] = "user4";
		dataset[3][1] = "pass4";
		
		return dataset;
	}
}
