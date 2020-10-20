package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginpageOrange {
	WebDriver driver;
	public LoginpageOrange (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (how= How.XPATH, using = "//*[@id='txtUsername']")
	private WebElement username;

	@FindBy (how= How.XPATH, using = "//*[@id='txtPassword']")
	private WebElement password;
	

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	
	


	
	
	

}
