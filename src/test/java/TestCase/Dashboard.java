package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.LoginPage;
import PageObject.DashboardPage;
import Utils.TestBase;


public class Dashboard extends TestBase
{
	private LoginPage loginPage;
    private DashboardPage dashboardPage;
	
    @BeforeMethod
    public void Setup() 
    {
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);             
        loginPage.enterUsername("root");
        loginPage.enterPassword("Password@123");
        loginPage.clickLoginButton();
    }
    
    @Test(priority = 1)
    public void verifyDashboardTitle() 
    {
        String actualText = dashboardPage.getDashboardText();
        String expectedText = "Dashboard";
        Assert.assertEquals(actualText, expectedText, "Dashboard title mismatch!");
    }
    
    
    @Test(priority = 2)
    public void testCase_TopDropdownCompanyProfile() 
    {
        dashboardPage.clickCompanyDropdown();
        Assert.assertTrue(dashboardPage.isCompanyProfileVisible(), "Company profile not visible!");
    }
    
        
    

    @Test(priority = 3)
    public void testCase_CustomDateSelection() {
        dashboardPage.clickCustomDate();
        dashboardPage.enterStartDate("2024-01-01");
    }

    @Test(priority = 4)
    public void testCase_TransactionsDropdown() throws InterruptedException 
    {
        driver.findElement(By.xpath("//div[contains(text(),'Transactions')]")).click();
        driver.findElement(By.id("demo-simple-select")).click();
        driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();     
        driver.findElement(By.xpath("//body")).click();         
        driver.findElement(By.id("demo-simple-select-label")).click();
        driver.findElement(By.xpath("//body/div[@id='menu-']/div[3]/ul[1]/li[1]")).click();
    }

    
    
    @Test(priority = 5)
    public void testCase_AddCMSSystemUser() 
    {
    	driver.findElement(By.xpath("//div[contains(text(),'CMS System User')]")).click();
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();   	
    	

    	driver.findElement(By.name("username")).sendKeys("Demo");
    	driver.findElement(By.name("firstName")).sendKeys("Demo");
    	driver.findElement(By.name("lastName")).sendKeys("Demo");
    	driver.findElement(By.name("email")).sendKeys("Demo@gmail.com");
    	driver.findElement(By.name("phone")).sendKeys("789878987");
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    	
    	
    }

    @Test(priority = 6)
    public void testCase_AddRole() 
    {
    	driver.findElement(By.xpath("//div[contains(text(),'Roles')]")).click();
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]")).click();    	
    	driver.findElement(By.name("roleName")).sendKeys("Demo New Role");    	
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span[1]")).click();
    	driver.findElement(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span[1]")).click();
    	driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    
//    @Test(priority = 7)
//    public void testCase_CreateCompany() {
//        dashboardPage.clickCreateCompany();
//        dashboardPage.enterCompanyDetails("NewCompany");
//        dashboardPage.submitCompany();
//    }
//
//    @Test(priority = 8)
//    public void testCase_SearchServiceRequest() {
//        dashboardPage.searchServiceRequest("test@example.com");
//    }
//
//    @Test(priority = 9)
//    public void testCase_SearchChargingProfile() {
//        dashboardPage.searchChargingProfile("123456");
//    }
//
//    @Test(priority = 10)
//    public void testCase_SearchCustomer() {
//        dashboardPage.searchCustomer("Test Customer");
//    }
//
//    @Test(priority = 11)
//    public void testCase_StatementReport() {
//        dashboardPage.selectReportFilters("TestCompany", "TestTeam", "12345", "Paid", "2024-01-01", "2024-12-31");
//        dashboardPage.clickFindReport();
//    }
//
//    @Test(priority = 12)
//    public void testCase_SearchMember() {
//        dashboardPage.searchMember("Test Member");
//    }

    
    @AfterMethod
    public void tearDown() 
    {
    	
//        driver.quit();
    }
    
    
	
}
