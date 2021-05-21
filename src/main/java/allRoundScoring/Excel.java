package allRoundScoring;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0= workbook.createSheet("Decathlon");
        XSSFSheet sheet1= workbook.createSheet("Heptathlon");
        Row row0 = sheet0.createRow(0);
        Row row1 = sheet0.createRow(1);

        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        Cell cellC = row0.createCell(2);
        Cell cellD = row0.createCell(3);
        Cell cellE = row1.createCell(0);
        cellA.setCellValue("Name");
        cellB.setCellValue("Spjutkastning");
        cellC.setCellValue("diskus");
        cellD.setCellValue("hundra meter");
        cellE.setCellValue("Daniel");

        File f = new File("C:\\Prov\\Grupp5.xlsx");
        FileOutputStream fo = new FileOutputStream(f);

        workbook.write(fo);
        fo.close();

        System.out.println("file created!!");

    }
}





