package genaricutility;

import org.openqa.selenium.WebDriver;



	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import com.google.common.io.Files;


	public class SeleniumUtility
	{
		

		/**
		 * 
		 * @param driver
		 * @param URL
		 */
		public void acessToApplication(WebDriver driver,String URL)
		{
			driver.get(URL);
		}
		
		/**
		 * This is a generic method to maximize the browser
		 * @param driver
		 */
		public void maximizeWindow(WebDriver driver)
		{
			driver.manage().window().maximize();
		}
		
		/**
		 * This is a generic method to apply implicit wait to the script
		 * @param driver
		 * @param maxTime
		 */
		
		public void implicitWait(WebDriver driver,int maxTime)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(maxTime));
		}
		/**
		 * 
		 * @param dropdownElement
		 * @param index
		 */
		 
		 
		public void selectOptionsUsingIndex(WebElement dropdownElement,int index)
		{
			Select s=new Select(dropdownElement);
			s.selectByIndex(index);
			
		}
		
		/**
		 * This is a generic method to select an option in a dropdown using value attribute
		 * @param dropdownElement
		 * @param value
		 */
		public void selectOptionsUsingValue(WebElement dropdownElement,String value)
		{
			Select s=new Select(dropdownElement);
			s.selectByValue(value);
			
		}
		
		/**
		 * This is a generic method to select an option in a dropdown using visible text
		 * @param dropdownElement
		 * @param visible text
		 */
		public void selectOptionsUsingVisibleText(WebElement dropdownElement,String visibleText)
		{
			Select s=new Select(dropdownElement);
			s.selectByVisibleText(visibleText);
			
		}
		
		////////*Handling Alert////////////////
		/**
		 * This is a generic method to accept the alert popup
		 * @param driver
		 */
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		/**
		 * This is a generic method to dismiss the alert popup
		 * @param driver
		 */
		public void dismissAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		/**
		 * This is a generic method to fetch the alert message from the alert popup
		 * @param driver
		 */
		public String getAlertMessage(WebDriver driver)
		{
			String alertMessage=driver.switchTo().alert().getText();
			return alertMessage;
		}
		
		/**
		 * This is a generic method to pass the value to the alert popup
		 * @param driver
		 */
		public void sendValueToAlert(WebDriver driver, String value)
		{
			driver.switchTo().alert().sendKeys(value);;
		}
		
		//////////////Handling Mouse Actions*///////////////
		
		/**
		 * This is a generic method to perform the mouse hovering action on a element
		 * @param driver
		 * @param element
		 */
		public void mouseHoveringAction(WebDriver driver,WebElement element)
		{
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		//////////////*Handling Frames*/////////////////////
		
		/**
		 * This is a generic method to switch the driver control to a frame using index
		 * @param driver
		 * @param index
		 */
		public void switchToFrameUsingIndex(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		
		/**
		 * This is a generic method to switch the driver control to a frame using nameOrIdAttribute
		 * @param driver
		 * @param nameOrIdAttribute
		 */
		public void switchToFrameUsingNameOrId(WebDriver driver,String nameOrIdAttribute)
		{
			driver.switchTo().frame(nameOrIdAttribute);
		}
		
		
		/**
		 * This is a generic method to switch the driver control to a frame using frame element
		 * @param driver
		 * @param frameElement
		 */
		public void switchToFrameusingFrameElement(WebDriver driver,WebElement frameElement)
		{
			driver.switchTo().frame(frameElement);
		}
		
		////////////*Handling Screenshot///////////////////
		
		/**
		 * This is a generic method to take a screenshot of a webpage
		 * @param driver
		 * @param dateTimeStamp ----> this variable used to make each and every image as unique
		 * @return
		 * @throws IOException
		 */
		public String getWebpageScreenshot(WebDriver driver,String dateTimeStamp) throws IOException 
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\surag_1m\\OneDrive\\Desktop\\selelinum\\com.crm.vtiger\\screenshot\\image-"+dateTimeStamp+".png");
			Files.copy(src, dest);
			return dest.getAbsolutePath();   // used in Listeners
			
		}
//C:\Users\surag_1m\OneDrive\Desktop\selelinum\com.crm.vtiger\screenshot
		
		

	}
	
