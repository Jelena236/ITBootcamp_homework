package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Resenje {

	public static void main(String[] args) {

			int zbir = 0;
			File f = new File("domaci.xlsx");

			try {
				InputStream inp = new FileInputStream(f);
				XSSFWorkbook wb = new XSSFWorkbook(inp);
				Sheet sheet = wb.getSheetAt(0);

				for (int i = 0; i < sheet.getLastRowNum(); i++) {
					zbir += sheet.getRow(i).getCell(0).getNumericCellValue();
				}
				System.out.println(zbir);
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
