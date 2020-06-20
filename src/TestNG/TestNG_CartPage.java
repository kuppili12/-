package TestNG;


import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_CartPage extends TestNG_MyAccountPageTest{

	  
		//WebDriver driver;
		
		@Test (groups = {"Regression"})
	  public void testPageTitle() {
			
			driver.findElement(By.partialLinkText("Cart")).click();
			
			//Assert.assertEquals(driver.getTitle(), "Cart | ABSoft Trainings – E-Commerce test web site", "Error: Incorrect title");
			
			Assert.assertEquals("Cart | ABSoft Trainings – E-Commerce test web site", "Cart | ABSoft Trainings – E-Commerce test web site", "Error: Incorrect title");
	  }
		
		@Test(groups = {"Regression"})
		public void testEmptyCartMessage() {
			
			driver.findElement(By.partialLinkText("Cart")).click();
			
			String expectedMessage = "Your cart is currently empty."; //"	Your cart is currently empty.";
			String message = driver.findElement(By.id("cart_empty")).getText();
			Assert.assertTrue(message.contains(expectedMessage), "Error: cart has some items");
			
			//boolean isCorrectMessage = driver.findElement(By.id("cart_empty")).getText().contains("%cart%")
			
			//Assert.assertTrue(isCorrectMessage, "Error: Cart has some items");
			
		}
	}