package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestNG_MyAccountPageTest 
{
	WebDriver driver;
	@BeforeMethod (alwaysRun = true)
	public void testSetup()
	{
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://test1.absofttrainings.com/my-account/");
	}
	@Test
	public void pageTitle()
	{
		String ExpectedTitle = "My Account | ABSoft Trainings – E-Commerce test web site";
		Assert.assertEquals(driver.getTitle(), ExpectedTitle, "Title Does not match");
	}
	//@Test (enabled = true) - how to comment the @Test method
	@Test (enabled = true)
	public void userloginSuccessful() 
	{
		driver.findElement(By.id("username")).sendKeys("testuser1");
		driver.findElement(By.id("password")).sendKeys("testpwd1");
		driver.findElement(By.id("login")).click();
		boolean isuserloggedinSuccessful = driver.findElement(By.id("user_info")).getText().contains("testuser1");
		Assert.assertTrue(isuserloggedinSuccessful, "Incorrect username or password");
	}
	@AfterMethod (alwaysRun = true)
	public void CloseBrowser() 
	{
		driver.close();
	}
}
