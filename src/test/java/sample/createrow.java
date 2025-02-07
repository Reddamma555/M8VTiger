package sample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class createrow 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\surag_1m\\OneDrive\\Desktop\\test.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Animal");
		sh.createRow(6).createCell(2).setCellValue("duck");
		sh.getRow(6).createCell(1).setCellValue("pig");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\surag_1m\\OneDrive\\Desktop\\test.xlsx");
		wb.write(fos);
	}
}
