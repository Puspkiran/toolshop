package Utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProvider1 {

	
	
	String pathString="C:\\Users\\puspk\\eclipse-workspace\\Toolshop\\testdata\\Data.xlsx";
	
	ExcelUtility x=new ExcelUtility(pathString);
	
	
	//String[][] nS=new String[totalrows][totalcoloumns];
	
	
	
	@DataProvider(name="LoginData")
	public String [][] getData() throws IOException {
	
    String[][] nS=new String[0][2];
	
	nS[0][1]=x.getCellData("Sheet1",0, 1);
	
	nS[0][2]=x.getCellData("Sheet1",0, 2);
	
	
	return nS;
	}
	
	
	
	
}
