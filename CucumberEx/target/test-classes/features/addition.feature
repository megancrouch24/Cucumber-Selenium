Feature: Calculator addition behaviour
  Testing whether the calculator can successfully add numbers.

 Background: Calculator setup
 Given a calculator 
  
  Scenario: Integer addition
    Given the number 4
    And the second number 6
    When the numbers are added
    Then the result should be 10

  Scenario: Floating point
    Given the number 4.2
    And the second number 2.5
    When the numbers are added
    Then the result should be 6.5
  
  Scenario Outline: Varying values Integer addition
  	Given the number <num1>
 		 And the second number <num2>
 	  When the numbers are added
  	Then the result should be <expected>
  
 Examples: Integer values
 | num1 | num2 | expected |
 |  2   |   4  |     6    |
 |  4   |   8  |     12   |