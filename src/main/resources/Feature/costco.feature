
@Regression @Functional
Feature:  google search functionalty testing


  @Positive
  Scenario Outline: user will be able to search items successfuly 
    Given user is on the google search browser
    When user enters "<value>" in search box
    Then validate dropdown contain "<value>" 

    Examples: 
      |value| 
      |iphone 14| 
      |iphone 15|
      |iphone 16|
