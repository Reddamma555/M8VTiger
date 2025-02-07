package test_repo;

import org.testng.annotations.Test;

import genaricutility.BaseClass;
import pomclass.createLeadsPage;
import pomclass.homePage;
import pomclass.leadsPage;

public class TC_002 extends BaseClass
{
	
	@Test(groups= {"sanity,regresion"})
	public void leads_02() throws Exception
	{
		System.out.println("test execution started");
		homePage hp=new homePage(driver);
		hp.clickOnLeads();
		
		leadsPage lp=new leadsPage(driver);
		lp.clickOnCreateLeads();
		 
		 
		String fName=eUtil.getdataformat("leads", 5, 1);
		String lName=eUtil.getdataformat("leads", 5, 2);
		String com=eUtil.getdataformat("leads", 5, 3);
		String phone=eUtil.getdataformat("leads", 5, 4);
		String website=eUtil.getdataformat("leads", 5, 5);
		createLeadsPage clp=new createLeadsPage(driver);
		clp.createNewLead(fName,lName, com, phone, website);
		System.out.println("test execution ended");
	}
}
