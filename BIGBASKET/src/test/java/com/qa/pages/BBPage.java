package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBPage {
	WebDriver driver;
	
	@FindBy(xpath="//input[@id='input']") 
	WebElement searchBox;
	public BBPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
}

	
	@FindAll(@FindBy(xpath="//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div/product-template[1]/div[1]")) 
	List <WebElement> results;
                                                                                                                                                                                                             

	
	public WebElement getSearchBox() {
		return searchBox;
	}
	
	
	public List <WebElement> getResults() {
		return results;
	}
}

//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div/product-template[1]/div[1]

//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[4]/product-template[1]/div[1]

//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[14]/product-template[1]/div[1]

//body/div[1]/div[3]/product-deck[1]/section[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]