package com.pages;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class SearchPage extends PageObject {
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_car']")
	private WebElement autoSection;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_bike']")
	private WebElement bikeSection;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_transport']")
	private WebElement transportSection;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_utilaje']")
	private WebElement utilajeSection;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_ad_tab_accessories']")
	private WebElement accessoriesSection;
	
	@FindBy (css="[id='ctl00_ctl00_ctl01_lbSearch']")
	private WebElement cautaButton;

	
	public void clickAutoSection() {
		autoSection.click();
	}
	public void clickBikeSection() {
		bikeSection.click();
	}
	public void clickTransportSection() {
		transportSection.click();
	}
	public void clickUtilajeSection() {
		utilajeSection.click();
	}
	public void clickAccessoriesSection() {
		accessoriesSection.click();
	}
	public void clickCautaButton() {
		cautaButton.click();
	}
							

	
}
