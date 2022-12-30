package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutDemo {
    public static WebDriver oBrowser=null;
    public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		Login();
		minimizeFlyOutWindow();
		logOut();
		closeApp();
	}
    private static void LaunchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		oPage=new ActiTimePage(oBrowser);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    private static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost/login.do");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		
    	}
    }
    
    private static void Login()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("admin");
    		oPage.getpwd().sendKeys("manager");
    		oPage.getlogin().click();
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
    		oPage.getFlyOutWindow().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    
    private static void logOut()
    {
    	try
    	{
    		oPage.getLogOut();
    		Thread.sleep(4000);
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
