package com.qa.cucumber_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class SeleniumHooks {


private WebDriver webdriver;

@Before
public void setup() {
System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
this.webdriver = new ChromeDriver();

}


@After
public void teardown() {
this.webdriver.quit();	
}

public WebDriver getDriver() {
	return this.webdriver;
	}
}