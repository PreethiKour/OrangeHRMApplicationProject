package Test;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import Pages.HomePage;
import Pages.LoginPage;

public class HomePageTest {


LoginPage LoginPage;
HomePage homepage;


@BeforeTest
public void configBrowser()
{
	LoginPage = new LoginPage();
	LoginPage.login();
}

@Test

public void searchTest()
{
	try {
		LoginPage.login();
		homepage.isMyInfoLinkDisplayed();
	}
	catch(Exception e) {
	}
}

@AfterTest
public void closeBrowser()
{
	LoginPage.tearDown();
	
}









}





