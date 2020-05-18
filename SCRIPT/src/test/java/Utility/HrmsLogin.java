package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HrmsLogin  {
	
	public WebDriver driver;
	
	
	
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	

	@FindBy(id="txtPassword")
	
	WebElement Password;
	
	
	
@FindBy(id="btnLogin")
	
	WebElement Loginbutton;

	

//Initilization 


public HrmsLogin(WebDriver driver)
{
	this.driver=driver;
	
}



//Utilization


public  void OrangeLogin() {
	
	Username.sendKeys("Admin");
	Password.sendKeys("admin123");
	Loginbutton.click();
	
	
	
	
}

	
	
}
