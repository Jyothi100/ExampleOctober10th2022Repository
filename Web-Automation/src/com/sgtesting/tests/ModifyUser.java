package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ModifyUser {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		modifyUser();
	    deleteUser();
		logout();
		closeApp();
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
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
    		Thread.sleep(2000);
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
    		oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div\r\n")).click();
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
    		Thread.sleep(5000);
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
    private static void createUser()
    {
        try
        {
    	    oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a")).click();
    	    Thread.sleep(5000);
    	    oBrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div")).click();
    	    Thread.sleep(2000);
    	    oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    	    oBrowser.findElement(By.name("lastName")).sendKeys("User1");
    	    oBrowser.findElement(By.name("email")).sendKeys("demoUser1@gmail.com");
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
    private static void modifyUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
    		oBrowser.findElement(By.name("password")).sendKeys("welcome11");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome11");
    		oBrowser.findElement(By.name("firstName")).sendKeys("Demo");
    		oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
