package pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.Given;

public class Homepage extends ProjectSpecificMethods {
	
	
	
 public Homepage verifyHomePage() {
	 
	 String expTitle = "Leaftaps - TestLeaf Automation Platform";
	 String actTitle = driver.getTitle();
	 System.out.println(actTitle);
	 Assert.assertEquals(actTitle, expTitle);
	
	 
	 return this ;
 }
	public MyhomePage clickCrmSfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyhomePage();
	}
 
}
