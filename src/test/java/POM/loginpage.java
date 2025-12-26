package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{

	@FindBy(name="username")
	private WebElement un;
	@FindBy(name="password")
	private WebElement psw;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn;
	
	public loginpage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement fname()
	{
		return un;
	}
	public WebElement pswd()
	{
		return psw;
	}
	public WebElement login_btn()
	{
		return btn;
	}
	
}
