package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(id = "Login")
	@CacheLookup
	WebElement txtLogin;
	
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	
	public void setLogin(String nick) {
		txtLogin.clear();
		txtLogin.sendKeys(nick);
	}
	
	
	
	public void setPassword(String haslo) {
		txtLogin.clear();
		txtLogin.sendKeys(haslo);
	}
	
	
	
	
	
	
	
}
