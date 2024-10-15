@smoke
Feature: edit addresses

  Scenario: edit shipping address
    Given  user is on allovercommerce homepage
    And user clicks on SignIn button
    Then user enters username and password
    Then user clicks on login button
    Then verify url contains allover
    And  close the driver
