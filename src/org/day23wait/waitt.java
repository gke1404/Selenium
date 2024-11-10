package org.day23wait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitt {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		Method 2 We can use only one time first step itself
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
//		Method 1
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[@class=\"_58mt\"])[3]")).click();
		
//		Method 3
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert a = driver.switchTo().alert();
		a.dismiss();
			
//		Method 4
		FluentWait<WebDriver> f = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(2000))
				.pollingEvery(Duration.ofSeconds(200)).ignoring(Exception.class);
		
		
	}
}
