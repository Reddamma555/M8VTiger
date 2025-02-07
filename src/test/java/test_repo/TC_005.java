package test_repo;

import org.testng.annotations.Test;

import genaricutility.BaseClass;
import pomclass.contactsPage;
import pomclass.createContactsPage;
import pomclass.homePage;

public class TC_005 extends BaseClass
{
	@Test(groups= {"regresion ,sanity"})
	public void contacts_001() throws Exception
	{
		System.out.println("test execution started");
		homePage hp=new homePage(driver);
		hp.clickOncontacts();
		
		contactsPage  lp=new contactsPage (driver);
		lp.clickOnCreateContacts();
		
		String fName=eUtil.getdataformat("contacts", 6, 1);
		String lName=eUtil.getdataformat("contacts", 6, 2);
		String leadSource=eUtil.getdataformat("contacts", 6, 3);
		String title=eUtil.getdataformat("contacts", 6, 4);
		String email=eUtil.getdataformat("contacts", 6, 5);
		createContactsPage ccp=new createContactsPage(driver);
		ccp.newCreateContacts(fName, lName, title, email);
		System.out.println("test execution ended");
	}
}
