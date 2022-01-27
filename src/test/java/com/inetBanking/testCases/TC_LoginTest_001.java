package com.inetBanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass{
	
	LoginPage loginPage;
	
	@Test
	public void loginTest() throws IOException {
		logger.info("URL is opened");
		
		loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		logger.info("Entered username");
		
		loginPage.setPassword(password);
		logger.info("Entered password");
		
		loginPage.clickSubmit();
		logger.info("Clicked on submit");
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}
