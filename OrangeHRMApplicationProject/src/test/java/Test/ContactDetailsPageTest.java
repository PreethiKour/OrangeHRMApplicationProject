package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.ContactDetailsPage;
import Pages.LoginPage;

public class ContactDetailsPageTest {


	LoginPage LoginPage;
	ContactDetailsPage contactpage;
	

	@BeforeMethod
	public void configBrowser()
	{
		LoginPage = new LoginPage();
		LoginPage.initialize();
	}
	
@Test	
public void verifyContactDetails()
{
	LoginPage.login();
	contactpage.clickContactDetails();
}

@Test
public void enterCityField()
{
	
		LoginPage.login();
		contactpage.enterCity();
	}
	


@Test
public void enterStateField()
{
	LoginPage.login();
	contactpage.enterState();
}

@Test
public void enterZipcodeField()
{
	LoginPage.login();
	contactpage.enterZipCode();
}


@Test
public void selectCountryField() {
	LoginPage.login();
	contactpage.selectCountry();
}

@Test
public void clickOnSave()
{
	LoginPage.login();
	contactpage.clickSaveButton();
}

@AfterMethod
public void closeBrowser() {
	LoginPage.tearDown();
}



}









