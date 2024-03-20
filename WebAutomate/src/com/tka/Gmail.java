package com.tka;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		String expTitle="Gmail";

		WebDriver driver=new ChromeDriver();
		//1. Open the url on browser.
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		System.out.println(1);
		
		//2. Get the title of current page
		String actTitle= driver.getTitle();
		System.out.println("Title Of page >>" + actTitle);
		
		//3. Get the title of current page.
		String currentUrl= driver.getCurrentUrl();
		System.out.println("Current URL is>> "+currentUrl);
		
		
	}

}
