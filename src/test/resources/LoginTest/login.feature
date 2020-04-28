
Feature: Login to customer porta
User should be able to login
  
  Scenario: Successful login with user logs in with valid credentials
    Given I am on the customer login page
   When I enter username as "jared"  and password as "demo123"
    And I click on Login button
    Then I should be redirected to home page
    Scenario: Successful login with user logs in with invalid credentials
    Given I am on login page
   When I enter  invalid username as "invalid" and password as "demo123"
    And I click on Login button
    Then I am on login page
  
  