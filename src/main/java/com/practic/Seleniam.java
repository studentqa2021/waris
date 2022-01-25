package com.practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Seleniam {


public void getlogout() throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","/Users/waris/Downloads/chromedriver"); //driver path
    
    WebDriver  Driver = new ChromeDriver();
 Driver.get("http://automationpractice.com/index.php"); // prob

 Driver.manage().window().maximize();
	
	WebElement signInButton = Driver.findElement(By.xpath("//*[@class= \"login\"]"));//prob
	signInButton.click();
	Thread.sleep(3000);// slow down for 3 sec
	
	WebElement email = Driver.findElement(By.xpath("//*[@id='email']"));//prob
	email.sendKeys("begumsultana808@gmail.com");//prob
	
	WebElement password = Driver.findElement(By.xpath("//*[@name='passwd']"));//prob
	password.sendKeys("ali12345");// crime
	
	WebElement signInBtn = Driver.findElement(By.xpath("//*[@id='SubmitLogin']"));//prob
	signInBtn.click();


}


}
