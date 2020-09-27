package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	public WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	
	@FindBy(xpath="//input[@name='name']")
	@CacheLookup
	WebElement txtCustomerName;
	
	
	@FindBy(name="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(xpath="//input[@id='dob']")
	@CacheLookup
	WebElement dateOfBirthday;
	
	@FindBy(xpath="//textarea[@name='addr']")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(xpath="//input[@name='city']")
	@CacheLookup
	WebElement txtCity;
	
	@FindBy(xpath="//input[@name='state']")
	@CacheLookup
	WebElement txtState;
	
	@FindBy(xpath="//input[@name='pinno']")
	@CacheLookup
	WebElement txtPIN;
	
	@FindBy(xpath="//input[@name='telephoneno']")
	@CacheLookup
	WebElement txtPhoneNumber;
	
	@FindBy(xpath="//input[@name='emailid']")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@name='sub']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void setCustomerName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void setMaleGender() {
		rdGender.click();
	}
	
	public void setBirthdayDate(String mm, String dd, String yy) {
		dateOfBirthday.sendKeys(mm);
		dateOfBirthday.sendKeys(dd);
		dateOfBirthday.sendKeys(yy);
	}
	
	public void setAddress(String caddress) {
		txtAddress.sendKeys(caddress);
	}
	
	public void setCity(String ccity) {
		txtCity.sendKeys(ccity);
	}
	
	public void setState(String cstate) {
		txtState.sendKeys(cstate);
	}
	
	public void setPIN(String cpin) {
		txtPIN.sendKeys(cpin);
	}
	
	public void setPhoneNumber(String cphonenum) {
		txtPhoneNumber.sendKeys(cphonenum);
	}
	
	public void setEmail(String cemail) {
		txtEmail.sendKeys(cemail);
	}
	
	public void setPassword(String cpwd) {
		txtPassword.sendKeys(cpwd);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}

}
