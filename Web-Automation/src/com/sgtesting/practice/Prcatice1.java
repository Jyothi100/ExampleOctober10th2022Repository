package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prcatice1 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeLogInWindow();
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
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
    		oBrowser.get("https://www.flipkart.com/");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void closeLogInWindow()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
