package org.day22windhand;

import java.util.Set;

import org.bouncycastle.math.ec.WNafPreCompInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindHand {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement sndkey = driver.findElement(By.xpath("(//input[@name=\"keyword\"])[1]"));
		
		sndkey.sendKeys("Headphones");
		
		driver.findElement(By.xpath("//span[text()='Search']")).click();

		driver.findElement(By.xpath("(//img[@class=\"product-image \"])[1]")).click();
		
		String winHan = driver.getWindowHandle();
		System.out.println("\nParent window id: "+winHan);
		
		Set<String> allWinId = driver.getWindowHandles();
		System.out.println("\nParent & Child windos id: "+allWinId);
		
//		Method 1
//		Looping Method to switch child windows
		for (String eachid  : allWinId ) {
			if (!eachid.equals(winHan)) {
				driver.switchTo().window(eachid);
			}

		}
		
		driver.findElement(By.xpath("//span[text()='add to cart']")).click();
	}

}
