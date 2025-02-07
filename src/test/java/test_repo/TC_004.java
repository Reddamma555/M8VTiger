package test_repo;

import org.testng.annotations.Test;

import genaricutility.BaseClass;
import pomclass.contactsPage;
import pomclass.createContactsPage;
import pomclass.homePage;

public class TC_004 extends BaseClass
{
	@Test(groups= {"regresion ,sanity"})
	public void contacts_001() throws Exception
	{
		System.out.println("test execution started");
		homePage hp=new homePage(driver);
		hp.clickOncontacts();
		
		contactsPage  lp=new contactsPage (driver);
		lp.clickOnCreateContacts();
		
		String fName=eUtil.getdataformat("contacts", 1, 1);
		String lName=eUtil.getdataformat("contacts", 1, 2); 
		String leadSource=eUtil.getdataformat("contacts", 1, 3);
		createContactsPage ccp=new createContactsPage(driver);
		ccp.newCreateContacts(fName, lName, leadSource);
		System.out.println("test execution ended");
	}
}
