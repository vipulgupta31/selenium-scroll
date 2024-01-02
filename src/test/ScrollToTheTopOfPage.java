package test;

import org.testng.annotations.Test;

public class ScrollToTheTopOfPage extends BaseTest
{
	public void navigateAndScrollToBottom()
	{
		//launch the website
		driver.get("https://www.lambdatest.com/selenium-playground/");
				
		//get the height of the webpage and scroll to the end
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
	@Test
	public void testScrollToTop_Method_1() 
	{
		navigateAndScrollToBottom();
		
	    js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	@Test
	public void testScrollToTop_Method_2() 
	{
		navigateAndScrollToBottom();
		
	    js.executeScript("window.scrollTo(0,0)");
	}
	
	@Test
	public void testScrollToTop_Method_3() 
	{
		navigateAndScrollToBottom();
		
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
	}
}
