package org.day21select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selct {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement monthdrop = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(monthdrop);
		
		if (s.isMultiple()) {
			System.out.println("We can Select Multiple Option");
		} else {
			System.out.println("It's Single Seletion Option");
		}
		Thread.sleep(2000);
		
		s.selectByValue("1"); // based on the value in locator
		
		Thread.sleep(2000);
		s.selectByIndex(6); // index position
		
		Thread.sleep(2000);
		s.selectByVisibleText("Dec"); // string in locator value
		
		s.deselectByVisibleText("Dec");
		// we can't De-select the selected value in single selection
			
		
	}

}
