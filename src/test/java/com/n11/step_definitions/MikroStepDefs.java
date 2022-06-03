package com.n11.step_definitions;


import com.n11.pages.*;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.ConfigurationReader;
import com.n11.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MikroStepDefs {

    HomePage homePage = new HomePage();
    FacebookAuthPage facebookAuthPage = new FacebookAuthPage();
    LoginPage loginPage = new LoginPage();
    MyFavouritesPage myFavouritesPage = new MyFavouritesPage();
    SearchResultPage searchResultPage = new SearchResultPage();
    BrowserUtils browserUtils = new BrowserUtils();


    @Given("user navigates to {string} page")
    public void theUserGoesToPagee(String url) {
        Driver.get().get(ConfigurationReader.get("url"));

    }

    @Then("verify that the page title is {string}")
    public void verify_that_the_page_title_is(String pageTitle) {
        String actualPageTitle = Driver.get().getTitle();
        String expectedPageTitle = pageTitle;

        Assert.assertEquals(expectedPageTitle, actualPageTitle);

    }


    @And("user clicks {string} button")
    public void userClicksButton(String GirişYap) {
        homePage.GirişYapButton.click();

        if (homePage.Dahasonra.isDisplayed()) {
            homePage.Dahasonra.click();
        } else {
            Driver.get().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }

    }


    @And("user logs in with Facebook")
    public void clickFacebookIleGirişYapButtonForLoginWithFacebookAccount() {
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        homePage.DahaSonraButton.click();
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        facebookAuthPage.FacebookGirişButton.click();
        loginPage.loginWithFacebook();

    }


    @Then("verify that username {string} is visible under My Account")
    public void verify_that_is_visible_under_My_Account(String expectedUsername) {

        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.visibilityOf(homePage.UserName));

        Assert.assertEquals(expectedUsername, homePage.UserName.getText());

    }


    @When("user searches for {string}")
    public void userWriteInSearchBox(String item) {
        BrowserUtils.waitFor(5);
        homePage.SearchBox.click();

        homePage.SearchBox.sendKeys("Iphone");
        BrowserUtils.waitFor(2);
        homePage.SearchButton.click();
    }


    @Then("verify that user sees the results for {string}")
    public void userShouldSeeTheResults(String Iphone) {


        String ActualResult = Driver.get().getCurrentUrl();
        String expected = Iphone;
        Assert.assertTrue(ActualResult.contains(Iphone));

/*
        String actual = searchResultPage.IphoneResults.getText();
        String expected = Iphone;

        Assert.assertTrue(actual.contains(expected));
*/


        //Note: 2 türlü de olur assertion,ancak 2.si daha dynamic.

    }


    @And("click the page {string}")
    public void clickThePage(String page) {
        homePage.ClickPage(page);
    }

    @Then("verify for {string} results are opened in page {string}")
    public void verifyForResultsAreOpenedInPage(String item, String page) {

        homePage.AssertOpenedPage(item, page);

    }

    @When("user adds the product number {string} on the page to Favourites")
    public void userAddThProductInFavorite(String FavoriteProductNumber) {
        searchResultPage.AddFavorite(FavoriteProductNumber);

    }


    @And("user clicks to {string} button")
    public void userClicksToButton(String subpageName) throws InterruptedException {


        Actions actions = new Actions(Driver.get());

        Thread.sleep(2000);
        actions.moveToElement(homePage.Hesabım).perform();


        homePage.navigateToHesabımSubpage(subpageName);

    }

    @Then("verify open the {string} page")
    public void verifyOpenThePage(String İstekListem) {
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl = "istek-listelerim";

        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }


    @Then("verify displayed the {string} title")
    public void verifyDisplayedTheTitle(String favorilerimTitle) {

        String ActualTitle = myFavouritesPage.FavorilerimListerimTitle.getText();
        String ExpectedTitle = favorilerimTitle;

        Assert.assertTrue(ActualTitle.equals(ExpectedTitle));

    }


    @And("click the favorilerim button")
    public void clickTheFavorilerimButton() {

        myFavouritesPage.FavorilerimListResults.click();

        WebDriverWait wait = new WebDriverWait(Driver.get(), 10);
        wait.until(ExpectedConditions.visibilityOf(myFavouritesPage.Favorilerimdekiürün));

    }

    @Then("verify that page title starts with {string}")
    public void verify_that_user_is_on_the_page(String expectedPageName) {
        Assert.assertTrue(Driver.get().getTitle().startsWith(expectedPageName));

    }


    @When("user deletes the product from the favorites")
    public void userDeleteTheProduct() {
        Driver.get().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        myFavouritesPage.FavoriListtenÜrünüSilme.click();

    }


    @Then("verify that {string} message is displayed")
    public void verify_that_the_image_which_shows_the_list_empty_is_visible(String expectedMessage) {
        Assert.assertEquals(expectedMessage, myFavouritesPage.MessageOfDeleted.getText());
        myFavouritesPage.TamamButton.click();

    }


    @Then("verify user log out")
    public void verifyUserLogOut() {

        String ActualTitle = Driver.get().getTitle();
        String ExpectedTitle = "Giriş Yap - n11.com";

        Assert.assertEquals(ExpectedTitle, ActualTitle);
    }
}
