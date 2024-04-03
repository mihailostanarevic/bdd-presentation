Feature: Test feature

  @v1
  Scenario: I call the method to multiply two integers
    Given I have two numbers: 2 and 3
    When I call the multiply method with those two numbers
    Then I expect the result to be 6

  @v1
  Scenario: I call the method to multiply two integers
    Given I have two numbers: 3 and 3
    When I call the multiply method with those two numbers
    Then I expect the result to be 9