package com.simpals.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

    //NOT RELEVANT!!!---!!!SELENIUM RC OR 1.0V

    @FindBy(xpath = "html/body/div[1]/div/div[1]/form/div[1]/input")
    private WebElement loginNameField;

    @FindBy(xpath = "html/body/div[1]/div/div[1]/form/div[2]/input")
    private WebElement passwordField;

    @FindBy(xpath = "html/body/div[1]/div/div[1]/form/footer/button[1]")
    private WebElement submitButton;

    //NOT RELEVANT!!!---!!!SELENIUM RC OR 1.0V


    public void loginIn(String loginName, String password) {
        loginNameField.sendKeys(loginName);
        passwordField.sendKeys(password);
        submitButton.click();
    }
}
