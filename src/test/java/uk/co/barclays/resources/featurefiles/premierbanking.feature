Feature: PremierBanking feature
  As a user I want To navigate to Premier Banking Page

  Scenario: User should navigate to Premier Banking Page
    Given I am on Home Page
    When I click on premier link
    Then I can navigate to Premier Banking Page successfully"Premier Banking"

  Scenario:User can Navigate to Spring Budget Page successfully
    Given I am on Home Page
    When I click on premier link
    Then I can navigate to Premier Banking Page successfully"Premier Banking"
    Then I click on spring budget link
    And I navigate to spring budget page successfully"Spring Budget 2020"

