Feature: Homepage

  Scenario: User clicks on the profile dropdown and navigates to the history page
    Given the user is on the homepage
    When the user clicks on the profile dropdown
    And the user clicks on the history link
    Then the user should be redirected to the history page