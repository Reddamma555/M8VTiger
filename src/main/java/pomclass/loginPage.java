package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage 
{
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userName;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordText;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement submitButton;
	//login page pom class
	public loginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getuserName()
	{
		return userName;
	}
	public WebElement getpasswordText() 
	{
		return passwordText;
	}
	public WebElement getsubmitButton()
	{
		return submitButton;
	}
	//business library to perform login operation
	public void loginToApplication(String userName,String password)
	{
		getuserName().sendKeys(userName);
		getpasswordText().sendKeys(password);
		getsubmitButton().click();
		
	}
}
