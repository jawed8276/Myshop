package com.myshop.testcases;

import org.testng.annotations.Test;

import com.myshop.pageobject.AccountRegistrationPage;
import com.myshop.pageobject.IndexPage;
import com.myshop.pageobject.MyAccountPage;

public class AccountRegistrationTest extends Base{

	@Test
	public void verifyAccountRegistration() {
		driver.get(url);
		logger.info("Url opened");
		IndexPage ip =new IndexPage(driver);
		ip.clickOnSignin();
		logger.info("click on sign in");
		MyAccountPage map = new MyAccountPage(driver);
		map.enterEmailAddress("jawedabc@gmail.com");
		logger.info("email entered ");
		map.clickonCreateAccoountButton();
		logger.info("create account button clicked entered ");
		AccountRegistrationPage arp =new AccountRegistrationPage(driver);
		arp.clickonTitle();
		arp.enterFirstName("jawed");
		logger.info("firstname entered");
		arp.enterLastName("alam");
		logger.info("lastname entered");
		arp.enterPassword("jawed@8276");
		logger.info("entered password");
		arp.selectDateofBirth();
		logger.info("date of birth selected");
		arp.clickonNewletter();
		logger.info("newsletter clicked");
		arp.clickonregisterButton();
		logger.info("click on registration button");
	}
}
