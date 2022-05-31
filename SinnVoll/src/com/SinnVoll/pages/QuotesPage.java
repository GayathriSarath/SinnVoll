package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class QuotesPage 
{
@FindBy(xpath="//td[contains(text(),'Quotes: ')]") private WebElement quotesText;

public QuotesPage() 
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getQuotesTextAddress() {
	return quotesText;
}
public String getQuotesText()
{
	return quotesText.getText();
	
}
}
