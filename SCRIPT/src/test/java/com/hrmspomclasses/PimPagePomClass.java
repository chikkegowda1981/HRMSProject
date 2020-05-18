package com.hrmspomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import bsh.This;

public class PimPagePomClass {

	
	public WebDriver driver;
	
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[2]/ul[1]/li[2]/a[1]/b[1]")
	WebElement Pim;
	
	
	@FindBy(id="empsearch_employee_name_empName")
	WebElement Employee_name;
	
	
	@FindBy(partialLinkText="007")
	WebElement id;
	
	@FindBy(id="personal_txtEmpFirstName")
    WebElement personFirstname;
	
	
	@FindBy(id="empsearch_id")
	WebElement EmpId;
	
	@FindBy(id="searchBtn")
	WebElement searchBtn;
	
	
	
	//Initilization
	
	public  PimPagePomClass(WebDriver driver)
	{
	  this.driver=driver;
	  
	}
	
	//Utilization
	
	
	
	public void VerifyEmployeName() {
		
		
		Pim.click();
		
		//Employee_name.sendKeys("Robert");
		
		
		
		id.click();
		
		String a = personFirstname.getText();
		
		System.out.println(a);
		
		Reporter.log(a);
		
		
		/*Select select=new Select(Employee_name);
		
		select.selectByValue("Robert Craig");
		
		
		
		
		EmpId.sendKeys("006");
		
		searchBtn.click();
		*/
		
		
	}
	
	
	
}
