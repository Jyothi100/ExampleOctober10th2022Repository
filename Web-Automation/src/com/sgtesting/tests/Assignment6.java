package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		lunchrBrowser();
		navigate();
		logIn();
		minimizeFlyOutWindow();
		createCustomer();
		createProject();
		deleteProject();
		deleteCustomer();
		logOut();
		closeApp();
	}	
    private static void lunchrBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    		oBrowser.get("http://localhost/login.do ");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logIn()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("admin");
    		oBrowser.findElement(By.name("pwd")).sendKeys("manager");
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
    	}catch(Exception e)
        {
        	e.printStackTrace();
        }
    }
    private static void createCustomer()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    		oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
    		oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Flipkart");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("it is an e-commerce application");
    		oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
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
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Payment Options");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("providing multiple payment options for customers");
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
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
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
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
    		oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[2]")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
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
    		oBrowser.findElement(By.id("logoutLink")).click();
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
