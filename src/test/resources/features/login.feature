Feature: Sconto Login feature
  Log in to the website Sconto to see the account area

  Scenario: Successful Login
    Given Navigate to Homepage
    When Click on Anmelden icon
    Then Login page displayed

    When Enter valid user credentials
    And Click on Anmelden button
    Then Homepage displayed

    When Click on Mein Konto icon
    Then User name displayed