Feature: Allround scoring system

  @Prio1
  Scenario: As an official I want to be able to register a competitor first name
    Given I have opened the program
    And I have typed competitors first name in textbox
    When I press submit
    Then the competitors first name is saved

  @Prio1,5
  Scenario: As an official I want to be able to register a competitor last name
    Given I have opened the program
    And I have typed competitors last name in textbox
    When I press submit
    Then the competitors last name is saved

  @Prio1,9
  Scenario: As an official I want to be able to choose male or female
    Given I have opened the program
    And I have selected male or female
    When I press submit
    Then the competitors gender is saved

  @Prio2
  Scenario: As an offical i want to enter a performance value (double, not integer) one at a time (or more at the same time)
    Given I have Performance results <value>
    And I have input Performance <value>
    When I press Save
    Then the result <value> should be saved

  @Prio3
  Scenario: As an official I want the decathlon track scoring used
    Given I have entered the competitors performance <value>
    When I press the "button"
    Then I should see the competitors score

  @Prio4
  Scenario: As an official I want the decathlon field scoring used
    Given I have entered the competitors performance <value>
    When I press the "button"
    Then I should see the competitors score

  @Prio5
  Scenario: As an official I want the heptathlon track scoring used
    Given I have entered the competitors performance <value>
    When I press the "button"
    Then I should see the competitors score

  @Prio6
  Scenario: As an official I want the heptathlon field scoring used
    Given I have entered the competitors performance <value>
    When I press the "button"
    Then I should see the competitors score

  @Prio7
  Scenario: As an official I want to be able to save a competitors score.
    Given I have chosen a competitor
    And I have mark his score
    And I have saved the score
    Then I should be able to see the saved score in a excel file

  @Prio8
  Scenario: As an official i want to be able to see all the current scores at any time
    Given I have entered a competitors name
    And I have entered competitors score
    And I have saved the data
    When I press show data I should be able to see the data

  @Prio9
  Scenario: Resume the program after it was stopped.
    Given that the program is stopped
    Then  press start
    Then  the program is runing

  @Prio10
  Scenario: As an official I want to be able to stop the program after each time a score is saved.
    Given I have entered a competitors name
    And I have entered competitors score
    And I have saved the data
    Then I should be able to stop the program

  @Prio11
  Scenario: The program should save the score tabel into a excel file where the officials can see the live score.
    Given The score should be in excel file
    And the score is saved into a excel file
    Then the officials should be able to see it in the excel file

  @Prio12
  Scenario: As an official I want to be able see a competitors score whenever I want
    Given I have chosen a competitor by <name>
    When I press "show score" for a specific competitor
    Then The competitors score is displayed as <score>

  @Prio13
  Scenario: As an official I want to be able to minimize the window
    Given I have started the program
    When I press the minimize button inte the corner
    Then the program should minimize

  @Prio14
  Scenario: As an official I want to be able to choose a competitor from a drop-down list and load their values (if there are any).
    Given I have started the program
    When I press the drop-down list
    Then the program should load the old values
