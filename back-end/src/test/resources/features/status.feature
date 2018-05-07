@sprint_1

Feature: 01 - TNR - a customer should be able to read his account
  
  @sprint_1
  Scenario Outline: a customer should be able to read his account
    Given I am a customer with <balance> on my account <account>
    When I check my account <account>
    Then my balance should be <balance>

    Examples:
    |balance|account |
    |100.0  |TEST_002|   