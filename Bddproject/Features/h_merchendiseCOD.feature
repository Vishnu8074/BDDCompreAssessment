Feature: Testing Cash on delivery availability

  Scenario Outline: Entering pincode and checking for cash on delivery option
    Given user hovers on official merchandise
    When user clicks on Official harry potter merchandise
    And user searches for Hedwig Owl mug from Official harry potter merchandise page and clicks on it
    Then user enters pincode in cod textbox <pincode> , clicks on check and prints the text

    Examples: 
      | pincode |
      |  506001 |
