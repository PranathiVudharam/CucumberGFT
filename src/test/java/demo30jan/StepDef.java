package demo30jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demo30jan.DriverUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	
	@Given("user must be in login page")
	public void user_must_be_in_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=DriverUtil.getDriver("chrome");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By .name("userName")).sendKeys(string);
		driver.findElement(By .name("password")).sendKeys(string2);
		driver.findElement(By .name("Login")).click();
		driver.quit();
		
	}

	@When("performs login")
	public void performs_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

	@Then("user must be in home page")
	public void user_must_be_in_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
	}

}
