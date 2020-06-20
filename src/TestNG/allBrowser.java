package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class allBrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.ie.driver", "C:/JavaTraining/selenium/iedriver/IEDriverServer.exe"); 
		//WebDriver driver = new InternetExplorerDriver();
		//driver.manage().window().maximize();
		
		System.setProperty("webdriver.gecko.driver", "C:/JavaTraining/selenium/firefoxdriver/geckodriver.exe"); 
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe"); 
		//WebDriver driver = new ChromeDriver();
		
		driver.get("http://test1.absofttrainings.com/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.cssSelector("input[id=username]")).sendKeys("testuser1");
		
		//driver.findElement(By.id("password")).sendKeys("testpwd1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testpwd1");
		
		driver.findElement(By.id("login")).click();
		driver.findElement(By.linkText("#472")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='entry-content']/div/table/tbody/tr[1]/td[1]/a[1]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//div[@id='product-60']/div[2]/h1")).getText());
		Thread.sleep(5000);
		driver.close();

	}

}
