package practice;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;



public class Contextclk {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver", "C:/DriverSoftware/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement link = driver.findElement(By.xpath("//a[.='Forgot Password?']"));
		try
		{
		Actions act = new Actions(driver);
		act.moveToElement(link);
		//Thread.sleep(5000);
		act.contextClick(link).build().perform();
		
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.ENTER).build().perform();
		}
		catch(Exception e)
		{
         System.out.println(e);
		}
	


		
	
		
	}

}
