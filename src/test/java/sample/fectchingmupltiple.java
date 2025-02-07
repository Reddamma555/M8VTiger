package sample;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import genaricutility.ExcelUtility;

public class fectchingmupltiple 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
//		FileInputStream fis=new FileInputStream("C:\\Users\\surag_1m\\OneDrive\\Desktop\\selelinum\\com.crm.vtiger\\src\\test\\resources\\testData\\test.xlsx");
//		Workbook wb=WorkbookFactory.create(fis);
//		Sheet sh=wb.getSheet("Animal");
//		System.out.println(sh.getLastRowNum());
//		DataFormatter df=new DataFormatter();
//		for(int i=1;i<=sh.getLastRowNum();i++)
//		{
//			Row row=sh.getRow(i);
//			for(int j=0;j<row.getLastCellNum();j++)
//			{
//				Cell cell=row.getCell(j);
//				String value=df.formatCellValue(cell);
//				System.out.println(value);
//			}
//		}
		ExcelUtility e=new ExcelUtility();
		List<String> value=e.getMultipleDataFromExcel("Animal", 1, 0);
		System.out.println(value);
	}
}
