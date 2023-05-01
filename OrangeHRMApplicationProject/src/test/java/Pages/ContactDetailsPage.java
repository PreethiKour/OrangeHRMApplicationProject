package Pages;
import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;

	import Base.BaseClass;

	public class ContactDetailsPage extends BaseClass {


	By streetaddress = By.xpath("\"//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input");
	By city = By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[3]/div/div[2]/input");
	By state = By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input");
	By zip = By.xpath("//*[@id=\\\"app\\\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[4]/div/div[2]/input");
	By countydropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div");
	By country = By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div/div[1]");
	By savebtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button");

	public void clickContactDetails()

	{
		try {
			Thread.sleep(1000);
		WebElement ele = driver.findElement(streetaddress);
		ele.sendKeys(prop.getProperty("streetaddress"));
		ele.click();
	}catch (InterruptedException e) {
		e.printStackTrace();
		
	}
	}
		

	public void enterCity()
	{
		try {
			Thread.sleep(1000);
			WebElement ele = driver.findElement(city);
			ele.sendKeys(prop.getProperty("city"));
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
		

	public void enterState()
	{
		try {
		WebElement ele = driver.findElement(state);
		ele.sendKeys(prop.getProperty("State"));
	}catch (Exception e) {
		e.printStackTrace();
	}
		
	}

	public void enterZipCode()
	{
		try {
			Thread.sleep(1000);
			WebElement ele = driver.findElement(zip);
			ele.sendKeys(prop.getProperty("Zipcode"));
		}catch (Exception e) {
	     e.printStackTrace();
		}
	    
	}

	public void selectCountry()
	{
		WebElement ele = driver.findElement(countydropdown);
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
			driver.findElement(savebtn).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}







