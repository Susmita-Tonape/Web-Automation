package com.tka;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertWindow {

	public static void main(String[] args){

		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		/*System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.linkText("Alert with OK ")).click();*/
		System.out.println(driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).isDisplayed());
		/*driver.switchTo().alert().accept();
		
		Thread.sleep(500);
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		//actions.sendKeys();
		//driver.close();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("susmittonape");
		System.out.println(al.getText());		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		String message=driver.findElement(By.id("demo1")).getText();
		System.out.println(message);*/

		
		

	}
	}


