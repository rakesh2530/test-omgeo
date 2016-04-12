package omgeo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestCase {
	

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.omgeo.com/");
		

Home_Page.elem_about(driver).click();
About_Page.verifyaboutpage(driver);
About_Page.selectfromdropdown(driver, "ALERT");
Alert_Page.verifyalertpage(driver);
Alert_Page.elem_Leadership(driver).click();
Leadership_Page.Paula_Arthus(driver);

driver.quit();
System.out.println("Test Passed");
	}

}
