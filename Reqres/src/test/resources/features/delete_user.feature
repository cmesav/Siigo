# Author: mesa.cristian@gmail.com

Feature: As a user
  I want to delete one register

  @DeleteUser
  Scenario: delete user
    When I send the request to erase the user with id 2
    Then I see the response code 204
