package com.tka;
import org.openqa.selenium.*;
import java.util.List;
import org.openqa.selenium.*;
import java.util.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {

	public static void main(String[] args) throws InterruptedException {

		//1. Envoke the browser
		WebDriver driver =new ChromeDriver();
		
		//2. Maximize the window
		driver.manage().window().maximize();
		
		//3. pass the URL.
		driver.get("https://www.flipkart.com/");
		
		//4. find elements on browser using findElements.
		List <WebElement> element=driver.findElements(By.xpath("//div[@class='_1ZMrY_']//a"));
		
		//5. Print the webelements on console.
		for(WebElement ele:element)
		{
			System.out.println(ele.getText());
			if(ele.getText().equals("Myntra")) {
				ele.click();
			}
		}
		
		
		
		
		Thread.sleep(3000);
		driver.close();
	}

	
}
///html/body/div[1]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[3]
		//*[@id="container"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[3]