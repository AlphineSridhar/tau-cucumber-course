  Feature: Login functionality

  In order to do Internet banking
  As a valid customer
  i want to login successfully

    Scenario Outline: Login successful

      Given I am login page of the internet banking customer
      When I enter valid credentials <username> and <password>
      And i can able to see the transaction list table 1
      Then I should be able to see the logout button

      Examples:
        |username|password|
        |"autotester"|"password"|
        |"tautester"|"password"|