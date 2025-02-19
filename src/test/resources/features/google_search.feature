Feature: Google Search functionality Title Verification
  User Story: As a user, when I am on the Google search page
  I should be able to search whatever I want and see the relevant information

  @google_search
  Scenario: Search functionality result title verification
    Given user is on Google search page
    When user types Loop Academy in the google search box and clicks enter
    Then user should see Loop Academy - Google search in the google title
