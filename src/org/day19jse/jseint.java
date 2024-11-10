package org.day19jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jseint {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@id=\"email\"]"));
		WebElement txtpass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		WebElement btnCli = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		
//		txtUser.sendKeys("smart"); // its normal step
		
//		whenever sendkey() & click() its working we can use JavaScriptExecutor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].setAttribute('value', 'skills')", txtUser);
		js.executeScript("arguments[0].setAttribute('value', 'habig')", txtpass);
		
//		btnCli.click();// its normal step
		js.executeScript("arguments[0].click()", btnCli);
		
		Object executeScript = js.executeScript("return arguments[0].getAttribute('value')", txtUser);
		System.out.println(executeScript);
	
	}

}
