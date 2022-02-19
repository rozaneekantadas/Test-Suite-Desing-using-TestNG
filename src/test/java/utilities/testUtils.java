package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import common.BaseTest;

public class testUtils extends BaseTest{

	public void getScreenshot() throws IOException {

		Date currentdate = new Date();
		String ssFileName = currentdate.toString().replace(" ", "-").replace(":", "-");
		File screenshots = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshots, new File(".//screenshot/" + ssFileName + ".png"));
	}

}
