package com.cucumber.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	protected static WebDriver driver;

	public WebDriver launchapplication() {
	if(driver==null);
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
	    driver.get("https://selenium-prd.firebaseapp.com/");
		
		

	}
	return driver;
}
}