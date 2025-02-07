package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage 
{
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Leads']")
	private WebElement leadsMenu;
	@FindBy(xpath="//td[@class='tabUnSelected']/a[text()='Contacts']")
	private WebElement contactsMenu;
	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
	private WebElement administor;
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut;
	//login page pom class
	public  homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getleadsMenu()
	{
		return leadsMenu;
	}
	public WebElement getcontactsMenu()
	{
		return contactsMenu;
	}
	public WebElement getadministor()
	{
		return administor;
	}
	public WebElement getsignOut()
	{
		return signOut;
	}
	//business library to perform login operation
	public void clickOnLeads()
	{
		getleadsMenu().click();
	}
	public void clickOncontacts()
	{
		getcontactsMenu().click();
	}
	public void signOutOperation(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(getadministor()).perform();
		getsignOut().click();
	}
}
