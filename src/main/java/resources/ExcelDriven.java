package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriven {

	public static void main(String[] args) throws IOException {
		
		String file = "C:\\Users\\561877\\OneDrive - Cognizant\\Desktop\\DataSelenium.xlsx";
		
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		
		for (int i=0; i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				XSSFSheet sheet= workbook.getSheetAt(i);
				
				Iterator<Row>  rows= sheet.iterator();
				Row FirstRow = rows.next();
				Iterator<Cell> ce = FirstRow.cellIterator();
				
				int k=0;
				int column = 0; 
				while(ce.hasNext())
				{
					Cell value = ce.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCase"))
					{
						column=k;
					}
					k++;
					
				}
				System.out.println(column);
			}
		}
	}

}
