package TestClasses;
import java.io.IOException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ICSbaseClasses.ICSbaseClass;
import ICSpomClasses.ICSLoginPage;
import UtilityClasses.ICSutilityClass;

public class NewTestICS extends ICSbaseClass
{
	ICSLoginPage IC;
	@BeforeClass
	public void openBrouser() throws IOException 
	{
		launchBrowser();
		Reporter.log("browser open sucsessfully");
	}
	@BeforeMethod
	public void loginToApp() throws IOException, InterruptedException 
	{
		IC=new ICSLoginPage(driver);

		ICSutilityClass.wait(driver, 3000);
		IC.clickOnloginButton();
		Thread.sleep(2000);
		IC.EnterUsername(ICSutilityClass.ReadDataFromICSganu("username"));
		Thread.sleep(2000);
		IC.EnterPassword(ICSutilityClass.ReadDataFromICSganu("password"));
		IC.ClickOnlogin();
	}
	@Test
	public void validateloginPage()
	{
		Reporter.log("launch brouser sucessfully");
	}
  
}
