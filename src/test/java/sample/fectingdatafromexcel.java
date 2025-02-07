package sample;

import genaricutility.ExcelUtility;

public class fectingdatafromexcel 
{
	public static void main(String[] args) throws Exception 
	{
//		FileInputStream fis=new FileInputStream("C:\\Users\\surag_1m\\OneDrive\\Desktop\\module.xlsx");
//		Workbook wb= WorkbookFactory.create(fis);
//		Cell cell=wb.getSheet("Animal");
//		String value=cell.getStringCellValue();
//		System.out.println(value);
//		DataFormatter df=new DataFormatter();
//		String value1=df.formatCellValue(cell);
//		System.out.println(value1);
	
		ExcelUtility e=new ExcelUtility();
		String value=e.getdataformat("Leads", 2, 2);
		System.out.println(value);
		
	}
}
