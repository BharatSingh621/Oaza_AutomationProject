package Utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase 
{

	 	protected WebDriver driver;

	    @BeforeMethod
	    public void setUp() 
	    {
	        driver = DriverFactory.getDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.get("https://cms.dashboardandreports.com/");
	    }
	    
	    
	    @AfterMethod
	    public void tearDown() 
	    {
	        DriverFactory.closeDriver();
	    }
	    
}
