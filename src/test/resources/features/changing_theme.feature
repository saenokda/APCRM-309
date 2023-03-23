Feature: Changing Theme

  US:
  As a user, I should be able to change theme; so that I can experience more personal application.

  Accept Criteria:

  1. User can select an image from the options.
  2. User can select custom theme
  3. User can use animated background

  Background: for these scenarios in this feature file, user is expected to be on the login page
    Given user is already on homepage

    Scenario: User can select an image from the options.
      When User clicks the profile picture on the top right corner
      And User sees dropdown options and clicks Themes button
      Then User should see 80 pictures to choose from
      And User clicks one of them background changes
      And User clicks save

    Scenario: User can select custom theme.
      When User clicks the profile picture on the top right corner
      And User sees dropdown options and clicks Themes button
      Then User clicks Custom Theme button
      And User uploads custom image
      And User clicks the Create button
      And User clicks save

    Scenario: User can use animated background
      When User clicks the profile picture on the top right corner
      And User sees dropdown options and clicks Themes button
      Then User chooses animated background
      And User clicks save
















