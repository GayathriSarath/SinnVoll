package com.SinnVoll.Solutions;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.ProductsPage;
import com.SinnVoll.pages.SolutionsPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifySolutionsTabText extends BaseTest
{
	@Test
	public void verifySolutionsTab() throws Throwable
	{
		//Login to App and Verify Home Page
		ValidSignInTest vt=new ValidSignInTest();
		vt.verifyValidSignIn();
		
		// click on Solutions Tab
		HomePage hp=new HomePage();
		hp.clickSolutionsTab();
		
		//Verify Solutions Page
		SolutionsPage sp=new SolutionsPage();
		String text = sp.getSolutionsText();
		Reporter.log(text,true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(sp.getSolutionsTextAddress(),"Solutions Text");
	}
}
