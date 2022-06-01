package com.n11.step_definitions;


import com.n11.pages.MikroPage;
import com.n11.utilities.BrowserUtils;
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

import java.util.Set;

public class MikroStepDefs {

    WebDriver driver;
    MikroPage mikro = new MikroPage();

    @Given("user goes to {string} pagee")
    public void theUserGoesToPagee(String url) {
        Driver.get().get(url);

    }


    @Then("verify user in homepage")
    public void verifyUserInHomepage() {
        String expectedURL = "https://www.n11.com/";
        String actualURL = Driver.get().getCurrentUrl();
        Assert.assertTrue(expectedURL.equals(actualURL));

    }

    @And("user clicks {string} button")
    public void userClicksButton(String GirişYap) {
        mikro.GirişYapButton.click();

        if (mikro.Dahasonra.isDisplayed()){
            mikro.Dahasonra.click();
        }else{
            BrowserUtils.waitFor(2);
        }

    }


    @And("user logs in with {string} andd {string}")
    public void userLogsInWithAndd(String email, String password) throws InterruptedException {

        BrowserUtils.waitFor(3);
        mikro.DahaSonraButton.click();
        BrowserUtils.waitFor(3);
        mikro.EmailBox.sendKeys(email);
        mikro.PasswordBox.sendKeys(password);
        mikro.LoginButton.click();


    }


    @Then("verify user login in the webpage")
    public void verifyUserLoginInTheWebpage() throws InterruptedException {


        Assert.assertTrue(mikro.UserName.isDisplayed());


    }


    @When("user write {string} in searchBox")
    public void userWriteInSearchBox(String item) {
        BrowserUtils.waitFor(2);
        mikro.SearchBox.click();

        mikro.SearchBox.sendKeys("Iphone");
        BrowserUtils.waitFor(2);
        mikro.SearchButton.click();
    }


    @Then("user should see the {string} results")
    public void userShouldSeeTheResults(String Iphone) {

        String actual = mikro.IphoneResults.getText();
        String expected = Iphone;

        Assert.assertTrue(actual.contains(expected));


/*
        String ActualResult = driver.getCurrentUrl();
        String expected=Iphone;
        Assert.assertTrue(ActualResult.contains(Iphone));

        Url i al

        Note:aslında ne ararsan iphone my Iphone mu ne yazarsan üstte,url kısmında o yazıyor,
        ama ancak UI da webpage üzerinde Iphone olarak otomatik düzeltir

*/


    }


    @And("click the page {string}")
    public void clickThePage(String page) {
        mikro.ClickPage(page);


    }

    @Then("verify for {string} results are opened in page {string}")
    public void verifyForResultsAreOpenedInPage(String item, String page) {

        mikro.AssertOpenedPage(item, page);

    }

    @When("user add {string}th product in favorite")
    public void userAddThProductInFavorite(String FavoriteProductNumber) {
        mikro.AddFavorite(FavoriteProductNumber);

    }


    @And("user clicks to {string} button")
    public void userClicksToButton(String favorilerim) throws InterruptedException {


        Actions actions = new Actions(Driver.get());

        Thread.sleep(2000);
        actions.moveToElement(mikro.Hesabım).perform();

        mikro.FavorilerimListerimButton.click();


    }

    @Then("verify open the {string} page")
    public void verifyOpenThePage(String İstekListem) {
        String actualUrl = Driver.get().getCurrentUrl();
        System.out.println("istek listerim mi=?"+actualUrl);
        String expectedUrl = "istek-listelerim";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }


    @Then("verify displayed the {string} title")
    public void verifyDisplayedTheTitle(String favorilerimTitle) {

        String ActualTitle = mikro.FavorilerimListerimTitle.getText();
        System.out.println(ActualTitle);
        String ExpectedTitle = favorilerimTitle;

        Assert.assertTrue(ActualTitle.equals(ExpectedTitle));

    }


    @And("click the favorilerim button")
    public void clickTheFavorilerimButton() {

        mikro.FavorilerimListResults.click();

    }


    @Then("verify user in Favorilerim page")
    public void verifyUserInFavorilerimPage() {

        String actualtitle = mikro.FavorilerimTitle.getText();
        String expectedtitle = "Favorilerim";
        Assert.assertTrue(actualtitle.equals(expectedtitle));

    }

    @When("user delete the product")
    public void userDeleteTheProduct() {
        mikro.FavoriListtenÜrünüSilme.click();

    }

    @Then("verify the product is deleted")
    public void verifyTheProductIsDeleted() {

        Assert.assertTrue(mikro.MessageOfDeleted.isDisplayed());
        mikro.TamamButton.click();

    }


    @And("click Facebook ile giriş yap button for login with facebook account")
    public void clickFacebookIleGirişYapButtonForLoginWithFacebookAccount() {
        BrowserUtils.waitFor(4);
        mikro.DahaSonraButton.click();
        BrowserUtils.waitFor(2);
        mikro.FacebookGirişButton.click();

        BrowserUtils.switchToWindowWithIndex(1);
        BrowserUtils.waitFor(2);

        mikro.FacebookEmailButton.sendKeys("elifulker1521@gmail.com");
        mikro.FacebookPasswordButton.sendKeys("e123456u");
        mikro.facebookgirişbutton.click();

        BrowserUtils.switchToWindowWithIndex(0);
        BrowserUtils.waitFor(2);

/*

       // Ramazan Abiden methodlar windowhandle methodları

            for(String windowHandle:driver.getWindowHandles()){
            if(!windowHandle.equals(mainWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }
        for(String windowHandle:driver.getWindowHandles()){
            if(!windowHandle.equals(popupWindowHandle)){
                driver.switchTo().window(windowHandle);
            }
        }

*/


    }

    @When("user clicks Çıkış Yap button")
    public void userClicksÇıkışYapButton() throws InterruptedException {

        Actions actions = new Actions(Driver.get());

        Thread.sleep(2000);
        actions.moveToElement(mikro.Hesabım).perform();

        mikro.ÇıkışYapButton.click();


    }

    @Then("verify user log out")
    public void verifyUserLogOut() {

     //   Assert.assertTrue(mikro.LoginButton.isDisplayed());

        String ActualTitle=Driver.get().getTitle();
        String ExpectedTitle="Giriş Yap - n11.com";

        Assert.assertEquals(ExpectedTitle,ActualTitle);

    }
}
