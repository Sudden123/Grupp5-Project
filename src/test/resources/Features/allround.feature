Feature: Allround scoring system
  # language: se

  @Prio1
  Scenario Outline: As an official I want to be able to register a competitor first name
    Given I have typed competitors first name as "<firstName>"
    When I press enter
    Then The competitors first name is saved as "<firstName>"
    Examples:
      | firstName     |
      | Carolina      |
      | Katarina-Mary |
      | Bjorn         |
      | Sven Ake      |


  @Prio1.5
  Scenario Outline: As an official I want to be able to register a competitor last name
    Given I have typed competitors last name as "<lastName>"
    When I press enter
    Then The competitors last name is saved as "<lastName>"
    Examples:
      | lastName         |
      | Melnychenko      |
      | Göransson        |
      | Johnson-Thompson |
      | O'Brien          |



  @Prio2
  Scenario: As an official i want to enter a performance value (double, not integer) one at a time (or more at the same time)
    Given I have Performance results <value>
    And I have input Performance <value>
    When I press Save
    Then The result <value> should be saved



  @Prio15
  Scenario: Record high jump in decathlon
    Given I have entered 232 cm for a high jump in decathlon
    When I ask for the result
    Then I get 1111 points

