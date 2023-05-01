package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import Pages.EmergencyContactsPage;
import Pages.LoginPage;


public class EmergencyContactsPageTest {


	LoginPage LoginPage;
	EmergencyContactsPage contact;
	

	@BeforeMethod
	public void configBrowser()
	{
		LoginPage = new LoginPage();
		LoginPage.initialize();
		
	}

	@Test
	public void getEmergencyContact()
	{
		LoginPage.login();
		contact.clickEmergencyContacts();
	}
	
	@Test
	public void addButton()
	{
		LoginPage.login();
		contact.clickOnAddButton();
	}

	@Test
	public void getName()
	{
		LoginPage.login();
		contact.enterName();
	}

	@Test
	public void getTelephoneNumber()
	{
		LoginPage.login();
		contact.enterHomeTelephone();
	}


	@Test
	public void getMobileNumber()
	{
		LoginPage.login();
		contact.enterMobileNum();
		
	}

	@Test
	public void getWorkTelephone()
	{
		LoginPage.login();
		contact.enterMobileNum();
		
	}
	@Test
	public void clickSave()
	{
		LoginPage.login();
		contact.clickOnSaveButton();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		LoginPage.tearDown();
	}


	}






