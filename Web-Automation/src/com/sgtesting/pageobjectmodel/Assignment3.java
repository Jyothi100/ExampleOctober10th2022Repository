package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	public static WebDriver oBrowser=null;
    public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		launchrowser();
		navigate();
		logIn();
		minimizeFlyOutWindow();
		createUser();
		createUser2();
		createUser3();
		logOut();
		logInAsUser1();
		clickOnStartExplrActiTime();
		logOut();
		logInAsUser2();
		clickOnStartExplrActiTime();
		logOut();
		logInAsUser3();
		clickOnStartExplrActiTime();
		logOut();
		logInAsUser1();
		modifyUser1Pwd();
		logOut();
		logInAsUser2();
		modifyUser2Pwd();
		logOut();
		logInAsUser3();
		modifyUser3Pwd();
		logOut();
		logInWithNewPwdUser1();
		logOut();
		logInWithNewPwdUser2();
		logOut();
		logInWithNewPwdUser3();
		logOut();
		logIn();
		modifyPwdForUser123();
		logOut();
		logInWithPwdUser1();
		logOut();
		logInWithPwdUser2();
		logOut();
		logInWithPwdUser3();
		logOut();
		logIn();
		deleteUser123();
		logOut();
        closeApp();
	}
    private static void launchrowser()
    {
    	try
    	{
    		System.setProperty("webdriver.chrome.driver",".\\Library\\drivers\\chromedriver.exe");
    		oBrowser=new ChromeDriver();
    		oBrowser.manage().window().maximize();
    		oPage=new ActiTimePage(oBrowser);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void navigate()
    {
    	try
    	{
    		oBrowser.navigate().to("http://localhost/login.do");
    		Thread.sleep(5000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logIn()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("admin");
    		oPage.getpwd().sendKeys("manager");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void minimizeFlyOutWindow()
    {
    	try
    	{
    		oPage.getFlyOutWindow().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void createUser()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.AddUser().click();
    		Thread.sleep(2000);
    		oPage.enterFirstName().sendKeys("demo");
    		Thread.sleep(1000);
    		oPage.enterLastName().sendKeys("User1");
    		Thread.sleep(1000);
    		oPage.enterEMail().sendKeys("demoUser1@gamil.com");
    		Thread.sleep(1000);
    		oPage.enterUserName().sendKeys("demoUser1");
            Thread.sleep(2000);
            oPage.userPWD().sendKeys("welcome1");
            oPage.userPWDretype().sendKeys("welcome1");
            oPage.createUser().click();
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
    		oPage.AddUser().click();
    		Thread.sleep(2000);
    		oPage.enterFirstName().sendKeys("demo");
    		Thread.sleep(2000);
    		oPage.enterLastName().sendKeys("User2");
    		Thread.sleep(2000);
    		oPage.enterEMail().sendKeys("demoUser2@gamil.com");
    		Thread.sleep(2000);
    		oPage.enterUserName().sendKeys("demoUser2");
            Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome2");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome2");
    		Thread.sleep(2000);
    		oPage.createUser().click();
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
    		oPage.AddUser().click();
    		Thread.sleep(2000);
    		oPage.enterFirstName().sendKeys("demo");
    		Thread.sleep(2000);
    		oPage.enterLastName().sendKeys("User3");
    		Thread.sleep(2000);
    		oPage.enterEMail().sendKeys("demoUser3@gamil.com");
    		Thread.sleep(2000);
    		oPage.enterUserName().sendKeys("demoUser3");
            Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome3");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome3");
    		Thread.sleep(2000);
    		oPage.createUser().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInAsUser1()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser1");
    		oPage.getpwd().sendKeys("welcome1");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInAsUser2()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser2");
    		oPage.getpwd().sendKeys("welcome2");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInAsUser3()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser3");
    		oPage.getpwd().sendKeys("welcome3");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void deleteUser123()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.selectUser1().click();
    		Thread.sleep(1000);
    		oPage.deleteUser().click();
    		Thread.sleep(1000);
    		Alert oalert1=oBrowser.switchTo().alert();
    		Thread.sleep(1000);
    		String str=oalert1.getText();
    		System.out.println(str);
    		oalert1.accept();
    		Thread.sleep(2000);
    		oPage.selectUser2().click();
    		Thread.sleep(1000);
    		oPage.deleteUser().click();
    		Thread.sleep(1000);
    		Alert oalert2=oBrowser.switchTo().alert();
    		Thread.sleep(1000);
    		String str2=oalert2.getText();
    		System.out.println(str2);
    		oalert2.accept();
    		Thread.sleep(2000);
    		oPage.selectUser3().click();
    		Thread.sleep(1000);
    		oPage.deleteUser().click();
    		Thread.sleep(1000);
    		Alert oalert3=oBrowser.switchTo().alert();
    		Thread.sleep(1000);
    		String str3=oalert3.getText();
    		System.out.println(str3);
    		oalert3.accept();
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
    		oPage.getLogOut().click();
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
    private static void modifyUser1Pwd()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.selectUser1().click();
    		Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome11");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome11");
    		Thread.sleep(2000);
    		oPage.userSaveChange().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void modifyUser2Pwd()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.selectUser2().click();
    		Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome22");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome22");
    		Thread.sleep(2000);
    		oPage.userSaveChange().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void modifyUser3Pwd()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.selectUser3().click();
    		Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome33");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome33");
    		Thread.sleep(2000);
    		oPage.userSaveChange().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInWithNewPwdUser1()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser1");
    		oPage.getpwd().sendKeys("welcome11");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInWithNewPwdUser2()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser2");
    		oPage.getpwd().sendKeys("welcome22");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInWithNewPwdUser3()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser3");
    		oPage.getpwd().sendKeys("welcome33");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void modifyPwdForUser123()
    {
    	try
    	{
    		oPage.User().click();
    		Thread.sleep(2000);
    		oPage.selectUser1().click();
    		Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome111");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome111");
    		Thread.sleep(2000);
    		oPage.userSaveChange().click();
    		Thread.sleep(2000);
    		oPage.selectUser2().click();
    		Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome222");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome222");
    		Thread.sleep(2000);
    		oPage.userSaveChange().click();
    		Thread.sleep(2000);
    		oPage.selectUser3().click();
    		Thread.sleep(2000);
    		oPage.userPWD().sendKeys("welcome333");
    		Thread.sleep(2000);
    		oPage.userPWDretype().sendKeys("welcome333");
    		Thread.sleep(2000);
    		oPage.userSaveChange().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInWithPwdUser1()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser1");
    		oPage.getpwd().sendKeys("welcome111");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInWithPwdUser2()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser2");
    		oPage.getpwd().sendKeys("welcome222");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void logInWithPwdUser3()
    {
    	try
    	{
    		oPage.getUserName().sendKeys("demoUser3");
    		oPage.getpwd().sendKeys("welcome333");
    		Thread.sleep(2000);
    		oPage.getlogin().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
    private static void clickOnStartExplrActiTime()
    {
    	try
    	{
    		oPage.startExploringActiTime().click();
    		Thread.sleep(2000);
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
   
}
