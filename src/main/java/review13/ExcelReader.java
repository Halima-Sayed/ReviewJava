package review13;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.C;
import utils.Constants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {
    public static void main(String[] args) {

      var excelData=read(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(excelData);
    }

    public static List<Map<String, String>> read(String filePath, String sheetName) {
        List<Map<String, String>> mapList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
            Sheet sheet = xssfWorkbook.getSheet(sheetName);
            int numberOfRows = sheet.getPhysicalNumberOfRows();
            Row headerRow = sheet.getRow(0);
            for (int i = 1; i < numberOfRows; i++) {
                Map<String, String> rowMap = new LinkedHashMap<>();
                Row row = sheet.getRow(i);
                int numberOfCells = row.getPhysicalNumberOfCells();
                for (int j = 0; j < numberOfCells; j++) {
                    String key = headerRow.getCell(j).toString();

                    String value = row.getCell(j).toString();

                    rowMap.putIfAbsent(key, value);
                }
                mapList.add(rowMap);
            }
            System.out.println();
        } catch (IOException foundException) {
            foundException.printStackTrace();
        }
        return mapList;
    }
}