package Pages;




import org.openqa.selenium.By;



import Base.BaseClass;

public class HomePage extends BaseClass
{

	By myinfoLink = By.linkText("viewMyDetails");

	public boolean isMyInfoLinkDisplayed() {
        return driver.findElement(myinfoLink).isDisplayed();

	}
	public void clickMyInfoLink() {
        driver.findElement(myinfoLink).click();
        
    }

}