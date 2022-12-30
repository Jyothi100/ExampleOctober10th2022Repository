package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutUsingFirefoxBrowser {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		creaateUser();
		deleteUser();
		logout();
		closeApplication();
	

	}
    private static void launchBrowser()
    {
    	try
    	{
    		oBrowser=new FirefoxDriver();
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
    		e.printStackTrace();
    	}
    }
    private static void login()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
    //		oBrowser.findElement(By.xpath("//div[text()='Login']")).click();
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
    		oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
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
    		oBrowser.findElement(By.linkText("Logout")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeApplication()
    {
    	try
    	{
    		oBrowser.quit();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void creaateUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    		oBrowser.findElement(By.name("lastName")).sendKeys("User1");
    		oBrowser.findElement(By.name("email")).sendKeys("demouser1@yahoo.com");
    		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
    		oBrowser.findElement(By.name("password")).sendKeys("welcome1");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
    		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
    		Thread.sleep(5000);
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
    		Thread.sleep(5000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Thread.sleep(2000);
    		Alert oAlert=oBrowser.switchTo().alert();
    		Thread.sleep(2000);
    		String content=oAlert.getText();
    		System.out.println(content);
    		oAlert.accept();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
