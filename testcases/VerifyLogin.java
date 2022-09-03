package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods {
	
	@Test
	public void runLogin() {
		
		LoginPage lp = new LoginPage();
		//enter username 
		lp.typeUserName("Demosalesmanager").typePassword("crmsfa").clickLogin().verifyHomePage();
		
	}

}
