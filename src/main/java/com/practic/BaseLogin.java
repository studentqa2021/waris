package com.practic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseLogin {
 public static  void  testlogin() throws InterruptedException{
//System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe ");
//this is selenium Webdriver path
// WebDriver obj=new ChromeDriver();
	 
	 System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("http://automationpractice.com/index.php"); // prob
		
		driver.manage().window().maximize();
		
		WebElement signInButton = driver.findElement(By.xpath("//*[@class='login']"));//prob
		signInButton.click();
		Thread.sleep(3000);// slow down for 3 sec
		
		WebElement email = driver.findElement(By.xpath("//*[@id='email']"));//prob
		email.sendKeys("sarowerny@gmail.com");//prob
		
		WebElement password = driver.findElement(By.xpath("//*[@name='passwd']"));//prob
		password.sendKeys("student");// crime
		
		WebElement signInBtn = driver.findElement(By.xpath("//*[@id='SubmitLogin']"));//prob
		signInBtn.click();
 }
}
