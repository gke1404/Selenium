package org.day16locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='email']"));
		
		txtUser.sendKeys("Smart");
		
		Thread.sleep(2000);
		
		WebElement txtpass = driver.findElement(By.xpath("//input[@name=\"pass\"]"));
		
		txtpass.sendKeys("1234567890");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();;
		
		
	}

}
