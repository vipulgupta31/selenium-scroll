package test;

import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class ScrollToHorizontalRight extends BaseTest{

	@Test
	public void testScrollToHorizontalRight()
	{
	    //launch the website
		driver.get("https://www.lambdatest.com");

		//decrease the size of window to show both scroll bars
		driver.manage().window().setSize(new Dimension(450,630));
		
		//scroll to the right
	    js.executeScript("window.scrollBy(6000,0)");   
	}
}
