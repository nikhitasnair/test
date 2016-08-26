package com.howtodoinjava.test;

import org.openqa.selenium.By;

public class ElementFactory {
	
	public By userNameElement = By.name("txtUserId");

    public By passwordElement = By.name("txtPassword");

    public By loginElement = By.id("btnSignIn");
    
   
                  
    //elements for method factory 
    
    public By dropDown = By.name("");
    
    public By radioButtonId = By.id("");
    
    public By radioButtonName = By.name("");
     
    public By image = By.xpath("//img[contains(@id,'logo-header'])]");
    
    public By pageText = By.xpath("//div[@id='navbar']/div[2]/div/a");

}
