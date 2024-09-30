package com.myshop.testcases;

import org.testng.annotations.Test;

import com.myshop.pageobject.IndexPage;
import com.myshop.pageobject.MyAccountPage;

public class MyAccountPageTest extends Base {
	@Test
	public void verifyLogin() {
		driver.get(url);
		logger.info("Url opened");
		IndexPage ip = new IndexPage(driver);
		ip.clickOnSignin();
		logger.info("click on sign in link");
		MyAccountPage map = new MyAccountPage(driver);
		map.enterEmail("manzooralam8276@gmail.com");
		logger.info("entered email");
		map.enterPassword("Manzoor@8276");
		logger.info("entered password ");
		map.clickonSigninButton();
		logger.info("entered sigin button");

	}
}
