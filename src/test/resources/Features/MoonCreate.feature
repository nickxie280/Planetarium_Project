Feature: Moon Creation
  As a user I want to add new moons to the Planetarium so I can update my findings

  Background:
    Given that the user is logged in and is on the home page

  ## Happy Path
  Scenario: While logged in, the user is able to create a planet with valid inputs
    When the user creates a moon
    When the user inputs a valid moon name
    When the user inputs a valid owning planet ID
    Then the user is redirected to the home page
    And the data reflected has been refreshed to include the newly added moon