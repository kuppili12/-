package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertions {
	
	@Test
	public void testPageTitle(){
		System.out.println("*********************TEST PAGE TITLE*********************");
		String actualTitle="Gmail";
		String ExpectedTitle = "Gmail55555";
		Assert.assertEquals(actualTitle, ExpectedTitle, "Error : Page incorrect");
	}
	
	@Test
	public void assertTrue(){
		boolean x = true;
		Assert.assertTrue(x, "Error: Actual value is false");
	}
	
	@Test
	public void testCase1(){
		System.out.println("Performing the tests");
		Assert.fail("Error : Page incorrect expected");
	}

}
