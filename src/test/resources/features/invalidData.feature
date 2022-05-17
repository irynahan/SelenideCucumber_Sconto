@regression
Feature: Sconto Login feature
  To see error message

  @wrongPassword
  Scenario: Login with empty field in password
    Given Navigate to Homepage
    When Click on Anmelden icon
    Then Login page displayed

    When Enter user credentials with empty field in password
    And Click on Anmelden button
    Then Error password message displayed

  @wrongPasswordWithTable
  Scenario Outline: Login with an invalid password
    Given Navigate to Homepage
    When Click on Anmelden icon
    Then Login page displayed

    When Enter user credentials with an invalid password
      | email   | password   |
      | <email> | <password> |
    And Click on Anmelden button
    Then Error email message displayed
    Examples:
      | email            | password     |
      | manuel@gmail.com | manuel12345! |
      | manuel@gmail.com | ^$#*&^*&^    |