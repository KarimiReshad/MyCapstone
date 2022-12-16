Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'Singh2@gmail.com' and password 'Farshad@123456'
    And User click on login button
    And User should be logged in into Account
    When User click on Account option

  @AcctUpdate
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Karimi' Phone '2408906000'
    And User click on Update button
    Then user profile information should be updated

  @updatePass
  Scenario: Verify User can Update password
    And User enter below information
      | previousPassword | newPassword    | confirmPassword |
      | Farzad@123456    | Farshad@123456 | Farshad@123456  |
    And User click on Change Password button
    Then a message should be displayed 'Password Updated Successfully'

  @payMethod
  Scenario: Verify User can add a payment method
    * User click on Add a payment method link
    * User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 1236548597853259 | Singh      |              11 |           2024 |          321 |
    * User click on Add your card button
    Then a message should be displayed 'Payment Method added sucessfully'

  @editPayMeth
  Scenario: Verify User can edit Debit or Credit card
    And user click on cardNumber ending '3259'
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4569874563211235 | Panthers   |              12 |           2026 |          654 |
    And user click on Update Your Card button
    Then a message should be displayed 'Payment Method updated Successfully'

  @removeMeth
  Scenario: Verify User can remove Debit or Credit card
    And user click on cardNumber ending '7658'
    And User click on remove option of card section
    Then payment details should be removed

  @Address
  Scenario: Verify User can add an Address
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city      | state   | zipCode |
      | United States | EnzerGul |  2026948695 |          9038 | 644 | Covington | Florida |   30016 |
    And User click Add Your Address button
    Then the message should be displayed 'Address Added Successfully'

  @editAddress
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user update new address form with below information
      | country       | fullName     | phoneNumber | streetAddress | apt | city      | state    | zipCode |
      | United States | ReshadKarimi |  2406525978 |          7535 | 465 | Manhattan | New York |   10001 |
    And User click update Your Address button
    Then a message should be displayed 'Address Updated Successfully'
	@removeAdd
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
