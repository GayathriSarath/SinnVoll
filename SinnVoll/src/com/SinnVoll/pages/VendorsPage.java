package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class VendorsPage
{
@FindBy(xpath="//td[contains(text(),'Vendors: ')]") private WebElement vendorsText;

public VendorsPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public WebElement getVendorsTextAddress() {
	return vendorsText;
}
public String gtVendorsText()
{
	return vendorsText.getText();	
}
}
