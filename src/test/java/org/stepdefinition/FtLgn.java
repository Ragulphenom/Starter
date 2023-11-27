package org.stepdefinition;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.*;
public class FtLgn extends BaseClass{
@Given("launch chrome browser at maximise window")
public void launchChromeBrowserAtMaximiseWindow() {
	 LaunchBrowser();
		    windowMaximize();
}
@When("To launch ICICI bank site URL")
	public void toLaunchICICIBankSiteURL() {
	LaunchUrl("https://www.icicibank.com/");
}
@When("To click on login btn")
public void toClickOnLoginBtn() {
WebElement logbt = driver.findElement(By.xpath("//button[@class='hed-dropdown-toggle login-toggle']"));
	logbt.click();
	}
	@When("To Click on Corporate btn")
	public void toClickOnCorporateBtn() {
		WebElement corbt = driver.findElement(By.xpath("//a[text()='Corporate ']"));
	corbt.click();
	}
	@When("to pass valid ID in ID field")
	public void toPassValidIDInIDField() {
	    WebElement name = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	name.sendKeys("891412");
	}
	@When("To pass valid Password in password field")
	public void toPassValidPasswordInPasswordField() {
		WebElement passwd = driver.findElement(By.xpath("//input[@class=' margin-bottom-0 login-user-id login-pwd font_mulish']"));
	passwd.sendKeys("ghguifaa");
	}
	@When("to click on proceed butn")
	public void toClickOnProceedButn() {
	   WebElement prcdbt = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
	prcdbt.click();
	}
	@Then("To Close the Browser")
	public void toCloseTheBrowser() {
	    closeEntireBrowser();
	}






	//https://www.icicibank.com/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			//@Given("To launch chrome browser at maximise window")
//	public void to_launch_chrome_browser_at_maximise_window() {
//		LaunchBrowser();
//	    windowMaximize();
//	}
//
//	@When("TO launch URL of the Flipkart application")
//	public void to_launch_URL_of_the_Flipkart_application() {
//	   LaunchUrl("https://www.flipkart.com/");
//	}
//
//	@When("TO pass valid email or phno in mail field")
//	public void to_pass_valid_email_or_phno_in_mail_field(DataTable d) {
//	    WebElement ema = driver.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']"));
//	    List<String> li = d.asList();
//	    ema.sendKeys(li.get(2));
//	}
//	@When("To click the Request OTP button")
//	public void to_click_the_Request_OTP_button() {
//	    WebElement btn = driver.findElement(By.xpath("//button[text()='Request OTP']"));
//		btn.click();
//	}
//
//	@When("To check whether navigate to home page or not")
//	public void to_check_whether_navigate_to_home_page_or_not() {
//	    System.out.println("Checking for Navigation");
//	}
//
//	@Then("To close the browser")
//	public void to_close_the_browser() {
//	    closeEntireBrowser();
//	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Given("To launch chrome browser at maximise window")
//	public void to_launch_chrome_browser_at_maximise_window() {
//		LaunchBrowser();
//	    windowMaximize();
//	}
//
//	@When("TO launch URL of the Gmail application")
//	public void to_launch_URL_of_the_Gmail_application() {
//		LaunchUrl("https://www.google.com/gmail/about/");
//	}
//
//	@When("To click the create account button")
//	public void to_click_the_create_account_button() {
//		WebElement ca = driver.findElement(By.xpath("(//span[text()='Create an account'])[1]"));
//		ca.click();
//	}
//
//	@When("TO pass valid first name in string")
//	public void to_pass_valid_first_name_in_string() {
//		WebElement fname= driver.findElement(By.name("firstName"));
//		fname.sendKeys("Ragul");
//	}
//
//	@When("To pass valid last name in string")
//	public void to_pass_valid_last_name_in_string() {
//		WebElement lname = driver.findElement(By.id("lastName"));
//		lname.sendKeys("rock");
//	}
//
//	@When("To click the Login button")
//	public void to_click_the_Login_button() {
//		WebElement btn = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']"));
//		btn.click();
//	}
//
//	@When("To check whether navigate to home page or not")
//	public void to_check_whether_navigate_to_home_page_or_not() {
//	    System.out.println("Check");
//	}
//
//	@Then("To close the browser")
//	public void to_close_the_browser() {
//		   //closeEntireBrowser();
//	}



	
	
	
}
