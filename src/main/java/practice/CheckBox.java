package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		WebElement ele1 = driver.findElement(By.xpath("//label[text()='Option 1']"));
		ele1.click();
		WebElement ele2 = driver.findElement(By.xpath("//label[text()='Option 2']//input"));
		ele2.click();
		System.out.println(ele2.isSelected());


		WebElement ele3 = driver.findElement(By.xpath("//label[text()='Option 3']"));
		System.out.println(ele3.isSelected());
		


		
		
	}

}
