package genaricutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility 
{
	
	/**
	 * 
	 * @param sheetName 
	 * @param rowindex
	 * @param cellindex
	 * @return
	 * @throws Exception
	 */
	public  String getdataformat(String sheetName,int rowindex,int cellindex) throws Exception 
	{
		FileInputStream fis=new FileInputStream(IPathUtility.excelpath);
		Workbook wb=WorkbookFactory.create(fis);
		Cell cell=wb.getSheet(sheetName).getRow(rowindex).getCell(cellindex);
		DataFormatter df=new DataFormatter();
		String value=df.formatCellValue(cell);
		return value;
	}
	/**
	 * 
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultipleDataFromExcel(String sheetName,int startRowIndex,int startCellIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(IPathUtility.excel);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		DataFormatter df=new DataFormatter();
		List<String> data=new ArrayList<>();
		for(int i=startRowIndex;i<=sh.getLastRowNum();i++)
		{
			Row row=sh.getRow(i);
			for(int j=startCellIndex;j<row.getLastCellNum();j++)
			{
				Cell cell=row.getCell(j); 
				String value=df.formatCellValue(cell);
				data.add(value);
			}
		}
		return data;
	}
}
