package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readpropertiesfiles {

	public static void main(String[] args) throws IOException, InterruptedException {
	 FileInputStream file=new FileInputStream("E:\\workspace\\basiccorejava\\src\\files\\properties\\objectrepo.properties");
     Properties or=new Properties();
     
     or.load(file);
     System.out.println(or.get("userName"));
     System.out.println(or.get("password"));
     System.out.println(or.get("login"));
     //Thread.sleep(4000);
	}

}

