package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configuration.confic;

public class Applicationlib
{
	public WebDriver launchBrowser(String browserName)
	{
	WebDriver dr=null;
	 
	 if(browserName.equalsIgnoreCase("Chrome"))
		 {
			System.setProperty("webdriver.chrome.driver",confic.chromDriverPath1);
		 dr=new ChromeDriver();
		 }else if(browserName.equalsIgnoreCase("Firefox"))
		 {
			 System.setProperty("webdriver.gecko.driver",confic.firefoxDriverPath1);
			 dr=new FirefoxDriver();
		 }else if(browserName.equalsIgnoreCase("edge"))
			 {
			 dr=new EdgeDriver();
			 }
		 return dr;
		 

	}
}
