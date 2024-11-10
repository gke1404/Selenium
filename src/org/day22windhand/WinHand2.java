package org.day22windhand;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHand2 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.snapdeal.com/");
	
	WebElement sndkey = driver.findElement(By.xpath("(//input[@name=\"keyword\"])[1]"));
	
	sndkey.sendKeys("SmartPhones");
	
	driver.findElement(By.xpath("//span[text()='Search']")).click();

	driver.findElement(By.xpath("(//img[@class=\"product-image \"])[1]")).click();
	
	String winHan = driver.getWindowHandle();
	System.out.println("\nParent window id: "+winHan);
	
	Set<String> allWinId = driver.getWindowHandles();
	System.out.println("\nParent & Child windos id: "+allWinId);
	
//	Method 2 without Looping concept
//	Casting into List from Set
	List<String> li = new ArrayList<>();
	li.addAll(allWinId);

	driver.switchTo().window(li.get(1));
//	driver.switchTo().window(li.get(2));
	
	driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	
	driver.findElement(By.xpath("//a[text()='Proceed To Checkout']")).click();
	

}
}
