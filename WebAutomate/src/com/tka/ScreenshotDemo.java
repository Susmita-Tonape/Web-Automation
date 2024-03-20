package com.tka;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotDemo {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot,new File("C:\\Users\\susmi\\OneDrive\\Desktop\\Screenshot\\ss.png"));
		
	}

}
