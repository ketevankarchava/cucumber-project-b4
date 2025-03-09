Feature: Docuport Sample Scenario

  @sampleDocuport
  Scenario: Practice click buttons on different pages as a client
    Given user is on Docuport login page
    When user inserts "b1g1_client@gmail.com" to "username" field on "Login" page
    When user inserts "Group1" to "password" field on "Login" page
    And user clicks "login" button on "Login" page
    And user clicks "continue" button on "Choose account" page
    Then user should be able to see the home for client
    And user clicks "Received Doc" button on "Left Navigate" page
    And user clicks "Search" button on "Received Doc" page
    And user inserts "tax document" to "Document name" field on "Received Doc" page
    And user inserts "tax return" to "Tags" field on "Received Doc" page
    And user inserts "3-5-2025" to "Upload date" field on "Received Doc" page
    And user inserts "batch1 group1" to "Uploaded by" field on "Received Doc" page
    Then user clicks "Search" on "Received Doc" page
    And user validates message "Your search returned no results. Make sure you search properly"
