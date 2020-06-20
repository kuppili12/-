package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyAccountPageTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver");
		// WebDriverdriver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://test1.absofttrainings.com/");
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("testuser1");
		Thread.sleep(5000);
		driver.findElement(By.id("password")).sendKeys("testpwd1");
		Thread.sleep(5000);
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		driver.quit(); // driver.close()  for multiple chrome browser windows to close
		
	}

}
