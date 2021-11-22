Feature: Adding product from homepage to cart

  Scenario: Adding product from homepage to cart
    Given user searches for product on homepage
    Then user clicks on product so that enters into productpage
    And user adds product to wishlist, increases its quantity and adds to cart
