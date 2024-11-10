package org.day20scupscdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Scroll down from the web element(scrollUP) selecting to ending web element(scrollDown)

public class jseint {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.k2bindia.com/company/careers/");
		
		WebElement scrollDown = driver.findElement(By.xpath("(//input[@type=\"submit\"])[2]"));
		
		WebElement scrollUP = driver.findElement(By.xpath("//h2[@class=\"subtitle\"]"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("arguments[0].scrollIntoView(false)", scrollDown);
		
		
	}

}
