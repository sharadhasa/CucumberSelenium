package com.cucumber.BasePage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebDriver driver;//Stores the browser instance
	
	HashMap <String, By> ObjectRepo= new HashMap<String, By>();//Object repo is created with key and value
	
	public BasePage(WebDriver driver) {
		this.driver=driver;
	}


	public void addobject(String elementName,By by) {
		ObjectRepo.put(elementName, by);
	}
	
	
	public WebElement getElement(String elementName) {
	
		By by= ObjectRepo.get(elementName);
		
		WebElement element=driver.findElement(by);
		return element;

}
	
	public void enterintoTextbox(String elementName,String InputData) {
		WebElement element =getElement(elementName);
		element.sendKeys(InputData);
	}
	
	
	public void ClickButton(String elementName)
	{
		WebElement element =getElement(elementName);
		waitforElement(element);
		element.click();
	}
	public void ClickonRadioButton(String elementName)
	{
		WebElement element =getElement(elementName);
		waitforElement(element);
		element.click();
	}
	public void user_enter_the_value(String elementName,String InputData) {
		WebElement element =getElement(elementName);
		waitforElement(element);
		element.sendKeys(InputData);
	}
	


	private void waitforElement(WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
}