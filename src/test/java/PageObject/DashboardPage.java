package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage 
{

WebDriver driver;
	
    public DashboardPage(WebDriver driver) 
    {
        this.driver = driver;
    }
    
    
    By dashboard_heading = By.xpath("//p[contains(text(),'Dashboard')]");
        
    
    
    public String  getDashboardText()    
    {
    	String dashboardText = driver.findElement(dashboard_heading).getText();    	
    	return dashboardText;
    }
}

