package com.qa.cucumber_selenium.calculator;

import static org.junit.Assert.assertEquals;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefs {

	private int num1;
	private int num2;
	private int actualResult;
	private Calculator calculator;

	@Given("a calculator")
	public void aCalculator() {
	this.calculator = new Calculator();
	}
	
	
	@Given("the number {int}")
	public void theNumber(Integer int1) {
		System.out.println(int1);
		num1 = int1;
	}
	
	@Given("the second number {int}")
	public void theSecondNumber(Integer int1) {
		System.out.println(int1);	
	    num2 = int1;
	}
	
	@When("the numbers are added")
	public void theNumbersAreAdded() {
		this.actualResult = this.calculator.add(num1,num2);
	}
		
	@Then("the result should be {int}")
	public void theResultsShouldBeSub(Integer expectedResult) {
		assertEquals(expectedResult, actualResult, 10);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
