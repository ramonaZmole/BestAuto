package com.tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.UseTestDataFrom;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.SearchPage;
import com.steps.SearchPageSteps;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom("resources/searchitems.csv")

public class DropdownSelectTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps
	public SearchPage searchPage;
	
	@Steps
	SearchPageSteps searchPageSteps;
	String category,state;
	
	@Test
	public void selectDropdownItem(){
	searchPageSteps.homePage();
	searchPageSteps.selectCategoryDropdown(category);
	searchPageSteps.selectCarStatusDropdown(state);
	searchPageSteps.clickCautaButton();
	
	
	}
}
