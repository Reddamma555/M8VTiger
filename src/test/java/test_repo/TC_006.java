package test_repo;

import org.testng.annotations.Test;

import genaricutility.BaseClass;
import pomclass.contactsPage;
import pomclass.createContactsPage;
import pomclass.homePage;

public class TC_006 extends BaseClass
{
	@Test(groups= {"sanity"})
	public void contacts_003() throws Exception 
	{
		System.out.println("test execution started");
		homePage hp=new homePage(driver);
		hp.clickOncontacts();
		
		contactsPage  lp=new contactsPage (driver);
		lp.clickOnCreateContacts();
		
		String fName=eUtil.getdataformat("contacts", 9, 1);
		String lName=eUtil.getdataformat("contacts", 9, 2);
		String leadSource=eUtil.getdataformat("contacts", 9, 3);
		String title=eUtil.getdataformat("contacts", 9, 4);
		String email=eUtil.getdataformat("contacts", 9, 5);
		String city=eUtil.getdataformat("contacts", 9, 6);
		String state=eUtil.getdataformat("contacts", 9, 7);
		createContactsPage ccp=new createContactsPage(driver);
		ccp.newCreateContacts(fName, lName, title, email,city,state);
		System.out.println("test execution ended");
	}
}
