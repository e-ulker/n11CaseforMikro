package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MikroPage extends BasePage {

    @FindBy(css = ".btnSignIn")
    public WebElement GirişYapButton;

    @FindBy(css = ".facebook_large.medium.facebookBtn.btnLogin")
    public WebElement FacebookGirişButton;

    @FindBy(id = "email")
    public WebElement EmailBox;

    @FindBy(id = "password")
    public WebElement PasswordBox;

    @FindBy(id = "loginButton")
    public WebElement LoginButton;

    @FindBy(xpath = "(//a[@title='Hesabım'])[1]")
    //(//a[@title='Hesabım'])[1]
    public WebElement Hesabım;

    @FindBy(className = ".logoutBtn")
    public WebElement ÇıkışYapButton;

    @FindBy(xpath = "(//*[text()='Erva Ulker'])[1]")
    // bu da hesabım altındaki isim (//a[@title='Hesabım'])[2]
    public WebElement UserName;

    @FindBy(xpath = "(//button[text()='Daha Sonra'])[1]")
    public WebElement DahaSonraButton;

    @FindBy(id = "searchData")
    public WebElement SearchBox;

    @FindBy(css = ".icon.iconSearch")
    public WebElement SearchButton;

    @FindBy(xpath = "(//button[text()='Daha Sonra'])[1]")
    public WebElement dahasonrabuttonEdge;

    @FindBy(className = "resultText")
    public WebElement IphoneResults;

    @FindBy(xpath = "(//button[@class='dn-slide-deny-btn'])[1]")
    public WebElement DahaSonraButton2;

    @FindBy(xpath = "(//a[text()='Favorilerim / Listelerim'])[1]")
    public WebElement FavorilerimListerimButton;

    @FindBy(xpath = "(//div[@class='hOpenMenuContent'])[1]//a[text()='Favorilerim / Listelerim']")
    public WebElement favorilerimListerimButton;

    @FindBy(xpath = "//h2[text()='Favorilerim / Listelerim']")
    public WebElement FavorilerimListerimTitle;

    @FindBy(xpath = "(//h4[@class='listItemTitle'])[1]")
    public WebElement FavorilerimListResults;

    @FindBy(xpath = "//h2[text()='Favorilerim']")
    public WebElement FavorilerimTitle;

    @FindBy(css = ".deleteProFromFavorites")
    public  WebElement FavoriListtenÜrünüSilme;

    @FindBy(xpath = "(//div[@id='view']//ul//li)[1]")
    public WebElement Favorilerimdekiürün;

    @FindBy(xpath = "//span[text()='Ürününüz listeden silindi.']")
    public WebElement MessageOfDeleted;

    @FindBy(css = ".btn.btnBlack.confirm")
    public WebElement TamamButton;

    @FindBy(xpath = "//div[text()='İzlediğiniz bir ürün bulunmamaktadır.']")
    public WebElement FavorilerimListEmpty;


//FACEBOOK İÇİN

    @FindBy(xpath = "(//input[@class='inputtext _55r1 inputtext inputtext'])[1]")    //input[@id='email']
    public WebElement FacebookEmailButton;

    @FindBy(xpath = "(//input[@class='inputtext _55r1 inputtext inputtext'])[2]")
    public WebElement FacebookPasswordButton;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement facebookgirişbutton;







/*
    @FindBy(xpath = "//div[@class='pagination']//a[3][@class='active ']")
    public WebElement page2active;
*/




    public void ClickPage(String pagenumber) {

        String pageLocator = "//a[text()='" + pagenumber + "']";
        Driver.get().findElement(By.xpath(pageLocator)).click();
    }


    public boolean AssertOpenedPage(String item, String page) {
        //void döndürerek assert yapabilirsin

        String expectedincludeURL = item + "&pg=" + page;
        String actualURL = Driver.get().getCurrentUrl();
        System.out.println("actualURL" + actualURL);

        //Assert.assertTrue(actualURL.contains(expectedincludeURL));

        return actualURL.contains(expectedincludeURL);

        //bu kısmı çok bilemedim return de true döndürsün istedim ama,bilemedim
    }


    public void AddFavorite(String ProductLine) {

        String favoriteLocator = "//div[@id='view']//ul//li[" + ProductLine + "]//span[@title='Favorilere ekle']";
        Driver.get().findElement(By.xpath(favoriteLocator)).click();

        //3.sıradkini favorilere ekle butunu
        // div[@id='view']//ul//li[3]//span[@title='Favorilere ekle']

    }



}



