package com.simpals.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.*;
import org.openqa.selenium.chrome.ChromeOptions;

public class ExampleTest {

	private WebDriver driver;
	private String baseUrl;

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
		//driver.manage().window().maximize();
		
		
		/*
		try{
		DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://172.18.51.88:4444/wd/hub"), capability);
		}catch(Exception e){}
             */

	}
	@Test
	public void testQwe() throws Exception {
		driver.get(baseUrl + "/ru/");
		driver.findElement(By.linkText("подать объявление")).click();
		new Select(driver.findElement(By.id("category"))).selectByVisibleText("Транспорт");
		new Select(driver.findElement(By.name("subcategory"))).selectByVisibleText("Легковые автомобили");
		new Select(driver.findElement(By.name("offer_type"))).selectByVisibleText("Продам");
		driver.findElement(By.id("control_20")).click();
		new Select(driver.findElement(By.id("control_20"))).selectByVisibleText("Acura");
		new Select(driver.findElement(By.id("control_21"))).selectByVisibleText("Cl");
		new Select(driver.findElement(By.id("control_775"))).selectByVisibleText("Молдова");
		new Select(driver.findElement(By.id("control_593"))).selectByVisibleText("Без пробега");
		driver.findElement(By.id("control_19")).clear();
		driver.findElement(By.id("control_19")).sendKeys("1234");
		new Select(driver.findElement(By.id("control_846"))).selectByVisibleText("2");
		new Select(driver.findElement(By.id("control_102"))).selectByVisibleText("Внедорожник");
		new Select(driver.findElement(By.id("control_851"))).selectByVisibleText("2");
		driver.findElement(By.id("control_104")).clear();
		driver.findElement(By.id("control_104")).sendKeys("123");
		driver.findElement(By.id("control_103")).clear();
		driver.findElement(By.id("control_103")).sendKeys("123");
		new Select(driver.findElement(By.id("control_151"))).selectByVisibleText("Бензин");
		new Select(driver.findElement(By.id("control_101"))).selectByVisibleText("Автоматическая");
		new Select(driver.findElement(By.id("control_108"))).selectByVisibleText("4х4");
		new Select(driver.findElement(By.id("control_17"))).selectByVisibleText("Оранжевый");
		driver.findElement(By.name("109")).click();
		driver.findElement(By.name("119")).click();
		driver.findElement(By.name("112")).click();
		driver.findElement(By.name("115")).click();
		driver.findElement(By.name("118")).click();
		driver.findElement(By.name("121")).click();
		driver.findElement(By.name("124")).click();
		driver.findElement(By.name("127")).click();
		driver.findElement(By.name("128")).click();
		driver.findElement(By.name("125")).click();
		driver.findElement(By.name("122")).click();
		driver.findElement(By.name("116")).click();
		driver.findElement(By.name("113")).click();
		driver.findElement(By.name("110")).click();
		driver.findElement(By.name("111")).click();
		driver.findElement(By.name("114")).click();
		driver.findElement(By.name("117")).click();
		driver.findElement(By.name("120")).click();
		driver.findElement(By.name("123")).click();
		driver.findElement(By.name("126")).click();
		driver.findElement(By.name("129")).click();
		driver.findElement(By.name("130")).click();
		driver.findElement(By.name("133")).click();
		driver.findElement(By.name("136")).click();
		driver.findElement(By.name("139")).click();
		driver.findElement(By.name("142")).click();
		driver.findElement(By.name("148")).click();
		driver.findElement(By.name("145")).click();
		driver.findElement(By.name("131")).click();
		driver.findElement(By.name("134")).click();
		driver.findElement(By.name("137")).click();
		driver.findElement(By.name("140")).click();
		driver.findElement(By.name("143")).click();
		driver.findElement(By.name("146")).click();
		driver.findElement(By.name("149")).click();
		driver.findElement(By.name("132")).click();
		driver.findElement(By.name("135")).click();
		driver.findElement(By.name("138")).click();
		driver.findElement(By.name("141")).click();
		driver.findElement(By.name("147")).click();
		driver.findElement(By.name("144")).click();
		driver.findElement(By.name("150")).click();
		driver.findElement(By.id("control_2")).clear();
		driver.findElement(By.id("control_2")).sendKeys("123");
		new Select(driver.findElement(By.id("control_7"))).selectByVisibleText("Дубоссары");
		driver.findElement(By.id("control_13")).clear();
		driver.findElement(By.id("control_13")).sendKeys("123123");
		driver.findElement(By.id("fileupload-button")).click();
		driver.findElement(By.id("fileupload-file-input")).clear();
		driver.findElement(By.id("fileupload-file-input")).sendKeys("");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("control_2")).click();
		driver.findElement(By.id("control_2")).clear();
		driver.findElement(By.id("control_2")).sendKeys("123000");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("control_2")).click();
		driver.findElement(By.id("control_2")).clear();
		driver.findElement(By.id("control_2")).sendKeys("13000");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		driver.findElement(By.id("control_19")).click();
		driver.findElement(By.id("control_19")).clear();
		driver.findElement(By.id("control_19")).sendKeys("1999");
		driver.findElement(By.id("agree")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}

	@Test
	public void testGooglePageTitleInChrome() {
		driver.navigate().to("http://www.google.com");
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Google"), "Page title doesn't match");
/*		driver.navigate().to("http://172.18.51.87:81/devcapsule-spring-1.0/");
		//driver.get("http://172.18.51.88:8080/devcapsule-spring-1.0/");
		String strPageTitle = driver.getTitle();
		Assert.assertTrue(strPageTitle.equalsIgnoreCase("Pizzas"), "Page title doesn't match");*/
	}

	
	


}
