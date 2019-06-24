package tools;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel {
    public static String[][] getExcelData(String fileName,String sheetName) throws IOException {

        String[][] excelData = null;

        //实现从磁盘读取文件
        FileInputStream fs = new FileInputStream(fileName);

        //使用POI接受文件流读取的Excel整体文件
        XSSFWorkbook wb = new XSSFWorkbook(fs);

        //POI读取Excel的sheet页
        XSSFSheet sh = wb.getSheet(sheetName);

        //获取总行数
        int totalNoOfRows = sh.getLastRowNum();

        //获取总列数
        int totalNoOfCols = sh.getRow(0).getLastCellNum();

        //创建String类型的二维数组“excelData” ,指定数组的行和列用来接收从Excel读取出的数据
        excelData = new String[totalNoOfRows][totalNoOfCols];

        //使用for循环从Excel单元格取数据，为上面的二维数组excelData进行赋值
        for (int i=1; i<=totalNoOfRows;i++) {

            XSSFRow row = sh.getRow(i);

            for (int j=0;j<totalNoOfCols;j++) {

                XSSFCell cell = row.getCell(j);

                if(cell.getCellTypeEnum() == CellType.STRING) {

                    excelData[i-1][j] = cell.getStringCellValue();
                    System.out.println("String类型" + excelData[i-1][j]);

                }else {
                    excelData[i-1][j] = String.valueOf(cell.getNumericCellValue());
                }
            }

        }

        return excelData;

    }

}
