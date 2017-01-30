package com.simpals.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by MaRV on 1/29/2017.
 */
public class HomePage {

    @FindBy(xpath = ".//*[@id='header']/div[3]/div/h1/a")
    public WebElement logo;

    @FindBy(xpath = ".//*[@id='m__user_panel']/ul/li[2]/a")
    public WebElement popupLoginForm;

/*    @Override
    public void tryToOpen() {
        logo.click();*/
    }
