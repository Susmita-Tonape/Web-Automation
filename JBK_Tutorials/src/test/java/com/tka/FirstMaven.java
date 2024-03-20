package com.tka;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstMaven {
	@Test
	void testCase1() {
	WebDriver driver= new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");
	
	}
}
