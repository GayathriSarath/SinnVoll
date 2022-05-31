package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class PriceBooksPage
{
@FindBy(xpath="//td[contains(text(),'Price Books: ')]") private WebElement priceBooksText;

public PriceBooksPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getPriceBooksTextAddress() {
	return priceBooksText;
}
public String getPriceBooksText()
{
	return priceBooksText.getText();

}
}