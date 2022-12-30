package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser1();
		createUser2();
		createUser3();
		logoutFromAdmin();
		logInAsUser1();
		logOutAsUser1();
		logInAsUser2();
		logOutAsUser2();
		logInAsUser3();
		logOutAsUser3();
		logInUser1();
		 modifyPwdUser1();
		 logOutUser1();
		 logInUser2();
		 modifyPwdUser2();
		 logOutUser2();
		 logInUser3();
		 modifyPwdUser3();
		 logOutUser3();
		 logInUser1NewPwd();
		 logOutAsUser1();
		 logInUser2NewPwd();
		 logOutAsUser2();
		 logInUser3NewPwd();
		 logOutUser3();
		 login();
		 modifyPwdFor123();
		 logoutFromAdmin();
		 logInUserNewPwd1();
		 logOutUser11();
		 logInUserNewPwd2();
		 logOutUser22();
		 logInUserNewPwd3();
		 logOutUser33();
		 login();
		 deleteUser();
		 logoutFromAdmin();
		 closeApp();
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
    private static void createUser1()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    		oBrowser.findElement(By.name("lastName")).sendKeys("User1");
    		oBrowser.findElement(By.name("email")).sendKeys("demoUser1@gmail.com");
    		oBrowser.findElement(By.name("username")).sendKeys("demoUser1");
    		oBrowser.findElement(By.name("password")).sendKeys("welcome1");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome1");
    		oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
    		Thread.sleep(2000);	
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void createUser2()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    		oBrowser.findElement(By.name("lastName")).sendKeys("User2");
    		oBrowser.findElement(By.name("email")).sendKeys("demoUser2@gmail.com");
    		oBrowser.findElement(By.name("username")).sendKeys("demoUser2");
    		oBrowser.findElement(By.name("password")).sendKeys("welcome2");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome2");
    		oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
    		Thread.sleep(2000);	
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void createUser3()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("firstName")).sendKeys("demo");
    		oBrowser.findElement(By.name("lastName")).sendKeys("User3");
    		oBrowser.findElement(By.name("email")).sendKeys("demoUser1@gmail.com");
    		oBrowser.findElement(By.name("username")).sendKeys("demoUser3");
    		oBrowser.findElement(By.name("password")).sendKeys("welcome3");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome3");
    		oBrowser.findElement(By.id("userDataLightBox_commitBtn")).click();
    		Thread.sleep(2000);	
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logoutFromAdmin()
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
    private static void logInAsUser1()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome1");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutAsUser1()
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
    private static void logInAsUser2()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
  
    private static void logOutAsUser2()
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
    private static void logInAsUser3()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    		oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutAsUser3()
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
    private static void logInUser1()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome1");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void modifyPwdUser1()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("password")).sendKeys("welcome11");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome11");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutUser1()
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
    private static void logInUser2()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome2");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void modifyPwdUser2()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User2, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("password")).sendKeys("welcome22");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome22");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutUser2()
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
    private static void logInUser3()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome3");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void modifyPwdUser3()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User3, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("password")).sendKeys("welcome33");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome33");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
    		Thread.sleep(2000);
    		
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutUser3()
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
    private static void logInUser1NewPwd()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome11");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logInUser2NewPwd()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome22");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logInUser3NewPwd()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome33");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void modifyPwdFor123()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User2, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("password")).sendKeys("welcome222");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome222");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User3, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("password")).sendKeys("welcome333");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome333");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.name("password")).sendKeys("welcome111");
    		oBrowser.findElement(By.name("passwordCopy")).sendKeys("welcome111");
    		oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logInUserNewPwd1()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome111");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutUser11()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("Logout")).click();
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logInUserNewPwd2()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome222");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutUser22()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("Logout")).click();
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logInUserNewPwd3()
    {
    	try
    	{
    		oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
    		oBrowser.findElement(By.name("pwd")).sendKeys("welcome333");
    		oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void logOutUser33()
    {
    	try
    	{
    		oBrowser.findElement(By.linkText("Logout")).click();
    	}catch(Exception e)
    	{
        	e.printStackTrace();
    	}
    }
    private static void deleteUser()
    {
    	try
    	{
    		oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a\r\n")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User1, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Alert oAlert=oBrowser.switchTo().alert();
    		Thread.sleep(2000);
    		String content=oAlert.getText();
    		System.out.println(content);
    		oAlert.accept();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User2, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Thread.sleep(2000);
    		Alert oAlert1=oBrowser.switchTo().alert();
    		Thread.sleep(2000);
    		String content1=oAlert1.getText();
    		System.out.println(content1);
    		oAlert1.accept();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.xpath("//span[text()='User3, demo']")).click();
    		Thread.sleep(2000);
    		oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
    		Thread.sleep(2000);
    		Alert oAlert2=oBrowser.switchTo().alert();
    		Thread.sleep(2000);
    		String content2=oAlert2.getText();
    		System.out.println(content2);
    		oAlert2.accept();
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
