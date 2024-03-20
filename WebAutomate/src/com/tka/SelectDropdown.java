package com.tka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		ele.click();
		Select sc=new Select(ele);
		//sc.selectByIndex(2);
		sc.selectByVisibleText("Barbados");
		sc.selectByValue("DZA");
	}

}
