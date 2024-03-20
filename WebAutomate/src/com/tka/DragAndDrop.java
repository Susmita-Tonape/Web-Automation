package com.tka;
import org.openqa.selenium.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(3000);

		WebElement from= driver.findElement(By.id("draggable"));
		WebElement to= driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		act.dragAndDrop(from,to).build().perform();

		
	}

}
