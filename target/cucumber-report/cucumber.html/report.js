$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/barclays/resources/featurefiles/barclays.feature");
formatter.feature({
  "line": 1,
  "name": "Barclays Bank",
  "description": "As a user I want to navigate to the Account Page",
  "id": "barclays-bank",
  "keyword": "Feature"
});
formatter.before({
  "duration": 19816887600,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#"
    },
    {
      "line": 4,
      "value": "#  Scenario: User should navigate to Account page successfully"
    },
    {
      "line": 5,
      "value": "#    Given   I am on barclays Bank HomePage"
    },
    {
      "line": 6,
      "value": "#    When    I mouse hover to bank link"
    },
    {
      "line": 7,
      "value": "#    Then    I click on account link"
    },
    {
      "line": 8,
      "value": "#    And     I should navigate to account page successfully text seen \"Current accounts\""
    }
  ],
  "line": 10,
  "name": "User should find local branch successfully",
  "description": "",
  "id": "barclays-bank;user-should-find-local-branch-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I am on barclays Bank HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I click on find a branch",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter nearest branch post code \"LE4 5AT\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click on search button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I see the result \"131/133 Belgrave Road\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iAmOnBarclaysBankHomePage()"
});
formatter.result({
  "duration": 256602600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnFindABranch()"
});
formatter.result({
  "duration": 4102641800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LE4 5AT",
      "offset": 34
    }
  ],
  "location": "MyStepdefs.iEnterNearestBranchPostCode(String)"
});
formatter.result({
  "duration": 1076598800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSearchButton()"
});
formatter.result({
  "duration": 3688918100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "131/133 Belgrave Road",
      "offset": 18
    }
  ],
  "location": "MyStepdefs.iSeeTheResult(String)"
});
formatter.result({
  "duration": 117467200,
  "status": "passed"
});
formatter.after({
  "duration": 1009273200,
  "status": "passed"
});
});