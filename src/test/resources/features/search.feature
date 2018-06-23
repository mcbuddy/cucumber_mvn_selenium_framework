# ../features/search.feature

Feature: As end user I want to search cucumber homepage on google

  Scenario: Search cucumber homepage on google
    Given I at google search homepage
    When I search for "cucumber.io" keyword
    Then I should see "cucumber.io" search result
    And I should see "cucumber.io" official homepage