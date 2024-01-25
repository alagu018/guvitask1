package Task13;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;  
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteOperation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		XSSFWorkbook TaskBook = new XSSFWorkbook(); 
		XSSFSheet Sheet1 = TaskBook.createSheet(); 
		
		Object[][] data = {
				
				{"Name","Age","Email"},
				{"John Doe",30,"john@test.com"},       
				{"Jane Doe",28,"jane@test.com"},
				{"Bob Smith",35,"jacky@example.com"},
				{"Swapnil",37,"swapnil@example.com"}
		};
		
		int RowCount = 0; // Initializing rows
		
		for(Object[] row1 : data) { 
			
			XSSFRow row = Sheet1.createRow(RowCount++); 
			
			int ColumnCount = 0; 
			
			for(Object col : row1) { 
				
				XSSFCell cell = row.createCell(ColumnCount++); 
				
				if(col instanceof String) {
					
					cell.setCellValue((String) col);   
					
				}else if(col instanceof Integer) {
					
					cell.setCellValue((Integer) col);
					
				}
			}
			
		}
		
		try(   
				FileOutputStream output = new FileOutputStream("TaskBook.xlsx");){ 
				TaskBook.write(output); 
		} 

	}

}
