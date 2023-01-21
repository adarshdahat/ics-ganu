package ICSpomClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ICSLoginPage 
{
	@FindBy(xpath ="//a[text()='Login']")private WebElement loginButton;
	
	@FindBy(xpath= "(//input[@type='text'])[3]")private WebElement uname;
	
	@FindBy(xpath = "(//input[@type='password'])[5]")private WebElement pass;
	
	@FindBy(xpath = "//*[@id=\"submit\"]")private WebElement login;
	
	public ICSLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnloginButton()
	{
		loginButton.click();
	}
	public void EnterUsername(String un)
	{
		uname.sendKeys(un);
	}
	public void EnterPassword(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void ClickOnlogin()
	{
		login.click();
	}
	
}

