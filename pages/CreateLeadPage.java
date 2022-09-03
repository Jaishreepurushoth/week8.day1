package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		return this;
			
		}
	
public CreateLeadPage enterLastName(String lName) {
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		return this;
			
		}

public CreateLeadPage enterCompanyName(String cName) {
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	return this;
		
	}

public ViewLeadPage clickCreateLeadButton() {
	driver.findElement(By.name("submitButton")).click();
	return new ViewLeadPage();
		
	}
	}
	
	

