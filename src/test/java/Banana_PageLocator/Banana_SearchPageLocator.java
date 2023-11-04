package Banana_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Banana_Utility.Banana_Base;

public class Banana_SearchPageLocator extends Banana_Base {

	public  Banana_SearchPageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//span[text()='Create Account']")
	public WebElement clickcreatAcc;
	
	
	
	
	
}


