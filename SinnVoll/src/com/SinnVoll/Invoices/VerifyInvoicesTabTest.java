package com.SinnVoll.Invoices;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.InvoicesPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyInvoicesTabTest extends BaseTest
{
	@Test
	public void verifyInvoicesTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Invoices Tab
				HomePage hp=new HomePage();
				hp.clickInvoicesTab();
				
				//Verify Invoices Page
				InvoicesPage ip= new InvoicesPage();
				String text = ip.getInvoicesText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(ip.getInvoicesTextAddress(),"Invoices Text");
}
}
