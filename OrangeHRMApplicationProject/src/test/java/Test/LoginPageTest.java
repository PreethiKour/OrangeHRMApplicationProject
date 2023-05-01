package Test;


import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;


import Pages.LoginPage;

public class LoginPageTest
{
	LoginPage LoginPage;
	
	@BeforeMethod
	public void configBrowser()
	{
		LoginPage = new LoginPage();
		LoginPage.initialize();
	}
	
	
	@Test
	public void validateLogin()
	{
        LoginPage.login();
	}
	
	
	
	@AfterMethod
	public void closeBrowser()
	{
		LoginPage.tearDown();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
 
