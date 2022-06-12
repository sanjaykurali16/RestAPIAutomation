#Author: your.email@your.domain.com
#Keywords Summary :

@API
Feature: To verify the comments made by Samantha

  @verifyEmail
  Scenario Outline: Should be able to verify the comments
    Given Users, Posts, comments api is up & running
    When Search for user with name "<userName>"
    And Search for the post with user Id
    And Search for the comment with post Id
    Then Verify the email format

    Examples: 
      | userName |
      | Samantha |