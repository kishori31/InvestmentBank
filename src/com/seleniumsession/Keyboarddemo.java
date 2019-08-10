package com.seleniumsession;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboarddemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/autocomplete");
		Actions action=new Actions (driver);
		//action.keyDown(textbox,Keys.SHIFT);
		
		
		
		driver.manage().window().maximize();
	}

}
