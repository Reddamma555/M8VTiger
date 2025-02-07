package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fectingpropertiesdate 
{
	public static void main(String[] args) throws IOException 
	{
	//	C:\Users\surag_1m\OneDrive\Desktop\sample.properities
		FileInputStream fis=new FileInputStream("C:\\Users\\surag_1m\\OneDrive\\Desktop\\sample.properities");
		Properties prop=new Properties();
		prop.load(fis);
		String value=prop.getProperty("url");
	//	System.out.println(value);
		WebDriver driver=new ChromeDriver();
		driver.get(value);
	}
	
}
