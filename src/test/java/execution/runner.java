package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="./src/test/resources/Features/login.feature",glue="loginsetup" )
public class runner extends AbstractTestNGCucumberTests
{

}
