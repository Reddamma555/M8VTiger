package test_repo;

import org.testng.annotations.Test;

import genaricutility.BaseClass;
import pomclass.createLeadsPage;
import pomclass.homePage;
import pomclass.leadsPage;

public class TC_003 extends BaseClass
{
	@Test(groups= {"smoke,regresion"})
	public void leads_03() throws Exception
	{
		System.out.println("test execution started");
		homePage hp=new homePage(driver);
		hp.clickOnLeads();
		
		leadsPage lp=new leadsPage(driver);
		lp.clickOnCreateLeads();
		 
		String fName=eUtil.getdataformat("leads", 9, 1);
		String lName=eUtil.getdataformat("leads", 9, 2);
		String com=eUtil.getdataformat("leads", 9, 3);
		String phone=eUtil.getdataformat("leads", 9, 4);
		String website=eUtil.getdataformat("leads", 9, 5);
		String emp=eUtil.getdataformat("leads", 9, 6);
		String coun=eUtil.getdataformat("leads", 9, 7);
		String city=eUtil.getdataformat("leads", 9, 8);
		String state=eUtil.getdataformat("leads", 9, 9);
		createLeadsPage clp=new createLeadsPage(driver);
		clp.createNewLead(fName,lName, com, phone, website,emp,coun,city,state);
		System.out.println("test execution ended");
	}
}
