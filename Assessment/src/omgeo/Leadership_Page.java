package omgeo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Leadership_Page {

	//method verifying designation of Paula Arthus
	public static void Paula_Arthus(WebDriver driver){
	    driver.findElement(By.xpath("//tr//td[2]//span[@class='SecondaryCallToAction']//a[contains(@href,'paula_arthus')]")).click();
		driver.switchTo().frame(driver.findElement(By.tagName("iframe"))); //switching to the frame
		String x=driver.findElement(By.xpath("html/body/table/tbody/tr/td/em")).getText();//copying designation details from frame
		Assert.assertEquals(x, "President and Chief Executive Officer, Omgeo");//verifying the designation
		System.out.println("Designantion of Paula Arthus(President and CEO) verified");//printing the result
		driver.switchTo().defaultContent();//going back to main frame
        	
	}
	
}
