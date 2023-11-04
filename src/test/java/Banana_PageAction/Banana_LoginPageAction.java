package Banana_PageAction;

import org.testng.Assert;

import Banana_PageLocator.Banana_LoginPageLocator;
import Banana_Utility.Banana_Base;
import Banana_Utility.Banana_TestData;
import Banana_Utility.Banana_Utiliti;

public class Banana_LoginPageAction extends Banana_Base {

Banana_LoginPageLocator banana_LoginPageLocator = new Banana_LoginPageLocator();
	
public void enterinvalidemailfirstnamelastnamephonenumberenterinvpassword() throws Exception {
	
	Thread.sleep(5000);
	banana_LoginPageLocator.enterEm.sendKeys(Banana_TestData.banEmail);
	Thread.sleep(2000);
	banana_LoginPageLocator.typeFN.sendKeys(Banana_TestData.banfirstN);	
	Thread.sleep(2000);
	banana_LoginPageLocator.typeLA.sendKeys(Banana_TestData.banLastN);	
	Thread.sleep(2000);
	banana_LoginPageLocator.enterPN.sendKeys(Banana_TestData.banPhon);
	Thread.sleep(2000);
	banana_LoginPageLocator.enterPW.sendKeys(Banana_TestData.banPassword);
	Thread.sleep(2000);
	}
	public void clickcreateaccount() {
		banana_LoginPageLocator.clickAcc.click();	
		
		
	}
	public void Verifyusercannotcreateaccountsuccessfully() throws Exception {
		Thread.sleep(3000);
    boolean to = banana_LoginPageLocator.verifyUnsucc.isDisplayed();
		Assert.assertTrue(to);
		Banana_Utiliti.takeMyScreenshot(driver, "login page");
	}
}
