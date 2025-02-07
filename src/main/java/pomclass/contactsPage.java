package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactsPage 
{
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createContacts;
	//pom class
	public contactsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getcreateContacts()
	{
		return createContacts;
	}
	public void clickOnCreateContacts()
	{
		 getcreateContacts().click();
	}
}
