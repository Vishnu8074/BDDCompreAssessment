Feature: Testing PersonalisedGifts functionality

  Scenario Outline: Testing PersonalisedGifts functionality
    Given user clicks on PersonalisedGifts available in home page
    Then user validates whether we entered personalized page or not
    And user checks if this  <productname> available or not

    Examples: 
      | productname          			|
      | Personalized Wonder Woman |
