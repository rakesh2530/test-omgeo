package omgeo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {
	private static WebElement elem = null;
    
	//method to return a Web Element
	public static WebElement elem_about(WebDriver driver){
		elem=driver.findElement(By.linkText("About"));
		return elem;
	}
	//method to return a Web Element,not needed for this task.Just written to show the structure		
 	public static WebElement elem_viewpoint(WebDriver driver){
		elem=driver.findElement(By.linkText("Viewpoint"));
		return elem;
	}
	
}
