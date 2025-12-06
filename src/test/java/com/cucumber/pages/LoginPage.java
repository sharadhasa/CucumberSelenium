package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.BasePage.BasePage;

public class LoginPage extends BasePage{
	
	
	public LoginPage(WebDriver driver) {

		super(driver);
		
		
		
		
addobject("Username", By.id("email_field"));
	addobject("Password", By.id("password_field"));
	addobject("Login",By.xpath("//button[contains(text(),'Login to Account')]"));
	}
	
	

}
