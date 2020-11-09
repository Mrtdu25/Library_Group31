Feature: As a user(librarian) i should control the Book Management module

  Background: common steps
    Given user is on the login page
    When user logs in as a "librarian"
    Then user navigates to "Users"
    Then user should see "User Management" page

   

     @US1_AC4
    Scenario:
      When user clicks on Search
      And user enters the "HUSSEIN ALAARAGY"
      Then user should see desired search




