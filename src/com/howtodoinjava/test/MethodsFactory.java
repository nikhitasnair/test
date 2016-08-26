package com.howtodoinjava.test;

import java.io.File;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MethodsFactory extends ElementFactory{

//BrowserSetup browser=new BrowserSetup();
static ElementFactory ef=new ElementFactory();
//WebDriver driver;
     public static String getPageText() {
	
     String Homepagetext=BrowserSetup.driver.findElement(ef.pageText).getText();
     System.out.println("Value is abcd");
	return Homepagetext;
	
	
}
	public static void dropdownSelection()
	{
	WebElement dropdownElement = BrowserSetup.driver.findElement(ef.dropDown);
	Select dropdownsel=new Select(dropdownElement);
	
	if(appConfigCall.DropdownSelectBy=="index")
	{
	dropdownsel.selectByIndex(1);
	}
	if(appConfigCall.DropdownSelectBy=="value")
	{
		dropdownsel.selectByValue("");
	}
	if(appConfigCall.DropdownSelectBy=="visibletext")
	{
		dropdownsel.selectByVisibleText("");
	}
	}
	
	public void radioSelection()
	{		
		if(appConfigCall.RadioSelectBy=="id")
		{
		WebElement radioBtn = BrowserSetup.driver.findElement(ef.radioButtonId);
		radioBtn.click();
		}
		
		/*if(appConfigCall.RadioSelectBy=="IsSelected")
		{
		List<WebElement> oRadioButton = driver.findElements(ef.radioButtonName);
		 
		 // Create a boolean variable which will hold the value (True/False)
		 
		 boolean bValue = false;
		 
		 // This statement will return True, in case of first Radio button is selected
		 
		 bValue = oRadioButton.get(0).isSelected();
		 
		 // This will check that if the bValue is True means if the first radio button is selected
		 
		 if(bValue = true){
		 
			// This will select Second radio button, if the first radio button is selected by default
		 
			oRadioButton.get(1).click();
		 
		 }else{
		 
			// If the first radio button is not selected by default, the first will be selected
		 
			oRadioButton.get(0).click();

		
		
	}
	
	}*/
	}
	
	
	
		 
		 /*public void readExcel () throws Exception
		 
		 {	 
			 String FilePath = "d://filepath.xls";
			 FileInputStream fs = new FileInputStream(FilePath);
			 Workbook wb = Workbook.getWorkbook(fs);
			 Sheet sh = wb.getSheet(0);
			 String CellGetContent = sh.getCell(0,0).getContents();
			 System.out.println(CellGetContent);
		 }
*/
		 
		 public void CheckImage() throws Exception {
			 //driver.get(appConfigCall.URL);

			 WebElement ImageFile = BrowserSetup.driver.findElement(ef.image);

			     Boolean ImagePresent = (Boolean) ((JavascriptExecutor)BrowserSetup.driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
			     if (!ImagePresent)
			     {
			          System.out.println("Image not displayed.");
			     }
			     else
			     {
			         System.out.println("Image displayed.");
			     }
			 }
	
}
	
	
	
	
	

