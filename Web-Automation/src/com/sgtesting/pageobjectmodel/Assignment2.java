package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
    public static WebDriver oBrowser=null;
    public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		logIn();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
		deleteUser();
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
    		Thread.sleep(2000);
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
    		Thread.sleep(1000);
    		oPage.getlogin().click();
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
    private static void createUser()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.AddUser().click();
    		Thread.sleep(2000);
    		oPage.enterFirstName().sendKeys("demo");
    		Thread.sleep(1000);
    		oPage.enterLastName().sendKeys("User1");
    		Thread.sleep(1000);
    		oPage.enterEMail().sendKeys("demoUser1@gamil.com");
    		Thread.sleep(1000);
    		oPage.enterUserName().sendKeys("demoUser1");
            Thread.sleep(2000);
            oPage.userPWD().sendKeys("welcome1");
            oPage.userPWDretype().sendKeys("welcome1");
            oPage.createUser().click();
            Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void modifyUser()
    {
    	try
    	{
    		oPage.selectUser1().click();
    		Thread.sleep(5000);
    		oPage.enterEMail().clear();
    		Thread.sleep(3000);
    		oPage.enterEMail().sendKeys("demouser11@gmail.com");
    		Thread.sleep(1000);
    		oPage.userSaveChange().click();
    		Thread.sleep(1000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteUser()
    {
    	try
    	{
    		oPage.selectUser1().click();
    		Thread.sleep(1000);
    		oPage.deleteUser().click();
    		Thread.sleep(1000);
    		Alert oalert=oBrowser.switchTo().alert();
    		Thread.sleep(1000);
    		String str=oalert.getText();
    		System.out.println(str);
    		oalert.accept();
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


