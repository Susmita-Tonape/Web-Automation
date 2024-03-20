package com.tka;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicSearch {

	

		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			driver.findElement(By.xpath("//textarea[contains(@title,'Search')]")).sendKeys("testing");
			Thread.sleep(3000);
			
		//WebDriverWait wait= new WebDriverWait(driver,10);
			//List<WebElement> list=	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@jsname=\\'bw4e9b\\']/li")));
			List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname=\'bw4e9b\']/li"));
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(WebElement ele:list) {
				System.out.println(ele.getText());
				if(ele.getText().trim().equals("testing interview questions")){
					Thread.sleep(3000);
					ele.click();
					break;
				}
				
			}
			

		}

	}


