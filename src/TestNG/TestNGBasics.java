package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeMethod
	public void testPresetup(){
		System.out.println("1 - Open the Browser");
		
		System.out.println("2 - Open my AccountPage");
	}
	
	@Test
	public void TestCase1(){
		System.out.println("First Test Case");
	}
	
	@Test
	public void TestCase2(){
		System.out.println("Second Test Case");
	}
	
	@Test
	public void TestCase3(){
		System.out.println("Third Test Case");
	}
	
	@AfterMethod
	public void closeBrowser(){
		System.out.println("Close Browser");
	}
}
