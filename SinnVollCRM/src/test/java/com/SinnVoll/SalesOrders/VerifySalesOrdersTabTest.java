package com.SinnVoll.SalesOrders;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PriceBooksPage;
import com.SinnVoll.pages.SalesOrdersPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifySalesOrdersTabTest extends BaseTest
{
	@Test
	public void verifySalesOrdersTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Sales Order Tab
				HomePage hp=new HomePage();
				hp.clickSalesOrderElement();
				
				//Verify Sales OrderPage
				SalesOrdersPage sop= new SalesOrdersPage();
				String text = sop.getSalesOrderAddress();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(sop.getSalesOrderTextAddress(),"Sales Order Text");
}
}
