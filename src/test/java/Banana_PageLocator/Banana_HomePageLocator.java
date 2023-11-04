package Banana_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Banana_Utility.Banana_Base;

public class Banana_HomePageLocator extends Banana_Base{
	
	
	public Banana_HomePageLocator() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath ="//span[text()='Sign in']")
	public WebElement clickSignin;
	
}
