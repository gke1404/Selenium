package org.day18action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsskey {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement findElement = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		
		Actions a = new Actions(driver);
		
//		build used for more than one method using
		a.keyDown(Keys.SHIFT).sendKeys("smart").keyUp(Keys.SHIFT).build().perform();
		
		a.doubleClick(findElement).perform();
		a.contextClick(findElement).perform();
	}

}
// keydown means shift is pressing
// keyup means shift is released