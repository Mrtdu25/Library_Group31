Feature: As user i want to be able to login under different role
#this is a comment
  #this is a comment

  Background: common steps
    Given user is on the login page

  @parametrized_test
  Scenario: Parametrized login
    When user logs in as a "student"
    #Then user should see "Test Student 91" profile name

  @parametrized_test2
  Scenario: Parametrized login
    When user logs in as a "librarian"
   # Then user should see "Test Librarian 62" profile name

  @s_o @with_two_columns
  Scenario Outline: Parametrized login as <role>
    When user logs in as a "<role>"
    #Then user should see "<page_title>" profile name
    Examples:
      | role      | page_title        |
      | student   | Test Student 91   |
      | librarian | Test Librarian 62 |


