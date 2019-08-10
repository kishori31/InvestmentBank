package com.seleniumsession;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args)  throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-switch-windows/");
		String parentwindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,150)");//used to scrollup 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement clickbtn=driver.findElement(By.xpath("//button[@id='button1']"));
		for(int i=0;i<4;i++) {
			clickbtn.click();
			Thread.sleep(3000);
		}
		Set<String> childernwindowhandles=driver.getWindowHandles();
		String lastwindowhandle=" ";
		for(String handle:childernwindowhandles)
		{
			System.out.println("window handle:"+handle);
		}
		driver.get("https:www.google.com");
		
		
			
		}
		
		
		
		
		
		
		

	}


