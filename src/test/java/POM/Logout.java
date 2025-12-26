package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout 
{
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	private WebElement logout_menu;
	@FindBy(xpath="//a[.='Logout']")
    private WebElement logoutbtn;

	public Logout(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement logout_menu()
	{
		return logout_menu;
	}
	public WebElement logout()
	{
		return logoutbtn;
	}
}
