package test_repo;


import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genaricutility.BaseClass;
import pomclass.createLeadsPage;
import pomclass.homePage;
import pomclass.leadsPage;



@Listeners(genaricutility.ListenersImplementation.class)
public class TC_001 extends BaseClass
{
	@Test(groups= {"regresion"})
	public void leads_001() throws Exception
	{
		System.out.println("test execution started");
		homePage hp=new homePage(driver);
		hp.clickOnLeads();
		 
		//Assert.fail();
		
		leadsPage lp=new leadsPage(driver);																																																																																																																																																																																																																																																																																																																																																																																							
		lp.clickOnCreateLeads();
		 
	 	String iName=eUtil.getdataformat("leads", 2, 1);
		String company=eUtil.getdataformat("leads", 2, 2);
		createLeadsPage clp=new createLeadsPage(driver);
		clp.createNewLead(iName, company);
		System.out.println("test execution ended");
	}
	
}