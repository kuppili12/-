package SeleniumWebDriver;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().timeouts().im
		
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/ajax-and-dynamic-html-behaviour//");
		
		
//		driver.findElement(By.id("wait-time")).clear();
//		
//		driver.findElement(By.id("wait-time")).sendKeys("5");
//		
//		driver.findElement(By.id("new-button")).click();
//		
//		//wait for 5 seconds
		
		
		
		driver.findElement(By.id("wait-time")).clear();
        driver.findElement(By.id("wait-time")).sendKeys("5");
        driver.findElement(By.id("new-button")).click();
//		
//		driver.findElement(By.id("wait-time")).sendKeys("5");
        //Thread.sleep(7000);
		System.out.println(driver.findElement(By.id("wait5")).getText());
		

		
		
		
		//System.out.println("Button Label: " + driver.findElement(By.id("wait5")).getText());
		
}
}