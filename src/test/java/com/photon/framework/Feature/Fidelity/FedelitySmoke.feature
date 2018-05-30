@FedelityDemo
Feature: Fidelity Website verification and running a smoke test on it

  @FidelitySmoke
  Scenario: Land on Home Screen
  Given User launches the Fedelity URL
  Then  User lands on the Usage Agrement page
  When  User accepts the Usage Agrement
  Then  User lands on Loginpage
  
  @FidelitySmoke1
  Scenario: Search and select a stock
  Given User launches the Fedelity URL
  Then  User lands on the Usage Agrement page
  When  User accepts the Usage Agrement
  And User searches for "fidelity funds" in Fidelity website
  Then User validates the search result "Fidelity Mutual Funds"
   

  