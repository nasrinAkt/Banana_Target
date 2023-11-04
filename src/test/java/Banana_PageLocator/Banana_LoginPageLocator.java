package Banana_PageLocator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Banana_Utility.Banana_Base;

public class Banana_LoginPageLocator extends Banana_Base {

	public Banana_LoginPageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id ="username")
	public WebElement enterEm;
	
	@FindBy(id ="firstname")
	public WebElement typeFN ;
	
	@FindBy(id ="lastname")
	public WebElement typeLA;
	
	@FindBy(id ="phone")
	public WebElement enterPN;
	
	@FindBy(id ="password")
	public WebElement enterPW;
	
	@FindBy(id ="createAccount")
	public WebElement clickAcc;
	
	@FindBy(id ="username--ErrorMessage")
	public WebElement verifyUnsucc;
}
	
	

