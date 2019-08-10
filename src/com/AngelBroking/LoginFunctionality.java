package com.AngelBroking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.angelbroking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@id='top-bar-login']")).click();
		
		

	}

}
