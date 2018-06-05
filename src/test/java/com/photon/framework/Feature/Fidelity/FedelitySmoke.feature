@FedelityDemo
Feature: Fidelity Website verification and running a smoke test on it

  @FidelitySmoke
  Scenario: Land on Home Screen
  Given User launches the Fedelity URL
  Then  User lands on the Usage Agrement page
  When  User accepts the Usage Agrement
  Then  User lands on Loginpage
  
  @FidelitySmoke
  Scenario: Search and select a stock
  Given User launches the Fedelity URL
  Then  User lands on the Usage Agrement page
  When  User accepts the Usage Agrement
  And User searches for "fidelity funds" in Fidelity website
  Then User validates the search result "Fidelity Mutual Funds"
   
  @FidelitySmoke
  Scenario Outline: User validates the home page menu
    Given User launches the Fedelity URL
    Then User lands on the Usage Agrement page
    When User accepts the Usage Agrement
    Then User validate the header menu '<Names>'
    
    Examples: 
      | Names               |
      | Accounts & Trade    |
      | Planning & Advice   |
      | News & Research     |
      | Investment Products |
      | Why Fidelity        |
  
  @FidelitySmoke1
  Scenario: User validates why fidelity header link  
  Given User launches the Fedelity URL
  Then  User lands on the Usage Agrement page
  When  User accepts the Usage Agrement
  And User click on "Customer Service" header link 
  Then user should be on "Customer Service" page
  And User click on "Open An Account" header link 
  Then user should be on "Open An Account" page
  And User click on "Refer A Friend" header link 
  Then user should be on "Refer A Friend" page