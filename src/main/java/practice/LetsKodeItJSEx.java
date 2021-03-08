package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.CommonUtilities;

public class LetsKodeItJSEx {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://letskodeit.teachable.com/p/practice");
		WebElement data = driver.findElement(By.id("displayed-text"));
		WebElement ele = driver.findElement(By.id("hide-textbox"));
		CommonUtilities common = new CommonUtilities();
		common.jsScroll(driver, ele);
		Thread.sleep(3000);
		common.jsSendkeys(driver, data);
		//common.jsScrollnClick(driver, ele);
		
		
		

	}

}
