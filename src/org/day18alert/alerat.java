package org.day18alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerat {

	public static void main(String[] args) throws InterruptedException {
		
//		Simple Alert
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class =\"analystic\"])[1]")).click();
		
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class =\"btn btn-danger\"]")).click();
		
//		Alert function accepting using accept()
		Alert a = driver.switchTo().alert();
		
		a.accept();
	}
}
