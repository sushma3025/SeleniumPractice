package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonUtilities {
	String name = "sushma";
	String pass = "pass";

	
	
	
	
	public void jsClick(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
	
public void jsSendkeysnp(WebDriver driver, WebElement ele1, WebElement ele2, String value1, String value2)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+ value1 +"';arguments[1].value='"+ value2 +"';", ele1, ele2);
		
		//js.executeScript("document.getElementById('email').setAttribute('value' , 'sushma');");
		
		//js.executeScript("argument[0].setAttribute('value', '"+ name +"') ;", ele1); //not working
		//js.executeScript("arguments[0].value='"+ pass +"';", ele2);

	}
	public void jsSendkeys(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+ name +"';", ele);
	}
	
		//js.executeScript("arguments[0].value='"+ pass +"';", ele2);
	
	
public void jsScrollnClick(WebDriver driver, WebElement ele)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);", ele);
	js.executeScript("arguments[0].click();", ele);

	
}


public void jsScroll(WebDriver driver, WebElement ele)
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,600);", ele);
	
}

}
