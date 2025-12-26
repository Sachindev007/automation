package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/Features/Orange_login.feature",glue="loginsetup")
public class test_run_01 extends AbstractTestNGCucumberTests
{
	

}
