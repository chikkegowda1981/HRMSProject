package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.hrmspomclasses.HrmAdminPage;
import com.hrmspomclasses.PimPagePomClass;



import io.github.bonigarcia.wdm.WebDriverManager;



public class BaseTest  {
	
	
	
	public WebDriver driver=null;
	
	public HrmAdminPage hrmsAdminPage;

      public HrmsLogin     hrmsLogin;
      
     public  PimPagePomClass pimPagePomClass;
  
  
      
      
      @BeforeClass 
      
      public void LaunchBrowser() {
    	  
    	  WebDriverManager.chromedriver().setup();
    	  WebDriver driver= new ChromeDriver();
    	driver.get(Constant.URL);
    	
    	  
    	  
    	
    	//  hrmsAdminPage= PageFactory.initElements(driver, HrmAdminPage.class);
    	  hrmsLogin= PageFactory.initElements(driver, HrmsLogin.class);
    	  
    	  pimPagePomClass=PageFactory.initElements(driver, PimPagePomClass.class);
    	  
    	  
    	  
    	  
    	  
      }
      
      
      
      @AfterClass
      
      public void CloseBrowser() {
    	  
    	//  driver.quit();
    	  
    	  
      }
      
      
      
      
      
      
      

}
