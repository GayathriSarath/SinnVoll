package com.SinnVoll.PriceBooks;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.SinnVoll.GenericLib.BaseTest;
import com.SinnVoll.GenericLib.WebDriverCommonLib;
import com.SinnVoll.Login.ValidSignInTest;
import com.SinnVoll.pages.HomePage;
import com.SinnVoll.pages.PotentialPage;
import com.SinnVoll.pages.PriceBooksPage;

@Listeners(com.SinnVoll.GenericLib.MyListeners.class)
//Open the browser, enter the test URL
//Verify Sign In Page
public class VerifyPriceBooksTabTest extends BaseTest
{
	@Test
	public void verifyPriceBooksTab() throws Throwable
	{
				//Login to App and Verify Home Page
				ValidSignInTest vt=new ValidSignInTest();
				vt.verifyValidSignIn();
				
				// click on PriceBook Tab
				HomePage hp=new HomePage();
				hp.clickPriceBookTab();
				
				//Verify PriceBook Page
				PriceBooksPage pbp = new PriceBooksPage();
				String text = pbp.getPriceBooksText();
				Reporter.log(text,true);
				WebDriverCommonLib wlib=new WebDriverCommonLib();
				wlib.elementDisplayed(pbp.getPriceBooksTextAddress(),"PriceBook Text");
}
}
