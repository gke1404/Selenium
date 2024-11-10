package org.day21screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotcls {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		taking screenshot only 4 step
//		1
		TakesScreenshot ts = (TakesScreenshot) driver;
//		2
		File src = ts.getScreenshotAs(OutputType.FILE);
//		3
		File f = new File("C:\\Users\\gkr01\\eclipse-workspace\\SeleniumAutoTest\\ScreenShot\\fbpage.png");
//		4
		FileUtils.copyFile(src, f);
		
		
		
	}
}
