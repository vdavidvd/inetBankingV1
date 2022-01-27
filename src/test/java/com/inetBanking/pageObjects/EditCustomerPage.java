package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
	
	WebDriver driver;
	
	public EditCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Edit Customer']")
	WebElement linkEditCustomer;
	
	@FindBy(name="cusid")
	WebElement txtCustomerId;
	
	@FindBy(name="AccSubmit")
	WebElement btnSubmit;
	
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
	
	@FindBy(name="sub")
	WebElement btnEditSubmit;
	
	public void clickLinkEditCustomer() {
		linkEditCustomer.click();
	}
	
	public void setCustomerId(String custId) {
		txtCustomerId.sendKeys(String.valueOf(custId));
	}
	
	public void clickSubmit() {
		btnSubmit.click();
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
	
	public void clickEditSubmit() {
		btnEditSubmit.click();
	}

}
