package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode 

{
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;

	public static String readStringData(int i,int j) throws IOException//i represet as row and j represent as column
	{
		f=new FileInputStream("C:\\Users\\Nila\\OneDrive\\Desktop\\ExcelRead.xlsx");//to fetch the excelsheet
		w=new XSSFWorkbook(f);//to get the workbook from the path of f
		s=w.getSheet("Sheet1");//to get the sheet and getsheet is a predefined method
	
		XSSFRow r=s.getRow(i);//XSSFRow is the predefined class to get the row
		XSSFCell c=r.getCell(j);//XSSFCell is the predefined class to fetch column
		
		return c.getStringCellValue();//To get the data in String type
		
	}
	
	public static double readIntegerData(int i,int j) throws IOException
	{
		f=new FileInputStream("C:\\Users\\Nila\\OneDrive\\Desktop\\ExcelRead.xlsx");//to fetch the excelsheet
		w=new XSSFWorkbook(f);//to get the workbook from the path of f
		s=w.getSheet("Sheet1");//to get the sheet and getsheet is a predefined method
	
		XSSFRow r=s.getRow(i);//XSSFRow is the predefined class to get the row
		XSSFCell c=r.getCell(j);//XSSFCell is the predefined class to fetch column
		
		return c.getNumericCellValue();//getNumericValuen is the predefined method  to get the integer value in the cell c
	}
}
