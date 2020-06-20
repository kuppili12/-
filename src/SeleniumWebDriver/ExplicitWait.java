package SeleniumWebDriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour//");
		
driver.findElement(By.id("wait-time")).clear();
		
		driver.findElement(By.id("wait-time")).sendKeys("7");
		
		driver.findElement(By.id("new-button")).click();
		
		//wait for 7 seconds
		WebDriverWait wdWait = new WebDriverWait(driver, 30);
		
		wdWait.until(ExpectedConditions.presenceOfElementLocated(By.id("wait7")));
		
		
//		wdWait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert();
		
		//ExpectedConditions.presenceOfElementLocated(By.id("wait7"))
				
		System.out.println("Button Label: " + driver.findElement(By.id("wait7")).getText());
		
		
}

}