package Pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;

public class DependentsPage extends BaseClass {


	

 By dependenttab = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a");
 By addbtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[4]/a");
 By name = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
 By Relationshipdropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
 By value = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]");
 By deleteBtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div/div/button[1]/i");
 By cancelButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[1]");
 By savebtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]");
 
 

public void clickDependentsfield()
{
	try {
		Thread.sleep(1000);
		driver.findElement(dependenttab).click();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}

public void clickAddDependents()

{
	try {
		Thread.sleep(1000);
		driver.findElement(addbtn).click();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}

	
}
	
public void enterName()
{
	try {
		Thread.sleep(0);
		WebElement ele = driver.findElement(name);
		ele.sendKeys(prop.getProperty("Name"));
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	
	
	
}

public void selectRelationship()
{
	WebElement ele = driver.findElement(Relationshipdropdown);
	Actions actions = new Actions(driver);
	actions.moveToElement(ele);
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	List<WebElement>  status= driver.findElements(value);
	for(WebElement relationship: status)
    {
		System.out.println(relationship.getText());
    }
}

public void deleteDependents()
{
	try {
	Thread.sleep(1000);
	WebElement ele = driver.findElement(deleteBtn);
	ele.click();
	}catch (Exception e) {
	e.printStackTrace();
	}
}

public void cancelButton()
{
	try {
		Thread.sleep(1000);
		WebElement ele = driver.findElement(cancelButton);
	    ele.click();
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	

}

{
	
}

}





