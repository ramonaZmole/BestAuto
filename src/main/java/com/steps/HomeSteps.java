package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import com.pages.HomePage;

public class HomeSteps extends ScenarioSteps{

	HomePage  homePage;
	
	@Step
    public void is_the_home_page() {
        homePage.open();
    }
	
	@Step
	public void selectBrand(String option){
		homePage.selectBrand(option);
	}
	
	@Step
	public void selectModel(String option){
		homePage.selectModel(option);
	}
	
	@Step
	public void selectMaxPrice(String option){
		homePage.selectMaxPrice(option);
	}
	
	@Step
	public void selectRegistrationFrom(String option){
		homePage.selectRegistrationFrom(option);
	}
	
	@Step
	public void selectKilometers(String option){
		homePage.selectKilometers(option);
	}
	
	@Step
	public void selectFuelType(String option){
		homePage.selectFuelType(option);
	}
	
	@Step
	public void clickSearchButton(){
		homePage.clickSearchButton();
	}
	
	@Step
	public void clickMotorcycleIcon(){
		homePage.clickMotorcycle();
	}
	
	@Step
	public void clickTransportIcon(){
		homePage.clickTransportIcon();
	}
	
	@Step
	public void clickUtilajeIcon(){
		homePage.clickUtilajeIcon();
	}
	
	@Step
	public void clickDiverseIcon(){
		homePage.clickDiverseIcon();
	}
}
