package com.pages;

import java.util.ArrayList;
import java.util.List;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class MenuPage extends PageObject {
	 
	@FindBy(css="a[title='mobile']")
	private WebElement mobile;
	
	@FindBy(css=" a[title='Contact']")
	private WebElement contact;
	
	@FindBy(css="input[id='homeSearch']")
	private WebElement search;
	
	@FindBy(css="select[id=homeSearchCategory] option[class]")
	private List<WebElement> searchDropdown;
	
	@FindBy(css="div[id='homeSearchButton'] img[src]")
	 private WebElementFacade searchImg;

	@FindBy(css="div[id='logoPowerd'] a[href]]")
	private WebElement logo;
	
	@FindBy(css="a[title='Cautare']")
	 private WebElementFacade cautare;
	
	@FindBy(css="ul[id='new_nav'] a[title='Adauga anunt']")
	 private WebElementFacade adaugaAnunt;
	
	@FindBy(css="ul[id='new_nav'] a[title='Contul meu']")
	 private WebElementFacade contulMeu;
	
	@FindBy(css="ul[id='new_nav'] a[title='Dealer']")
	 private WebElementFacade dealer;

	 
	public void press_Search(){
		search.click();
	}
	
//	public void press_SearchDropdown(){
//	  element(nextButton).waitUntilVisible();
//		searchDropdown.click();
//	}
	
	public void press_SearchImg(){
		searchImg.click();
	}

	public void press_Logo(){
		logo.click();
	}
	
	 public void press_Cautare() {
		  cautare.click();
		 }
	
	public void press_AdaugaAnunt(){
		adaugaAnunt.click();
	}
	
	public void press_ContulMeu(){
		contulMeu.click();
	}
	
	public void press_Dealer(){
		dealer.click();
	}
	
	public void get_SearchDropdown(String elem){
	List<String> searchList= new ArrayList<String>();
	//	    boolean found=false;
	for(WebElement item:searchDropdown){
		//		 if (item.getText().contains(elem)){
		//			 found=true;
		//		 }
		//	 }
		//		Assert.assertTrue("Name doesn't found", found);
		searchList.add(item.getText());
		System.out.println("Search types:"+ item.getText());
	}
}

}
