Feature: Home Page

  @navigate
  Scenario: Verify Home page title is displayed
    Given User launches Chromebrowser
    When User opens ilcarro Home Page
    Then User verifies Home Page title is displayed
    And User quites browser
