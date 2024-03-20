package com.tka;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfError {
	public static void main(String[] args) throws IOException {
		//1.Invoke the browser.
		WebDriver driver= new ChromeDriver();
		
		//2. Pass URL to browser.
		driver.get("https://www.linkedin.com/login");
		
		//3.Maximize the window of webpage.
		driver.manage().window().maximize();
		
		//4. refresh the webpage.
		driver.navigate().refresh();
		
		//5. Locate username field and send required data.
		driver.findElement(By.id("username")).sendKeys("susmita3112000@gmail.com");
		
		//6. Locate password field and send required data.
		driver.findElement(By.id("password")).sendKeys("79882245");
		
		//7. Click on login button.
		driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		
		//8.Locate error message 
		WebElement ele= driver.findElement(By.id("error-for-password"));
		
		//Take screenshot
		File source= ele.getScreenshotAs(OutputType.FILE);
		
		//Copy file to desired location
		FileUtils.copyFile( source, new File("C:\\Users\\susmi\\OneDrive\\Desktop\\Screenshot\\errorss.png"));

		
		
		
	}

}
