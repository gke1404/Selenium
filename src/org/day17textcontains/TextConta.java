package org.day17textcontains;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextConta {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		Getting text from web elements using getText()
		WebElement txtuser = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
		
		String text = txtuser.getText();
		System.out.println(text);
//		Getting text from web elements using Contains()
		WebElement txtuser1 = driver.findElement(By.xpath("//h2[contains(text(),'life')]"));
		
		System.out.println("=======");
		System.out.println(txtuser1.getText());

		WebElement txtus = driver.findElement(By.id("email"));
		txtus.sendKeys("Smart");
		
//		getting attribute value or type using getAttribute()
		String attribute = txtus.getAttribute("value");
		System.out.println(attribute);
		
		String attribute1 = txtus.getAttribute("type");
		System.out.println(attribute1);
	}

}
