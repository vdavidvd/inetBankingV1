package com.inetBanking.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustorerPage {
	
	WebDriver driver;
	
	public AddCustorerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='New Customer']")
	WebElement linkAddNewCustomer;
	
	@FindBy(name="name")
	WebElement txtCustomerName;
	
	@FindBy(name="rad1")
	WebElement radioButtonGender;
	
	@FindBy(name="dob")
	WebElement txtDataOfBirth;
	
	@FindBy(name="addr")
	WebElement txtAddress;
	
	@FindBy(name="city")
	WebElement txtCity;
	
	@FindBy(name="state")
	WebElement txtState;
	
	@FindBy(name="pinno")
	WebElement txtPin;
	
	@FindBy(name="telephoneno")
	WebElement txtTelephone;
	
	@FindBy(name="emailid")
	WebElement txtEmail;
	
	@FindBy(name="password")
	WebElement txtPassword;
	
	@FindBy(name="sub")
	WebElement btnSubmit;
	
	@FindBy(xpath="//table[@id='customer']//tr[4]//td[2]")
	WebElement customerId;
	
	public String getCustomerId() {
		return customerId.getText();
	}
	
	public void clickLinkAddNewCustomer() {
		linkAddNewCustomer.click();
	}
	
	public void setCustomerName(String custName) {
		txtCustomerName.sendKeys(custName);
	}
	
	public void setGender(String cgender) {
		radioButtonGender.click();
	}
	
	public void setDateOfBirth(String dd, String mm, String yy) {
		txtDataOfBirth.sendKeys(dd);
		txtDataOfBirth.sendKeys(mm);
		txtDataOfBirth.sendKeys(Keys.TAB);
		txtDataOfBirth.sendKeys(yy);
		
	}
	
	public void setAddress(String address) {
		txtAddress.sendKeys(address);
	}
	
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	
	public void sestState(String state) {
		txtState.sendKeys(state);
	}
	
	public void setPin(String pin) {
		txtPin.sendKeys(String.valueOf(pin));
	}
	
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);
	}
	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}
	
	public void setPassword(String pass) {
		txtPassword.sendKeys(pass);
	}
	
	public void clickSubmit() {
		btnSubmit.click();
	}

}
