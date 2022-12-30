package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
    
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	
	//create WebElement for UserName text field
	private WebElement username;
	
	public WebElement getUserName()
	{
		return username;
	}
	
	//create WebElement for password text field
	private WebElement pwd;
	
	public WebElement getpwd()
	{
		return pwd;
	}
	
	//create WebElement for login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement ologin;
	
	public WebElement getlogin()
	{
		return ologin;
	}
	
	//create WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
	    return 	gettingStartedShortcutsPanelId;
	}
	
	//create WebElement for logout link
	@FindBy(linkText="Logout")
	private WebElement ologout;
	public WebElement getLogOut()
	{
		return ologout;
	}
	
	//create WebElement for clickOnCreateUser
	@FindBy(linkText="USERS")
	private WebElement ouser;
	public WebElement User()
	{
		return ouser;
	}
	
	//create WebElement for clickOnAddUser
	@FindBy(xpath="//div[text()='Add User']")
	private WebElement aduser;
	public WebElement AddUser()
	{
		return aduser;
	}
	
	//create WebElement for enteringtheDetailsForUser
	private WebElement firstName;
	public WebElement enterFirstName()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement enterLastName()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement enterEMail()
	{
		return email;
	}
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement name;
	public WebElement enterUserName()
	{
		return name;
	}
	
	private WebElement password;
	public WebElement userPWD()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement userPWDretype()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//span[text()='Create User']")
	private WebElement create;
	public WebElement createUser()
	{
		return create;
	}
	
	//create WebElement to select user
	@FindBy(xpath="//span[text()='User1, demo']")
	private WebElement selectUser1;
	public WebElement selectUser1()
	{
		return selectUser1;
	}
	
	@FindBy(xpath="//span[text()='User2, demo']")
	private WebElement selectUser2;
	public WebElement selectUser2()
	{
		return selectUser2;
	}
	
	@FindBy(xpath="//span[text()='User3, demo']")
	private WebElement selectUser3;
	public WebElement selectUser3()
	{
		return selectUser3;
	}
	
	//create WebElement to delete user
	private WebElement userDataLightBox_deleteBtn;
	public WebElement deleteUser()
	{
		return userDataLightBox_deleteBtn;
	}

	//create WebElement to modify user
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement save;
	public WebElement userSaveChange()
	{
		return save;
	}
	
	//create WebElement to create customer
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement task;
	public WebElement Task()
	{
		return task;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	public WebElement addNewCustorProj()
	{
		return addnew;
	}
	
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement createCustomer;
	public WebElement createCustomer()
	{
		return createCustomer;
	}
	
	@FindBy(xpath="//input[@id='customerLightBox_nameField']")
	private WebElement customername;
	public WebElement enterCustomerName()
	{
		return customername;
	}
	
	@FindBy(xpath="customerLightBox_descriptionField")
	private WebElement custDesc;
	public WebElement CustDescription()
	{
		return custDesc;
	}
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement createButton;
	public WebElement CustomerCreateButton()
	{
		return createButton;
	}
    
	//create WebElement to delete Customer
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement eBCustomer;
	public WebElement CustomerEditButton()
	{
		return eBCustomer;
	}
	
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actionBofCustomer;
	public WebElement CustomerActionButton()
	{
		return actionBofCustomer;
	}
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement deleteCustomer;
	public WebElement CustomerDelete()
	{
		return deleteCustomer;
	}
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement dltPrmt;
	public WebElement customerDltPermanent()
	{
		return dltPrmt;
	}
	
	//create WebElement to modify Customer
	@FindBy(xpath="//textarea[@class='textarea']")
	private WebElement edtCust;
	public WebElement CustomerEditDesc()
	{
		return edtCust;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]")
	private WebElement closeButton;
	public WebElement CustomerCloseButton()
	{
		return closeButton;
	}
	
	//create WebElemenet for creating Project
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement crtproj;
	public WebElement projectAdd()
	{
		return crtproj;
	}
	
	@FindBy(xpath="//input[@id='projectPopup_projectNameField']")
	private WebElement projectName;
	public WebElement projectNameTextField()
	{
		return projectName;
	}
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement crtProj;
	public WebElement projectCreateButton()
	{
		return crtProj;
	}
	
	//create WebElement for deleting project
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement porjEdt;
	public WebElement projectEditButton()
	{
		return porjEdt;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")
	private WebElement projAction;
	public WebElement projectActionButton()
	{
		return projAction;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement projDlt;
	public WebElement projectDeleteButton()
	{
		return projDlt;
	}
	
	
	private WebElement projectPanel_deleteConfirm_submitTitle;
	public WebElement projectDltPermanent()
	{
		return projectPanel_deleteConfirm_submitTitle;
	}
	
	//create WebElement for modifying the project
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement projed;
	public WebElement projectEditDesc()
	{
		return projed;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[1]")
	private WebElement close;
	public WebElement projectEditCloseButton()
	{
		return close;
	}
	
	//create WebElement to create tasks
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement createTask;
	public WebElement taskAdd()
	{
		return createTask;
	}
	
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement addtask;
	public WebElement taskCreate()
	{
		return addtask;
	}
	
	@FindBy(xpath="//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")
	private WebElement entertask;
	public WebElement tasknameTextField()
	{
		return entertask;
	}
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement crtTask;
	public WebElement taskCreateButton()
	{
		return crtTask;
	}
	
	//create WebElement to delete the task
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement clickonTask;
	public WebElement taskClickOn()
	{
		return clickonTask;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement taskAct;
	public WebElement taskActionButton()
	{
		return taskAct;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")
	private WebElement dltTask;
	public WebElement taskDelete()
	{
		return dltTask;
	}
	
	@FindBy(xpath="//*[@id=\"taskPanel_deleteConfirm_submitTitle\"]")
	private WebElement dltTaskCnfrm;
	public WebElement taskDltPermanent()
	{
		return dltTaskCnfrm;
	}
	
	//create WebElement to Start Exploring actiTime
	@FindBy(xpath="//span[text()='Start exploring actiTIME']")
	private WebElement explr;
	public WebElement startExploringActiTime()
	{
		return explr;
	}
}

