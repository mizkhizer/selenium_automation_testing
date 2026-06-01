package utility;


import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtility {

    
    public String getCellData(int row, int cell) throws IOException
    {
    	
        FileInputStream file = new FileInputStream("./testData/TestData.xlsx");

        
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        
        XSSFSheet sheet = workbook.getSheetAt(0);

        System.out.println("Last Row Number: "+ sheet.getLastRowNum());
        
        
        if(sheet.getRow(row) == null)
        {
            workbook.close();

            return "Row Not Found";
        }
        
        
        String data = sheet.getRow(row).getCell(cell).getStringCellValue();
        
        
        workbook.close();

        
        return data;
    }
}



