Feature: This is a feature for creating account unsuccessfully


Scenario: Verify user can not create account successfully
Given open <"URL"> Ban
Then click sign in ban
Then click create account ban
Then enter invalid email firstname lastname phone number enter inv password
Then click create account 
Then Verify user can not create account successfully