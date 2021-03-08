package screenshot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CapturingElement {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		
//		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		BufferedImage FullImg = ImageIO.read(screenshot);
//		WebElement ele = driver.findElement(By.xpath("//div[@class='Aa1VU']"));
//		Point point = ele.getLocation();
//		int getHeight = ele.getSize().height;
//		int getWidth = ele.getSize().width;
//		BufferedImage eleScreenshot = FullImg.getSubimage(point.getX(), point.getY(), getWidth , getHeight);
//		ImageIO.write(eleScreenshot, "jpg", screenshot);
//		File screenshotLogo = new File(".//Screenshots//logo.jpg");
//		FileUtils.copyFile(screenshot, screenshotLogo);
//		
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='Aa1VU']"));
		File screenshotLogo = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotLogo, new File(".//Screenshots//logo.jpg"));
		


		


	}

}
