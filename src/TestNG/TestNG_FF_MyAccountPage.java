package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestNG_FF_MyAccountPage 
{
	WebDriver driver;
	@BeforeMethod
	public void testSetup()
	{
		System.setProperty("webdriver.gecko.driver", "C:/JavaTraining/selenium/firefoxdriver/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/my-account/");
	}
	
	@Test
	public void pageTitle()
	{
		String ExpectedTitle = "My Account | ABSoft Trainings - E-Commerce test web site_Fail";
		Assert.assertEquals(driver.getTitle(), ExpectedTitle, "Title does not match");
	}
	public void userLoginSucessful()
	{
		driver.findElement(By.id("username")).sendKeys("testuser1");
		driver.findElement(By.id("password")).sendKeys("testpwd1");
		driver.findElement(By.id("login")).click();
		boolean isuserloggedinSuccessful = driver.findElement(By.id("user_info")).getText().contains("testuser1");
		Assert.assertTrue(isuserloggedinSuccessful, "Incorrect username and password");
	}
	
	@AfterMethod
	public void CloseBrowser() 
	{
		driver.close();
	}
}
	
