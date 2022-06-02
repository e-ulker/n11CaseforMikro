$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Mikro.feature");
formatter.feature({
  "name": "n11 automation case",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Adding/deleting favourite product",
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
  "name": "user navigates to \"https://www.n11.com/\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.theUserGoesToPagee(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that the page title is \"n11.com - Hayat Sana Gelir\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verify_that_the_page_title_is(java.lang.String)"
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
  "name": "user logs in with Facebook",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.clickFacebookIleGirişYapButtonForLoginWithFacebookAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that username \"Erva Ulker\" is visible under My Account",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verify_that_is_visible_under_My_Account(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"Iphone\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userWriteInSearchBox(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that user sees the results for \"Iphone\"",
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
  "name": "user adds the product number \"3\" on the page to Favourites",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userAddThProductInFavorite(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to \"Favorilerim / Listelerim\" button",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userClicksToButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify open the \"istek-listelerim\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verifyOpenThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify displayed the \"Favorilerim / Listelerim\" title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verifyDisplayedTheTitle(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the favorilerim button",
  "keyword": "And "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.clickTheFavorilerimButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that page title starts with \"Favorilerim\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verify_that_user_is_on_the_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user deletes the product from the favorites",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userDeleteTheProduct()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that \"Ürününüz listeden silindi.\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verify_that_the_image_which_shows_the_list_empty_is_visible(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks to \"Çıkış Yap\" button",
  "keyword": "When "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.userClicksToButton(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify user log out",
  "keyword": "Then "
});
formatter.match({
  "location": "com.n11.step_definitions.MikroStepDefs.verifyUserLogOut()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});