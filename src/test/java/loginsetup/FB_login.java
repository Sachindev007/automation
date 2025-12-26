
package loginsetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_login 
{
	WebDriver driver;
	@Given("login page should be displayed")
	public void login_page_should_be_displayed() 
	{
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.fb.com");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		

	}

	@When("user enter user and password")
	public void user_enter_user_and_password() 
	{
		driver.findElement(By.name("email")).sendKeys("Sachin");;
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sachindev007@");
	}

	@When("click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("hompage should be displayed")
	public void hompage_should_be_displayed() throws InterruptedException 
	{
	Thread.sleep(1000);
	 System.out.println("homepage is displayed");
	 driver.quit();
	}

}
