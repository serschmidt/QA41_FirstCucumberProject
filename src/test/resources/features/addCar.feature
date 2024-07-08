Feature: addCar

  @addCar
  Scenario: Login with valid data
    Given User launches Chrome browser
    When User opens ilcarro Home Page
    And User clicks on Log in link
    And User enters valid data
    And User clicks on Yalla button
    And User clicks on Let_the_car_work link
    And User enters location
    And User enter car manufacture
    And User enters model
    And User enters year
    And User selects the fuel
    And User enters seats
    And User enters car class
    And User enters rugistration number
    And User enters price
    And User clicks on submit
    And User clicks in show car button
    Then User verifies Success Message is displayed
#    And User quites browser

