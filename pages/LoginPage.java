package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethods {
	
	//@Given("Type the username as {string}")
	public LoginPage typeUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
		return this;
	 }
	//@And("Type the password as {string}")
	public LoginPage typePassword(String pWord) {
		driver.findElement(By.id("password")).sendKeys(pWord);
		return this;
		 
	 }
	//@When("Click on the Login button")
		public Homepage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
				 return new Homepage();
			 }	
	//@Then("Verify the home page is displayed")
	//public void verifyHomepage() {
		//String text = driver.findElement(By.tagName("h2")).getText();
		//if( text.contains("Welcome")) {
			//System.out.println("login successful");
		//}
//	}

}
