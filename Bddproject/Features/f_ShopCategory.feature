Feature: Testing functionality of shop by category on homepage

  Scenario: Testing functionality of shop by category on homepage
    Given user hover on shp by category in homepage
    When selects jewellery from shop by category and clciks on next
    Then user searches for Morning Glory Semi-Precious Ring from jewe page and clicks on it
    And user adds it to wishlist
