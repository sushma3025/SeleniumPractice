package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.CommonUtilities;

public class FacebookLogin {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebElement name = driver.findElement(By.id("email"));
		WebElement pass = driver.findElement(By.id("pass"));
		WebElement ele = driver.findElement(By.xpath("//button[@name='login']"));
		CommonUtilities  common = new CommonUtilities();
		common.jsSendkeysnp(driver, name, pass , "sushma" , "sss");
		common.jsClick(driver, ele);
		

	}

}
