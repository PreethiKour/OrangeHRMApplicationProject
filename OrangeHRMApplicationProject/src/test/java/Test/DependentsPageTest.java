package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import Pages.DependentsPage;
import Pages.LoginPage;


public class DependentsPageTest {

	LoginPage LoginPage;
	DependentsPage dependents;


	@BeforeMethod
	public void configBrowser()
	{
		LoginPage = new LoginPage();
		LoginPage.initialize();
		
	}

	@Test
	public void clickDependentOnField()
	{
		LoginPage.login();
		dependents.clickDependentsfield();
	}

	@Test
	public void addDependents()
	{
		LoginPage.login();
		dependents.clickAddDependents();
	}

	@Test
	public void setName()
	{
		LoginPage.login();
		dependents.enterName();
	}


	@Test
	public void setRelationshipStatus()
	{
		LoginPage.login();
		dependents.selectRelationship();
		
	}

	@Test
	public void deleteButton()
	{
		LoginPage.login();
		dependents.deleteDependents();
	}

	@Test
	public void cancelDependents()
	{
		LoginPage.login();
		dependents.cancelButton();
	}

	

	@AfterMethod
	public void closeBrowser()
	{
		LoginPage.tearDown();
	}






}
