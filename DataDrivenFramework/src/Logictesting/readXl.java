package Logictesting;
import java.io.IOException;

import configuration.confic;
import libraries.Xls_Reader;

public class readXl {
	public static void main(String[] args) throws IOException {
		Xls_Reader xl=new Xls_Reader(confic.testData);
		int rows=xl.getrowcount("Sheet1");
		int cols=xl.getColumncount("Sheet1");
		
		String[][] data=new String[rows-1][cols];
		
		for(int r=2; r<=rows;r++)
		{
			for(int c=1; c<=cols; c++)
			{
				System.out.println(xl.getCellData("Sheet1", r, c));
				
			}
		}
		
		}
	}

