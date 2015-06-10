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

import com.pages.SearchPage;

public class SearchPageSteps extends ScenarioSteps {
	
	SearchPage searchPageSteps;
	
	@Step
	public void clickAutoTab() {
		searchPageSteps.clickAutoTab();
	}
	@Step
	public void clickBikeTab() {
		searchPageSteps.clickBikeTab();
	}
	@Step
	public void clickTransportTab() {
		searchPageSteps.clickTransportTab();
	}
	@Step
	public void clickUtilajeTab() {
		searchPageSteps.clickUtilajeTab();
	}
	@Step
	public void clickAccessoriesTab() {
		searchPageSteps.clickAccessoriesTab();
	}
	@Step
	public void clickCautaButton() {
		searchPageSteps.clickCautaButton();
	}
}