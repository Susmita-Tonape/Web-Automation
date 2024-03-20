package com.tka;
import java.util.List;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockTask {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://msrtc.maharashtra.gov.in/GeneralPages/HomeE.aspx");
		
		driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_ddlBusCategory\"]"));
		List<WebElement> list=driver.findElements(By.xpath("//select[@id='ContentPlaceHolder1_ddlBusCategory']/option"));
		Thread.sleep(3000);
		for(WebElement ele:list) {
			System.out.println(ele.getText());
		}
	}

}
