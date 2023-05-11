package org.pagerepo;

import java.util.List;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageRepo {
	
	public HomePageRepo()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}

	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbar;
	
	@FindBy(xpath="(//div[@role='button'])[4]")
	private WebElement searchselc; 
	
		
	@FindBy(xpath="//*[contains(@aria-label,'Go to next page')]")
	private WebElement nextpage;
	
	@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']")
	private List<WebElement> mobileList;
	
	@FindBy(xpath="//span[@class='a-price']//child::span[@aria-hidden='true']//child::span[@class='a-price-whole']")
	private List<WebElement> priceList;

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchselc() {
		return searchselc;
	}

	public WebElement getNextpage() {
		return nextpage;
	}

	public List<WebElement> getMobileList() {
		return mobileList;
	}

	public List<WebElement> getPriceList() {
		return priceList;
	}
	
}
