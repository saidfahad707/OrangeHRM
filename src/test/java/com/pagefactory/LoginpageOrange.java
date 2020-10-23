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

	@FindBy (how = How.XPATH, using = "//*[@id=\\'btnLogin\\']")
	private WebElement singin;
	
	@FindBy (how = How.XPATH, using = "//*[@id=\\\"welcome\\\"]")
	private WebElement logout;

	@FindBy (how = How.XPATH, using = "//*[@id=\\\"welcome-menu\\\"]/ul/li[2]/a")
	private WebElement click;

	public WebElement getUsername() {
		return username;
	}


	public void setUsername(WebElement username) {
		this.username = username;
	}


	public WebElement getPassword() {
		return password;
	}


	public void setPassword(WebElement password) {
		this.password = password;
	}


	public WebElement getSingin() {
		return singin;
	}


	public void setSingin(WebElement singin) {
		this.singin = singin;
	}


	public WebElement getLogout() {
		return logout;
	}


	public void setLogout(WebElement logout) {
		this.logout = logout;
	}


	public WebElement getClick() {
		return click;
	}


	public void setClick(WebElement click) {
		this.click = click;
	}
	
	
	

}
