package com.tka;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class WebdriverMethods {

	public static void main(String[] args) {
		//1. invoke the browser
		WebDriver driver= new ChromeDriver();
		
		//2. Opne url on selected browser.

		driver.get("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		
		//System.out.println(driver.getPageSource());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Login")).click();
		
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();

		
		//driver.close();
		driver.findElement(By.id("email")).sendKeys("8087148809");
		driver.findElement(By.name("pass")).sendKeys("aarohishirke");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.className("class=\"x193iq5w xeuugli x13faqbe x1vvkbs x1xmvt09 x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x xudqn12 x3x7a5m x6prxxf xvq8zen xk50ysn xzsf02u x1yc453h\"")).click();

		
		
		

	}

}
