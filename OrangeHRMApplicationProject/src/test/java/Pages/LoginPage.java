package Pages;

import org.openqa.selenium.By;


import Base.BaseClass;

public class LoginPage extends BaseClass{


	By username = By.name("username");
	By password = By.name("password");
	By loginbtn = By.xpath("//button[@type ='submit']");
	
	
	
	
	public void login()
	{
		driver.findElement(username).sendKeys(prop.getProperty("username"));
		driver.findElement(password).sendKeys(prop.getProperty("password"));
		driver.findElement(loginbtn).click();
		
		
	}

	


}







