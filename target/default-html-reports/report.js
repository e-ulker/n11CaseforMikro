$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Mikro.feature");
formatter.feature({
  "name": "n11 case",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "N11 login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mikro"
    }
  ]
});
formatter.scenario({
  "name": "caseler devamı",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@mikro"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user goes to \"https://www.n11.com/\" pagee",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.theUserGoesToPagee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verifyUserInHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks \"Giriş Yap\" button",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userClicksButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click Facebook ile giriş yap button for login with facebook account",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.clickFacebookIleGirişYapButtonForLoginWithFacebookAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user login in the webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verifyUserLoginInTheWebpage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write \"Iphone\" in searchBox",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userWriteInSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the \"Iphone\" results",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userShouldSeeTheResults(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the page \"2\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.clickThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify for \"ıphone\" results are opened in page \"2\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verifyForResultsAreOpenedInPage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user add \"3\"th product in favorite",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userAddThProductInFavorite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});