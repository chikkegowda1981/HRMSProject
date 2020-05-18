package com.hrmspomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HrmAdminPage {
	
	public WebDriver driver;
	
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/ul[1]/li[1]/a[1]/b[1]")
	WebElement Admin;
	
	

	@FindBy(id="menu_admin_UserManagement")
	WebElement UserManagement;

	

	@FindBy(id="menu_admin_viewSystemUsers")
	WebElement Users;
	
	@FindBy(id="searchSystemUser_userName")
	WebElement SearchBox;
	
	@FindBy(id="searchBtn")
	WebElement SearchButton;
	
	
	
	
	@FindBy(id="resetBtn")
	WebElement resetBtn;
	
	
	
	
	
	
	public HrmAdminPage(WebDriver driver)
	{
		this.driver= driver;
		
	}
	
	
	public void VerifySearch() throws Exception {
		
		
		Admin.click();
		
		UserManagement.click();
		
		
		Users.click();
		
		SearchBox.sendKeys("safdaf");
		
		//hjk
		Thread.sleep(10000);
		SearchButton.click();
		
		System.out.println("safsdfad");
		
		resetBtn.click();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
