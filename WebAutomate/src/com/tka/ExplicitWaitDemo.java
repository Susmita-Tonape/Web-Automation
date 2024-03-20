package com.tka;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
        // Create WebDriverWait instance with a wait time of 10 seconds

		//WebDriverWait wait=new WebDriverWait(driver,5);
        // Wait for the element with ID "myElement" to be clickable

		//wait.until(ExpectedConditions.elementToBeClickable(By.id("alert"))).click();
		
		WebDriverWait wait2= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("populate-text"))).click();
	}

}
