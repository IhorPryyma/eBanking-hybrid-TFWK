package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_LoginDDTest_002 extends BaseClass{
	
	@Test(dataProvider="LoginData")
	public void loginDDTest(String user, String pwd) {
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(user);
		logger.info("Entered username: " + username);
		lp.setPassword(pwd);
		logger.info("Entered password: " + password);
		
		lp.clickSubmit();
		
		if (isAlertPresent()) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.warn("Login failed");
			Assert.assertTrue(false);
		} else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			lp.clickLogout();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}

	}
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException {
		
		String path = System.getProperty("user.dir") + "/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rowNum = XLUtils.getRowCount(path, "Sheet1");
		int columnNum = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String [][] loginData = new String[rowNum][columnNum];
		
		for(int i = 1; i <= rowNum; i++) {
			for(int j = 0; j < columnNum; j++) {
				loginData[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		
		return loginData;
		
	}

}
