package examplecucumber;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
public class CucumberScript {

	 @Steps
	   Serenitycode buyer;

	@Given("^navigate to zoo website$")
	
	public void navigate_to_zoo_website() throws Throwable {

		buyer.openwebsite();
		
	}

	@When("^Enter text in textbox$")
	public void enter_text_in_textbox() throws Throwable {
		buyer.entertext();
			   
	}

	@Then("^Assert the dynamic text$")
	public void assert_the_dynamic_text() throws Throwable {
		
		buyer.dynamictext();
		
	}

	@Then("^Click on continue button$")
	public void click_on_continue_button() throws Throwable {
		
		buyer.clickbuttonone();
		
	}

	@Then("^Select value from dropdown box$")
	public void select_value_from_dropdown_box() throws Throwable {
		buyer.selectdrop();
	   
	}

	@Then("^Click continue button$")
	public void click_continue_button() throws Throwable {
		buyer.clickbuttontwo();
		
	}

	@Then("^Assert the url$")
	public void assert_the_url() throws Throwable {
		
		buyer.asserturl();
		
			
	}

	}
