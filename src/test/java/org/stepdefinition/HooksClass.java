package org.stepdefinition;

import cucumber.api.java.Before;
import cucumber.api.java.After;

public class HooksClass extends BaseClass {
	@Before(order = 1)
	private void precon2() {
		LaunchBrowser();
		System.out.println("preone");

	}
	@Before(order = 2)
	private void precon1() {
		windowMaximize();
		System.out.println("pretwo");

	}
	@Before(order = 3)
	private void precon3() {
		System.out.println("precondition is here");

	}
	
	
	@After(order = 2)
	private void postcon1() {
		System.out.println("Ends here...");

	}
	@After(order = 1)
	private void postcon2() {
		//closeEntireBrowser();

	}
	
	
	
		
	}
	
	