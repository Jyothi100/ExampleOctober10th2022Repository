package com.sgtesting.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AxesDemo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryForSachinTendulkar();
	//	enterSalaryNextToSanchin();
	//	makeDesignationActiveForIndianFreedomFighter();
	//	makeStatusActiveForPreviousSecondRecordOfSachin();
	//	getAttributeValueOfTableBasedOnRahulDravidSalaryTextField();
		BasedOnTableItsFourtRecordEnterTheSalary();
	}
    private static void launchBrowser()
    {
    	try
    	{
    	     System.setProperty("webdriver.chrome.driver",".\\\\Library\\\\drivers\\\\chromedriver.exe");
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
    		oBrowser.navigate().to("file:///C:/html/xpath_axes_15_dec_2022/WebTableHTML.html");
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void enterSalaryForSachinTendulkar()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("2500");
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void enterSalaryNextToSanchin()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("48000");
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void makeDesignationActiveForIndianFreedomFighter()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td/input")).click();
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void makeStatusActiveForPreviousSecondRecordOfSachin()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/preceding::tr[2]/td/input")).click();
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void getAttributeValueOfTableBasedOnRahulDravidSalaryTextField()
    {
    	try
    	{
    		WebElement ele=oBrowser.findElement(By.xpath("//input[@id='edit3']/ancestor::td/ancestor::tr/ancestor::table"));
    		String str=ele.getAttribute("id");
    		System.out.println(str);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
    private static void BasedOnTableItsFourtRecordEnterTheSalary()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[4]/td[6]/input")).sendKeys("45000");
    		Thread.sleep(2000);
    	}catch (Exception e) 
    	{
			e.printStackTrace();
		}
    }
}
