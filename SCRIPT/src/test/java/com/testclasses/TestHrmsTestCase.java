package com.testclasses;

import org.testng.annotations.Test;

import com.hrmspomclasses.HrmAdminPage;

import Utility.BaseTest;
import Utility.HrmsLogin;



public class TestHrmsTestCase extends BaseTest  {
	
	
	
	
	
	@Test(priority=0)
	public void VerifyOrangHrmsLogin() {
		
		hrmsLogin.OrangeLogin();
		
		
		
	}
	
	
	
	@Test(priority=1)
	public void VerifyUserSearchInAdmin() throws Exception {
		
		hrmsAdminPage.VerifySearch();
		
	
	
	
	
	}
	

	@Test(priority=2)
	public void VerifyEmployeeName() throws Exception {
	
	
	
	pimPagePomClass.VerifyEmployeName();
	
	
	
	}
	
	
	

	
}
