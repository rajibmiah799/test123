@CreatingAcc
Feature: creating account funcanility testing
Scenario Outline: user account creating
Given user on amazon home page
When user click on sign in
And user click on create your Amazon account
And user enter "<user name>", "<email>", "<password>", "<reenter password>" 
And user click on create your Amazon account
Then user create account successfully
Examples:
| user name | email                | password | reenter password |
| md miah   | miahrajib1@yahoo.com | RA123456  | RA123456 |
 