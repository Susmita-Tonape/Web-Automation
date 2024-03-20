package com.tka;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;

public class ScreenshotDemo2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div[1]/img"));
		File source=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File("C:\\Users\\susmi\\OneDrive\\Desktop\\Screenshot\\eless.png") );

	}

}
