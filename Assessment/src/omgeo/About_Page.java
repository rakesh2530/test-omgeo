package omgeo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class About_Page {
	private static WebElement elem = null;
	
	
	public static String geturl(WebDriver driver){
		String url=driver.getCurrentUrl();
		return url;
		
	}
	//method to select any option from the drop down list
	public static void selectfromdropdown(WebDriver driver,String text){
		
		   elem=driver.findElement(By.xpath("//select[@class='chzn-done' and @name='select']"));
		   JavascriptExecutor Executor = (JavascriptExecutor)driver;
		   Executor.executeScript("arguments[0].setAttribute('style', 'visibility: visible;');", elem);	   
		   Select sel=new Select(elem);
           sel.selectByVisibleText(text);	
	}
	
	//method to verify that we navigate to about page
	public static void verifyaboutpage(WebDriver driver){
		Assert.assertEquals(About_Page.geturl(driver), "http://www.omgeo.com/aboutomgeo");
		System.out.println("We have navigated to ABOUT page");
	}
	
}
