@US1 @SR1
Feature: User Registration
  As a new user I want to open an account with the Planetarium so I can save my celestial findings

  Background: Registration Starting Actions
    Given the user is on the login page
    And the user clicks the register link

  Scenario: Users can register a new account with valid credentials
    #TODO Insert valid username/password in step implementation
    When the user provides a valid username
    And the user provides a valid password
    And the user submits the credentials
    Then the user should get a browser alert saying "Account Created Successfully"
    And the user should be redirected to the login page

  @UR1 @UR2 @UR3 @UR4 @UR5 @UR6
  Scenario Outline: Users can not register a new account with invalid credentials
    When the user provides a username "<username>"
    When the user provides a password "<password>"
    Then the user should get a browser alert saying "<alert>"
    And the user should be redirected to the register page

  Examples:
    |username                            | password                           |alert                        |
    |Super_man-2001                      |Krypton-was_2000                    |Account Created Successfully |
    |Batman	                             |Krypton-was_2000	                  |Invalid Username Alert       |
    |Bane	                             |Krypton-was_2000	                  |Invalid Username Alert       |
    |wonder_woman_for_the_DC_theming	 |Krypton-was_2000	                  |Invalid Username Alert       |
    |2face	                             |Krypton-was_2000	                  |Invalid Username Alert       |
    |Joker!!!?)	                         |Krypton-was_2000	                  |Invalid Username Alert       |
    |Super_man-2001	                     |b4tS	                              |Invalid Password Alert       |
    |Super_man-2001	                     |AlfredIsTheBestButlerToExist111	  |Invalid Password Alert       |
    |Super_man-2001	                     |3atman	                          |Invalid Password Alert       |
    |Super_man-2001	                     |AlfredIsTheBestButlerToExist!	      |Invalid Password Alert       |
    |Super_man-2001	                     |batman1	                          |Invalid Password Alert       |
    |Super_man-2001	                     |BATMAN1	                          |Invalid Password Alert       |
    |Super_man-2001	                     |Robin	                              |Invalid Password Alert       |