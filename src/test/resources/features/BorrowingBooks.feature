@borrowingBook
Feature:  US2 As a user I should be able to see all book categories so I can select them by their types

  @TC3
  Scenario: Student should be able to see information of borrowed books history
    Given user is on the login page
    When user logs in as a "student"
    And user clicks on Borrowing Books button
    Then user should be able to see information of the borrowed books history

