@addProductToCart
Feature: Add product to shopping cart on sconto.de feature

  Scenario: Add furniture product to shopping cart without LogIn
    Given Navigate to Homepage
    When Navigate to a product department Schraenke
    And Select a sub department Kleiderschraenke
    And Select the first product in the catalog
    And Add product to the cart
    Then Product is in the cart