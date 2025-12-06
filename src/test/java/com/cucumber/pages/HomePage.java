package com.cucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cucumber.BasePage.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		addobject("Home", By.xpath("//a[text()='Home']"));
		addobject("Female",By.xpath("//input[@value='female']"));
		addobject("Name", By.id("name"));
		
	}

}
