@Feature2
Feature: To Search for shirts in myntra site

@Smoke
Scenario:  To search for printed shirts in Myntra
Given launch chrome browser at maximise window
When To launch Myntra site URL
And To pass Shirts in search field
And To click on search btn
Then To Close the Browser
