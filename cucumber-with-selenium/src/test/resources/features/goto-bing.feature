@service
Feature: Navigate to Bing
 
 As a user i would like to navigate to Bing 

  
  Scenario: 
  When I request https://www.bing.com
  When i search for doge
  Then the title of the page should be "doge - Bing"
  
  
  
  
  
  
  