package com.howtodoinjava.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;


public class LoginPage {

	
	 //Properties prop = new Properties();
	 //appConfigCall aCC=new appConfigCall();
	 BrowserSetup browser=new BrowserSetup();
	 ElementFactory ef=new ElementFactory();
	 MethodsFactory mf=new MethodsFactory();
	 
 
@Test (groups={"basicFuncTest","detailedTest"})

	  public void loginToPage() {
	 	try {
		
		browser.driver.findElement(ef.userNameElement).sendKeys(appConfigCall.Username);
		browser.driver.findElement(ef.passwordElement).sendKeys(appConfigCall.Password);
		browser.driver.findElement(ef.loginElement).click();

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
        browser.setDriver(appConfigCall.BrowserType, appConfigCall.URL);
        
  } 

  @AfterMethod(alwaysRun = true)

  public void afterTest() throws Exception {
	
  }
}

