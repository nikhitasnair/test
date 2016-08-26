package com.howtodoinjava.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class LoginPage extends MethodsFactory{

	
	 WebDriver driver;
	//Properties prop = new Properties();
	 //appConfigCall aCC=new appConfigCall();
	 BrowserSetup browser=new BrowserSetup(driver);
	 ElementFactory ef=new ElementFactory();
	 MethodsFactory mf=new MethodsFactory();
	 appConfigCall appConfigCall=new appConfigCall();
	 

@Test (groups={"basicFuncTest","detailedTest"})

	  public void loginToPage() {
	 	try {
	 	
		BrowserSetup.driver.get(appConfigCall.URL);
		BrowserSetup.driver.findElement(ef.userNameElement).sendKeys(appConfigCall.Username);
		BrowserSetup.driver.findElement(ef.passwordElement).sendKeys(appConfigCall.Password);
		BrowserSetup.driver.findElement(ef.loginElement).click();
		
		
	MethodsFactory.getPageText();
			
	  }catch (NullPointerException e) {
			e.printStackTrace();
		}
}

@Test(groups={"basicFuncTest","detailedTest"})
public void testGroup1()
{
	System.out.println("This should be run");
}
@Test(groups={"basicFuncTest"})
public void testGroup2()
{
	System.out.println("This should not be run");
}

  @BeforeTest(alwaysRun = true)
   public void initDriver() throws Exception { 
        appConfigCall.configMethod();
        BrowserSetup.setDriver(appConfigCall.BrowserType, appConfigCall.URL);
        
  } 

  @AfterMethod(alwaysRun = true)

  public void afterTest() throws Exception {
	
  }
}

