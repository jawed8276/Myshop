package com.myshop.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	WebDriver ldriver;
	
	public MyAccountPage(WebDriver rdriver){
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;
	
	@FindBy(xpath = "//span[normalize-space()='Sign in']")
	WebElement signInButton;
	
	@FindBy(xpath = "//input[@id='email_create']")
	WebElement emailAddress;
	
	@FindBy(xpath = "//span[normalize-space()='Create an account']")
	WebElement createAccountButton;
	
	
	
	//Action
	public void enterEmail(String emailid) {
		email.sendKeys(emailid);
	}
	public void enterPassword(String pswd) {
		password.sendKeys(pswd);
	}
	public void clickonSigninButton() {
		signInButton.click();
	}
	
	public void enterEmailAddress(String emailAdd) {
		emailAddress.sendKeys(emailAdd);
	}
	public void clickonCreateAccoountButton() {
		createAccountButton.click();
	}
}
