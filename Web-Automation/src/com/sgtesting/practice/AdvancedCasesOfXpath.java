package com.sgtesting.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedCasesOfXpath {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	findLinksCount();
	//	findDropDownsCount();
    //	displayLinks();
   	    clickOnLinksBasedOnEndsWithTextContent();
	//	staleElementReferenceDemo();
	}
    private static void launchBrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
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
    		oBrowser.get("file:///C:/html/xpath_15_dec_2022/Sample.html");
        	Thread.sleep(5000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void findLinksCount()
    {
    	try
    	{
    		List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
    		int count=olinks.size();
    		System.out.println("# of Links :"+count);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void findDropDownsCount()
    {
    	try
    	{
    		List<WebElement> olinks=oBrowser.findElements(By.xpath("//select[@id]"));
    		int count=olinks.size();
    		System.out.println("# of dropdowns :"+count);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void displayLinks()
    {
        List<WebElement> ele=oBrowser.findElements(By.xpath("//a[@href]"));
        Iterator<WebElement> ite=ele.iterator();
        while(ite.hasNext())
        {
        	WebElement link=ite.next();
        	String str=link.getText();
        	System.out.println(str);
        }
    }
    private static void clickOnLinksBasedOnEndsWithTextContent()
    {
    	List<WebElement> olinks=oBrowser.findElements(By.xpath("//a[@href]"));
    	for(int i=0;i<olinks.size();i++)
    	{
    		WebElement link=olinks.get(i);
    		String str=link.getText();
    		System.out.println(str);
    		if(str.endsWith("Tool"))
    		{
    			link.click();
    			break;
    		}
    	}
    }
}
