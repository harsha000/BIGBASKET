package com.qa.TestCase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.BaseTst.BaseTest;
import com.qa.Utility.ExcelUtility;
import com.qa.pages.BBPage;



public class BBTestCase extends BaseTest{
	
	

	@Test(dataProvider="fetchData")
	public void BigBasket(String inp) throws InterruptedException {
		BBPage page = new BBPage(driver);
		page.getSearchBox().sendKeys(inp,Keys.ENTER);
		Thread.sleep(5000);
		List <WebElement> results = page.getResults();
		for (WebElement result : results) {
			String title = result.findElement(By.cssSelector("a[class='ng-binding']")).getText();
			String rating = result.findElement(By.className("discnt-price")).getText();
			Reporter.log("price of " + title + " : " + rating, true);

		}
		
		
		


	}
	@DataProvider
	public Object[][] fetchData() throws IOException
	{
		String xlPath="D:\\BIGBASKET\\src\\test\\java\\com\\qa\\TestData\\inpData.xlsx";
		String xlSheet="Sheet1";
		int rowcount=ExcelUtility.getRowCount(xlPath, xlSheet);
		int cellcount=ExcelUtility.getCellCount(xlPath, xlSheet, rowcount);
		String [][] data=new String[rowcount][cellcount];
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<cellcount;j++)
			{
				data[i-1][j]=ExcelUtility.getCellData(xlPath, xlSheet, i, j);
			}
		}
		
		return data;
	}
}