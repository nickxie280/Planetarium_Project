Feature: Planet Deletion
  As a user I want to remove planets from the Planetarium so I can correct my findings

  Background: Planet Deletion Starting Actions
    Given that the user is logged in and is on the home page
    And the user deletes a planet

  Scenario: The user should be able to delete an existing planet
    When the user inputs a valid name
    When the user presses delete
    Then the user is redirected to the home page
    And the data reflected has been refreshed to include the removed planet and corresponding moons

  Scenario Outline: The user should not be able to delete a non-existing planet
    When the user inputs a invalid name "<Planet Name>"
    When the user presses delete
    Then the user should get a browser alert saying "Invalid planet name"
    And the user should be redirected to the home page

  Examples:
    |Planet Name  |
    |Random_Planet|
    |DoesntExist12|
    |TestRemove!!!|