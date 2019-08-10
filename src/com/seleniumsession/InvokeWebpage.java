package com.seleniumsession;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InvokeWebpage {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		WebElement userlogin=driver.findElement(By.id("email"));
		WebElement userpass=driver.findElement(By.id("pass"));
		//WebElement loginclick=driver.findElement(By.id("u_0_a"));
		userlogin.sendKeys("9423111564");
		userpass.sendKeys("1234567");
		//loginclick.click();
		WebElement first_name=driver.findElement(By.name("firstname"));
		WebElement Sur_name=driver.findElement(By.name("lastname"));
		WebElement mobile=driver.findElement(By.name("reg_email__"));
		WebElement newpass=driver.findElement(By.id("u_0_x"));
		first_name.sendKeys("ravi");
		Sur_name.sendKeys("nangre");
		mobile.sendKeys("8830158607");
		newpass.sendKeys("987456123");
		WebElement date_se=driver.findElement(By.xpath("//Select[@id='day']"));
		Select date_select=new Select(date_se);
		date_select.selectByIndex(13);
		WebElement month_se=driver.findElement(By.xpath("//*[@id='month']"));
		Select month_select=new Select(month_se);
		month_select.selectByVisibleText("Nov");
		WebElement year_se=driver.findElement(By.xpath("//*[@id='year']"));
		Select year_select=new Select(year_se);
		year_select.selectByValue("1983");
		WebElement male_radio=driver.findElement(By.xpath("//label[contains(text(),'Male')]//preceding-sibling::input[@value='2']"));
		male_radio.click();
		//driver.findElement(By.partialLinkText("Data Poli")).click();
		//driver.findElement(By.linkText("Terms")).click();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		TakesScreenshot ts=(TakesScreenshot)driver;
	      File src=ts.getScreenshotAs(OutputType.FILE);
	    //  FileUtils.copyFile(src,new File("C:\\Users\\user\\eclipse-workspace\\gdemo\\screenshot"+System.currentTimeMillis()+".png"));
		/* for (int i = 1; i<=links.size(); i=i+1) 
		 {
		 System.out.println(links.get(i).getText());
		 }
		 */
		//driver.findElement(By.cssSelector("#u_0_15")).click();
	}

}
