package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class SalesOrdersPage 
{
@FindBy(xpath="//td[contains(text(),'Sales Orders: ')]") private WebElement salesOrderText;

public SalesOrdersPage() 
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getSalesOrderTextAddress() {
	return salesOrderText;
}
public String getSalesOrderAddress()
{
	return salesOrderText.getText();
	
}
}
