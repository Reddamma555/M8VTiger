package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import genaricutility.ExcelUtility;
import genaricutility.SeleniumUtility;
import genaricutility.propertiesutility;

import pomclass.createLeadsPage;
import pomclass.homePage;
import pomclass.leadsPage; 
import pomclass.loginPage;

public class testcase 
{
	public void tc_01() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		SeleniumUtility sUtil=new SeleniumUtility();
		sUtil.maximizeWindow(driver);
		sUtil.implicitWait(driver,15);

		propertiesutility  pUtil=new propertiesutility();
		String url=pUtil.getDataFromProperties("url");
		String un=pUtil.getDataFromProperties("username");
		String pwd=pUtil.getDataFromProperties("password");
		sUtil.acessToApplication(driver,url);
		
		loginPage lop=new loginPage(driver);
		lop.loginToApplication(un, pwd);
		
		homePage hp=new homePage(driver);
		hp.clickOnLeads();
		leadsPage lp=new leadsPage(driver);
		lp.clickOnCreateLeads();
		
		ExcelUtility  eUtil=new ExcelUtility();
		String lname=eUtil.getdataformat("leads", 2, 1);
		String company=eUtil.getdataformat("leads", 2, 2);
		createLeadsPage cnlp=new createLeadsPage(driver);
		cnlp.createNewLead(lname,company);
		
		hp.signOutOperation(driver);
		driver.quit();
	}
}