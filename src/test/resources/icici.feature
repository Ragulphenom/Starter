@Feature3
Feature: To Validate login functionality in ICICI Bank site

@unit
Scenario:  To Validate login functionality for valid ID and valid password in ICICI site
Given launch chrome browser at maximise window
When To launch ICICI bank site URL
And To click on login btn
And To Click on Corporate btn
And to pass valid ID in ID field
And To pass valid Password in password field
And to click on proceed butn
Then To Close the Browser
