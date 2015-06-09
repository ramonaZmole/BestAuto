package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;


@DefaultUrl("http://www.bestauto.ro/")
public class HomePage extends PageObject{

	@FindBy(css="[name*='Marca']")
	private WebElementFacade brandDropdown;
	
	@FindBy(css="[name*='txtModel']")
	private WebElementFacade modelDropdown;
	
	@FindBy(css="[name*='Price']")
	private WebElementFacade maxPriceDropdown;
	
	@FindBy(css="[name*='Vehicleage']")
	private WebElementFacade vehicleAgeDropdown;
	
	@FindBy(css="[name*='Mileage']")
	private WebElementFacade mileAgeDropdown;
	
	@FindBy(css="[name*='Fuel']")
	private WebElementFacade fuelTypeDropdown;
	
	@FindBy(css="[value='Search']")
	private WebElementFacade searchButton;
	
	@FindBy(css="[id='bike_icon']")
	private WebElementFacade bikeIcon;
	
	@FindBy(css="[id='transport_icon']")
	private WebElementFacade transportIcon;
	
	@FindBy(css="[id='utilaje_icon']")
	private WebElementFacade utilajeIcon;
	
	@FindBy(css="[id='misc_icon']")
	private WebElementFacade diverseIcon;
	
	
	public void selectBrand(String option){
		brandDropdown.selectByVisibleText(option);
	}
	
	public void selectModel(String option){
		modelDropdown.selectByVisibleText(option);
	}
	
	public void selectMaxPrice(String option){
		maxPriceDropdown.selectByVisibleText(option);
	}
	
	public void selectRegistrationFrom(String option){
		vehicleAgeDropdown.selectByVisibleText(option);
	}
	
	public void selectKilometers(String option){
		mileAgeDropdown.selectByVisibleText(option);
	}
	
	public void selectFuelType(String option){
		fuelTypeDropdown.selectByVisibleText(option);
	}
	
	public void clickSearch(){
		searchButton.click();
	}
	
	public void clickMotorcycle(){
		bikeIcon.click();
	}
	
	public void  clickTransportIcon(){
		transportIcon.click();
	}
	
	public void clickUtilajeIcon(){
		utilajeIcon.click();
	}
	
	public void clickDiverse(){
		diverseIcon.click();
	}
}


