package com.tka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class WaitDemo {

	public static void main(String[] args) {
    
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);

		WebElement ele=driver.findElement(By.id("btn1"));
		ele.click();
		ele.sendKeys("sush");
		
		
		
		
		
		
	}

}
