@ui
Feature: Hearthland Career Options

  Scenario:Search career title
    Given user in on Hearthland home page and scrolls down to click Career tab
    When Career page opens, user clicks on "Search Hearthland jobs" tab
    And user search "Salesforce QA Engineer" opportunity in search box
    Then "Salesforce QA Engineer" opportunity/opportunities display