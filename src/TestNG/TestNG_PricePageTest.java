package TestNG;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_PricePageTest extends TestNG_MyAccountPageTest { 
	 
		
		@Test (groups = {"smoke", "Regression"})
	  public void testPageTitle() {
			
			
			
			
			Assert.assertEquals(driver.getTitle(), "Products | ABSoft Trainings – E-Commerce test web site", 
					"Error: Title");
			
			//Assert.assertEquals("Products | ABSoft Trainings – E-Commerce test web site", "Products | ABSoft Trainings – E-Commerce test web site", 
					//"Error: Title");
			
			
			
			//Assert.fail("Error: Title is not correct");
	  }
		
		
	}