package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addCustomerTest() throws InterruptedException, IOException {
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		logger.info("Login successful");
		
		Thread.sleep(3000);
		
		AddCustomerPage addcustomer = new AddCustomerPage(driver);
		addcustomer.clickAddNewCustomer();
		
		logger.info("Setting up new customer...");
		addcustomer.setCustomerName("Ihor");
		addcustomer.setMaleGender();
		addcustomer.setBirthdayDate("03", "17", "1983");
		addcustomer.setAddress("Ukraine");
		addcustomer.setCity("Lviv");
		addcustomer.setState("Lvivska");
		addcustomer.setPIN("790000");
		addcustomer.setPhoneNumber(randomNum());
		addcustomer.setEmail(randomString() + "@test.com");
		addcustomer.setPassword("123456");
		
		addcustomer.clickSubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started...");
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if (res) {
			Assert.assertTrue(true);
			logger.info("Testcase passed");
		} else {
			captureScreen(driver, "addNewCustomer");
			logger.info("Testcase failed");
			Assert.assertTrue(false);
		}
		
	}
	


}
