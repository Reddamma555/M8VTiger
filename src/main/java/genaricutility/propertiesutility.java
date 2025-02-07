package genaricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesutility 
{
	/**
	 * 
	 * @param Key
	 * @return
	 * @throws Exception
	 */
	public String getDataFromProperties(String Key) throws Exception
	{
		FileInputStream fis= new FileInputStream(IPathUtility.properties);
		Properties pro=new Properties();
		pro.load(fis);
		String value=pro.getProperty(Key);
		return value;
	}

}   

