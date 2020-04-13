package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObjects.LoginPage;





public class Steps {
	
	public void waiting(int parameter) {
	try {
		Thread.sleep(parameter);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	}
	
	public WebDriver driver;
	public LoginPage lp;
	
	

	@Given("User Launch Chrome browser")
	public void user_Launch_Chrome_browser() {
		System.setProperty("webdriver.chromedriver", "E:\\TESTOWANIE AUTOMATYCZNE\\SRODOWISKO\\chromeDriver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String nickus, String haslo) {
		
		lp.setLogin(nickus);
		lp.setPassword(haslo);
	}

	@When("Click on Login")
	public void click_on_Login() {
	  //  lp.ldriver.findElement(By.id("SubmitLogin")).click();
		driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("Page Description should be {string}")
	public void page_Description_should_be(String got) {
	    String obiekt = driver.findElement(By.className("page-heading")).getText();
	    Assert.assertEquals(got, obiekt);
	}

	@Then("close browser")
	public void close_browser() {
		waiting(8000);
		lp.ldriver.close();
	}
	
	// added comment
	
}
