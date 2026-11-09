package day40ReadDataFromExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Excel file -> Workbook -> Sheets -> Rows -> Cells
//FileInputStream - reading
//FileOutputStream - writing

//XSSFWorkbook - workbook
//XSSFSheet - sheet
//XSSFRow - row
//XSSFCell - cell

public class WritingDynamicDataIntoExcel {
    static void main(String[] args) throws IOException {
        //FileOutputStream file = new FileOutputStream("C:\\Users\\xpate\\IdeaProjects\\seleniumwebdriver\\testdata\\myfile_dynamic.xlsx");
        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\myfile_dynamic.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("DynamicData");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num of rows : ");
        int noOfrows=sc.nextInt();

        System.out.println("Enter num of cells : ");
        int noOfcells=sc.nextInt();

        for (int r=0;r<=noOfrows;r++)
        {
            XSSFRow currentRow=sheet.createRow(r);

            for (int c=0;c<noOfcells;c++)
            {
                XSSFCell cell=currentRow.createCell(c);
                cell.setCellValue(sc.next());
            }
        }

        workbook.write(file);
        workbook.close();
        file.close();

        System.out.println("File is created...");

    }
}
