# Created by nththuy at 1/3/20
Feature: Open Account
  In order to open account, I want to have the adding customer feature so that I can add customer easily

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/manager

  Scenario Outline:  Open Account sucessfully
  When I choose button open account
    When I choose the account as <fullname> and currency as <currency>
    And I click open account
    Then I verify that user is already open
    Examples:
      | fullname     | currency |
      | Harry Potter | Pound    |