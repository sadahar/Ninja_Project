Feature: Login Page

  Background: 
    Given User Launch Chrome Browser
    When User open Url "http://tutorialsninja.com/demo/index.php?route=account/login"
    And User enter Email as "sadaharlogin@gmail.com" and password as "sadahar047"
    And User Click on Login butto
    Then Page Title should be "My Account"

  Scenario: Successfull login with valid crediential
    When user close browser

  Scenario: Checking Home Page all Functionality
    When User click on My Account
    And User Click on Edit account
    Then Page Title should be "My Account Information"
    And user Click on Password
    Then Page Title should be "Change Password"
