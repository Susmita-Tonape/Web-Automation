package com.tka;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class OfflineUrl {
	public static void main(String[] args) {
		String expTitle="JavaByKiran | Log in";
		//1. Open browser chrome.
		WebDriver driver= new ChromeDriver();
		//2. Enter  url as file:///C:/selenium%20files/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html
		driver.get("file:///C:/selenium%20files/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/index.html");
		
		//3. Get the title of current page
		String actTitle= driver.getTitle();
		System.out.println("Actual title of current page: "+actTitle);
		
		//4. get URL of current page
		String url= driver.getCurrentUrl();
		System.out.println("url of current page is : "+url);
		
		if(expTitle.equals(actTitle)) {
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is failed");
		}
		
		
		
		
	}

}
