package com.simpals.selenium.common;

import org.junit.Rule;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.out.println("*******************");
        System.out.println("launching chrome browser");

        Map<String, Object> chromeOptions = new HashMap<String, Object>();
        chromeOptions.put("binary", "/var/lib/jenkins/chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);

        System.setProperty(
                "webdriver.chrome.driver",
                "webdriver/chromedriver");
        //System.setProperty("webdriver.chrome.driver","D:\\codebase\\SourceCode-Examples\\chromedriver_win32\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver","/usr/local/share/chromedriver");
        System.setProperty("webdriver.chrome.driver","F:\\Java\\AutomatedTesting-Selenium-UI-999\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
//		driver = new ChromeDriver(capabilities);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    public void browserKillerForIE() {
        boolean isIE = ((EventFiringWebDriver) driver).getWrappedDriver().toString().contains("internet explorer");
        if (isIE) {
            driver.quit();
        }
    }

    public void goToMainPage() {
        try {
            driver.navigate().to(Config.getHomePageUrl());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void goToAccountMainPage() {
        try {
            try {
                driver.navigate().to(Config.getMyAccountUrl());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (driver.getTitle().contains("Certificate") || driver.getTitle().contains("сертификат")) {
                driver.navigate().to("javascript:document.getElementById('overridelink').click()");
            }
        } catch (TimeoutException e) {
            goToAccountMainPage();
        }
    }

    public void tryToLogOut() {
        if (driver.findElements(By.id("t-user-logout")).size() == 1) {
            driver.findElement(By.id("t-user-logout")).click();
        }
    }

/*    public void loginIn(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitButton.click();
    }*/


    @Rule
    public TestRule testWatcher = new TestWatcher() {

/*
        @Override
        public void succeeded(Description test){
            for (LogEntry log : ((EventFiringWebDriver) driver).getWrappedDriver().manage().logs().get(LogType.DRIVER).getAll()) {
                System.out.println("Level:" + log.getLevel().getName());
                System.out.println("Message:" + log.getMessage());
                System.out.println("Time:" + log.getTimestamp());
                System.out.println("-----------------------------------------------");
            }
            System.out.println();
        }
*/


        public String getDebugHtmlText() {
            List<WebElement> debugElements = driver.findElements(By.id("debug_block"));
            String html = "";
            for (WebElement element : debugElements) {
                html += element.getAttribute("innerHTML");
            }
            return html + "</div> ";
        }
    };

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            System.out.println("Closing chrome browser");
            driver.quit();
        }
    }
}