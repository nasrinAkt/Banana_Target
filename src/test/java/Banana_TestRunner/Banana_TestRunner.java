package Banana_TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Banana_Utility.Banana_Base;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features= {"src/test/resources/Banana_Features"},
plugin = {"json:target/cucumber.json"},
glue = "Banana_StepDefinition")//tags={"@tag"})

public class Banana_TestRunner extends AbstractTestNGCucumberTests{

	@BeforeTest
	public void banStartURL() {
		
		Banana_Base ban = new Banana_Base();
		ban.BanBrowser();
	}
	@AfterTest
	public void banCloseURL() {
		Banana_Base ban = new Banana_Base();	
		ban.driver.quit();
		
	}
	
	
	
	
	
}
