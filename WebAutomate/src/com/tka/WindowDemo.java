package com.tka;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowDemo {

	public static void main(String[] args) throws InterruptedException {
		//1. Invoke the browser.
		WebDriver driver =new ChromeDriver();
		
		//2. Pass the URL  to browser
		driver.get("https://www.flipkart.com/");
		
		//3. Maximize the webpage.
		driver.manage().window().maximize();
		
		//4. Locate the web element
		driver.findElement(By.linkText("Flipkart Wholesale")).click();
		
		Thread.sleep(2000);
		//5. 
		Set <String> win=driver.getWindowHandles();
		System.out.println(win);
		Iterator <String> it=win.iterator();
		String parentWindow=it.next();
		System.out.println(parentWindow);
		String childWindow= it.next();
		System.out.println(childWindow);
		driver.switchTo().window(parentWindow);
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		Thread.sleep(3000);
		
		driver.switchTo().window(childWindow);

		
	}

}
