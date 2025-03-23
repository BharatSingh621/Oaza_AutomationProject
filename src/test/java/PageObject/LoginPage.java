package PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage 
{

    WebDriver driver;
	
    public LoginPage(WebDriver driver) 
    {
        this.driver = driver;
    }

	
	By usernameField = By.id("mui-1");
    By passwordField = By.id("mui-2");
    By loginButton = By.id("mui-3");

    
    public void enterUsername(String username) 
    {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) 
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}
