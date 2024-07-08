Feature: Login

  @validData
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    Then User verifies Success Message is displayed
    And User quites browser

  @invalidPassword
  Scenario Outline: Login with valid email and invalid password
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid email and invalid password
      | email   | passwort  |
      | <email> | <password> |
    And User clicks on Yalla button
    Then User verifies Error Message is displayed
    And User quites browser
    Examples:
      | email       | password  |
      | hans@gm.com | qwert007! |
      | hans@gm.com | Qwert0077 |
      | hans@gm.com | QWERT007! |
      | hans@gm.com | Qwert!!!! |
