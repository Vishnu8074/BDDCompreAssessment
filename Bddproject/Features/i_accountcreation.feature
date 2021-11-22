Feature: Checking functionality of create account

  #Scenario Outline: Creating account
    #Given user is on sign in page
    #And clicks on create account button
    #When user enters <firstname>, <lastname>, <emailid> and <password1>
    #Then system should accept data
    #Examples: 
    #|firstname|lastname|emailid|password1|
    
   Scenario: Creating account
    Given user is on sign in page
    And clicks on create account button
    When user enters firstname, lastname, emailid and password1
    Then system should accept data
    
    