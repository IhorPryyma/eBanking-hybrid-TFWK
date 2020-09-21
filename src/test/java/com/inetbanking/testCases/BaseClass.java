package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL = "http://demo.guru99.com/V4/";
	public String username = "mngr285799";
	public String password = "usAqYsu";
	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/Drivers/chromedriver");
		driver = new ChromeDriver();
		
		logger = Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
