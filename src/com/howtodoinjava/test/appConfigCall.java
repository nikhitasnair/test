package com.howtodoinjava.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class appConfigCall {
	public static String URL = null;
	public static String Username = null;
	public static String Password = null;
	public static String BrowserType = null;
	public static String DropdownSelectBy = null;
	public static String RadioSelectBy = null;
	
	public static void configMethod()  {
		File configFile = new File("C:/Users/NAIRNX/workspace/LCProject/Config files/AppConfig.Properties");
		Properties prop = new Properties();
		FileInputStream fileInput = null;
			try { 
				fileInput = new FileInputStream(configFile);
			    } catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			//load properties file
			try {
				prop.load(fileInput);
				URL=prop.getProperty("URL");
				Username=prop.getProperty("txtUserId");	
				Password=prop.getProperty("txtPassword");
				BrowserType=prop.getProperty("browserType");
				DropdownSelectBy=prop.getProperty("dropdownSelectBy");
				RadioSelectBy=prop.getProperty("radioSelectBy");
				
				} catch (IOException e) {
				e.printStackTrace();
			 }
			
			return;
	}
		
}

	

		

	


	

