package test;

import org.testng.annotations.Test;

public class ScrollDown extends BaseTest{
	
	@Test
	public void testScrollDown()
	{
	    //launch the website
		driver.get("https://www.lambdatest.com/selenium-playground/");
		
		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");	   
	}
}
