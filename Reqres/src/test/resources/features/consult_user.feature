# Author: mesa.cristian@gmail.com

Feature: As a client
  I want to consult an register user

  @GetOneUser
  Scenario: consult an user
    When I Consult the user id 2
    Then I see the response code 200
    And the correct schema for the method "Get"
