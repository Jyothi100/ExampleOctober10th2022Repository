package com.sgtesting.tests;

public class ExecuteAutoITDemo {

	public static void main(String[] args) {
		executeAutoIT();
	}
    private static void executeAutoIT()
    {
    	try
    	{
    		//Runtime.getRuntime().exec("C:\\ExampleAutomation\\AutoIT\\FirstScript.exe");
    		
    		Runtime obj=Runtime.getRuntime();
    		obj.exec("C:\\\\ExampleAutomation\\\\AutoIT\\\\FirstScript.exe");
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
}
