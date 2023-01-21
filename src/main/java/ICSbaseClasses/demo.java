package ICSbaseClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClasses.ICSutilityClass;

public class demo {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(ICSutilityClass.ReadDataFromICSganu("url"));
		
		driver.manage().window().maximize();	
		

	}

}
