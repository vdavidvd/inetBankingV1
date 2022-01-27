package com.inetBanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {
	
	WebDriver driver;
	
	public DeleteCustomerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Delete Customer']")
	WebElement linkDeleteCustomer;
	
	@FindBy(name="cusid")
	WebElement customerId;
	
	@FindBy(name="AccSubmit")
	WebElement btnSubmit;

}
