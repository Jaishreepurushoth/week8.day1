package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;

public class MyLeadPage extends ProjectSpecificMethods {
	//@And("Click Create Leads Link")
	public CreateLeadPage clickCreateLeadsLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage() ;
	}
	/*
	//@And("Click Find Leads Link")
	public MyLeadPage clickFindLeadsLink() {
		driver.findElement(By.linkText("Find Leads")).click();
		return this ;
	}
	
	//@And("Click Merge Leads Link")
	public MyLeadPage clickMergeLeadsLink() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return this ;
	}
*/
}
