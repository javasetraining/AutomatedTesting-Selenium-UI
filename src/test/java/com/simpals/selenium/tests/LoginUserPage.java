package com.simpals.selenium.tests;

import com.simpals.selenium.common.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginUserPage extends TestBase {


    @Test
    public void testUserLogin() throws Exception {

        driver.navigate().to("https://999.md/ru/");
        String strPageTitle = driver.getTitle();
        Assert.assertTrue(strPageTitle.equalsIgnoreCase("Доска объявлений - 999.md"), "Page title doesn't match");
        driver.findElement(By.xpath(".//*[@id='m__user_panel']/ul/li[2]/a")).click();//popupLoginForm
        driver.switchTo().frame(driver.findElement(By.id("topbar-popup")));
        WebElement LoginTextbox = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/form/div[1]/input"));
        LoginTextbox.clear();
        LoginTextbox.sendKeys("flytogether");
        WebElement PasswdTextbox = driver.findElement(By.xpath("html/body/div[1]/div/div[1]/form/div[2]/input"));
        PasswdTextbox.clear();
        PasswdTextbox.sendKeys("monitor");
        PasswdTextbox.submit();
//        driver.findElement(By.xpath("html/body/div[1]/div/div[1]/form/footer/button[1]")).click();  //submitButton;
//        Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='user-username-btn']")).equals("flytogether"), "flytogether");

        Boolean isPresent = driver.findElements(By.xpath(".//*[@id='m__user_panel']/ul/li[2]/a")).size() > 0;
        Assert.assertTrue(isPresent);
    }
}

