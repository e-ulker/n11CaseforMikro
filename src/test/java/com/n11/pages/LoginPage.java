package com.n11.pages;

import com.n11.utilities.BrowserUtils;
import com.n11.utilities.Driver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    FacebookAuthPage facebookAuthPage = new FacebookAuthPage();

    public void loginWithFacebook() {


        facebookAuthPage.switchToWindowWithIndex(1);
        BrowserUtils.waitFor(2);


        facebookAuthPage.FacebookEmailButton.sendKeys("elifulker1521@gmail.com");
        facebookAuthPage.FacebookPasswordButton.sendKeys("e123456u");
        facebookAuthPage.facebookgirişbutton.click();


        facebookAuthPage.switchToWindowWithIndex(0);
        BrowserUtils.waitFor(2);


    }

}
