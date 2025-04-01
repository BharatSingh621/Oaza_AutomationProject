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
    
    
    private By companyDropdown = By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[2]");    
    private By DropdownOption = By.xpath("//div[contains(text(),'oaza')]");    
    private By companyProfile = By.xpath("//div[contains(text(),'abhayComapny')]");           
    private By ClickDropDown = By.xpath("//div[@id='custom_time_dropdown-select']");
    
        
    
    public String  getDashboardText()    
    {
    	String dashboardText = driver.findElement(dashboard_heading).getText();    	
    	return dashboardText;
    }
          

    public void clickCompanyDropdown() 
    {    	
    	driver.findElement(DropdownOption).click();
        driver.findElement(companyDropdown).click();
    }
        

    public boolean isCompanyProfileVisible() 
    {
        return driver.findElement(companyProfile).isDisplayed();
    }
    

    public void clickCustomDate() 
    {
        driver.findElement(ClickDropDown).click();   
        driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[5]"));
    }
    
    
    public void enterStartDate(String date) {
        driver.findElement(By.id("mui-3"));
        
    }
    
    


}

