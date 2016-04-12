package omgeo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Alert_Page {

	private static WebElement elem=null;
	
	//method to return web element in alert page
	public static WebElement elem_Leadership(WebDriver driver){
    elem=driver.findElement(By.linkText("Leadership Team"));
	return elem;
	}
	
	//method to verify that we navigate to about page
	public static void verifyalertpage(WebDriver driver){
		Assert.assertEquals(About_Page.geturl(driver), "http://www.omgeo.com/alert");
		System.out.println("We have navigated to ALERT page");
	}
	
}
