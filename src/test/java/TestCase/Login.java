package TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObject.LoginPage;
import PageObject.DashboardPage;
import Utils.TestBase;


public class Login extends TestBase
{

	@Test
	public void TestCase_login() throws InterruptedException 
	{
			LoginPage loginPage = new LoginPage(driver);
			DashboardPage dashboardPage = new DashboardPage(driver);			
			
			loginPage.enterUsername("root");
			loginPage.enterPassword("Password@123");
			loginPage.clickLoginButton();
			String actualText =  dashboardPage.getDashboardText();	
			String expectedText = "Dashboard";	
			Assert.assertEquals(actualText, expectedText);				
	}
	
}
