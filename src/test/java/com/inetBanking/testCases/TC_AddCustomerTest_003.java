package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustorerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	@Test
	public void addNewCustomer() throws InterruptedException, IOException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("User name is provided");
		
		loginPage.setPassword(password);
		logger.info("Password is provided");
		
		loginPage.clickSubmit();
		
		AddCustorerPage addCustomer = new AddCustorerPage(driver);
		addCustomer.clickLinkAddNewCustomer();
		
		logger.info("Providing customer details......");
		
		addCustomer.setCustomerName("John");
		addCustomer.setGender("male");
		addCustomer.setDateOfBirth("15", "10", "1985");
		Thread.sleep(3000);
		
		addCustomer.setAddress("USA");
		addCustomer.setCity("New York");
		addCustomer.sestState("State York");
		addCustomer.setPin("5000074");
		addCustomer.setTelephone("987890091");
		
		String email = randomString()+"@gmail.com";
		addCustomer.setEmail(email);
		
		addCustomer.setPassword("abcdef");
		addCustomer.clickSubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started......");
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("Test case passed......");
		}else {
			logger.info("Test case failed......");
			captureScreen(driver, "addNewCustomer");
			Assert.assertTrue(false);
		}
		
	}

}
