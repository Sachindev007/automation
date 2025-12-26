package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadData {

	
public static List<Map<String,String>> getData() throws IOException
{
	
	List<Map<String,String>> data = new ArrayList<>();     
	FileInputStream fis=new FileInputStream("./src/test/resources/excel/New Microsoft Excel Worksheet.xlsx");
  XSSFWorkbook book=new XSSFWorkbook(fis);
  XSSFSheet sheet=book.getSheet("data");
  XSSFRow header=sheet.getRow(0);
  
  for(int r=1;r<=sheet.getLastRowNum();r++)
  {
	  Map<String, String> rowMap= new HashMap<>();
	  XSSFRow row=sheet.getRow(r);
	  for(int c=0;c<header.getLastCellNum();c++)
	  {
		  String key=header.getCell(c).getStringCellValue();
		  String value=row.getCell(c).getStringCellValue();
		  rowMap.put(key, value);
	  }
	  data.add(rowMap);
	  book.close();
	  fis.close();
  }

    return data;
  
}
	
}
