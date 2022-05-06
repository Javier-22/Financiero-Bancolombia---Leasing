@story
Feature:Verify the operation of the Financial Canon simulation screen exposed
        by the Bancolombia - Leasing group, in terms of the presentation of
        the calculated values.

        As a Bancolombia user
        I want to carry out a simulation of the Housing Leasing product
        to see what data it gives me.
  Background:
    Given  that the user enters the bancolombia portal
    And click the following options in order leasing, residential leasing, simulate, according to the value of the home

  @scenario1
    Scenario : Verify the operation of the Financial Canon simulation screen by entering valid entries.
    When when you have clicked on the option according to the value of the home, fill in the form and choose the option Housing Leasing
      |strCommercialvalue|strPercentege|strYears | strYear_Calendar| strMount_Calendar |strDay_Calendar|
      |150000000         | 80%         |   8     | 2004            |    MAR            |   22          |
    Then Verify that when simulating your credit you get the result of the simulation

  @scenario2
  Scenario: Verify the operation of the Financial Canon simulation screen by entering valid entries.
    When when you have clicked on the option according to the value of the home, fill in the form and choose the option Housing Leasing
      |strCommercialvalue|strPercentege|strYears | strYear_Calendar| strMount_Calendar |strDay_Calendar|
      |150000000         | 80%         |   3     | 2004            |    MAR            |   22          |
    Then Verify that age of credit must be show El campo no cumple con el valor
















