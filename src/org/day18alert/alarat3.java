package org.day18alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alarat3 {

	public static void main(String[] args) {
//		Simple Alert
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class =\"analystic\"])[3]")).click();
		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class =\"btn btn-info\"]")).click();
		
		Alert a = driver.switchTo().alert();
		
		a.sendKeys("Java Selenium");
		a.accept();
//		a.dismiss();

	}
}
