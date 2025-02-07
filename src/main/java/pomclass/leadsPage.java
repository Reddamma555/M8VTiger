package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadsPage 
{
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement createLeadsMenu;
	//pom class
	public  leadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getcreateLeadsMenu()
	{
		return createLeadsMenu;
	}
	// business libraries
	public void clickOnCreateLeads()
	{
		getcreateLeadsMenu().click();
	}

	
}
