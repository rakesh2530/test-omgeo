package omgeo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase1 {
	WebDriver driver;
	@BeforeTest
	public void openbrowser(){
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.omgeo.com/");	
	}
@Test
	public void testcase(){
		Home_Page.elem_about(driver).click();
		About_Page.verifyaboutpage(driver);
		About_Page.selectfromdropdown(driver, "ALERT");
		Alert_Page.verifyalertpage(driver);
		Alert_Page.elem_Leadership(driver).click();
		Leadership_Page.Paula_Arthus(driver);
	}
	
	@AfterTest
	public void closebrowser(){
		driver.quit();
		System.out.println("Test Passed");

	}
	
}
