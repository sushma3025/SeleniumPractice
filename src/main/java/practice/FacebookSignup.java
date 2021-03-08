package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookSignup {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);  //implicit wait
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		
		//explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name='websubmit']")));
		
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Sushma");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("d");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("9898989899998");
		driver.findElement(By.id("password_step_input")).sendKeys("mmmmmm");
		
		//dropdown
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		Select selectMonth = new Select(month);
		selectMonth.selectByIndex(6);
		WebElement day = driver.findElement(By.cssSelector("#day"));
		Select selectDay = new Select(day);
		selectDay.selectByValue("30");
		WebElement year = driver.findElement(By.cssSelector("#year"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1986");
		
		//radio button
		
//		WebElement f = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//		System.out.println(f.isSelected());
		
		
		List <WebElement> list = driver.findElements(By.xpath("//input[@type='radio']/../..//label"));
		for(int i=1;i<=list.size();i++)
		{
			String ele = driver.findElement(By.xpath("(//input[@type='radio']/../..//label)["+i+"]")).getText().toString().trim();
			//System.out.println(ele);
			
			
		if(ele.contains("Female"))
		{
			WebElement fem = driver.findElement(By.xpath("(//input[@type='radio']/../..//input)["+i+"]"));
				if(!fem.isSelected())
				{
			       fem.click();
				}
			break;
		}
		
		}
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		driver.close();
		
		
		
		


	}

}
