Feature: Allround scoring system

  # language: eng
  # language: no
  # language: se
  # language: fi

  @Prio1
  Scenario Outline: As an official I want to be able to register a competitor's first name
  Given I have typed competitor's first name as "<firstName>"
  When I press enter
  Then The competitor's first name is saved as "<firstName>"
  Examples:
  | firstName             |
  | Carolina              |
  | Katarina-Mary         |
  | Jorgen                |
  | Hakan Mattias Peter    |
  |  |

  @Prio1.5
  Scenario Outline: As an official I want to be able to register a competitor's last name
  Given I have typed competitor's last name as "<lastName>"
  When I press enter
  Then The competitor's last name is saved as "<lastName>"
  Examples:
  | lastName         |
  | Melnychenko      |
  | Göransson        |
  | Johnson-Thompson |
  | O'Brien          |
  |   |

  @Prio2
  Scenario: Record high jump in decathlon
  Given I have entered 232 cm for a high jump in decathlon
  When I ask for the result in high jump
  Then I get 1111 points in high jump

  @Prio3
  Scenario: Record long jump in decathlon
  Given I have entered 400 cm for a long jump in decathlon
  When I ask for the result in long jump
  Then I get 206 points in long jump

  @Prio4
  Scenario: Record 100 m hurdles in heptathlon
  Given I have entered 20 seconds for 100m hurdles in heptathlon
  When I ask for the result in 100m hurdles
  Then I get 302 points in 100 m hurdles