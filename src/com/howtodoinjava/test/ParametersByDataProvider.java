package com.howtodoinjava.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParametersByDataProvider {
	//@Test (dataProviderClass=ParametersByDataProvider.class)
		 @Test(dataProvider="getData")
			public void setData(String username, String password)
			{
				System.out.println("you have provided username as::"+username);
				System.out.println("you have provided password as::"+password);
			}
				 @DataProvider
				  public Object[][] getData() {
					  
					  //Rows- No.of times test has to be repeated
					  //Columns - No.of parameters in test data
					  Object[][] data = new Object[3][2];

						// 1st row
						data[0][0] ="sampleuser1";
						data[0][1] = "abcdef";
						
						// 2nd row
						data[0][0] ="sampleuser2";
						data[0][1] = "abcdef";
						
						// 3rd row
						data[0][0] ="sampleuser3";
						data[0][1] = "abcdef";
								
						
						return data;


				    };
				  
			}


