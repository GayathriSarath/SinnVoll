package com.SinVoll.Cases;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.CasesPage;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PotentialPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page

public class VerifyCasesTabTest extends BaseTest 
{
	@Test
	public void verifyCasesTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on Cases Tab
				HomePage hp=new HomePage();
				hp.clickCaseTab();
				
				//Verify Cases Page
				CasesPage cp= new CasesPage(); 
				String text =cp.getCasesText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(cp.getCasesTextAddress(),"Cases Text");
	}
}
