package ICSbaseClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UtilityClasses.ICSutilityClass;

public class ICSbaseClass 
{
	protected static WebDriver driver;
	public void launchBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(ICSutilityClass.ReadDataFromICSganu("url"));
		
		driver.manage().window().maximize();	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

}
}
