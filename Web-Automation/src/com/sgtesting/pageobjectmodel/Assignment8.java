package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
    public static WebDriver oBrowser=null;
    public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
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
    	//	oBrowser.manage().window().maximize();
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
    private static void createProject()
    {
    	try
    	{
    		oPage.addNewCustorProj().click();
    		Thread.sleep(2000);
    		oPage.projectAdd().click();
    		Thread.sleep(2000);
    		oPage.projectNameTextField().sendKeys("Payment Modes");
    		Thread.sleep(2000);
    		oPage.projectCreateButton().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createTask()
    {
    	try
    	{
    		oPage.taskAdd().click();
    		Thread.sleep(2000);
    		oPage.taskCreate().click();
    		Thread.sleep(2000);
    		oPage.tasknameTextField().sendKeys("add BharthPay");
    		Thread.sleep(2000);
    		oPage.taskCreateButton().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteTask()
    {
    	try
    	{
    		oPage.taskClickOn().click();
    		Thread.sleep(2000);
    		oPage.taskActionButton().click();
    		Thread.sleep(2000);
    		oPage.taskDelete().click();
    		Thread.sleep(2000);
    		oPage.taskDltPermanent().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteProject()
    {
    	try
    	{
    		oPage.projectEditButton().click();
    		Thread.sleep(2000);
    		oPage.projectActionButton().click();
    		Thread.sleep(2000);
    		oPage.projectDeleteButton().click();
    		Thread.sleep(2000);
    		oPage.projectDltPermanent().click();
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
