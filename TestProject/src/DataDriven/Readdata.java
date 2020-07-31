package DataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class Readdata {

	public static void main(String[] args) throws IOException {
		// Write code Excel file stream object
		FileInputStream file = new FileInputStream("C:\\selenium-Samples\\Excel\\SampleExcel.xlsx");
		// Excel work book object
		XSSFWorkbook wb = new XSSFWorkbook(file);
		//Excel sheet object
		XSSFSheet sh = wb.getSheet("Sample"); // With sheet name
		// Row count
		int rc = sh.getLastRowNum();
		System.out.println("Ror count:"+rc);
		// Coloumn count
		int cc = sh.getRow(0).getLastCellNum(); // first frow cell count
		System.out.println("Ror count:"+rc+"Column Count:"+cc);
		for(int r=0;r<rc;r++)
		{
			XSSFRow cr=sh.getRow(r); //Keep focus on the current row
			//System.out.println("Ror count:"+cr);
			for(int c=0;c<cc;c++)
			{
				String cv=cr.getCell(c).toString();  // tostring is to read the data from a cell
				System.out.print("\t " +cv+"\t");
			}
			System.out.println();
		}
		
		
	}

}
