package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFavouritesPage extends BasePage{



    @FindBy(xpath = "(//a[text()='Favorilerim / Listelerim'])[1]")
    public WebElement FavorilerimListerimButton;

    @FindBy(xpath = "//h2[text()='Favorilerim / Listelerim']")
    public WebElement FavorilerimListerimTitle;


    @FindBy(xpath = "(//h4[@class='listItemTitle'])[1]")
    public WebElement FavorilerimListResults;

    @FindBy(xpath = "(//div[@id='view']//ul//li)[1]")
    public WebElement Favorilerimdekiürün;

    @FindBy(xpath = "//h2[text()='Favorilerim']")
    public WebElement FavorilerimTitle;

    @FindBy(css = ".deleteProFromFavorites")
    public WebElement FavoriListtenÜrünüSilme;


    @FindBy(xpath = "//span[text()='Ürününüz listeden silindi.']")
    public WebElement MessageOfDeleted;


    @FindBy(css = ".btn.btnBlack.confirm")
    public WebElement TamamButton;




}
