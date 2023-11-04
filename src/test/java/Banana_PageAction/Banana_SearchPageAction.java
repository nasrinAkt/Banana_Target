package Banana_PageAction;

import Banana_PageLocator.Banana_SearchPageLocator;
import Banana_Utility.Banana_Base;

public class Banana_SearchPageAction extends Banana_Base{
	
	Banana_SearchPageLocator banana_SearchPageLocator = new Banana_SearchPageLocator();
	
	
	public void clickcreateaccountban() throws Exception {
		Thread.sleep(2000);
		 banana_SearchPageLocator.clickcreatAcc.click();	
		
		
	}
	
	
	
}
