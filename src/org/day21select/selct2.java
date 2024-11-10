package org.day21select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selct2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(2000);
		
		WebElement monthdrop = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s = new Select(monthdrop);
		
		if (s.isMultiple()) {
			System.out.println("Yes Multiple Selection");
		} else {
			System.out.println("Single Seletion");
		}
		List<WebElement> alloptions = s.getOptions();
		
		int size = alloptions.size();
		System.out.println("\nSize: "+size);
		
//		index values string Output
		WebElement singleIndexValue = alloptions.get(0);
		System.out.println(singleIndexValue.getText());
		
		System.out.println("\nList in Single Seletion Values:");
		for (int i = 0; i < alloptions.size(); i++) {
			
			WebElement opti = alloptions.get(i);

			System.out.println(opti.getText());
		}
			
		
		
	}

}
