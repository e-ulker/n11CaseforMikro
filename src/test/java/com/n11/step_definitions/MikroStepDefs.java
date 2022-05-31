package com.n11.step_definitions;


import com.n11.pages.MikroPage;
import com.n11.utilities.BrowserUtils;
import com.n11.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
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
        //   System.out.println("actual"+actualURL);
        Assert.assertTrue(expectedURL.equals(actualURL));

    }

    @And("user clicks {string} button")
    public void userClicksButton(String GirişYap) {
        mikro.GirişYapButton.click();


    }


    @And("user logs in with {string} andd {string}")
    public void userLogsInWithAndd(String email, String password) throws InterruptedException {

        BrowserUtils.waitFor(3);
        mikro.DahaSonraButton.click();
        BrowserUtils.waitFor(3);
     //   mikro.DahaSonraButton.click();
        mikro.EmailBox.sendKeys(email);
        mikro.PasswordBox.sendKeys(password);
        mikro.LoginButton.click();

        mikro.EmailBox.sendKeys(email);
        mikro.PasswordBox.sendKeys(password);
        mikro.LoginButton.click();




        /* Java script ile tıklatmaya çalıştım
        JavascriptExecutor jse=(JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", mikro.DahaSonraButton);
        BrowserUtils.waitFor(2);
*/

    }
    //"Daha sonra" button dün gece çıkmıyordu.neyapmalı orada,bir condition mı koymalı


    @Then("verify user login in the webpage")
    public void verifyUserLoginInTheWebpage() throws InterruptedException {
/*
 //Hesabım a Hover over ile hareket edip,çıkış yap button u isdisplayed mi?
 //isenabled mı bakılmaya çalışıldı


        Actions actions = new Actions();

        Thread.sleep(2000);
        actions.moveToElement(mikro.Hesabım).perform();

        Assert.assertTrue(mikro.ÇıkışYapButton.isDisplayed());
        //isdisplayed ile Erva Ulker

      */


//  kullanıcı görünüyorsa da olur --->Assert.assertTrue(mikro.UserName.isDisplayed());


    }


    @When("user write {string} in searchBox")
    public void userWriteInSearchBox(String item) {
       // mikro.SearchBox.clear();
        mikro.SearchBox.click();
        BrowserUtils.waitFor(2);
        mikro.SearchBox.sendKeys(item);
 //       mikro.DahaSonraButton2.click();  //login olmadan işlem yapmaya çalıştım,direct yönlendirilince çıktı
        BrowserUtils.waitFor(2);
        mikro.SearchButton.click();
        //bu doğruymuş(NUR) ( mikro.SearchBox.sendKeys(item);)
    }


    @Then("user should see the {string} results")
    public void userShouldSeeTheResults(String Iphone) {
        // System.out.println(mikro.IphoneResults.getText()); //Iphone,için 218,708 sonuç bulundu.Çıkmış
        // text i dene sonuçta ıphone kılıfta olabilir.ekranda ne görünürse UI için böyle

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

        //paramertre olduğu için feature file daki aynı şeyin olması zorunlu değil,adı değişebilir
        //göndermeden önce Notları commentler sil (//)
*/


    }


    @And("click the page {string}")
    public void clickThePage(String page) {
        mikro.ClickPage(page);


    }
/*
    @Then("verify page {string} is opened")
    public void verifyPageIsOpened(String page) {

    }

 */

/*
    @Then("verify for {string} in page {string} is opened")
    public void verifyForInPageIsOpened(String item, String page) {

    }

 */

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

//------------------------------------------------------------------
        //hover over yapmaya çalıştım

        Actions actions = new Actions(driver);
        //ben driver yazdım ama başka birşeyde olabilir,Actions() içinde birşey arıyordu çnk

        Thread.sleep(2000);
        actions.moveToElement(mikro.Hesabım).perform();

        //-------------------------------

        mikro.FavorilerimListerimButton.click();


    }

    @Then("verify open the {string} page")
    public void verifyOpenThePage(String İstekListem) {
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "istek-listelerim";
        Assert.assertTrue(actualUrl.contains(expectedUrl));

    }


    @Then("verify displayed the {string} title")
    public void verifyDisplayedTheTitle(String favorilerimTitle) {

        String ActualTitle = mikro.FavorilerimListerimTitle.getText();
        String ExpectedTitle = favorilerimTitle;

        Assert.assertTrue(ActualTitle.equals(ExpectedTitle));

    }


    @And("click the favorilerim button")
    public void clickTheFavorilerimButton() {

        mikro.FavorilerimListResults.click();

    }


    @Then("verify user in Favorilerim page")
    public void verifyUserInFavorilerimPage() {

        String actualtitle=mikro.FavorilerimTitle.getText();
        String expectedtitle="Favorilerim";
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
/*
        Set<String> windowHandles = Driver.get().getWindowHandles();

        for (String tab : windowHandles) {
            driver.switchTo().window(tab);
            if (driver.getTitle().equals(tab)) {
                break;
            }
        }
 */
        BrowserUtils.switchToWindowWithIndex(1);
        BrowserUtils.waitFor(2);

        mikro.FacebookEmailButton.sendKeys("elifulker1521@gmail.com");
        mikro.FacebookPasswordButton.sendKeys("e123456u");
        mikro.facebookgirişbutton.click();

      //  Set<String> handles=driver.getWindowHandles();


    }
}
