package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
@DefaultUrl("http://www.bestauto.ro/vanzari-auto-piata-auto-cautari.htm")
public class SearchPage extends PageObject {
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_car']")
	private WebElement autoTab;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_bike']")
	private WebElement bikeTab;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_transport']")
	private WebElement transportTab;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_utilaje']")
	private WebElement utilajeTab;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_accessories']")
	private WebElement accessoriesTab;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_lbSearch']")
	private WebElement cautaButton;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ddlCategory']")
	private WebElement categoryDropdown;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ddlCarStatus']")
	private WebElement carStatusDropdown;
	
	
	
	public void selectCategoryDropdown(String option) {
		Select categDropD = new Select(categoryDropdown);
		categDropD.selectByVisibleText(option);
	}

	public void selectCarStatusDropdown(String option) {
		Select carStatusDropD = new Select(carStatusDropdown);
		carStatusDropD.selectByVisibleText(option);
		
	}

	
	
	
	
	
	public void clickAutoTab() {
		autoTab.click();
	}
	public void clickBikeTab() {
		bikeTab.click();
	}
	public void clickTransportTab() {
		transportTab.click();
	}
	public void clickUtilajeTab() {
		utilajeTab.click();
	}
	public void clickAccessoriesTab() {
		accessoriesTab.click();
	}
	public void clickCautaButton() {
		cautaButton.click();
	}
}			

	


