package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmericanAirlines {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);  //implicit wait
		driver.get("https://www.aa.com");
		
		//radio button
		
		WebElement oneWay = driver.findElement(By.xpath("//span[.='One way']"));
		if(oneWay.isSelected())
		{
			return;
		}
		else
		{
			oneWay.click();
		}
		
		WebElement dest = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
	    dest.sendKeys("Tam");
	    
	    // Explicit wait
	    
	    WebDriverWait wait = new WebDriverWait(driver,5);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='TPA - Tampa International, FL']")));
	    
	    for(int i=0;i<2;i++)
	    {
	    dest.sendKeys(Keys.ARROW_DOWN);
	    }
	    dest.sendKeys(Keys.ENTER);
	    
	   //DropDown
	    
	    WebElement noOfPass = driver.findElement(By.xpath("//select[@id='flightSearchForm.adultOrSeniorPassengerCount']"));
	    Select count = new Select(noOfPass);
	    count.selectByValue("4");
	    
	    driver.findElement(By.id("aa-leavingOn")).click();
	    
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[.='11']")));
	    
	    driver.findElement(By.xpath("//a[.='11']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//button[contains(text(),'Search')]")).submit();
	    


		
		
		
		
		
	}

}
