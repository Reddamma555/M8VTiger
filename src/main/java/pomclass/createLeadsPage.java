package pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createLeadsPage 
{
	//locating elements
		@FindBy(xpath="//input[@name='firstname']")
		private WebElement firstNameField;
		@FindBy(xpath="//input[@name='lastname']")
		private WebElement lastNameField;
		@FindBy(xpath="//input[@name='company']")
		private WebElement companyField;
		@FindBy(xpath="//input[@name='phone']")
		private WebElement phoneField;
		@FindBy(xpath="//input[@name='website']")
		private WebElement websiteField;
		@FindBy(xpath="//input[@name='noofemployees']")
		private WebElement noOfEmployeesField;
		@FindBy(xpath="//input[@name='country']")
		private WebElement countryField;
		@FindBy(xpath="//input[@name='city']")
		private WebElement cityField;
		@FindBy(xpath="//input[@name='state']")
		private WebElement stateField;
		@FindBy(xpath="//input[@value='  Save  ']")
		private WebElement saveButton;
		//pom class
		public createLeadsPage(WebDriver driver)
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
		public WebElement getcompanyField()
		{
			return companyField;
		}
		public WebElement getphoneField()
		{
			return phoneField;
		}
		public WebElement getwebsiteField()
		{
			return websiteField;
		}
		public WebElement getnoOfEmployeesField()
		{
			return noOfEmployeesField;
		}
		public WebElement getcountryField()
		{
			return countryField;
		}
		public WebElement getcityField()
		{
			return  cityField;
		}
		public WebElement getstateField()
		{
			return stateField;
		}
		public WebElement getsaveButton()
		{
			return saveButton;
		}
		public void createNewLead(String lastName,String company)
		{
			getlastNameField().sendKeys(lastName);
			getcompanyField().sendKeys(company);
			getsaveButton().click();
		}
		public void createNewLead(String firstName,String lastName , String company,String phone,String website)
		{
			getfirstNameField().sendKeys(firstName);
			getlastNameField().sendKeys(lastName);
			getcompanyField().sendKeys(company);
			getphoneField().sendKeys(phone);
			getwebsiteField().sendKeys(website);
			getsaveButton().click();
		}
		public void createNewLead(String firstName,String lastName , String company,String phonenum,String website,String noofemp,String country,String city,String state)
		{
			getfirstNameField().sendKeys(firstName);
			getlastNameField().sendKeys(lastName);
			getcompanyField().sendKeys(company);
			getphoneField().sendKeys(phonenum);
			getwebsiteField().sendKeys(website);
			getnoOfEmployeesField().sendKeys(noofemp);
			getcountryField().sendKeys(country);
			getcityField().sendKeys(city);
			getstateField().sendKeys(state);
			getsaveButton().click();
		}
}
