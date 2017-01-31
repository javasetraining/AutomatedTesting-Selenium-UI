package com.simpals.selenium.tests;

import com.simpals.selenium.tests.LoginUserPage;
import org.testng.annotations.Test;


public class CreateAnAd {
    @Test
    public void CreateAds() throws Exception {
        LoginUserPage loginUserPage = new LoginUserPage();
        loginUserPage.testUserLogin();


    }


}
