# Author: mesa.cristian@gmail.com

Feature: as a client
  I want to buy some products on falabella website

  Background:
    Given Search "falabella" website

  Scenario: buy product
    When I choose one product of "ps4 games" with extended warranty
    Then I see the product name in the shopping bag
    And the total purchase value
