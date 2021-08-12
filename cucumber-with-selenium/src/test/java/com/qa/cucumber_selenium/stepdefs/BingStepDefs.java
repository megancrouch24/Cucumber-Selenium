package com.qa.cucumber_selenium.stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber_selenium.SeleniumHooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingStepDefs {

	private WebDriver driver;

	public BingStepDefs(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();
	}

	@When("I request https://www.bing.com")
	public void i_request_www_bing_com() {
		driver.get("https://www.bing.com");
	}


    @When("i search for doge")
    public void search_for() {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys("doge");
        element.submit();
   }
    
    @Then("the title of the page should be {string}")
    public void theTitleOfThePageShouldBe(String expectedTitle) {
    	String actualTitle = driver.getTitle();
    	assertEquals(expectedTitle, actualTitle);
    }

	
	
}
