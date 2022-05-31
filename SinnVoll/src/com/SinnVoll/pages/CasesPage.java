package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.SinnVoll.GenericLib.BaseTest;

public class CasesPage 
{
	@FindBy(xpath="//td[contains(text(),'Cases: ')]") private WebElement casesText;

	public CasesPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getCasesTextAddress() {
		return casesText;
	}
	public String getCasesText()
	{
		return casesText.getText();
	}
}
