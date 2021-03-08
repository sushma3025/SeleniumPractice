package screenshot;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenShotCapture
{
	public static WebDriver driver;
	public static void CaptureScreen() throws IOException
	{		
		Date d = new Date();
		String FileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
	
		
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(".//Screenshots//"+FileName));

	}

	public static void main(String[] args) throws IOException  
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		CaptureScreen();
		
	}

}
