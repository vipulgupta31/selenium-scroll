package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollOnAPage extends BaseTest{

	@Test
	public void testScrollOnAPage()
	{
	    //launch the website
		driver.get("https://www.lambdatest.com/selenium-playground/drag-drop-range-sliders-demo");
		
		//locate the scroll bar element on page
	    WebElement element = driver.findElement(By.xpath("(//input[@type='range'])[1]"));
	    
		//scroll the range element on page
	    element.sendKeys(Keys.END);
	}
}
