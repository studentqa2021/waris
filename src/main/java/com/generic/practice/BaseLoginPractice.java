package com.generic.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoginPractice {
     public void getlogin(){
    	
   System.setProperty("webdriver.chrome.driver","/Users/waris/Downloads/chromedriver");
    	 
    WebDriver driver = new ChromeDriver();
	
   driver.get("https://https://demo.guru99.com/test/newtours/");
	
  driver.findElement(By.xpath(null));
     
     
     
     
     
     
     
     }

}
