package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment4 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createCustomer();
		deleteCustomer();
		logOut();
		closeApp();
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser =new ChromeDriver();
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
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
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
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//div[text()='TASKS']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.className("addNewButton")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("FlipKart");
    		oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("It is an e-commerce application");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.className("actionButton")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
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
    		oBrowser.findElement(By.linkText("Logout")).click();
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
