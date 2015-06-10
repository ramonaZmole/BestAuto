package com.steps;

import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.PageObject;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.pages.MenuPage;

public class menuSteps extends ScenarioSteps {

	MenuPage menuSteps;
	
	@Step
	public void click_SearchField(){
		menuSteps.clickSearchField();
	}
	
	@Step
	public void click_SearchImg(){
		menuSteps.clickSearchImg();
	}
	
	@Step
	public void click_BestAutoLogo(){
		menuSteps.clickBestAutoLogo();
	}
	
	@Step
	public void click_SearchPage(){
		menuSteps.clickSearchPage();
	}
	
	@Step
	public void click_AddNewAnnouncementPage(){
		menuSteps.clickAddNewAnnouncementPage();
	}
	
	@Step
	public void click_MyAccount(){
		menuSteps.clickMyAccount();
	}
	
	@Step
	public void click_Dealer(){
		menuSteps.clickDealer();
	}
}
