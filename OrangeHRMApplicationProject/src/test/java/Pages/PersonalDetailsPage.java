package Pages;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import Base.BaseClass;

public class PersonalDetailsPage extends BaseClass {



By myinfo = By.xpath("//a[@href='/web/index.php/pim/viewMyDetails']");
By firstname = By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']");
By lastname =By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']");
By employeeid = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input");
By driverlicensenum = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input");
By ssnnum = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input");
By nationalityDropdown = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']//div[@class='oxd-select-text-input'][1]");
By country = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[1]/div[1]/div/div[2]/div/div/div[1]");
By savebutton = By.xpath("//button[@type='submit'][1]");
By profilepicture = By.xpath("//img[@class='employee-image'][1]");



public void clickMyInfo()
{
	try {
		Thread.sleep(1000);
		driver.findElement(myinfo).click();
	}catch (InterruptedException e) {
	 e.printStackTrace();
	}
}

public void setFirstName() {

	try {
		Thread.sleep(2000);
		WebElement name =  driver.findElement(firstname);
		name.clear();
		name.sendKeys(prop.getProperty("fname"));
	}catch (InterruptedException e) {
		e.printStackTrace();
	}
	
}
	


	public void setLastName() {
		try {
				Thread.sleep(2000);
				WebElement name = driver.findElement(lastname);
			        name.clear();
				name.sendKeys(prop.getProperty("Lastname"));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	

public void setEmpID()
{
	
	   try {
		Thread.sleep(1000);
		WebElement name = driver.findElement(employeeid);
		name.clear();
		name.sendKeys(prop.getProperty("empID"));
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
		
}


public void setDriverLicenseNumber()
{
	
	try {
		Thread.sleep(1000);
		WebElement name = driver.findElement(driverlicensenum);
		name.sendKeys(prop.getProperty("driver license"));
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
}

public void setSSNNumber()
{
	try {
		Thread.sleep(1000);
		WebElement name = driver.findElement(ssnnum);
		name.sendKeys(prop.getProperty("SSN"));
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
}

public void setNationalityDropDown()
{
	
	WebElement ele = driver.findElement(nationalityDropdown);
	Actions actions = new Actions(driver);
	actions.moveToElement(ele);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	List<WebElement>  allcountries= driver.findElements(country);
	for(WebElement country: allcountries)
    {
		System.out.println(country.getText());
    }
}
	
	public void clickSaveButton()
	{
		try {
			Thread.sleep(1000);
			WebElement ele = driver.findElement(savebutton);
			ele.click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}

	public void viewProfilePicture()
	{
		
		try {
			Thread.sleep(1000);
			WebElement ele = driver.findElement(profilepicture);
			ele.click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}



