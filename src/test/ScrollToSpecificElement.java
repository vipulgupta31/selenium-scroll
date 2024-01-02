package test;

import org.openqa.selenium.*;
import org.testng.annotations.Test;

public class ScrollToSpecificElement extends BaseTest
{

	@Test
	public void testScrollToSpecificElement()
	{
	    //launch the website
		driver.get("https://www.lambdatest.com/selenium-playground");
		
		//locate the element
	    WebElement element = driver.findElement(By.linkText("Changelog"));
	    
		//scroll to the element
	    js.executeScript("arguments[0].scrollIntoView();", element);

	}
}
