package qa.common;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Xlrw {
	@SuppressWarnings("resource")                        // IF NOT WORKING JUST REMOVE THIS LINE
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
		xlrow.createCell(5).setCellValue("@@@");
		xlrow.createCell(6).setCellValue("@@@");
		xlrow.createCell(7).setCellValue("44");
		xlrow.createCell(8).setCellValue("1");
		xlrow.createCell(9).setCellValue("9");	
		xlbook.write(xlwr);
		xlwr.close();	
	}
}