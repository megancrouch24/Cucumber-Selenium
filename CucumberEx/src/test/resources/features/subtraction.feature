Feature: Calculator subtraction behaviour
  Testing whether the calculator can successfully subtract numbers.
  
Background: Calculator setup
Given a calculator
  
  Scenario: Integer subtraction
     Given the number 10
     And the second number 5
     When the numbers are subtracted
     Then the results should be 5
    

 Scenario: Floating point
    Given the number 4.5
    And the second number 2.5
    When the numbers are subtracted
    Then the results should be 2
  

 Scenario Outline: Varying values Integer addition
  	Given the number <num1>
 		 And the second number <num2>
 	  When the numbers are subtracted
  	Then the results should be <expected>
  
 Examples: Integer values
 | num1 | num2 | expected |
 |  6   |   4  |     2    |
 |  10  |   4  |     6    |