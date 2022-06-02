package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class FacebookAuthPage extends BasePage {


    @FindBy(xpath = "(//input[@class='inputtext _55r1 inputtext inputtext'])[1]")    //input[@id='email']
    public WebElement FacebookEmailButton;

    @FindBy(xpath = "(//input[@class='inputtext _55r1 inputtext inputtext'])[2]")
    public WebElement FacebookPasswordButton;

    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement facebookgirişbutton;


    @FindBy(css = ".facebook_large.medium.facebookBtn.btnLogin")
    public WebElement FacebookGirişButton;




    public static void switchToWindowWithIndex(int index) {
        List<String> windowHandles = new ArrayList<>(Driver.get().getWindowHandles());
        Driver.get().switchTo().window(windowHandles.get(index));
    }





}
