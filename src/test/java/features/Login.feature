Feature: Invalid Login to the Flipkart app


  Scenario: Passing Invalid credentials and log in into the application
    Given I am on the landing page
    When I enter login as "someone@testvagrant.com" and password as "testvagrant123"
    Then I should see the error "Login Failed.Account does not exist"
