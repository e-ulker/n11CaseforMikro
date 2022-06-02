package com.n11.pages;

import com.n11.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MikroPage extends BasePage {


    @FindBy(id = "email")
    public WebElement EmailBox;

    @FindBy(id = "password")
    public WebElement PasswordBox;

    @FindBy(id = "loginButton")
    public WebElement LoginButton;








    @FindBy(xpath = "(//button[@class='dn-slide-deny-btn'])[1]")
    public WebElement dahaSonraButton;



    @FindBy(xpath = "(//button[text()='Daha Sonra'])[1]")
    public WebElement dahasonrabuttonEdge;


    @FindBy(xpath = "(//button[@class='dn-slide-deny-btn'])[1]")
    public WebElement DahaSonraButton2;



    @FindBy(xpath = "(//div[@class='hOpenMenuContent'])[1]//a[text()='Favorilerim / Listelerim']")
    public WebElement favorilerimListerimButton;









    @FindBy(xpath = "//div[text()='İzlediğiniz bir ürün bulunmamaktadır.']")
    public WebElement FavorilerimListEmpty;




    /*
    @FindBy(xpath = "//div[@class='hOpenMenuContent']/a[@title='Çıkış Yap']")
    public WebElement çıkışyapbutton;
  */


//FACEBOOK İÇİN







/*
    @FindBy(xpath = "//div[@class='pagination']//a[3][@class='active ']")
    public WebElement page2active;
*/








}



