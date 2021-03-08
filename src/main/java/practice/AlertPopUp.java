package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/DriverSoftware/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    //driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);  //implicit wait
		driver.get("https://phptravels.com/demo/");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("*@gmail.com");
		driver.findElement(By.xpath("//button[.='SUBSCRIBE']")).click();

		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		
		WebElement ele = driver.findElement(By.cssSelector("svg[class='wh-messenger-svg-whatsapp wh-svg-icon']"));
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		
		Set<String> s = driver.getWindowHandles();
		Iterator<String> it = s.iterator();
		String parent = it.next();
		String child = it.next();
		driver.switchTo().window(child);
		
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[data-testid='whatsapp_www_header_logo_link']"))));
		Thread.sleep(2000);
		Alert alert2 = driver.switchTo().alert();
		System.out.println(alert2.getText());
		
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		driver.switchTo().window(parent);
		driver.quit();

	}

}
