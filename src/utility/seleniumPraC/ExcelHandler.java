package utility.seleniumPraC;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandler {

	public static XSSFWorkbook wbk;
	public static XSSFSheet sheet;
	public static XSSFCell cell;
	public static XSSFRow row;

	public static void main(String[] args) {

		try {
			// FileInputStream EXCELFILE = new
			// FileInputStream(System.getProperty("user.dir")+"\\Resource\\Book.xls");

			readExcelFile();

			System.out.println("Done");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void readExcelFile() {

		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(
					System.getProperty("user.dir") + "\\Resource\\Book1.xlsx");
			wbk = new XSSFWorkbook(fileInputStream);
			sheet = wbk.getSheet("Sheet1");
			
			
			
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				//cell=sheet.ge
				row=sheet.getRow(i);
				row.getCell(0).setCellType(1);
				String sno = row.getCell(0).getStringCellValue();
				String firstName=row.getCell(1).getStringCellValue();
				String lastName=row.getCell(2).getStringCellValue();
				String location=row.getCell(3).getStringCellValue();
				System.out.println(sno+":"+firstName+":"+lastName+":"+location);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
