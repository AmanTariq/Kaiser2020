package qa.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlrw {

	public static void main(String[] args) throws Exception {
		File xlfile=new File("C:\\Te\\Bok.xlsx");
		FileInputStream fis=new FileInputStream(xlfile);
		XSSFWorkbook xlbook=new XSSFWorkbook(fis);
		XSSFSheet xlshet=xlbook.getSheet("pg");
		XSSFRow xlrow=xlshet.getRow(3);
		XSSFCell xlcell=xlrow.getCell(3);
		System.out.println(xlcell.getStringCellValue());
		
		xlcell=xlrow.getCell(0);
		System.out.println(xlcell.getNumericCellValue());
		fis.close();
		
		FileOutputStream xlwr=new FileOutputStream(xlfile);
		
		xlrow.createCell(5).setCellValue("@");
		xlrow.createCell(6).setCellValue("@");
		xlrow.createCell(7).setCellValue("@");
		xlrow.createCell(8).setCellValue("@");
		xlrow.createCell(9).setCellValue("@");
		
		xlbook.write(xlwr);
		xlwr.close();
		
		
	}

}















