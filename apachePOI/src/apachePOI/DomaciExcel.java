package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DomaciExcel {

	public static void main(String[] args) {

		File f = new File("domaci.xlsx");
		
		try {
			InputStream is = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(is);
			Sheet sh = wb.getSheetAt(0);
			Row row = sh.getRow(0);
			Cell cell = row.getCell(0);
			System.out.println(cell.toString());
			
			int zbirCelija = Brojevi(sh);
			System.out.println("Zbir celija u prvoj kolini je: "+zbirCelija);
			
			
			wb.close();
			
				
			
		} catch (IOException e) {
			System.out.println("Navedeni fajl nije pronadjen!");
			e.printStackTrace();
		}
	}
	
	public static int Brojevi (Sheet s) {
		int zbir=0;
		for(int i=0; i<=s.getLastRowNum(); i++) {
			
			try {
				
			zbir+=s.getRow(i).getCell(0).getNumericCellValue();
			 
				}
			catch(Exception e) {
				System.out.println("Celija nema unetu vrednost!");
				e.printStackTrace();
			}
			
		}return zbir;
	}

}
