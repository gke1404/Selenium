package org.day16locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locat {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		To find the locators -- find Elements 
		
		WebElement txtUser = driver.findElement(By.id("email"));
		
		txtUser.sendKeys("smart");
		
		//waiting for 2sec using sleep method
		Thread.sleep(2000);
		
		WebElement txtPass = driver.findElement(By.name("pass"));
		
		txtPass.sendKeys("12345");
		
		Thread.sleep(2000);
		
		WebElement btlog = driver.findElement(By.name("login"));
		
		btlog.click();
	}

}
