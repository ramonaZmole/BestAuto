package com.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.SearchPage;
import com.steps.SearchPageSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SearchPageTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	//@ManagedPages(defaultUrl = "http://www.bestauto.ro/vanzari-auto-piata-auto-cautari.htm")
	public SearchPage searchPage;
	
	@Steps
	SearchPageSteps searchPageSteps;
	
	@Test
	
	public void clickAllTabs() {
		searchPageSteps.homePage();
		searchPageSteps.clickAutoTab();
		searchPageSteps.clickBikeTab();
		searchPageSteps.clickTransportTab();
		searchPageSteps.clickUtilajeTab();
		searchPageSteps.clickAccessoriesTab();
		searchPageSteps.clickCautaButton();
	}
}
