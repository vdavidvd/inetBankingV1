package com.inetBanking.testCases;

import org.testng.annotations.Test;

import com.inetBanking.pageObjects.AddCustorerPage;
import com.inetBanking.pageObjects.EditCustomerPage;
import com.inetBanking.pageObjects.LoginPage;

public class TC_EditCustomerTest_004 extends BaseClass{
	
	@Test
	public void editCustomerTest() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.setUserName(username);
		loginPage.setPassword(password);
		loginPage.clickSubmit();
		
		AddCustorerPage addCustomer = new AddCustorerPage(driver);
		addCustomer.clickLinkAddNewCustomer();
		
		addCustomer.setCustomerName("Johnn");
		addCustomer.setGender("male");
		addCustomer.setDateOfBirth("15", "10", "1985");
		
		addCustomer.setAddress("USA");
		addCustomer.setCity("New York");
		addCustomer.sestState("State York");
		addCustomer.setPin("5000074");
		addCustomer.setTelephone("987890091");
		
		String email = randomString()+"@gmail.com";
		addCustomer.setEmail(email);
		
		addCustomer.setPassword("abcdef");
		addCustomer.clickSubmit();
		
		String custId = addCustomer.getCustomerId();
		
		EditCustomerPage editCustomer = new EditCustomerPage(driver);
		editCustomer.clickLinkEditCustomer();
		
		editCustomer.setCustomerId(custId);
		editCustomer.clickSubmit();
		
		editCustomer.setAddress("USAA");
		editCustomer.setCity("New Yorkk");
		editCustomer.sestState("State Yorkk");
		editCustomer.setPin("500055");
		editCustomer.setTelephone("98789009111");
	
		editCustomer.setEmail(email);
		editCustomer.clickEditSubmit();
		
		driver.switchTo().alert().accept();
	}

}
