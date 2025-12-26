package loginsetup;

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

public class Oranger_login_01 
{
	 Emp_add emp;
	 loginpage lp;
	 Logout lg;
	 WebDriver driver;
	 
	@Given("add employe should be added")
	public void add_employe_should_be_added() 
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
	   lp.pswd().sendKeys("admin123");
	   lp.login_btn().click();
	   emp.pim().click();
	   emp.add().click();
	   
	}

	@When("user enter {string},{string}")
	public void user_enter(String firstname, String middlename) 
	{
		emp.fname().sendKeys(firstname);
		emp.mname().sendKeys(middlename);
	   
	}

	@When("enter {string}")
	public void enter(String lastname) 
	{
	    emp.lname().sendKeys(lastname);
	   
	}
	@When("click on save button")
	public void click_on_save_button() 
	{
		emp.save().click();
	   
	}

	@Then("success message should be displayed")
	public void success_message_should_be_displayed() throws InterruptedException 
	{
		Thread.sleep(3000);
	    System.out.println("emp added");
	    lg.logout_menu().click();
	    lg.logout().click();
	    driver.quit();
	}

}
