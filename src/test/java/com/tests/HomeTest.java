package com.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.HomeSteps;

@RunWith(SerenityRunner.class)
public class HomeTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	public Pages pages;
	
	@Steps 
	public HomeSteps homeSteps;
	
	@Test
	public void checkIfAllSearchByBreandWorks(){
		homeSteps.is_the_home_page();
		homeSteps.selectBrand("Dacia");
		homeSteps.selectModel("1300");
		homeSteps.clickSearchButton();
	}
}
