package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopup {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		handlingPopUp();
		popupsTesting();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			
		}catch (Exception e) 
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
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void handlingPopUp()
	{
		try
		{
			WebElement oLink=oBrowser.findElement(By.linkText("actiTIME Inc."));
			System.out.println("Before clicking on link ,number of popup :"+getPopUpCount());
			oLink.click();
			System.out.println("After clicking on link,number of popups :"+getPopUpCount());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static int getPopUpCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size()-1;
		return count;
	}
	private static void popupsTesting()
	{
		try
		{  	
			String parentBrowser=oBrowser.getWindowHandle();
			System.out.println("parent browser:"+parentBrowser);
			Object popups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<popups.length;i++)
			{
				String childBrowser=popups[i].toString();
				System.out.println("Child Browesr :"+childBrowser);
				Thread.sleep(2000);
				oBrowser.switchTo().window(childBrowser);
				String childBrowserTitle=oBrowser.getTitle();
				System.out.println("ChildBrowser Title :"+childBrowserTitle);
				oBrowser.findElement(By.linkText("Try Free")).click();
				Thread.sleep(3000);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}	