package com.tka;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.navigate().refresh();
		WebElement ele= driver.findElement(By.name("fullName"));
		ele.click();
		ele.sendKeys("sush");
		Actions ac=new Actions(driver);
		ac.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();

		ac.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		ac.sendKeys(Keys.TAB).perform();
		//	
		ac.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		//	



	}

}
