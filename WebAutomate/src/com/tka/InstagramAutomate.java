package com.tka;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramAutomate {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("983");
		System.out.println(10);
		driver.findElement(By.name("password")).sendKeys("Sush");
		
		//driver.findElement(By.className("class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\"")).click();
		//driver.findElement(By.linkText("Log in")).click();
		//driver.findElement(By.xpath("<div class=\"x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1\">Log in</div>")).click();
	
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		
		//driver.close();
		//
		//driver.findElement(By.partialLinkText("Sign u")).click();
	}

}
