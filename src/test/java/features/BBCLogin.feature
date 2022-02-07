Feature: Verify user can login to BBC

  Scenario: Verify I can login to BBC
     Given User launches BBC homepage
    Then User clicks on Sign-in
    When User enters the "test99@gmail.com" and "test@123123"
    And Clicks on the Sign-in button
    Then BBC homepage should be displayed with Your account text