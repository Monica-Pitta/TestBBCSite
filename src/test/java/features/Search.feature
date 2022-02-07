Feature: Search Movies on BBC website and verify search
  

  Scenario: Search Movies on BBC website and verify results
    Given I open BBC website using chrome browser
    When I click on search option
    And I enter "Movies" in search textbox
    And I click at Search button
    Then search results are displayed

 
