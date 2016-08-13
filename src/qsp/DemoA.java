package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class DemoA {
	ExtentReports e= new ExtentReports(".//extent-report//extentreport.html");
	
	@Test
	public void testA()
	{
		
		ExtentTest t = e.startTest("testA");	
		t.log(LogStatus.PASS,"Hello");
		e.endTest(t);
		System.setProperty("webdriver.gecko.driver", ".//exes//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.quit();
	
	}
	
	@Test
	public void testB()
	{
		
		ExtentTest t = e.startTest("testB");	
		t.log(LogStatus.FAIL,"Hi");
		e.endTest(t);
		e.flush();
		System.setProperty("webdriver.gecko.driver", ".//exes//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
	}

}
