package Test;

import org.testng.annotations.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import Pages.LoginPage;
import Pages.PersonalDetailsPage;


public class PersonalDetailsPageTest {

LoginPage LoginPage;
PersonalDetailsPage page;


@BeforeMethod
public void configBrowser()
{
	LoginPage = new LoginPage();
	LoginPage.initialize();
	
}

@Test
public void myInfoTab()
{
	LoginPage.login();
	page.clickMyInfo();
}

@Test
public void getFirstName()
{
	LoginPage.login();
	page.setFirstName();
}

@Test
public void getLastName()
{
	LoginPage.login();
	page.setLastName();
}


@Test
public void getEmployeeID()
{
	LoginPage.login();
	page.setEmpID();
	
}

@Test
public void getDriverLicenseNumber()
{
	LoginPage.login();
	page.setDriverLicenseNumber();
}

@Test
public void getSSNNumber()
{
	LoginPage.login();
	page.setSSNNumber();
}

@Test
public void getNationalityDropDown()
{
	LoginPage.login();
	page.setNationalityDropDown();
}
	
@Test
public void saveButtonClick()
{
	LoginPage.login();
	page.clickSaveButton();
}

@Test
public void checkProfilePicture()
{
	LoginPage.login();
	page.viewProfilePicture();
}

@AfterMethod
public void closeBrowser()
{
	LoginPage.tearDown();
}


}


