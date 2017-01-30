package com.simpals.selenium.tests;

import com.simpals.selenium.common.TestBase;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginUserPage extends TestBase {


        @Test
        public void testUserLogin () throws Exception {
            driver.navigate().to("http://www.google.com");
            String strPageTitle = driver.getTitle();
            Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
/*            driver.navigate().to("http://www.999.md/ru");
            String strPageTitle = driver.getTitle();
            Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Доска объявлений - 999.md");*/
        }
    }

