package genaricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod; 
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import pomclass.homePage;
import pomclass.loginPage;

public class BaseClass  
{
	public WebDriver driver;
	public static WebDriver sDriver;  //used only in listeners
	public SeleniumUtility sUtil=new SeleniumUtility();
	public propertiesutility  pUtil=new  propertiesutility();
	public ExcelUtility  eUtil=new ExcelUtility();
	
	@BeforeSuite(alwaysRun= true)
	public void dbConnection()
	{
		System.out.println("db connected");
	}
	@Parameters("browser")
	@BeforeClass(alwaysRun= true)
	public void lanuchBrowser(@Optional("browser") String BROWSER) throws Exception
	{
		 if(BROWSER.equals("chrome"))
		 {
			driver=new ChromeDriver();
		 }
		 else if(BROWSER.equals("edge"))
		 {
			driver=new EdgeDriver();
		 }
		 else if(BROWSER.equals("firefox"))
		 {
			driver=new FirefoxDriver();
		 }
		 else if(BROWSER.equals("safari"))
		 {
			driver=new SafariDriver();
		 }
		 else
		 {
			 driver=new ChromeDriver();
		 }
		 sDriver=driver;   //initilizing static driver with actual driver to be used in listeners
		 sUtil.maximizeWindow(driver);
		 sUtil.implicitWait(driver, 20);
		 String URL=pUtil.getDataFromProperties("url");
		 sUtil.acessToApplication(driver, URL);
		 
	}
	
	@BeforeMethod(alwaysRun= true)
	public  void loginOperation() throws Exception
	{
		String UN=pUtil.getDataFromProperties("username");
		String PWD=pUtil.getDataFromProperties("password");
		loginPage lp=new loginPage(driver);
		lp.loginToApplication(UN, PWD);
		
	}
	@AfterMethod(alwaysRun= true)
	public void logoutOperation()
	{
		homePage hp=new homePage(driver);
		hp.signOutOperation(driver);
	}
	@AfterClass(alwaysRun= true)
	public void closeBrowser()
	{
		driver.quit();
	}
	@AfterSuite(alwaysRun= true)
	public void dbConnectionClosed()
	{
		System.out.println("db closed");
	}
}
