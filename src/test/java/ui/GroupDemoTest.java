package ui;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupDemoTest {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Run this before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Run this after class");
	}
	
	@Test(priority=1, groups="regression")
    public void bloginTest(){
        System.out.println("Login is successful");
    }
    
    @Test(priority=2, groups="regression")
    public void alogoutTest(){
        System.out.println("Logout is successful");
    }
    
    @Test(groups="regression")
    public void csignupTest(){
        System.out.println("Signup is successful");
    }
    
    @Test(groups= {"regression", "bvt"})
    public void bTest1(){
        System.out.println("Test1");
    }
    
    @Test(groups="bvt")
    public void bTest2(){
        System.out.println("Test2");
    }

}
