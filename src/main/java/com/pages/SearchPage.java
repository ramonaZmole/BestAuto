package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

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

	
	public void clickAutoSection() {
		autoTab.click();
	}
	public void clickBikeSection() {
		bikeTab.click();
	}
	public void clickTransportSection() {
		transportTab.click();
	}
	public void clickUtilajeSection() {
		utilajeTab.click();
	}
	public void clickAccessoriesSection() {
		accessoriesTab.click();
	}
	public void clickCautaButton() {
		cautaButton.click();
	}
}			

	


