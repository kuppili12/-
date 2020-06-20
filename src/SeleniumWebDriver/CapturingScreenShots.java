package SeleniumWebDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingScreenShots {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C:/JavaTraining/selenium/chromedriver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("http://test1.absofttrainings.com/");
		
		File imgFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Files.copy(imgFile.toPath(), Paths.get("C:\\EclipseWorkSpaceJava\\ScreenShots\\TestonePage.png"));
		
		FileUtils.copyFile(imgFile, new File("C:\\Saanvi\\TestonePage1.png"));
		driver.close();

	}

}