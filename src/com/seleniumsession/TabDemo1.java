package com.seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.*;

public class TabDemo1 {
	@Test
	public void openSameUrlInMultipleTab() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "D://geckodriver.exe");
		WebDriver driver=new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		{

			driver.navigate().to("http://google.com");
			WebElement body = driver.findElement(By.tagName("body"));

			body.sendKeys(Keys.CONTROL + "t");
			driver.get("http://www.facebook.com");
		}

		((JavascriptExecutor) driver).executeScript("window.open('http://www.yahoo.com');");
		Thread.sleep(1000);
		driver.quit();
	}

}
