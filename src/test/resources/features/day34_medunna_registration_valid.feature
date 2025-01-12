@medunna
Feature: User Registration

  Background:
    Given user navigates to "https://www.medunna.com/account/register"

  Scenario: Successful user registration
    When the user provides the following details
      | SSN         | firstname | lastname | username | email        | newPassword | confirmPassword |
      | 789-55-1289 | hay       | gtrey    | cleo     | kleo@kle.com | keles       | keles           |
    And the user clicks on Register button
    Then verify "Registration Saved" is displayed

  #mandatory fields in the registration form. Ensure that appropriate error messages are displayed when these fields are left blank using Scenario Outline
  @mandatory
  Scenario Outline: Mandatory fields registration
    When user enters SSN field "<ssn>"
    And user enters firstname "<firstname>"
    And user enters lastname "<lastname>"
    And user enters username "<username>"
    And user enters email "<email>"
    And user enters firstPassword "<firstPassword>"
    And user enters secondPassword "<secondPassword>"
    And the user clicks on Register button
    Then verify the "<errorMessage>" validation message is displayed

    Examples:
      | ssn         | firstname | lastname | username  | email               | firstPassword | secondPassword | errorMessage                            |
      |             | John      | Doe      | johndoe11 | johndoe11@gmail.com | John1234!     | John1234!      | Your SSN is required.                   |
      | 789-55-0000 |           | Doe      | johndoe12 | johndoe12@gmail.com | John1234!     | John1234!      | Your FirstName is required.             |
      | 789-55-0000 | John      |          | johndoe13 | johndoe13@gmail.com | John1234!     | John1234!      | Your LastName is required.              |
      | 789-55-0000 | John      | Doe      |           | johndoe14@gmail.com | John1234!     | John1234!      | Your username is required.              |
      | 789-55-0000 | John      | Doe      | johndoe15 |                     | John1234!     | John1234!      | Your email is required.                 |
      | 789-55-0000 | John      | Doe      | johndoe16 | johndoe16@gmail.com |               | John1234!      | Your password is required.              |
      | 789-55-0000 | John      | Doe      | johndoe17 | johndoe17@gmail.com | John1234!     |                | Your confirmation password is required. |

