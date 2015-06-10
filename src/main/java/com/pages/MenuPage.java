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
	private WebElement mobileField;
	
	@FindBy(css=" a[title='Contact']")
	private WebElement contactField;
	
	@FindBy(css="input[id='homeSearch']")
	private WebElement searchField;
	
	@FindBy(css="select[id=homeSearchCategory] option[class]")
	private List<WebElement> searchDropdown;
	
	@FindBy(css="div[id='homeSearchButton'] img[src]")
	 private WebElementFacade searchImages;

	@FindBy(css="div[id='logoPowerd'] a[href]]")
	private WebElement bestAutoLogo;
	
	@FindBy(css="a[title='Cautare']")
	 private WebElementFacade searchPage;
	
	@FindBy(css="ul[id='new_nav'] a[title='Adauga anunt']")
	 private WebElementFacade addNewAnnouncementPage;
	
	@FindBy(css="ul[id='new_nav'] a[title='Contul meu']")
	 private WebElementFacade myAccount;
	
	@FindBy(css="ul[id='new_nav'] a[title='Dealer']")
	 private WebElementFacade dealer;

	 
	public void clickSearchField(){
		searchField.click();
	}
	
//	public void press_SearchDropdown(){
//	  element(nextButton).waitUntilVisible();
//		searchDropdown.click();
//	}
	
	public void clickSearchImages(){
		searchImages.click();
	}

	public void clickBestAutoLogo(){
		bestAutoLogo.click();
	}
	
	 public void clickSearchPage() {
		  searchPage.click();
		 }
	
	public void clickAddNewAnnouncementPage(){
		addNewAnnouncementPage.click();
	}
	
	public void clickMyAccount(){
		myAccount.click();
	}
	
	public void clickDealer(){
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
