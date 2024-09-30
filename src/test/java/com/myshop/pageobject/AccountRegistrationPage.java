package com.myshop.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountRegistrationPage {

	WebDriver ldriver;

	public AccountRegistrationPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//input[@id='id_gender1']")
	WebElement title;

	@FindBy(xpath = "//input[@id='customer_firstname']")
	WebElement firstname;

	@FindBy(xpath = "//input[@id='customer_lastname']")
	WebElement lastname;

	@FindBy(xpath = "//input[@id='passwd']")
	WebElement password;

	@FindBy(xpath = "//select[@id='days']")
	WebElement days;

	@FindBy(xpath = "//select[@id='months']")
	WebElement months;

	@FindBy(xpath = "//select[@id='years']")
	WebElement years;

	@FindBy(xpath = "//input[@id='newsletter']")
	WebElement newsletter;

	@FindBy(xpath = "//span[normalize-space()='Register']")
	WebElement registerButton;

	// Action

	public void clickonTitle() {
		title.click();
	}

	public void enterFirstName(String fstname) {
		firstname.sendKeys(fstname);
	}

	public void enterLastName(String lstname) {
		lastname.sendKeys(lstname);
	}
	
	public void enterPassword(String pswd) {
		password.click();
		password.sendKeys(pswd);
	}

	public void selectDateofBirth() {
		Select sc1 =new Select(days);
		sc1.selectByValue("11");
		Select sc2 =new Select(months);
		sc2.selectByValue("10");
		Select sc3 =new Select(years);
		sc3.selectByValue("1999");
	}
	public void clickonNewletter() {
		newsletter.click();
	}
	public void clickonregisterButton(){
		registerButton.click();
	}
}
