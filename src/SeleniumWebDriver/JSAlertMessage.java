package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertMessage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://test1.absofttrainings.com/javascript-alert-confirm-prompt-boxes/");
		
		driver.findElement(By.id("prompt")).click();
		
		Alert at = driver.switchTo().alert();
		Thread.sleep(5000);
		at.sendKeys("Ram");
		Thread.sleep(5000);
		at.accept(); 
		// at.dismiss(); when you click on the cancel button
		
		
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.close();

	}

}