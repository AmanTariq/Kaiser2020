package qa.testing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlsReader1 {
	public String[][] readExcel(String filePath, String fileName, String sheetName) throws IOException {
		File file = new File(filePath + "\\" + fileName);
		FileInputStream inputStream = new FileInputStream(file);
		Workbook TWorkbook = null;
		String fileExtensionName = fileName.substring(fileName.indexOf("."));
		if (fileExtensionName.equals(".xlsx")) {
			TWorkbook = new XSSFWorkbook(inputStream);
		}
		else if (fileExtensionName.equals(".xls")) {
			TWorkbook = new HSSFWorkbook(inputStream);
		}
		Sheet TSheet = TWorkbook.getSheet(sheetName);
		int rowCount = TSheet.getLastRowNum() - TSheet.getFirstRowNum();
		int cellCount = TSheet.getRow(0).getLastCellNum();
		String data[][] = new String[rowCount][cellCount];
		for (int i = 1; i <= rowCount; i++) {
			Row r = TSheet.getRow(i);

			for (int j = 0; j <= cellCount; j++) {
				Cell c = r.getCell(j);
				try {
					data[i - 1][j] = c.getStringCellValue();
					System.out.print(r.getCell(j).getStringCellValue());
				} catch (Exception e) {

				}
			}
		}

		return data;
	}
}
