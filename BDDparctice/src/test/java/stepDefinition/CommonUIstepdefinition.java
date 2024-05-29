package stepDefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CommonUIpage;

public class CommonUIstepdefinition extends CommonUIpage {
	private Stepdata sd;
	CommonUIpage com;
	
	public CommonUIstepdefinition(Stepdata sd) {
		this.sd=sd;
		
	}
	
	
	
	@Before
	public void filestart() {
		com= new CommonUIpage();
		com.propreader();
	}
	
	
	
	@Given("^user launches the OrangeHRM application$")
	public void user_launch_app() {
		
		sd.driver=com.driverStartUp(prop.getProperty("LoginURL"));
		sd.orderId="12345";
	}
		
	@And("user provides  username")
	public void user_provides_username() {
	    
			
		}
	
	@And("^user provides password$")
	public void user_provides_password() {
	}
	@When("^user taps on login button$")
	public void user_taps_on_login_button() {
	}
	@Then("^user should be in home page$")
	public void user_should_be_in_home_page() {
		
	}
	
	
	

}
