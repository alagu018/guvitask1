package Task13;

import java.io.IOException; 

import org.apache.poi.xssf.usermodel.XSSFCell;   
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadOperation {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook book = new XSSFWorkbook("C:\\Users\\pandiyaraja\\Desktop\\TASK13\\Sampleread.xlsx");  // Opening a book and mentioning the path of the excel file that needs to be read
		XSSFSheet sheet = book.getSheetAt(0); 
		
		int rowcount = sheet.getLastRowNum();  
		int columncount = sheet.getRow(0).getLastCellNum(); 
		
		String[][] data = new String[rowcount][columncount];
		
		for(int i=1; i<=rowcount; i++) {
			
			XSSFRow row = sheet.getRow(i); 
			
			for(int j=0; j<columncount; j++) {
				
				XSSFCell cell = row.getCell(j); 
				
				data[i-1][j] = cell.getStringCellValue(); 
				System.out.println(cell.getStringCellValue()); 
			}
		}
		book.close(); 
		
	}

}
