# Author: mesa.cristian@gmail.com

Feature: As a user
  I want to modify one register

  @UpdateUser
  Scenario Outline: modify register
    When I send the new information for user with <id>
      | name   | job   |
      | <name> | <job> |
    Then I see the response code 200
    And the correct schema for the method "Update"
    Examples:
      | id | name        | job       |
      | 2  | change user | Api User  |
      | 10 | Other user  | Developer |
