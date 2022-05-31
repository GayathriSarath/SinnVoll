package com.SinnVoll.PurchaseOrders;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PurchaseOrdersPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyPurchaseOdersTabTest extends BaseTest
{
	@Test
	public void verifyPurchaseOdersTab() throws Throwable
	{
		//Login to App and Verify Home Page
		ValidSignInTest vt=new ValidSignInTest();
		vt.verifyValidSignIn();
		
		// click on Purchase Order Tab
		HomePage hp=new HomePage();
		hp.clickPurchaseOrderTab();
		
		//Verify Purchase Order Page
		PurchaseOrdersPage pop=new PurchaseOrdersPage(); 
		String text = pop.getPurchaseOrdersText();
		Reporter.log(text,true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(pop.getPurchaseOrderTextAddress(),"Purchase OrderText");
	}
}
