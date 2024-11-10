package org.day20frames;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesclas {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement fram = driver.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]"));
		
//		this is also one method using locator id
//		driver.switchTo().frame("a077aa5e");
		
//		this is also one method to call web element
		driver.switchTo().frame(fram);
		
		driver.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();
		
	
	}

}
