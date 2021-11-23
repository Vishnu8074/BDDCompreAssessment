Feature: Checking Gifts

  Scenario Outline: Testing Gifts
    Given user is on homepage and hovering on Gifts
    And user searches for <giftname> from list and clicks on it and validates
    Then user sorts the products in ascending order and searches for <giftproductname> from products

    Examples: 
      | giftname  | giftproductname                |
      | DIY Gifts | DIY Hot Air Balloon Lamp Shade |
