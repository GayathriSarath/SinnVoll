package com.SinnVoll.Products;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.ProductsPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page

public class VerifyProductsTabTest extends BaseTest
{
	@Test
	public void verifyProductsTab() throws Throwable
	{
		//Login to App and Verify Home Page
		ValidSignInTest vt=new ValidSignInTest();
		vt.verifyValidSignIn();
		
		// click on Products Tab
		HomePage hp=new HomePage();
		hp.clickProductsTab();
		
		//Verify Products Page
		ProductsPage pp = new ProductsPage();
		String text = pp.getProductsText();
		Reporter.log(text,true);
		WebDriverCommonLib wlib=new WebDriverCommonLib();
		wlib.elementDisplayed(pp.getProductsTextAddress(),"Products Text");
	}
}
