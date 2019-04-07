package Logictesting;

import java.io.IOException;

import libraries.Xls_Reader;

public class readexel {

	public static void main(String[] args) throws IOException {
		Xls_Reader xl=new Xls_Reader(System.getProperty("user.dir")+"\\TestData.xls"); //Filepath
		String str=xl.getCellData("Sheet1", 1, 1);
	System.out.println(str);	
	
	String str2=xl.getCellData("Sheet1", 2, "Username");
System.out.println(str2);	
int rows=xl.getrowcount("Sheet1");
System.out.println(rows);
int cols=xl.getColumncount("Sheet1");
System.out.println(cols);

for(int i=2;i<=rows;i++)  //skip header and print data
{
	for(int j=1;j<=cols;j++)
	{
		System.out.println(xl.getCellData("Sheet1", i, j));
	}
}


	}

}
