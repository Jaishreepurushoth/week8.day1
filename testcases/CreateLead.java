package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods {
	
	@Test
	public void runLogin() {
		
		LoginPage lp = new LoginPage();
		//enter username 
		lp.typeUserName("Demosalesmanager").typePassword("crmsfa").clickLogin().verifyHomePage()
		.clickCrmSfa().clickLeadsTab().clickCreateLeadsLink().enterFirstName("Jiashree")
		.enterLastName("Purushoth").enterCompanyName("Veryx").clickCreateLeadButton().verifyFirstName("Jaishree");
		
	}

}
 
