package ui;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipDemoTest {
	
	Boolean datasetup = false;
	
	@Test(enabled=false)
	public void skip1() {
		System.out.println("Skipping this test as it is not completed");
	}
	
	@Test
	public void skip2() {
		System.out.println("Skipping this test forefully");
		throw new SkipException("Skipping this test");
	}
	
	@Test
	public void skip3() {
		System.out.println("Skipping this test based on condition");
		if(datasetup == true) {
			System.out.println("Execute the test");
		}
		else {
			System.out.println("Do not execute further steps");
			throw new SkipException("Don not execute further steps");
		}
	}
}
