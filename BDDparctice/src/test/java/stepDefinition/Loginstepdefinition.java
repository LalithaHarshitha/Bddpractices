package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.CommonUIpage;
import pageobjects.Loginpage;

public class Loginstepdefinition extends CommonUIpage{
	CommonUIpage com;
	private Stepdata sd;
	Loginpage log;
	
	public Loginstepdefinition(Stepdata sd) {
		this.sd=sd;
	}
	@And("user provides username")
	public void user_provides_username() {
		log=new Loginpage(sd.driver);
		log.enterusername();

	}
	
	 

	
	@And("user provides  password")
public void user_provides_password() {
		log=new Loginpage(sd.driver);
	log.enterpassword();
}
	
	

@When("user taps on login button for login")
public void user_taps_on_login_button() {
	log.clickLoginbutton();
}

@Then("user should be in home page for login")
public void user_should_be_in_home_page() {
	log.ishomepagedisplayed();
}



@After
public void driverclose() {
	sd.driver.close();
}
}





