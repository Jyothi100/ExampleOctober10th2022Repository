package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	 public static WebDriver oBrowser=null;
	    public static ActiTimePage oPage=null;
		public static void main(String[] args) {
			launchBrowser();
			navigate();
			logIn();
			minimizeFlyOutWindow();
			createCustomer();
			modifyCustomer();
			deleteCustomer();
			logOut();
			closeApp();
		}
	    private static void launchBrowser()
	    {
	    	try
	    	{
	    		System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
	    		oBrowser=new ChromeDriver();
	    		oPage=new ActiTimePage(oBrowser);
	    		oBrowser.manage().window().maximize();
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
	    private static void logIn()
	    {
	    	try
	    	{
	    		oPage.getUserName().sendKeys("admin");
	    		oPage.getpwd().sendKeys("manager");
	    		Thread.sleep(2000);
	    		oPage.getlogin().click();
	    		Thread.sleep(2000);
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
	    private static void createCustomer()
	    {
	    	try
	    	{
	    		oPage.Task().click();
	    		Thread.sleep(2000);
	    		oPage.addNewCustorProj().click();
	    		Thread.sleep(2000);
	    		oPage.createCustomer().click();
	    		Thread.sleep(2000);
	    		oPage.enterCustomerName().sendKeys("FlipKart");
	    		Thread.sleep(2000);
	    		oPage.CustomerCreateButton().click();
	    		Thread.sleep(2000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    private static void modifyCustomer()
	    {
	    	try
	    	{
	    		oPage.CustomerEditButton().click();
	    		Thread.sleep(2000);
	    		oPage.CustomerEditDesc().sendKeys("it is an e-commerce application");
	    		Thread.sleep(2000);
	    		oPage.CustomerCloseButton().click();
	    		Thread.sleep(2000);
	    	}catch(Exception e)
	    	{
	    		e.printStackTrace();
	    	}
	    }
	    private static void deleteCustomer()
	    {
	    	try
	    	{
	    		oPage.CustomerEditButton().click();
	    		Thread.sleep(2000);
	    		oPage.CustomerActionButton().click();
	    		Thread.sleep(2000);
	    		oPage.CustomerDelete().click();
	    		Thread.sleep(2000);
	    		oPage.customerDltPermanent().click();
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
	    		oPage.getLogOut().click();
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