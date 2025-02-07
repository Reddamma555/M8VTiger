package sample;

import genaricutility.ExcelUtility;

public class fectchingdataexcel 
{
	public static void main(String[] args) throws Exception 
	{
		ExcelUtility eUtil=new ExcelUtility();
		String value=eUtil.getdataformat("LEADS", 2, 2);
		System.out.println(value);
	}
}
