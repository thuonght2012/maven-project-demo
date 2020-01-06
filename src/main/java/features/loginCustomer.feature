# new feature
# Tags: optional

Feature: Customer login
  In order to user can log in, I want to see my profile so I can log in easily

  Background:
    Given Open website http://www.way2automation.com/angularjs-protractor/banking/#/login

  Scenario Outline: User can login successfully
    When I click login Customer button
    And I choose account as <name>
    Then I click login button
    And I verify that the user login successfully
    And I verify that the information of the user login correct
    Examples:
      | name        |
      | Harry Potter|