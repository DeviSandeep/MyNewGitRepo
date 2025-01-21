package MavenPackage2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	XSSFSheet sh;//Sheet1, declared globally as the variable need to be accessed outside constructor
	
	 public Excel() throws IOException {
		 FileInputStream f=new FileInputStream("C:\\Devi Java and Automation Notes\\Book1.xlsx");
		 XSSFWorkbook wb=new XSSFWorkbook(f);//class to read a workbook provided by apache poi
		 sh=wb.getSheet("Details");// method to read sheet provided by apache poi
	 }
	
	public String readData(int i, int j) {//0,0
		
		XSSFRow r=sh.getRow(i);//0
		XSSFCell c=r.getCell(j);//0
		int celltype=c.getCellType();//0 or 1
		switch(celltype) {//0
		case Cell.CELL_TYPE_NUMERIC:
		{
			double d=c.getNumericCellValue();//1000
			return String.valueOf(d);
		}
		case Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		}
		
		return null;
		
			
}

}
