package com.myshop.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IndexPage {
	WebDriver ldriver;

	public IndexPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath=("//a[@title='Log in to your customer account']"))
	WebElement signIn;
	
	//Action
	
	public void clickOnSignin() {
		signIn.click();
	}
}
