Feature: Login functionality of OrangeHRM application


@Smoke
Scenario: To Login with registered username and password
Given user launches the OrangeHRM application
And user provides  username
And user provides  password
When user taps on login button
Then user should be in home page

