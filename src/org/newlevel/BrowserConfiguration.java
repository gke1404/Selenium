package org.newlevel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfiguration {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		System.out.println("title :"+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("URL :"+currentUrl);
		
		driver.close();
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.flipkart.com/");
		
		String title2 = driver1.getTitle();
		System.out.println("Title 2 :"+title2);
		
		String currentUrl2 = driver1.getCurrentUrl();
		System.out.println("Url 2 :"+currentUrl2);
		
		driver1.quit();
		
	}

}
