package seleniumTests;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorStrategies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		driver.get("http://test1.absofttrainings.com/");
		driver.findElement(By.linkText("My Account")).click();
		//driver.manage().window().maximize();
		//driver.findElement(By.linkText("How to Use")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.id("username")).sendKeys("testuser1");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("testuser1"); // XPATH way to define
		driver.findElement(By.cssSelector("input[id=username]")).sendKeys("testuser1");
		//Thread.sleep(5000);
		//driver.findElement(By.id("password")).sendKeys("testpwd1");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testpwd1");
		//Thread.sleep(5000);
		driver.findElement(By.id("login")).click();
		//Thread.sleep(5000);
		
		/*List<WebElement> Links =driver.findElements(By.tagName("h4"));
		System.out.println("Count of all <h4> Links on Account Page : " + Links.size());
		for (WebElement printallLinks: Links){
			System.out.println(printallLinks.getText());*/
			
			//Locating by XPATH
			//tagname[@attribute = 'value']
			//driver.findElement(By@xpath("input[@value='forever']")).click();
			
			//driver.findElement(By.xpath("input[id='username']")).sendKeys("testuser1");
			//driver.findElement( By.xpath("input[name='password']")).sendKeys("password");
			
			
			//System.out.println(driver.findElement(By.xpath("//div[@id='text-4'] /div/a[1]")).getText());  // working good
			//System.out.println(driver.findElement(By.xpath("//div[@id='text-2'] /div/a[2]")).getText());	// working good	
			//System.out.println(driver.findElement(By.xpath("//div[@id='text-4'] /div/a[6]")).getText());	// working good
			
			//System.out.println(driver.findElement(By.xpath("//table[@id='testaccounts']")).getText());  // working displaying the test accounts table
		
			//System.out.println(driver.findElement(By.xpath("//td[text()='testuser3']")).getText()); // displays testuser3
			//System.out.println(driver.findElement(By.xpath("//td[text()='testpwd5']")).getText());  //displays testpwd5
		//System.out.println(driver.findElement(By.xpath("//table[@id='testaccounts']/tbody/tr[3]/td[2]")).getText()); // displays testpwd3 
		
		//System.out.println(driver.findElement(By.xpath("//table[@id='testaccounts']/tbody/tr[5]/td[1]")).getText()); //displays testuser5
			
		//System.out.println(driver.findElement(By.xpath("//table[@id='my_account_orders']")).getText()); //works now  /tbody/tr/td/a[3]
		//System.out.println(driver.findElement(By.xpath("//div[@class='entry-content']")).getText()); // works now  /div/table/tr/td/a[3]
		//System.out.println(driver.findElement(By.xpath("//tr[@class='order' /td/a[3]]")).getText());
			
		driver.findElement(By.linkText("#472")).click(); //works correctly
		
		//System.out.println(driver.findElement(By.linkText("Apple IPhone")));
		//System.out.println(driver.findElement(By.xpath("//td[text()='Apple IPhone']")).getText());
			
		driver.findElement(By.xpath("//div[@class='entry-content']/div/table/tbody/tr[1]/td[1]/a[1]")).click();
		
		//String x = driver.findElement(By.xpath("//div[@class='entry-content']/div/table[1]/tbody/tr[1]/td[1]/a[1]")).click();//.getText();
		
		System.out.println(driver.findElement(By.xpath("//div[@id='product-60']/div[2]/h1")).getText());
		
		
			
			//Locating by CSS SELECTOR
			//driver.findElement(By.cssSelector("input[@value='forever']")).click();
			//Locating by Tagname
		
		//driver.findElement(By.cssSelector("div[id=test-4] div a:nth-child(1)")).getText();
		//System.out.println(driver.findElement(By.cssSelector("table[id=testaccounts] tbody tr:nth-child(4) td:nth-child(1)")).getText()); // displays testuser4
		//System.out.println(driver.findElement(By.cssSelector("table[id=testaccounts] tbody tr:nth-child(3) td:nth-child(1)")).getText()); // displays testuser3
		//System.out.println(driver.findElement(By.cssSelector("table[id=testaccounts] tbody tr:nth-child(2) td:nth-child(2)")).getText()); // displays testpwd2
		
		//css Selector, Attribute = Value
		//driver.findElement(By.cssSelector("input[id=username]")).sendKeys("testuser1");
		
		//css Selector, Attribute starts with same value
		//driver.findElement(By.cssSelector("input[id^=user]")).sendKeys("testuser1");
		//driver.findElement(By.xpath("//input[starts-with(@id,'user')]")).sendKeys("testuser1");
		
		//css Selector, Attributes contains a specific value that do not change or common.
		//driver.findElement(By.cssSelector("input[id*=ern]")).sendKeys("testuser1");
		
		//css Selector, Attributes ends with same value
		//driver.findElement(By.cssSelector("input[id$=name]")).sendKeys("testuser1");
		
		driver.close();
	}
}


