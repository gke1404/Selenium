package org.day17dubug;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Debugg {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"radio\"])[3]")).click();
	}

}
