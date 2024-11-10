package org.day18action;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionss {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
//		actions class used to perform using perform()
		Actions a = new Actions(driver);
	
		WebElement mouseaction = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[1]"));
		
		a.moveToElement(mouseaction).perform();
		
		WebElement dragElement = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement dropElement = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		a.dragAndDrop(dragElement, dropElement).perform();
		
		WebElement dragElement2 = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[6]"));
		
		WebElement dropElement2 = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[2]"));
		
		a.dragAndDrop(dragElement2, dropElement2).perform();
		
	}

}
