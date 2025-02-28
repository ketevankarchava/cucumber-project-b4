@B4G2A-122
Feature: Demo how to upload json report to xray



  @xray @B4G2A-163 @B4G2A-170 @smoke
  Scenario: Login as a client
    Given user is on Docuport login page
    When user enters username for client
    And user enters password for client
    And user clicks login button
    Then user should be able to see the home for client