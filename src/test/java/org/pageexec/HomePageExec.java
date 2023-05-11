package org.pageexec;


import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.baseutils.BaseClass;
import org.openqa.selenium.WebElement;
import org.pagerepo.HomePageRepo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePageExec extends BaseClass{

	@Parameters("url")
	@BeforeClass
	public void url(String url)
	{
		driver.get(url);
	}	
	@Test
	public void search() throws InterruptedException
	{
		HomePageRepo hp=new HomePageRepo();
		hp.getSearchbar().sendKeys("redmi");
		Thread.sleep(2000);
		hp.getSearchselc().click();
		for(int i=1;i<=5;i++)
		{
			waits();
			hp.getNextpage().click();
		}
		
		List<WebElement> mobileList = hp.getMobileList();
		List<WebElement> priceList = hp.getPriceList();
		String mobile="";
		String price="";
		Map<String,String>lhm =new LinkedHashMap<>();
		for(int i=0;i<=mobileList.size()-1;i++)
		{
			 mobile =mobileList.get(i).getText();
			 price =priceList.get(i).getText();
			lhm.put(mobile, price);
		}
		Set<Entry<String,String>> entrySet = lhm.entrySet();
		System.out.println("Mobile models : "+"\t "+"Price List : ");
		
		for (Entry<String, String> entry : entrySet)
		{
				System.out.println(entry);
		}
}
}