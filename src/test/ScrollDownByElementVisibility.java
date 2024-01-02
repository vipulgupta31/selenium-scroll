package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollDownByElementVisibility extends BaseTest{
	
	@Test
	public void testScrollDownByElementVisibility()
	{
	    //launch the website
		driver.get("https://www.lambdatest.com/selenium-playground/");
		
		//specify the WebElement till which the page has to be scrolled
	    WebElement element = driver.findElement(By.linkText("Espresso Testing"));

		//get the height of the webpage and scroll to the end
	    js.executeScript("arguments[0].scrollIntoView();", element);   
	}

}
