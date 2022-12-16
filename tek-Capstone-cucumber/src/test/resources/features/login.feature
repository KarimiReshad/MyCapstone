Feature: Sign In Feature

  @test
  Scenario: Verify Retail page logo
    Given user is on retail website
    Then user verify retail page logo is present

  @SignIn
  Scenario: Verify user can sign in into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'singh@gmail.com' and password 'Tester@654321'
    And User click on login button
    Then User should be logged in into Account

  @SingUp
  Scenario: Verify user can create an account into Retail Website
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name      | email                 | password    | confirmPassword |
      | CapsFrame | Capstone@tekschool.us | Stone@12345 | Stone@12345     |
    And User click on SignUp button
    Then User should be logged into account page
    
    