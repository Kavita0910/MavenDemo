package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class DemoA {
	
	@Test
	public void testA()
	{
		System.setProperty("webdriver.gecko.driver", ".//exes//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	
	}

}
