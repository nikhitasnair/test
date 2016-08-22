package com.howtodoinjava.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	 WebDriver driver;
	static appConfigCall aCC=new appConfigCall();
	
	public void setDriver(String browserType, String URL){
	switch (browserType) {
	case "chrome":
		driver = initChromeDriver(URL);
		break;
	case "firefox":
		driver = initFirefoxDriver(URL);
		break;
	default:
		System.out.println("browser : " + browserType
				+ " is invalid, Launching Firefox as browser of choice..");
		driver = initFirefoxDriver(URL);
	}
}
	
public static WebDriver initChromeDriver(String URL) {
	System.out.println("Launching google chrome with new profile..");
	System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	//aCC.configMethod();
	driver.get(URL);
	System.out.println(driver);
	return driver;
	
}
public static WebDriver initFirefoxDriver(String URL) {
	System.out.println("Launching Firefox browser..");
	WebDriver driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(URL);
	return driver;
}

}
