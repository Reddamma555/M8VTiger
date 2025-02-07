package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class createContactsPage
{
	//locating elements
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstNameField;
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastNameField;
		@FindBy(xpath="//select[@name='leadsource']")
		private WebElement leadsSourceField;
		@FindBy(xpath="//input[@name='title']")
		private WebElement titleField;
		@FindBy(xpath="//input[@name='email']")
		private WebElement emailField;
		@FindBy(xpath="//input[@name='mailingcity']")
		private WebElement mailingcityField;
		@FindBy(xpath="//input[@name='mailingstate']")
		private WebElement mailingstateField;
		@FindBy(xpath="//input[@value='  Save  ']")
		private WebElement saveButton;
		//pom class
		public  createContactsPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getfirstNameField()
		{
			return firstNameField;
		}
		public WebElement getlastNameField()
		{
			return lastNameField;
		}
		public WebElement getleadsSourceField()
		{
			return leadsSourceField;
		}
		public WebElement gettitleField()
		{
			return titleField;
		}
		public WebElement getemailField()
		{
			return emailField;
		}
		public WebElement getmailingcityField()
		{
			return mailingcityField;
		}
		public WebElement getmailingstateField()
		{
			return  mailingstateField;
		}
		public WebElement getsaveButton()
		{
			return saveButton;
		}
		//libraries
		public void newCreateContacts(String firstName,String lastName,String leadsSource)
		{
			getfirstNameField().sendKeys(firstName);
			getlastNameField().sendKeys(lastName);
			Select s=new Select(getleadsSourceField());
			s.selectByValue(leadsSource);
			getsaveButton().click();
		}
		public void newCreateContacts(String firstName,String lastName,String title,String email)
		{
			getfirstNameField().sendKeys(firstName);
			getlastNameField().sendKeys(lastName);
			gettitleField().sendKeys(title);
			getemailField().sendKeys(email);
			getsaveButton().click();
		}
		public void newCreateContacts(String firstName,String lastName,String title,String email,String mailingcity,String mailingstate)
		{
			getfirstNameField().sendKeys(firstName);
			getlastNameField().sendKeys(lastName);
			gettitleField().sendKeys(title);
			getemailField().sendKeys(email);
			getmailingcityField().sendKeys(mailingcity);
			getmailingstateField().sendKeys(mailingstate);
			getsaveButton().click();
		}
}
