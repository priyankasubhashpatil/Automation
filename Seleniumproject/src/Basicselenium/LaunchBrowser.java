package Basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","E:\\drivers\\chromedriver.exe");
 ChromeDriver dr=new ChromeDriver();
  dr.manage().window().maximize();
  dr.get("http://newtours.demoaut.com/");
  
  
   dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
   dr.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
   dr.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	}


