package com.n11.pages;

import com.n11.utilities.BrowserUtils;
import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(css = ".btnSignIn")
    public WebElement GirişYapButton;

    @FindBy(xpath = "(//button[text()='Daha Sonra'])[1]")
    public WebElement Dahasonra;

    @FindBy(xpath = "(//button[text()='Daha Sonra'])[1]")
    public WebElement DahaSonraButton;

    @FindBy(xpath = "(//*[text()='Erva Ulker'])")
    public WebElement UserName;

    @FindBy(xpath = "//input[@id='searchData']")
    public WebElement SearchBox;

    @FindBy(css = ".icon.iconSearch")
    public WebElement SearchButton;

    @FindBy(xpath = "(//a[@title='Hesabım'])[1]")
    public WebElement Hesabım;


    @FindBy(css = ".logoutBtn")
    public WebElement ÇıkışYapButton;


    public void navigateToMyAccountSubPages(String subPageName) {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(Hesabım).perform();
        WebDriverWait wait = new WebDriverWait(Driver.get(), 20);
        wait.until(ExpectedConditions.elementToBeClickable(Driver.get().findElement(By.linkText(subPageName))));
        WebElement myAccountSubPage = Driver.get().findElement(By.linkText(subPageName));
        BrowserUtils.waitFor(2);
        myAccountSubPage.click();
    }


    public void ClickPage(String pagenumber) {

        String pagination = "//a[text()='" + pagenumber + "']";
        Driver.get().findElement(By.xpath(pagination)).click();
    }

    public boolean AssertOpenedPage(String item, String page) {

        String expectedincludeURL = item + "&pg=" + page;
        String actualURL = Driver.get().getCurrentUrl();
        System.out.println("actualURL" + actualURL);

        return actualURL.contains(expectedincludeURL);

    }


    public void navigateToHesabımSubpage(String subpageName) {

        String accountSubpage = "(//a[text()='" + subpageName + "'])[1]";

        switch (subpageName) {
            case "Favorilerim / Listelerim":
                Driver.get().findElement(By.xpath(accountSubpage)).click();
                break;
            case "Çıkış Yap":
                Driver.get().findElement(By.xpath(accountSubpage)).click();
                break;

        }


    }
}
