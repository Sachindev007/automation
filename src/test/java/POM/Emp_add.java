package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Emp_add 
{
	 @FindBy(xpath = "//span[.='PIM']")
	 private WebElement pim;
	 @FindBy(xpath = "//a[.='Add Employee']")
	 private WebElement add_emp;
	 @FindBy(xpath = "//input[@name='firstName']")
	 private WebElement fname;
	 @FindBy(xpath ="//input[@name='middleName']")
	 private WebElement mname;
	 @FindBy(xpath ="//input[@name='lastName']")
	 private WebElement lname;
	 @FindBy(xpath ="//button[@type='submit']")
	 private WebElement save;
	
	 
 public Emp_add(WebDriver driver)
 {
	 PageFactory.initElements(driver, this);
 }
 
 public WebElement pim()
 {
	 return pim;
 }
 public WebElement add()
 {
	 return add_emp; 
 }
 public WebElement fname()
 {
	 return  fname;
 }
 public WebElement mname()
 {
	 return mname;
 }
 public WebElement lname()
 {
	 return  lname;
 }
 public WebElement save()
 {
	 return save;
 }

}
