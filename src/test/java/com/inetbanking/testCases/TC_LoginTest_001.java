package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() {

		logger.info("URL is opened: " + baseURL);
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(username);
		logger.info("Entered username: " + username);
		lp.setPassword(password);
		logger.info("Entered password: " + password);
		lp.clickSubmit();
		
		if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Testcase passed");
		} else {
			Assert.assertTrue(false);
			logger.info("Testcase failed");
		}
	}

}
