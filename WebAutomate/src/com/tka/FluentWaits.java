package com.tka;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
public class FluentWaits {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
		FluentWait<WebDriver>  wait=  new FluentWait<WebDriver> (driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(NoSuchElementException.class);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("populate-text"))).click();
		
		
		
	}

}
