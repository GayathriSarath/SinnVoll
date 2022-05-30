package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class PurchaseOrdersPage
{
@FindBy(xpath="//td[contains(text(),'Purchase Orders: ')]") private WebElement purchaseOrderText;

public PurchaseOrdersPage() 
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getPurchaseOrderTextAddress() {
	return purchaseOrderText;
}
public String getPurchaseOrdersText()
{
	return purchaseOrderText.getText();	
}
}
