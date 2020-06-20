package SeleniumWebDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileAttachment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/test-file-attachment/");
		
		driver.findElement(By.id("username")).sendKeys("ram07.a@gmail.com");
		
		driver.findElement(By.id("resume")).sendKeys("C:\\Saanvi\\Saanvi-Document.docx");

	}

}
