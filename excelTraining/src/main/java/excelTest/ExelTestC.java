package excelTest;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelTestC {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;

	public static void main(String[] args) throws IOException {
		f=new FileInputStream("C:\\Users\\hpriy\\Downloads\\studentnw.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r = sh.getRow(3);
		Cell c = r.getCell(0);
		System.out.println(c);
		for(Row row : sh) {
			for(Cell cell : row) {
				System.out.print(cell+"  ");
				
			}
			System.out.println("\n");
		}

	}

	
}
