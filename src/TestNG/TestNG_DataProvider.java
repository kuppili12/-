package TestNG;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class TestNG_DataProvider {
	  
		    public static WebDriver driver;
			
			@BeforeMethod
			public void testSetup() {
		        System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
				
				driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				// 1) Go to myAccount Page
				driver.get("http://test1.absofttrainings.com/my-account/");
			}
			
			
			@Test  (groups = {"smoke"})
			public void testPageTitle() {
				
				Assert.assertEquals(driver.getTitle(), 
						"My Account | ABSoft Trainings – E-Commerce test web site", 
						"Error: Title");
			}
			
			
			
			
		  
			@Test(dataProvider="testUseraccounts")	
			public void testSuccessfulLogin(String username, String password) {
		       	// 1) Standard User
				// 2) Admin User
				// 3) Store Manager
				// 4) Store Contributor
				// Providing test data
				// Linking the test data to the method
				// Applying the test data to the method
				
				// 2) Enter Username
				driver.findElement(By.id("username")).sendKeys(username);
				
				// 3) Enter Password
				driver.findElement(By.id("password")).sendKeys(password);
				
				// 4) Click login
				driver.findElement(By.id("login")).click();
				
				// Verify successful login
				boolean isLoginSuccessful = driver.findElement(By.id("user_info")).getText().contains(username);
				
				Assert.assertTrue(isLoginSuccessful, "Error: Login is failed");
				}
			
			
			
			@AfterMethod
			public void testCleanup() {
				
			driver.quit();	
			
			}
			
			@DataProvider
			public Object[][] testUseraccounts() {
				Object[][] users = new Object[3][2];
				
				users[0][0] = "testuser1"; //123
				users[0][1] = "testpwd1";
				users[1][0] = "testuser2";
				users[1][1] = "testpwd2";
				users[2][0] = "testuser3";
				users[2][1] = "testpwd3";
						
				
				return users;
				
			}
			
		}

