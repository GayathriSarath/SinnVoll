package com.SinnVoll.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.SinnVoll.GenericLib.BaseTest;

public class HomePage
{
@FindBy(xpath="//a[text()='Leads']") private WebElement leadsTab;
@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
@FindBy(xpath="//a[text()='Contacts']") private WebElement contactsTab;
@FindBy(xpath="//a[text()='Potentials']") private WebElement potentialsTab;
@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignsTab;
@FindBy(xpath="//a[text()='Reports']") private WebElement reportsTab;
@FindBy(xpath="//a[text()='Dashboards']") private WebElement dashboardsTab;
@FindBy(xpath="//a[text()='Forecasts']") private WebElement forecastTab;
@FindBy(xpath="//a[text()='Activities']") private WebElement activitiesTab;
@FindBy(xpath="//a[text()='Products']") private WebElement productsTab;
@FindBy(xpath="//a[text()='Cases']") private WebElement casesTab;
@FindBy(xpath="//a[text()='Solutions']") private WebElement solutionsTab;
@FindBy(xpath="//a[text()='Vendors']") private WebElement vendorsTab;
@FindBy(xpath="//a[text()='Price Books']") private WebElement priceBooksTab;
@FindBy(xpath="//a[text()='Quotes']") private WebElement quotesTab;
@FindBy(xpath="//a[text()='Sales Orders']") private WebElement salesOrderTab;
@FindBy(xpath="//a[text()='Purchase Orders']") private WebElement purchaseOrderTab;
@FindBy(xpath="//a[text()='Invoices']") private WebElement invoicesTab;
@FindBy(id="scrollright") private WebElement scrollRightButton;

public HomePage()
{
	PageFactory.initElements(BaseTest.driver, this);
}

public WebElement getLeadsBtn() {
	return leadsTab;
}
public void clickLeadsTab()
{
	leadsTab.click();	
}

public WebElement getAccountsTab() {
	return accountsTab;
}
public void clickAccountsTab()
{
	accountsTab.click();
}

public WebElement getContactsTab() {
	return contactsTab;
}
public void clickContactsTab()
{
	contactsTab.click();
}

public WebElement getPotentialsTab() {
	return potentialsTab;
}
public void clickPotentialsTab()
{
	potentialsTab.click();
}
public WebElement getCampaignsTab() {
	return campaignsTab;
}
public void clickCampaignsTab()
{
	campaignsTab.click();
}
public WebElement getReportsTab() {
	return reportsTab;
}
public void clickReportsTab()
{
	reportsTab.click();
}
public WebElement getDashboardsTab() {
	return dashboardsTab;
}
public void clickDashboardsTab()
{
	dashboardsTab.click();
}
public WebElement getForecastTab() {
	return forecastTab;
}
public void clickForecastTab()
{
	forecastTab.click();
}
public WebElement getActivitiesTab() {
	return activitiesTab;
}
public void clickActivitiesTab()
{
	activitiesTab.click();
}
public WebElement getProductsTab() {
	return productsTab;
}
public void clickProductsTab()
{
	productsTab.click();
}
public WebElement getCasesTab() {
	return casesTab;
}
public void clickCaseTab()
{
	casesTab.click();	
}
public WebElement getSolutionsTab() {
	return solutionsTab;
}
public void clickSolutionsTab()
{
	solutionsTab.click();
}
public WebElement getVendorsTab() {
	return vendorsTab;
}
public void clickVendorsTab()
{
	vendorsTab.click();
}
public WebElement getPriceBooksTab() {
	return priceBooksTab;
}
public void clickPriceBookTab()
{
	priceBooksTab.click();
}
public WebElement getQuotesTab() {
	return quotesTab;
}
public void clickQuotesTab()
{
	quotesTab.click();	
}
public WebElement getSalesOrderTab() {
	return salesOrderTab;
}
public void clickSalesOrderTab()
{
	salesOrderTab.click();
}
public WebElement getPurchaseOrderTab() {
	return purchaseOrderTab;
}
public void clickPurchaseOrderTab()
{
	purchaseOrderTab.click();
}
public WebElement getInvoicesTab() {
	return invoicesTab;
}
public void clickInvoicesTab()
{
	invoicesTab.click();	
}

public WebElement getScrollRightButton() {
	return scrollRightButton;
}
public void clickScrollRightButton()
{
	scrollRightButton.click();
}
public void clickQuotesElement()
{
	for(int i=0;i<=20;i++)
	{
		if(getQuotesTab().isDisplayed())
		{
			clickQuotesTab();
			break;
		}
		else
		{
			clickScrollRightButton();
		}
	}
}
public void clickSalesOrderElement()
{
	for(int i=0;i<=20;i++)
	{
		if(getSalesOrderTab().isDisplayed())
		{
			clickSalesOrderTab();
			break;
		}
		else
		{
			clickScrollRightButton();
		}
	}
}
public void clickPurchaseOrderElement()
{
	for(int i=0;i<=20;i++)
	{
		if(getPurchaseOrderTab().isDisplayed())
		{
			clickPurchaseOrderTab();
			break;
		}
		else
		{
			clickScrollRightButton();
		}
	}
}
public void clickInvoiceElement()
{
	for(int i=0;i<=20;i++)
	{
		if(getInvoicesTab().isDisplayed())
		{
			clickInvoicesTab();
			break;
		}
		else
		{
			clickScrollRightButton();
		}
	}
}

}
