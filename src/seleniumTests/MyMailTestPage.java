package seleniumTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyMailTestPage {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe"); //C: Change your path here
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com"); // http://test1.absofttrainings.com/
		//driver.findElement(By.linkText("My Account")).click();
		//Thread.sleep(5000);
		driver.findElement(By.id("identifierId")).sendKeys("sridhar1973@gmail.com"); //Enter your personal gmailid here --> xxx@gmail.com 
		Thread.sleep(5000);
		driver.findElement(By.id("identifierNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("xxx"); //xxx - enter your email password
		Thread.sleep(5000);
		driver.findElement(By.id("passwordNext")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".aic .z0 div")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(".oj div textarea ")).sendKeys("sridhar1973@gmail.com");
		driver.findElement(By.cssSelector(".aoD.az6 input ")).sendKeys("Sending Message");
		driver.findElement(By.cssSelector(".Ar.Au div")).sendKeys("automated email generation");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("tr.btC td:nth-of-type(1) div div:nth-of-type(2)")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#gb > div.gb_xd.gb_Od.gb_Fd > div.gb_Ec.gb_La.gb_Dc.gb_Md > div > div.gb_Fa.gb_Zc.gb_jg.gb_f.gb_sf > div > a > span")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#gb_71")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit(); // driver.close()  for multiple chrome browser windows to close
		}
}
