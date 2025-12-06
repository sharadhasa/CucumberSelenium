package com.cucumber.steps;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import com.cucumber.BasePage.BasePage;
import com.cucumber.BasePage.BaseTest;
import com.cucumber.pages.HomePage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps extends BaseTest {
	
	BasePage page;
	WebDriver driver;
	

	@Given("User Launch the application")
	public void user_launch_the_application() {
		driver=launchapplication();
	    
	}
	
	
	@Given("User is on {string}")
	public void user_is_on(String pageName) {
		String PackageName="com.cucumber.pages";
		String fullpath=PackageName+"."+pageName;
	  //page=new.LoginPage(driver);
		try {
			page=(BasePage)Class.forName(fullpath).getDeclaredConstructor(WebDriver.class).newInstance(driver);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}



	@When("User enter into textbox {string} {string}")
	public void user_enter_into_textbox(String elementName,String InputData) {
		
		page.enterintoTextbox(elementName, InputData);
	    
	}
	
	
	

	@Then("User click on Button {string}")
	public void user_click_on_button(String elementName) {
		page.ClickButton(elementName);
	   
	}
	

	@Then("User click on Radiobutton {string}")
	public void user_click_on_radiobutton(String elementName) {
	    page.ClickonRadioButton(elementName);
	}

	

	@Then("user enter the value {string} {string}")
	public void user_enter_the_value(String elementName, String InputData) {
	    page.user_enter_the_value(elementName, InputData);
	}
/*@After
public void teardown()
{
	driver.close();
	driver=null;
}*/



	



	
	



	
	

	





	}

