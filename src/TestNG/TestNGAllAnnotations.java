package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAllAnnotations {

	
		@Test(priority=2)
		public void testCase1() {
			System.out.println("In testCase1() Test1");
		}
		
		@Test(priority=3)
		public void testCase2() {
			System.out.println("In testCase2() Test2");
		}
	  
		@BeforeSuite
		public void testSuiteSetup() {
			System.out.println("In testsuiteSetup() BeforeSuite"); //Deploy latest build, deploy QA database
		}
		
		@AfterSuite
		public void testSuitecleanup() {
			System.out.println("In testSuitecleanup() AfterSuite"); //Close all apps/ clear cookies.....
		}
		
		@Test(priority=1) 
		public void sneha() {
			System.out.println("this is my first preference to execute");
		}
		
		@BeforeTest
		public void testModuleORFeaturesetup() {
			System.out.println("In testModule OR Featuresetup() BeforeTest");
		
		}
		
		
		@AfterTest
		public void testModuleORFeaturecleanup() {
			System.out.println("In testModule OR Featurecleanup() AfterTest");
		}
		
		@BeforeClass
		public void testClasssetup() {
			System.out.println("In testClasssetup() BeforeClass");
		}
		
		@AfterClass
		public void testClasscleanup() {
			System.out.println("In testClasscleanup() AfterClass");
		}
		
		@BeforeMethod
		public void testCasesetup() {
			System.out.println("In testCasesetup() BeforeMethod -Initial setup of property file"); // Open the browser, go to url
		}
		
			
		@AfterMethod
		public void testCasecleanup() {
			System.out.println("In testCasecleanup() AfterMethod - closing the driver file"); //Close the browser, 
		}

	}


