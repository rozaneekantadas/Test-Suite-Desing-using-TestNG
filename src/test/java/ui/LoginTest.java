package ui;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	@BeforeTest
    public void loginToApplication(){
        System.out.println("Login to application");
    }
    
    @AfterTest
    public void logoutFromApplication(){
        System.out.println("Logout from application");
    }
    
    @BeforeMethod
    public void connectDb(){
        System.out.println("DB connection successful");
    }
    
    @AfterMethod
    public void disconnectDb(){
        System.out.println("Dissconnected");
    }
    
    @Test(priority=1, description="This is for Login Test")
    public void bloginTest(){
        System.out.println("Login is successful");
    }
    
    @Test(priority=2, description="This is for Logout Test")
    public void alogoutTest(){
        System.out.println("Logout is successful");
    }
    
    @Test(description="This is for signup Test")
    public void csignupTest(){
        System.out.println("Signup is successful");
    }

}
