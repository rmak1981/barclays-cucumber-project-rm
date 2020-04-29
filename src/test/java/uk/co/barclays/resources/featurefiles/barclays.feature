Feature: Barclays Bank
  As a user I want to navigate to the Account Page

  Scenario: User should navigate to Account page successfully
    Given   I am on barclays Bank HomePage
    When    I mouse hover to bank link
    Then    I click on account link
    And     I should navigate to account page successfully text seen "Current accounts"

  Scenario: User should find local branch successfully

    Given   I am on barclays Bank HomePage
    When    I click on find a branch
    And     I enter nearest branch post code "LE4 5AT"
    And     I click on search button
    Then    I see the result "131/133 Belgrave Road"
