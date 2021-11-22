Feature: Signin to the account

  Scenario: Sign in to the website
    Given The user is on sign in page
    When user enters the email and password
    Then system should accept signin data
