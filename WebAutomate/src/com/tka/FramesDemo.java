package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		//WebElement ele=driver.findElement(By.id("singleframe"));
		//driver.switchTo().frame(ele);
		//driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Susmita");
		
//	  driver.findElement(By.linkText("Iframe with in an Iframe")).click();
//	  WebElement ele1=driver.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
//	  driver.switchTo().frame(ele1);
//	  WebElement ele2=driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
//	  driver.switchTo().frame(ele2);
//	driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Susmita");
//	
//	

  driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		  driver.switchTo().frame(0);
		  driver.switchTo().frame(1);
driver.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Susmita");

	  
	  

	}

}
