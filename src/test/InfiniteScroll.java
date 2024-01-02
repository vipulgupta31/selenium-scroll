package test;

import org.testng.annotations.Test;

public class InfiniteScroll extends BaseTest
{
	@Test
	public void testInfiniteScroll()
	{
	    //launch the website
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		
		//find the initial page height
		long intialLength = (long) js.executeScript("return document.body.scrollHeight");
		
		//start the loop to perform infinite scroll to reach end of page
	    while(true)
	    {
	    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	     
	    	//find the height of page again
	    	long currentLength = (long) js.executeScript("return document.body.scrollHeight");
	    	
	    	//check if its end of page
	    	if(intialLength == currentLength) {
	    		break;
	    	}
	    	intialLength = currentLength;
	    }
	}

}
