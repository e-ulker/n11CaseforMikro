package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultPage  extends BasePage{

    @FindBy(className = "resultText")
    public WebElement IphoneResults;



    public void AddFavorite(String ProductLine) {

        String favoriteLocator = "//div[@id='view']//ul//li[" + ProductLine + "]//span[@title='Favorilere ekle']";
        Driver.get().findElement(By.xpath(favoriteLocator)).click();

    }



}
