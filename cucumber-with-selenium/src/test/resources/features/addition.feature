@calculator
Feature: Calculator addition behaviour
  Testing whether the calculator can successfully add numbers.

 Background: Calculator setup
 Given a calculator 
  
  Scenario: Integer addition
    Given the number 4
    And the second number 6
    When the numbers are added
    Then the result should be 10