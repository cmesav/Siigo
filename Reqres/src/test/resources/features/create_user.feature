# Author: mesa.cristian@gmail.com

Feature: As a user
  I want to register in the aplication

  @CreateNewUser
  Scenario: new register
    When I send the register information
    Then I see the response code 201
    And I see my info in the response
    And the correct schema for the method "Post"
