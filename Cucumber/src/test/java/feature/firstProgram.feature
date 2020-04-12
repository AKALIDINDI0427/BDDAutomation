#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: I want to create a new User for Facebook

  @tag1
  Scenario: Title of your scenario
    Given the user launches the Facebook login page
    And enter the information and clicks on Signup
 		#|field   		|value   		|
 		#|firstname  | Adhbfvjhd	|
 		#|lastname		| svkbsjkdv |
 		#|email			|	acbsjahbs@gmail.com	|
 		#|password		| sdchbs@123 |

