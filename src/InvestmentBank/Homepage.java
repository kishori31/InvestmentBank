package InvestmentBank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new ChromeDriver(); 
	driver.get("https://kite.zerodha.com");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("XA0634");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Gujar131!");
	driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
	//Thread.sleep(1000);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[contains(text(),'XA0634')]"), "XA0634"));
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("170615");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//Xdriver.findElement(By.xpath("//input[@type='submit']")).click();

	driver.switchTo().alert().dismiss();
}
}