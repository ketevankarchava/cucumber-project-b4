Feature: Passing multiple parameters to the same step

  @google_search_data_table
  Scenario: Searching multiple items
    Given user is on Google search page
    Then user searches the following items
      | loop academy |
      | java         |
      | selenium     |
      | cucumber bdd |
      | sql          |
      | pavlo        |
      | kate         |
    And we love Loop Academy

    #clt alt L to organize