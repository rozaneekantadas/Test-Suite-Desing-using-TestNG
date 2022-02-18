package ui;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VeriftyTitleTest {
	
    @Test
    public void titleTest(){
        
        String expectedTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        
        String actualTitle = driver.getTitle();
        
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
