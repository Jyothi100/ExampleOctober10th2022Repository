package com.sgtesting.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		deleteUser();
		logout();
		closeApp();
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    		oBrowser.navigate().to("http://localhost/login.do");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void login()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void minimizeFlyOutWindow()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
            Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createUser1()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@*='content users']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[contains(@class,'beigeButton')]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//input[@id='userDataLightBox_firstNameField' and  @name='firstName']")).sendKeys("demo");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//input[starts-with(@class,'lastNameField')]")).sendKeys("User1");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//input[@id='emailField inputFieldWithPlaceholder' or @name='email']")).sendKeys("demoUser1@gmail.com");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@*='username']")).sendKeys("demoUser1");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//input[starts-with(@class,'passwordField')]")).sendKeys("welcome1");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//input[@name='passwordCopy']")).sendKeys("welcome1");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[starts-with(text(),'Create')]")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
    		Thread.sleep(2000);
    		Alert oalert=oBrowser.switchTo().alert();
    		Thread.sleep(2000);
    		String content=oalert.getText();
    		System.out.println(content);
    		oalert.accept();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logout()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//a[text()='Logout']")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeApp()
    {
    	try
    	{
    		oBrowser.quit();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
