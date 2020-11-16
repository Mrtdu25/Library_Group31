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


    ########################################################
  #uros
  Scenario Outline:  Parametrized login as <role>

    When user logs in as a "<role>"
    Then user should see "<page_title>"

    Examples:
      | role            | page_title      |
      | student       | Books           |
      | librarian       | Dashboard       |



  @negative_scenario
  Scenario Outline: Invalid login
    Given user is on the login page
    When user logs in with "<username>" username and "<password>" password
    Then user verifies that "<message>" message is displayed

    Examples: data set
      | username             | password | message                        |
      | student91@library    | bad      | Sorry, Wrong Email or Password |
      | librarian62@library  | bad      | Sorry, Wrong Email or Password |
      | wrong@library    | c4vlSAqZ | Sorry, Wrong Email or Password |
      | librarianWrong@library  | DdZ8SHvz | Sorry, Wrong Email or Password |



