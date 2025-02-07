package genaricutility;

import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports; 
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplementation implements ITestListener
{

	ExtentReports report;
	ExtentTest test;
	JavaUtility jUtil=new JavaUtility();
	String dateTimeStamp=jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");

	
	@Override
	public void onTestStart(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"listeners test started");
		Reporter.log(methodName+"listeners test started");
		
		//adding test method to reports
		test=report.createTest(methodName);
		
	} 

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"listeners test passed");
		Reporter.log(methodName+"listeners test passed");
		
		test.log(Status.PASS,methodName+"test passed");
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"listeners test started");
		Reporter.log(methodName+"listeners test started");	
		
		test.log(Status.FAIL, result.getThrowable());
		test.log(Status.FAIL,methodName+"test failed");
		
		SeleniumUtility sUtil=new SeleniumUtility();
		try {
			String path=sUtil.getWebpageScreenshot(BaseClass.sDriver, dateTimeStamp);
			test.addScreenCaptureFromPath(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"listeners test skipped");
		Reporter.log(methodName+"listeners test skipped");	
		
		test.log(Status.SKIP,methodName+"test skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		
	}

	@Override
	public void onStart(ITestContext context) 
	{
		System.out.println("listeners suite started");
		
		//configuration of extent report
		ExtentSparkReporter reporter=new ExtentSparkReporter(".\\extent reports\\report_"+dateTimeStamp+".html");
		reporter.config().setDocumentTitle("VTiger report");
		reporter.config().setReportName("VTiger execution report");
		reporter.config().setTheme(Theme.STANDARD);
		
		
		//generation of extent report
		report=new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("base paltform", "windows");
		report.setSystemInfo("base browser", "chrome");
		report.setSystemInfo("test engineer", "reddamma");
		report.setSystemInfo("base application", "VTiger");

	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("listerners suite ended");
		
		//flush out report to create a report
		report.flush();
	}
	
}
