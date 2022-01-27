package com.inetBanking.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetBanking.pageObjects.LoginPage;
import com.inetBanking.utilities.XLUtils;

public class TC_LoginDDT_002 extends BaseClass{
	
	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(user);
		logger.info("user name provided");
		
		loginPage.setPassword(pwd);
		logger.info("password provided");
		
		loginPage.clickSubmit();
		logger.info("Clicked on submit");
		
		if(isAlertPresent()==true) {
			driver.switchTo().alert().accept();//close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Login failed");
		}else {
			Assert.assertTrue(true);
			logger.info("Login passed");
			loginPage.clikLinkLogout();
			driver.switchTo().alert().accept();//close logout alert
			driver.switchTo().defaultContent();
		}
	}
	
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException {
		String path = System.getProperty("user.dir")+
				"/src/test/java/com/inetBanking/testData/LoginData.xlsx";
		
		int rowNumber = XLUtils.getRowCount(path, "Sheet1");
		int columnNuber = XLUtils.getCellCount(path, "Sheet1", 1);
		
		String[][] loginData = new String[rowNumber][columnNuber];
		
		for(int i=1; i<=rowNumber; i++) {
			for(int j=0; j<columnNuber; j++) {
				loginData[i-1][j] = XLUtils.getCellData(path, "Sheet1", i, j);//[i-1] because xmlutils is [1][0]
			}
		}
		return loginData;
	}

}
