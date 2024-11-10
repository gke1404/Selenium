package org.day19robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robotclas {
		
		public static void main(String[] args) throws AWTException {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			WebElement findElement = driver.findElement(By.xpath("//input[@id=\"email\"]"));
			
			Actions a = new Actions(driver);
			
			a.keyDown(Keys.SHIFT).sendKeys("smart").keyUp(Keys.SHIFT).build().perform();
			
			a.doubleClick(findElement).perform();
			a.contextClick(findElement).perform();
			
//			Robot class need to create obj like actions
			Robot r = new Robot();
			
			for (int i = 0; i <= 2; i++) {
				r.keyPress(KeyEvent.VK_DOWN);
				r.keyRelease(KeyEvent.VK_DOWN);	
			}
			
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}

}
