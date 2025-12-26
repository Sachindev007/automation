package loginsetup;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Emp_add;
import POM.Logout;
import POM.loginpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadData;

public class AddemployeeDdt 
{
	Emp_add emp;
	loginpage lp;
	Logout lg;
	WebDriver driver;
	private int row;
	
	@Given("Add Employee page should be displayed")
	public void add_employee_page_should_be_displayed() 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     emp=new Emp_add(driver);
	     lp=new loginpage(driver);
	     lg=new Logout(driver);
	     lp.fname().sendKeys("Admin");
	     lp.pswd().sendKeys("admin@123");
	     lp.login_btn().click();
	     emp.pim().click();
	     emp.add().click();
	}

	@When("user enter firstname , middlename , lastname {int}")
	public void user_enter_firstname_middlename_lastname(Integer int1) throws IOException 
	{
	   List<Map<String, String>> data = ReadData.getData();
	   Map<String, String> rowdata = data.get(row);
	   
	   String firstname = rowdata.get("firstname");
	   String middlename = rowdata.get("middlename");
	   String lastname = rowdata.get("lastname");
	  emp.fname().sendKeys(firstname);
	  emp.fname().sendKeys(middlename);
	  emp.fname().sendKeys(lastname);
	}

	@When("click on save btn icon")
	public void click_on_save_btn_icon() 
	{
	   emp.save().click();
	}

	@Then("Employee should be added")
	public void employee_should_be_added() 
	{
	  System.out.println("emplyee is saved"); 
	  lg.logout_menu().click();
	  lg.logout().click();
	  driver.quit();
	}
}
