package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import Base.BaseClass;

public class EmergencyContactsPage extends BaseClass {



	   By emergencycontacts = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a");
	   By addbtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text'][1]");
	   By name = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
	   By homenumber = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input");
	   By mobilenumber = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input");
	   By worknumber= By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input");	   
	   By savebtn = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
	 
	   public void clickEmergencyContacts() {
		   try {
			   Thread.sleep(1000);
			   WebElement ele = driver.findElement(emergencycontacts);
				ele.sendKeys(prop.getProperty("emergency contacts"));
				ele.click(); 
		   }
			catch (InterruptedException e) {
	        e.printStackTrace();
	   }
	   }
	   

	   public void clickOnAddButton() {
			try {
			Thread.sleep(1000);
			WebElement addButtonclick=driver.findElement(addbtn);
			addButtonclick.click(); 
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
		}
	
		public void enterName() {
			try {  
			 Thread.sleep(1000);
			 driver.findElement(name).sendKeys(prop.getProperty("Name"));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}

		
		public void enterHomeTelephone() {
			try {
			 Thread.sleep(1000);
			 WebElement homeTelephone=driver.findElement(homenumber);
			 homeTelephone.sendKeys(prop.getProperty("HomeTelephoneNumber"));
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
			
		}
	
		public void enterMobileNum() {
			try {
			 
				Thread.sleep(2000);
				driver.findElement(mobilenumber).sendKeys(prop.getProperty("Mobilenumber"));
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		}

		
		public void enterWorkTelephone() {
			try {
			 Thread.sleep(1000);
			 WebElement workTelephone=driver.findElement(worknumber);
			 workTelephone.sendKeys("worktelephone");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
			
		}
		public void clickOnSaveButton() { 
			try {
			 Thread.sleep(1000);
			 WebElement saveButton=driver.findElement(savebtn);
			 saveButton.click();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		}
}

