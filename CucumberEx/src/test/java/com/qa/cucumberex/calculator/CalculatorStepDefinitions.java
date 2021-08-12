package com.qa.cucumberex.calculator;

import static org.junit.Assert.assertEquals;

import com.qa.cuccumberex.calculator.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {

	
	private double num1;
	private double num2;
	private double actualResult;
	private Calculator calculator;

	@Given("a calculator")
	public void aCalculator() {
	this.calculator = new Calculator();
	}
	
	
	@Given("the number {double}")
	public void theNumber(Double int1) {
		System.out.println(int1);
		num1 = int1;
	}
	
	@Given("the second number {double}")
	public void theSecondNumber(Double int1) {
		System.out.println(int1);	
	    num2 = int1;
	}
	
	@When("the numbers are added")
	public void theNumbersAreAdded() {
		this.actualResult = this.calculator.add(num1,num2);
	}
	
	@When("the numbers are subtracted")
	public void theNumbersAreSubtracted() {
		this.actualResult = this.calculator.subtract(num1,num2);
	}
	
	
	@Then("the result should be {double}")
	public void theResultsShouldBe(double expectedResult) {
		assertEquals(expectedResult, actualResult, 6.5);
	}
	

	@Then("the results should be {double}")
	public void theResultsShouldBeSub(double expectedResult) {
		assertEquals(expectedResult, actualResult, 5);
	}

	
	
	
	
}
