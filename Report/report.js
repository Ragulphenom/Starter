$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/icici.feature");
formatter.feature({
  "name": "To Validate login functionality in ICICI Bank site",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature3"
    }
  ]
});
formatter.scenario({
  "name": "To Validate login functionality for valid ID and valid password in ICICI site",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature3"
    },
    {
      "name": "@unit"
    }
  ]
});
formatter.step({
  "name": "launch chrome browser at maximise window",
  "keyword": "Given "
});
formatter.match({
  "location": "FtLgn.launchChromeBrowserAtMaximiseWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch ICICI bank site URL",
  "keyword": "When "
});
formatter.match({
  "location": "FtLgn.toLaunchICICIBankSiteURL()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click on login btn",
  "keyword": "And "
});
formatter.match({
  "location": "FtLgn.toClickOnLoginBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Click on Corporate btn",
  "keyword": "And "
});
formatter.match({
  "location": "FtLgn.toClickOnCorporateBtn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to pass valid ID in ID field",
  "keyword": "And "
});
formatter.match({
  "location": "FtLgn.toPassValidIDInIDField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid Password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FtLgn.toPassValidPasswordInPasswordField()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "to click on proceed butn",
  "keyword": "And "
});
formatter.match({
  "location": "FtLgn.toClickOnProceedButn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Close the Browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FtLgn.toCloseTheBrowser()"
});
formatter.result({
  "status": "passed"
});
});