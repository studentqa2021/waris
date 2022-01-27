package com.generic.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLoginPractice {
     
	public void getlogin(){
    	
   System.setProperty("webdriver.chrome.driver","/Users/waris/Downloads/chromedriver");
    	 
    WebDriver driver = new ChromeDriver();
	
   driver.get("https://demo.guru99.com/test/newtours/index.php");
   
   driver.manage().window().maximize();//this code for  bigger page. 
  
  WebElement user  =driver.findElement(By.xpath(" //*[@name='userName']"));
     
     user.sendKeys("ali");
     
WebElement password  =driver.findElement(By.xpath(" //*[@name='password']"));
     
     password.sendKeys("ali12345");
     
WebElement submitbutton  =driver.findElement(By.xpath(" //*[@name='submit']"));
     
     submitbutton.click();
     
     }

}
