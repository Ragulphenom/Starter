//package org.stepdefinition;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class MynClass extends BaseClass {
//	
//	@Given("launch chrome browser at maximise window")
//	public void LaunchChromeBrowserAtMaximiseWindow() {
//		 LaunchBrowser();
//		    windowMaximize();
//	}
//
//	@When("To launch Myntra site URL")
//	public void toLaunchMyntraSiteURL() {
//		LaunchUrl("https://www.myntra.com/");
//	}
//
//	@When("To pass Shirts in search field")
//	public void toPassShirtsInSearchField() {
//		WebElement name = driver.findElement(By.xpath("//input[@class='desktop-searchBar']"));
//		name.sendKeys("shirts");
//	}
//
//	@When("To click on search btn")
//	public void toClickOnSearchBtn() {
//		WebElement btn1 = driver.findElement(By.xpath("//a[@class='desktop-submit']"));
//		   btn1.click();
//	}
//
//	@Then("To Close the Browser")
//	public void toCloseTheBrowser() {
//	   //closeEntireBrowser();
//	}
//
//
//
//}
