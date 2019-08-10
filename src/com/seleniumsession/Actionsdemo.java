package com.seleniumsession;
import org.openqa.selenium.By;
//contextclick:foe rightclick.
//doubleclick
//move to element.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//mousemovement.


public class Actionsdemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		//WebElement btnelement=driver.findElement(By.xpath(".//div"))
		//WebElement btnelement
		WebElement weblink=driver.findElement(By.linkText("Sortable"));
		action.moveToElement(weblink).click().build().perform();
		
		
	}

}
