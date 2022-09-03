package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class MyhomePage extends ProjectSpecificMethods {
	
	public MyLeadPage clickLeadsTab() {
		
		driver.findElement(By.linkText("Leads")).click();
	return new MyLeadPage();
	
	}

}
