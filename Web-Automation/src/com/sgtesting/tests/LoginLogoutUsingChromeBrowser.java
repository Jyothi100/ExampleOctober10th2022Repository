package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutUsingChromeBrowser {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteUser();
		logout();
		closeApplivation();

	}
    private static void launchBrowser()
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
    		oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
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
    		oBrowser.findElement(By.id("logoutLink")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeApplivation()
    {
    	try 
    	{
    		oBrowser.close();
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_firstNameField\"]")).sendKeys("demo");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_lastNameField\"]")).sendKeys("User1");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_emailField\"]")).sendKeys("demoUser1@gmail.com");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_usernameField\"]")).sendKeys("demoUser1");
    		oBrowser.findElement(By.xpath(("//*[@id=\"userDataLightBox_passwordField\"]"))).sendKeys("welcome1");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_passwordCopyField\"]")).sendKeys("welcome1");
    		oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
