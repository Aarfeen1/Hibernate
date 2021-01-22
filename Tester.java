package com.xworkz.mouse.tester;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.xworkz.mouse.dao.*;
import com.xworkz.mouse.dto.*;



public class Tester {

	public static void main(String[] args) throws IOException {
		
				
		        FileInputStream file= new FileInputStream(new File("C:\\Users\\SONY\\Desktop\\data.xlsx"));
		        try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
					XSSFSheet sheet =workbook.getSheetAt(0);
					Row row;
					for(int i=1;i<=sheet.getLastRowNum();i++) {
						row = (Row) sheet.getRow(i);
						
					    if(row.getCell(0)==null) {} else
							row.getCell(0).toString();
						String NAME;
						if(row.getCell(1)==null) { NAME="null";}
						else NAME=row.getCell(1).toString();
						String SIZE;
						if(row.getCell(2)==null) { SIZE="null";}
						else SIZE=row.getCell(2).toString();
						
						MouseDTO mousedto=new MouseDTO();
						mousedto.setName(NAME);
mousedto.setSize(SIZE);		        	
	
						
				
						  MouseDAO mousedao=new MouseDAOImp();
					   
						mousedao.saveMouse(mousedto);

					}
				}
		        file.close();
				
			}
					  

		

	}


