package test;

import org.testng.annotations.Test;

public class ScrollDownByPixel extends BaseTest{

	@Test
	public void testScrollDownByPixel()
	{
	    //launch the website
		driver.get("https://www.lambdatest.com/selenium-playground/");
		
		//specify the number of pixels the page has to be scrolled
	    js.executeScript("window.scrollBy(0,3000)"); 
	}
}
